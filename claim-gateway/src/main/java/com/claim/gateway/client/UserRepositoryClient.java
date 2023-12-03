package com.claim.gateway.client;

import com.claim.gateway.model.User;
import com.claim.gateway.repository.UserRepository;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.Recoverable;
import org.reactivestreams.Publisher;

@Client(id = "claim-user")
@Recoverable(api = UserRepository.class)

public interface UserRepositoryClient extends UserRepository {

    @Get("/api/v1/user")
    Publisher<User> getUser();
}
