package br.com.sample.query;

import lombok.Getter;
import lombok.Setter;

public class PersonQuery {
	
	@Getter @Setter
	private String name;
	
	public PersonQuery() {
		
	}

	public PersonQuery(String name) {
		this.name = name;
	}

}
