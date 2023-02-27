package com.swaggertake6.infrastructure;

import com.swaggertake6.persistence.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository _usersRepo;

    public UserService(UserRepository usersRepo) {
        _usersRepo = usersRepo;
    }
}
