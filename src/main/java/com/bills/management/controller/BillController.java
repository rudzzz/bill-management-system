package com.bills.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bills.management.model.Bill;

@Controller
@RequestMapping("/bill")
public class BillController {
	
	@GetMapping("/new")
	public String novo() {
		return "RegisterBill";
	}
	
	@PostMapping()
	public String save(Bill bill) {
		System.out.println("bill: " + bill.getDescription());
		return "RegisterBill";
	}
}
