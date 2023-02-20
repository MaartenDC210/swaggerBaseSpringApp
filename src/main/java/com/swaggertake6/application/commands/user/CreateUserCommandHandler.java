package com.swaggertake6.application.commands.user;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import org.springframework.stereotype.Component;

@Component
public class CreateUserCommandHandler implements Command.Handler<CreateUserCommand, Voidy>{

    @Override
    public Voidy handle(CreateUserCommand createUserCommand) {
        System.out.println(createUserCommand.name);
        return null;
    }
}
