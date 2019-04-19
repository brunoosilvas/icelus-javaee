package br.com.icelus.javaee.bean;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import br.com.icelus.javaee.dto.UserDto;
import br.com.icelus.javaee.service.UserService;

@Named
@ViewScoped
public class UserBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private UserService userService;

    private List<UserDto> userList;

    public void search() {

        try {

            userList = userService.listAll();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<UserDto> getUserList() {
        return userList;
    }

    public void setUserList(List<UserDto> userList) {
        this.userList = userList;
    }

}
