package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserRecource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1l, "maria", "maria@maria", "123456789", "123456");
		return ResponseEntity.ok().body(u);
	}
}
