package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpOperationController {
@GetMapping("/show")
	ResponseEntity<String> fetchData()
	{
		return new ResponseEntity<String>("Showing emp info",HttpStatus.OK);
	}
}
