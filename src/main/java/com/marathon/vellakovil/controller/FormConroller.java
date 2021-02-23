package com.marathon.vellakovil.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormConroller {

	private static final Logger log = LoggerFactory.getLogger(FormConroller.class);

	@GetMapping("/")
	public String home(Model model) {

		return "index";
	}

	@GetMapping("/register")
	public String registration(Model model) {

		return "registration";
	}

}
