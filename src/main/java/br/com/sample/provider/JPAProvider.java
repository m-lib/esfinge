package br.com.sample.provider;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.esfinge.querybuilder.jpa1.EntityManagerProvider;

import br.com.sample.Generator;

public class JPAProvider implements EntityManagerProvider {

	@Override
    public EntityManager getEntityManager() {
		EntityManagerFactory factory = this.getEntityManagerFactory();
		EntityManager manager = factory.createEntityManager();
        Generator.pupulate(manager);
        return manager;
    }

    @Override
    public EntityManagerFactory getEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("sample");
    }

}
