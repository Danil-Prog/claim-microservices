package com.claim.gateway.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class MainController {

    private final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Get
    public String index() {
        this.logger.info("Main controller index is successfully return string type!");
        return "Main controller";
    }
}
