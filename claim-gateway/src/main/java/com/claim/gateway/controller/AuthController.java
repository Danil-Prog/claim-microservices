package com.claim.gateway.controller;

import com.claim.gateway.client.AuthRepositoryClient;
import com.claim.gateway.model.User;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

@Controller("/api/v1/auth")
public class AuthController {

    private final AuthRepositoryClient authClient;
    private final Logger logger = LoggerFactory.getLogger(AuthController.class);

    public AuthController(AuthRepositoryClient authClient) {
        this.authClient = authClient;
    }

    @Post
    public boolean saveUser(@Body User user) {
        this.logger.info("Request body: user [{}]", user);
        return Boolean.TRUE.equals(Flux.from(authClient.saveUser(user)).blockFirst());
    }
}
