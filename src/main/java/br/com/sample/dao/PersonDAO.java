package br.com.sample.dao;

import java.util.Collection;

import org.esfinge.querybuilder.Repository;

import br.com.sample.entities.Person;

public interface PersonDAO extends Repository<Person> {
	
	public Collection<Person> getPerson();
	public Collection<Person> getPersonByName(String name);

}
