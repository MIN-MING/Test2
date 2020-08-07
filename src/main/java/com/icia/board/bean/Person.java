package com.icia.board.bean;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

                                                           //@Component // Ioc(DI) 컨테이너에 객체 생성
@Data
public class Person {
	private String id;
	private String pw;
	private int age;

	public void study() {
		System.out.println("사람은 공부한다");
	}

	public String sleep() {
		return "사람은  잔다";
	}
}
