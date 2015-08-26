package br.com.sample.dao;

import java.util.Collection;

import org.esfinge.querybuilder.annotation.IgnoreWhenNull;
import org.esfinge.querybuilder.annotation.QueryBuilder;

import br.com.sample.entities.User;

@QueryBuilder
public interface UserDAO {

	public Collection<User> getUserByLoginAndPersonName(String login, @IgnoreWhenNull String name);
	
}
