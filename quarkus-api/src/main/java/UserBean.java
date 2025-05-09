
package com.example;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String address;

    @Inject
    private UserService userService;

    public User(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public void submit() {
        userService.logUserDetails(this);
    }
}

record UserService() {} // Empty record for UserService
