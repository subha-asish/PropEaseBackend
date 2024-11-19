package com.example.PropEase.Repository;

import com.example.PropEase.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

