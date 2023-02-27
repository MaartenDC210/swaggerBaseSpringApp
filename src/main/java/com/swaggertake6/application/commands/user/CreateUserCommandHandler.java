package com.swaggertake6.application.commands.user;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import com.swaggertake6.domain.User;
import com.swaggertake6.persistence.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class CreateUserCommandHandler implements Command.Handler<CreateUserCommand, Voidy>{
    private final UserRepository _userRepository;

    public CreateUserCommandHandler(UserRepository _userRepository) {
        this._userRepository = _userRepository;
    }

    @Override
    public Voidy handle(CreateUserCommand createUserCommand) {
        User user = new User(createUserCommand.name, createUserCommand.address);
        _userRepository.save(user);
        return null;
    }
}
