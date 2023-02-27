package com.swaggertake6.persistence;

import com.swaggertake6.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
