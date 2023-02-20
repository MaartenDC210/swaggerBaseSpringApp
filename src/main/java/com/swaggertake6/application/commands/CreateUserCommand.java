package com.swaggertake6.application.commands;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

public class CreateUserCommand  implements Command<Voidy> {
    public String name;
    public String address;

    public CreateUserCommand(String name, String address) {
        this.name = name;
        this.address = address;
    }

}