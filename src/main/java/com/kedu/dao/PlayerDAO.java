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

	public List<PlayerDTO> selectAll() throws Exception {

		String sql = "select * from player";
		
		return jdbc.query(sql, new BeanPropertyRowMapper<>(PlayerDTO.class));

	}
}
