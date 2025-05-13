
package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {

    private static final Logger logger = LogManager.getLogger(UserService.class);

    public void logUserDetails(UserBean userBean) {
        logger.info("User Details: {}", userBean);
    }
}

record UserBean(String firstName, String lastName, int age, String address) {
}
