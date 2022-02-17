package com.Abhishek.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Abhishek.springboot.model.CreditCard;
import com.Abhishek.springboot.service.CreditService;

@RestController
public class CreditCardValidator
{

	@Autowired
	CreditService service;
	
	@RequestMapping(value="/validate", method=RequestMethod.PUT)
	public CreditCard validate(@RequestParam("credit_card") String card) {
		CreditCard check = service.validate(card);
		return check;
	}
	
	@RequestMapping("/check")
	public String checking() {
		String s = service.check();
		return s;
	}
}
