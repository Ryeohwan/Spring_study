package com.ssafy.member.model.dto;

public class MemberDto {
	private String userName, userId, userPw;

	public MemberDto(String userName, String userId, String userPw) {
		super();
		this.userName = userName; // 여기 set으로 바꿔놔야 한다. 그리고 set 은 꼭 유효성 검사!!!!!!
		this.userId = userId;
		this.userPw = userPw;
	}
	
	

	public MemberDto() {
		super();
	}



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	@Override
	public String toString() {
		return "MemberDto [userName=" + userName + ", userId=" + userId + ", userPw=" + userPw + "]";
	}
	
	
}
