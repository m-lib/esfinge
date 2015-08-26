package br.com.sample.entities;

import lombok.Getter;
import lombok.Setter;

public class Person {
	
	@Getter @Setter
	private long code;
	
	@Getter @Setter
	private String name;
	
	@Getter @Setter
	private String email;
	
	public Person() {

	}

	public Person(long code) {
		this.code = code;
	}

}
