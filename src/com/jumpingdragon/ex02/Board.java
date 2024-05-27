package com.jumpingdragon.ex02;

public class Board {
	// subject(제목), content(내용), writer(글쓴이)
	String subject;
	String content;
	String writer;
	
	public Board(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
		super();
	}
	public String getSubject() {
		return subject;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
