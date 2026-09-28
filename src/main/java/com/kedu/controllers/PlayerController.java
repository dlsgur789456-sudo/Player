package com.kedu.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kedu.dao.PlayerDAO;
import com.kedu.dto.PlayerDTO;

@Controller
@RequestMapping("/player")
public class PlayerController {

	@Autowired
	PlayerDAO dao;
	
	@RequestMapping("delete")
	public String delete(String name) {
		dao.delete(name);
		return "redirect:/player/list";
	}
	@RequestMapping("/update")
	public String update(PlayerDTO dto) throws Exception {
		dao.update(dto);
		return "redirect:/player/list";
	}
	
}
