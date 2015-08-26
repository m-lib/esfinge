package br.com.sample;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.esfinge.querybuilder.QueryBuilder;
import org.junit.Test;

import br.com.sample.dao.PersonDAO;
import br.com.sample.dao.UserDAO;
import br.com.sample.entities.Person;
import br.com.sample.query.PersonQuery;

public class Assertions {
	
	@Test
	public void selectAll() throws Exception {
		PersonDAO dao = QueryBuilder.create(PersonDAO.class);
		assertEquals(5, dao.getPerson().size());
	}
	
	@Test
	public void selectByName() throws Exception {
		PersonDAO dao = QueryBuilder.create(PersonDAO.class);
		assertEquals(1, dao.getPersonByName("Willian").size());
	}
	
	@Test
	public void orderByName() throws Exception {
		PersonDAO dao = QueryBuilder.create(PersonDAO.class);
		
		Collection<Person> people = dao.getPersonOrderByName();
		String[] names = { "Lisa", "Mark", "Michael", "Susan", "Willian" };
		
		int i = 0;
		for (Person response : people) {
			assertEquals(names[i++], response.getName());
		}
	}
	
	@Test
	public void orderByNameDesc() throws Exception {
		PersonDAO dao = QueryBuilder.create(PersonDAO.class);
		
		Collection<Person> people = dao.getPersonOrderByNameDesc();
		String[] names = { "Willian", "Susan", "Michael", "Mark", "Lisa" };
		
		int i = 0;
		for (Person response : people) {
			assertEquals(names[i++], response.getName());
		}
	}
	
	@Test
	public void queryObject() throws Exception {
		PersonDAO dao = QueryBuilder.create(PersonDAO.class);
		
		PersonQuery queryObject = new PersonQuery("Willian");
		Collection<Person> people = dao.getPerson(queryObject);

		assertEquals(1, people.size());
	}
	
	@Test
	public void selectByNameLike() throws Exception {
		PersonDAO dao = QueryBuilder.create(PersonDAO.class);
		assertEquals(1, dao.getPersonByName("Will").size());
	}
	
	@Test
	public void ignoreWhenNull() throws Exception {
		UserDAO dao = QueryBuilder.create(UserDAO.class);
		assertEquals(1, dao.getUserByLoginAndPersonName("willian", null).size());
		assertEquals(1, dao.getUserByLoginAndPersonName("willian", "Willian").size());
	}

}
