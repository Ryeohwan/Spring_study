package com.ssafy.cafe3.dto;

public class Member {
	private String name,id,pw;

	
	
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", pw=" + pw + "]";
	}
	
	
	
}
