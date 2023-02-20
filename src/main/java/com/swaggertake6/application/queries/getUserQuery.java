package com.swaggertake6.application.queries;

import an.awesome.pipelinr.Command;

public class getUserQuery implements Command<String> {
    public String name;

    public getUserQuery(String name) {
        this.name = name;
    }
}
