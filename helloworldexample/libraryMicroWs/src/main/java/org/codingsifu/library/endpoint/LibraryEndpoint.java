package org.codingsifu.library.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryEndpoint {

	@RequestMapping("/getWelcomeMsg")
	public String getWelcomeMsg() {
		return "Welcome to our Library";
	}
}
