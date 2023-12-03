package com.claim.user.controller;

import com.claim.user.model.User;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/api/v1/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Get
    public User index() {
        this.logger.info("Initialization user controller");
        return new User("Daniel", "#password");
    }
}
