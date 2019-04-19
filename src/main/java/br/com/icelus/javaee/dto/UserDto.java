package br.com.icelus.javaee.dto;

import java.io.Serializable;
import java.util.Date;

public class UserDto implements Serializable {

   private static final long serialVersionUID = 1L;
   private Long id;
   private String username;
   private String password;
   private Date expiration;

   public UserDto() {

   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public Date getExpiration() {
      return expiration;
   }

   public void setExpiration(Date expiration) {
      this.expiration = expiration;
   }

}
