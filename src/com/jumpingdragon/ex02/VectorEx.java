package com.jumpingdragon.ex02;

import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		
		list.remove(2);
		list.remove(3);
		
	}
}
