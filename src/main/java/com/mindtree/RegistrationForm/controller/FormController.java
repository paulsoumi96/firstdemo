package com.mindtree.RegistrationForm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.RegistrationForm.entity.Form;
import com.mindtree.RegistrationForm.repository.FormRepository;


@RestController
public class FormController {
	
	@Autowired
	private FormRepository formrepo;
	
	@GetMapping("/getData")
	public List<Form> getAll(){
		System.out.println("hii");
		return formrepo.findAll();
	}
	@PostMapping("/postData")
	public Form postdata(@RequestBody Form form) {
		System.out.println("hii");
		return formrepo.save(form);
	}
}
