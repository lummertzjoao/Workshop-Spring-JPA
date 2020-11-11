package com.github.lummertzjoao.workshopspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.lummertzjoao.workshopspringjpa.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
