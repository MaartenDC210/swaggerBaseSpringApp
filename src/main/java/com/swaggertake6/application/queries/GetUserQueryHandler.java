package com.swaggertake6.application.queries;

import an.awesome.pipelinr.Command;
import org.springframework.stereotype.Component;

@Component
public class GetUserQueryHandler implements Command.Handler<getUserQuery, String> {

    @Override
    public String handle(getUserQuery getUserQuery) {
        return getUserQuery.name;
    }
}
