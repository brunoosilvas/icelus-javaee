package br.com.icelus.javaee.app;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.icelus.javaee.bean.DatabaseBean;
import br.com.icelus.javaee.cdi.Database;
import br.com.icelus.javaee.cdi.DevDatabase;

@DevDatabase
public class DevDataSource {
	
	@Inject
	private DatabaseBean database;
	
	@PersistenceContext(name = "dev-mysql")
	private EntityManager entityManagerMysql;
	
	@PersistenceContext(name = "dev-postgresql")
	private EntityManager entityManagerPostgresql;
	
	@Produces @Database @RequestScoped
	public EntityManager createEntityManager() {
		EntityManager entityManager = null;
		
		if (database.getChoise() == null) {
			entityManager = entityManagerMysql;
		} else if (database.getChoise().equals("mysql")) {
			entityManager = entityManagerMysql;
		} else if (database.getChoise().equals("postgresql")) {
			entityManager = entityManagerPostgresql;
		}
		
		return entityManager;
	}

}
