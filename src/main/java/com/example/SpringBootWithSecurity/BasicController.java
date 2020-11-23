package com.example.SpringBootWithSecurity;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String entryPage() throws IOException {
	
		return "<h4>Welcome</h4>";
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public String user() {
		return "<h4>Welcome user</h4>";
	}
	
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public String amdin() {
		return "<h4>Welcome admin</h4>";
	}
}
