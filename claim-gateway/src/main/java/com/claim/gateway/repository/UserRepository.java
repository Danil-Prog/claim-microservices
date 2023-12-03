package com.claim.gateway.repository;

import com.claim.gateway.model.User;
import org.reactivestreams.Publisher;

import java.util.concurrent.Flow;

public interface UserRepository {

    Publisher<User> getUser();
}
