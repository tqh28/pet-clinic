package com.example.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owner")
@Controller
public class OwnerController {

	@RequestMapping({"/", ""})
	public String owner() {
		return "owner/index";
	}
}
