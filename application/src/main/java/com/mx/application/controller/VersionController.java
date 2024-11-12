package com.mx.application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class VersionController {

	@GetMapping()
	public ResponseEntity<String> getVersion(){
			
			System.out.println("::::::::: getAllServicios :::::::::::");
			
			return new ResponseEntity<> ( "Version: 1.0",HttpStatus.OK);
	 }
	
}
