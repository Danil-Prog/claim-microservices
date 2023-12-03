package com.claim.gateway.repository;

import com.claim.gateway.model.User;
import org.reactivestreams.Publisher;


public interface AuthRepository {

    Publisher<Boolean> saveUser(User user);
}
