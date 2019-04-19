package br.com.icelus.javaee.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class DatabaseBean implements Serializable {

   private static final long serialVersionUID = 1L;
   private String choise;
   private String[] choiseList;

   @PostConstruct
   public void initialize() {
      choiseList = new String[] {
            "mysql", "postgresql"	
      };
   }

   public String getChoise() {
      return choise;
   }

   public void setChoise(String choise) {
      this.choise = choise;
   }

   public String[] getChoiseList() {
      return choiseList;
   }

   public void setChoiseList(String[] choiseList) {
      this.choiseList = choiseList;
   }

}
