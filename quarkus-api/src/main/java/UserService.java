
package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import java.util.Objects;

@ApplicationScoped
public class UserService {

    private static final Logger logger = LogManager.getLogger(UserService.class);

    public void logUserDetails(UserBean userBean) {
        Objects.requireNonNull(userBean, "userBean is null");

        logger.info("User Details:");
        logger.info("First Name: {}", userBean.getFirstName());
        logger.info("Last Name: {}", userBean.getLastName());
        logger.info("Age: {}", userBean.getAge());
        logger.info("Address: {}", userBean.getAddress());
    }
}

record UserBean(String firstName, String lastName, int age, String address) {
}
