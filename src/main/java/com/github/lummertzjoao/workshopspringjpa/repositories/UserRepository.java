package com.github.lummertzjoao.workshopspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.lummertzjoao.workshopspringjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
