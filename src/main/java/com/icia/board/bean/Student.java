package com.icia.board.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component // Ioc(DI) 컨테이너에 객체 생성
@Data
public class Student extends Person {
	private String name;
	private int sNo;

	public void study() {
		System.out.println("학생은 공부한다");
	}

	public String sleep() {
		return "학생은 6시간 잔다";
	}
}
