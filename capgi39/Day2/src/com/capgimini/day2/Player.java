package com.capgimini.day2;
//Multiple Inheritance 
//Which is not allowed in java
public class Player extends Person {

	public String getPlayerid() {
		return playerid;
	}
	public void setPlayerid(String playerid) {
		this.playerid = playerid;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", gameName=" + gameName + "]";
	}
	public Player(String name, String address, int age,String playerid,String gamename) {
		//super(id, fees, subject, teacherName, name, address, age);
		// TODO Auto-generated constructor stub
		super(name, age, address);
		this.playerid=playerid;
		this.gameName=gamename;
		
	}
	private String playerid;
	private String gameName;
	
}
