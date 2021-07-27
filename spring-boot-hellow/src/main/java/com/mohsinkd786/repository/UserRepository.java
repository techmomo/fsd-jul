package com.mohsinkd786.repository;

import com.mohsinkd786.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
