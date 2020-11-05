package com.todo.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InquiryController {
	@GetMapping("inquiry/form")
	public String displayForm() {
		return "inquiry/form";
	}
	
	@PostMapping("inquiry/confirm")
		public String displayConfirm() {
			return "inquiry/confirm";
	}
}
