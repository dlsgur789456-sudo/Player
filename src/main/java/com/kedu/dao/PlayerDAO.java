package com.kedu.dao;

import org.springframework.beans.factory.annotation.Autowired;
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
}
