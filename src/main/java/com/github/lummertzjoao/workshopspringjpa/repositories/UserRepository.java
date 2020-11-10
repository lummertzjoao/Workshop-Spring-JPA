package com.github.lummertzjoao.workshopspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.lummertzjoao.workshopspringjpa.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
