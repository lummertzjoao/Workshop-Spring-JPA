package com.github.lummertzjoao.workshopspringjpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.lummertzjoao.workshopspringjpa.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "Maria", "Maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(user);
	}
}
