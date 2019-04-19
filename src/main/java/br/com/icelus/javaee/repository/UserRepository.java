package br.com.icelus.javaee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.icelus.javaee.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
