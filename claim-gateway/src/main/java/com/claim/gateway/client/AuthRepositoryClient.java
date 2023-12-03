package com.claim.gateway.client;


import com.claim.gateway.model.User;
import com.claim.gateway.repository.AuthRepository;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.Recoverable;
import org.reactivestreams.Publisher;

@Client(id = "claim-auth")
@Recoverable(api = AuthRepository.class)

public interface AuthRepositoryClient extends AuthRepository {

    @Post("/api/v1/user/save")
    Publisher<Boolean> saveUser(User user);
}
