package com.kedu.dto;

public class PlayerDTO {

	private String name;
	private int backnumber;
	private String position;
	
	
	
	
	public PlayerDTO() {}

	public PlayerDTO(String name, int backnumber, String position) {
		this.name = name;
		this.backnumber = backnumber;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getBacknumber() {
		return backnumber;
	}



	public void setBacknumber(int backnumber) {
		this.backnumber = backnumber;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}

	
	
}
