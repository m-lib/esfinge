package br.com.sample.dao;

import java.util.Collection;

import org.esfinge.querybuilder.Repository;
import org.esfinge.querybuilder.annotation.QueryObject;
import org.esfinge.querybuilder.annotation.Starts;

import br.com.sample.entities.Person;
import br.com.sample.query.PersonQuery;

public interface PersonDAO extends Repository<Person> {
	
	public Collection<Person> getPerson();
	public Collection<Person> getPersonOrderByName();
	public Collection<Person> getPersonOrderByNameDesc();
	public Collection<Person> getPersonByName(@Starts String name);
	public Collection<Person> getPerson(@QueryObject PersonQuery query);

}
