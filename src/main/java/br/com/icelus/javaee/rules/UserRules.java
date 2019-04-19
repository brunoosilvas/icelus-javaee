package br.com.icelus.javaee.rules;

import java.sql.SQLException;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.icelus.javaee.cdi.Repository;
import br.com.icelus.javaee.dto.UserDto;
import br.com.icelus.javaee.entity.User;
import br.com.icelus.javaee.repository.UserRepository;
import br.com.icelus.javaee.util.Mapper;

@Dependent
public class UserRules {
	
	@Inject @Repository
	private UserRepository userRepository;

	public List<UserDto> listAll() throws SQLException {
		
		List<UserDto> userDtoList = null;
		
		List<User> userList = userRepository.findAll();
		
		userDtoList = Mapper.mapAll(userList, UserDto.class);
		
		return userDtoList;
	}
}
