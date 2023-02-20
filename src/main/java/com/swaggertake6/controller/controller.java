package com.swaggertake6.controller;

import an.awesome.pipelinr.Pipeline;
import com.swaggertake6.application.commands.user.CreateUserCommand;
import com.swaggertake6.application.queries.getUserQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    //mediator pattern
    @Autowired
    Pipeline pipeline;
    @GetMapping("/sayHello")
    public String SayHello(){
        return pipeline.send(new getUserQuery("test"));

    }
    @PostMapping("/sayHello")
    public void SayHelloPost(){
         pipeline.send(new CreateUserCommand("test","address"));
    }
}
