package com.swaggertake6.application.queries;

import an.awesome.pipelinr.Command;
import com.swaggertake6.domain.User;
import com.swaggertake6.persistence.UserRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetUserQueryHandler implements Command.Handler<GetUserQuery, List<User>> {

    private final UserRepository _userRepository;

    public GetUserQueryHandler(UserRepository userRepository) {
        _userRepository = userRepository;
    }

    @Override
    public List<User> handle(GetUserQuery getUserQuery) {
        List<User> users = _userRepository.findAll();

        return users;
    }
}
