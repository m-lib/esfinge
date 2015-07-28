package br.com.sample;

import static org.junit.Assert.assertEquals;

import org.esfinge.querybuilder.QueryBuilder;
import org.junit.Test;

import br.com.sample.dao.PersonDAO;
import br.com.sample.dao.UserDAO;
import br.com.sample.entities.Person;
import br.com.sample.entities.User;

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
	public void queryByExample() throws Exception {
		UserDAO dao = QueryBuilder.create(UserDAO.class);
		Person person = new Person(1);
		User example = new User(1);
		example.setPerson(person);

		assertEquals(1, dao.queryByExample(example).size());
	}

}
