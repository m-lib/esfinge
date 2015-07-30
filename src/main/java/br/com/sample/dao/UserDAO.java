package br.com.sample.dao;

import java.util.Collection;

import org.esfinge.querybuilder.Repository;
import org.esfinge.querybuilder.annotation.IgnoreWhenNull;

import br.com.sample.entities.User;

public interface UserDAO extends Repository<User> {

	public Collection<User> getUserByLoginAndPersonName(String login, @IgnoreWhenNull String name);
	
}
