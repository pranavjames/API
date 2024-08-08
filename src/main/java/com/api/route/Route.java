package com.api.route;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.service.Services;

@RestController
@RequestMapping("/api/v1")
public class Route {

	@Autowired
	Services service;
	
	@GetMapping("get")
	public ResponseEntity<String> get(){
		return new ResponseEntity<>("got the response", HttpStatus.OK);
	}
	
	@GetMapping("getall")
	public ResponseEntity<List<String>> getAll(){
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("add/{element}")
	public ResponseEntity<Boolean> addElement(@PathVariable String element){
		return new ResponseEntity<>(service.addElement(element), HttpStatus.OK);
	}
	
	@GetMapping("delete/{element}")
	public ResponseEntity<Boolean> removeElement(@PathVariable String element){
		return new ResponseEntity<>(service.removeElement(element), HttpStatus.OK);
	}
	
}
