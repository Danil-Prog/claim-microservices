package com.claim.gateway.controller;

import com.claim.gateway.client.UserRepositoryClient;
import com.claim.gateway.model.User;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

@Controller("/api/v1/user")
public class UserController {

    private final UserRepositoryClient userClient;
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    public UserController(UserRepositoryClient userClient) {
        this.userClient = userClient;
    }

    @Get
    public User getDefaultUser() {
        Publisher<User> publisher = userClient.getUser();
        return Flux.from(publisher).blockFirst();
    }
}
