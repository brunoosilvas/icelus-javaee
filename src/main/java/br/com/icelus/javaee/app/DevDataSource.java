package br.com.icelus.javaee.app;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.icelus.javaee.cdi.Database;
import br.com.icelus.javaee.cdi.DevDatabase;

@DevDatabase
public class DevDataSource {
	
	@PersistenceContext(name = "dev-mysql")
	private EntityManager entityManagerMysql;
	
	@PersistenceContext(name = "dev-postgresql")
	private EntityManager entityManagerPostgresql;
	
	@Produces
	@Database
	@RequestScoped
	public EntityManager createEntityManager() {
		return entityManagerMysql;
	}

}