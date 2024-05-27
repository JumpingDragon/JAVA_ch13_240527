package com.jumpingdragon.ex01;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> memberList = new ArrayList<Member>();
		
		Member member1 = new Member();
		member1.setId("tiger");
		member1.setPw("12345");
		member1.setAge(25);
		member1.setName("홍길동");
		member1.setPhone("010-3456-1945");
		
		Member member2 = new Member();
		member2.setId("wolf");
		member2.setPw("35355");
		member2.setAge(32);
		member2.setName("이순신");
		member2.setPhone("010-1233-3444");
		
		Member member3 = new Member("horse","77777", 27, "김유신", "010-8282-9797");
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		
		if (memberList.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("비어있지 않음");
		}
	}

}
