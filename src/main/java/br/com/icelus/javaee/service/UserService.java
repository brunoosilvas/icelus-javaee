package br.com.icelus.javaee.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.icelus.javaee.dto.UserDto;
import br.com.icelus.javaee.rules.UserRules;

@RequestScoped
public class UserService {

   @Inject 
   private UserRules userRules;

   @Transactional
   public List<UserDto> listAll() throws Exception {
      return userRules.listAll();
   }

}
