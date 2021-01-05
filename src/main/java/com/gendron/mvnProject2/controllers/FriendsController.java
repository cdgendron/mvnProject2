package com.gendron.mvnProject2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gendron.mvnProject2.entity.Friend;
import com.gendron.mvnProject2.service.FriendsService;

@RestController
public class FriendsController {

	@Autowired
	FriendsService service; 
	
	@RequestMapping(value="/friends", method=RequestMethod.POST)
	public Friend addFriend(@RequestBody Friend friend) {
		return service.createFriend(friend);
	}
	
	@RequestMapping("/friends")
	public Iterable<Friend> getFriends() {
		return service.getFriends(); 
	}
	
}
