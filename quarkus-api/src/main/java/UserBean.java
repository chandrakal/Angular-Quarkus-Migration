
package com.example;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public record UserBean(String firstName, String lastName, int age, String address) implements Serializable {

    @Inject
    UserService userService;

    public void submit() {
        userService.logUserDetails(this);
    }
}
