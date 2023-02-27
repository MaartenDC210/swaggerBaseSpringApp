package com.swaggertake6.controller;

import an.awesome.pipelinr.Pipeline;
import an.awesome.pipelinr.Voidy;
import com.swaggertake6.application.commands.CreateUserCommand;
import com.swaggertake6.application.queries.GetUserQuery;

import com.swaggertake6.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {
    @Autowired
    Pipeline pipeline;
    @GetMapping("/sayHello")
    public List<User> SayHello(){
        return pipeline.send(new GetUserQuery());

    }

    @PostMapping("/user")
    public Voidy CreateUser(@RequestBody CreateUserCommand cmd){
        return pipeline.send(cmd);
    }
}
