package br.com.icelus.javaee.repository;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import br.com.icelus.javaee.cdi.Database;
import br.com.icelus.javaee.cdi.Repository;

@Dependent
public class FactoryRepository {

   @Inject @Database
   private EntityManager entityManager;

   @Produces @Repository
   public UserRepository getUsuariosRepository() {
      JpaRepositoryFactory factory = new JpaRepositoryFactory(entityManager);
      return factory.getRepository(UserRepository.class);
   }


}
