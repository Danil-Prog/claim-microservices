package com.claim.auth.controller;

import com.claim.auth.model.User;
import com.claim.auth.service.UserService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/api/v1/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Post("/save")
    public boolean saveUser(User user) {
        this.logger.info("User: [{}]", user);
        return userService.saveUser(user);
    }

}
