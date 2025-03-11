package com.google.dearapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.dearapp.dto.MatchingUser;
import com.google.dearapp.entity.User;
import com.google.dearapp.responsestructure.ResponseStructure;
import com.google.dearapp.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping
	public ResponseStructure<User> saveUser(@RequestBody User user){
		return service.saveUser(user);
	}
	
	@GetMapping
	public ResponseStructure<List<User>> findAllUsers(){
		return service.findAllUsers();
	}
	
	@GetMapping("/id/{id}")
	public ResponseStructure<User> findUserById(@PathVariable(name="id") Long id){
		//(name="id")--> This is used to non-primitive types
		return service.findUserById(id);
	}
	
	@GetMapping("/gender/male")
	public ResponseStructure<List<User>> findAllMaleUsers(){
		return service.findAllMaleUsers();
	} 
	
	@GetMapping("/gender/female")
	public ResponseStructure<List<User>> findAllFemaleUsers(){
		return service.findAllFemaleUsers();
	} 
	
	@GetMapping("/role/user")
	public ResponseStructure<List<User>> findAllUserRole(){
		return service.findAllUserRole();
	}
	
	@GetMapping("/role/admin")
	public ResponseStructure<List<User>> findAllAdminRole(){
		return service.findAllAdminRole();
	}
	
	@PatchMapping("/role/admin/{id}")
	public ResponseStructure<User> setRoleToAdmin(@PathVariable(name="id") Long id){
		return service.setRoleToAdmin(id);
	}
	@PatchMapping("/role/user/{id}")
	public ResponseStructure<User> setRoleToUser(@PathVariable(name="id") Long id){
		return service.setRoleToUser(id);
	}
	
	@GetMapping("/status/active")
	public ResponseStructure<List<User>> findAllActiveUsers(){
		return service.findAllActiveUsers();
	}
	
	@GetMapping("/status/inactive")
	public ResponseStructure<List<User>> findAllInactiveUsers(){
		return service.findAllInactiveUsers();
	}
	
	@GetMapping("/status/blocked")
	public ResponseStructure<List<User>> findAllBlockedUsers(){
		return service.findAllBlockedUsers();
	}
	
	@GetMapping("/status/deleted")
	public ResponseStructure<List<User>> findAllDeletedUsers(){
		return service.findAllDeletedUsers();
	}
	
	@GetMapping("/status/terminated")
	public ResponseStructure<List<User>> findAllTerminatedUsers(){
		return service.findAllTerminatedUsers();
	}
	
	@PatchMapping("/status/inactive/{id}")
	public ResponseStructure<User> setStatusToInactive(@PathVariable(name="id") Long id){
		return service.setStatusToInactive(id);
	}
	
	@PatchMapping("/status/blocked/{id}")
	public ResponseStructure<User> setStatusToBlocked(@PathVariable(name="id") Long id){
		return service.setStatusToBlocked(id);
	}
	
	@PatchMapping("/status/deleted/{id}")
	public ResponseStructure<User> setStatusToDeleted(@PathVariable(name="id") Long id){
		return service.setStatusToDeleted(id);
	}
	
	@PatchMapping("/status/terminated/{id}")
	public ResponseStructure<User> setStatusToTerminated(@PathVariable(name="id") Long id){
		return service.setStatusToTerminated(id);
	}
	@PatchMapping("/status/active/{id}")
	public ResponseStructure<User> setStatusToActive(@PathVariable(name="id") Long id){
		return service.setStatusToActive(id);
	}
	
	@GetMapping("/active/male")
	public ResponseStructure<List<User>> findAllActiveMaleUsers(){
		return service.findAllActiveMaleUsers();
	}
	@GetMapping("/active/female")
	public ResponseStructure<List<User>> findAllActiveFemaleUsers(){
		return service.findAllActiveFemaleUsers();
	}
	
	@GetMapping("/matches/{id}/{top}") //     /users/matches/11/3  ---------->{id} database records count
	public ResponseStructure<List<MatchingUser>> findAllMatches(@PathVariable(name="id") Long id,@PathVariable(name="top") Integer top){
		return service.findAllMatches(id,top);
	}
	
	

}
