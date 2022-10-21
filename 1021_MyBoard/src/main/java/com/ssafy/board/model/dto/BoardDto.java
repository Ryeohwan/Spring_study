package com.ssafy.board.model.dto;

public class BoardDto {
	
	private int articleNo,hit;			
	private String userId,userName,subject,content,registerTime;
	
	
	public BoardDto() {
		super();
	}
	public BoardDto(int articleNo, int hit, String userId, String userName, String subject, String content,
			String registerTime) {
		super();
		this.articleNo = articleNo;
		this.hit = hit;
		this.userId = userId;
		this.userName = userName;
		this.subject = subject;
		this.content = content;
		this.registerTime = registerTime;
	}
	public int getArticleNo() {
		return articleNo;
	}
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	@Override
	public String toString() {
		return "BoardDto [articleNo=" + articleNo + ", hit=" + hit + ", userId=" + userId + ", userName=" + userName
				+ ", subject=" + subject + ", content=" + content + ", registerTime=" + registerTime + "]";
	}
	
	

}