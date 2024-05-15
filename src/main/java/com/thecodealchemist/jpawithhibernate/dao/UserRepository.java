package com.thecodealchemist.jpawithhibernate.dao;

import com.thecodealchemist.jpawithhibernate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
