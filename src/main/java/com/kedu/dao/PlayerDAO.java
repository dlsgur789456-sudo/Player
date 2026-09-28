package com.kedu.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kedu.dto.PlayerDTO;

@Repository
public class PlayerDAO {

	@Autowired
	private JdbcTemplate jdbc;
	
	public int update(PlayerDTO dto) {
		String sql = "update player(backnumber, position) set(?,?)";
		return jdbc.update(sql, dto.getBacknumber(), dto.getPosition());

  }
	public List<PlayerDTO> selectAll() throws Exception {

		String sql = "select * from player";
		
		return jdbc.query(sql, new BeanPropertyRowMapper<>(PlayerDTO.class));
	}

	public int insert(PlayerDTO dto) {
		String sql = "insert into player (name, backnumber, position) values (?, ?, ?)";
		return jdbc.update(sql, 
				dto.getName(), 
				dto.getBacknumber(), 
				dto.getPosition()
				);

	
	public int delete(String name) {
		String sql = "delete from player where name = ?";
		return jdbc.update(sql, name);
	}
		
	}
}
