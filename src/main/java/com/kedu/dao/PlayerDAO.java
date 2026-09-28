package com.kedu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerDAO {
	
	@Autowired
	private JdbcTemplate jdbc;

	
	public int delete(String name) {
		String sql = "delete from player where name = ?";
		return jdbc.update(sql, name);
	}
		
}
