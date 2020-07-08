package com.Varun.login.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class UserResource {
	
	@Autowired
	UserRepository userrepository;
	
	@GetMapping("/all")
	public List<User> getAll(){
		
		return userrepository.findAll();
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/load")
	public List<User> persist(@RequestBody final User user){
		userrepository.save(user);
		return userrepository.findAll();
		
	}

}
