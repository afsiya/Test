package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Apartment;
import com.example.demo.model.Visitor;
import com.example.demo.service.AppartmentService;


@RestController
public class Controller {
	@Autowired(required=false)
	private AppartmentService s;

	@PostMapping("/getid")
	public Apartment add(@RequestBody Apartment a) {
		s.add(a);
		
	return a;
	}
	
	@GetMapping("/getid/{id}")
	public Apartment getById(@PathVariable Integer id) {
		Apartment a=s.getByApartmentid(id);
		
	return a;
	}
	@GetMapping("/visitor/{id}/{date}/{atype}")
	public Visitor getVisitor(@PathVariable Integer id,@PathVariable String date,@PathVariable String atype) {
		if(atype.equals("admin"))
		{
		Visitor v=s.getVisitor(id, date);
		return v;
		}
		else
		{
			return null;
		}
		
	
	}
	@GetMapping("/getall")
	public List<Apartment>findall()
	{
		List<Apartment>list=s.getall();
		return list.stream().sorted((p1, p2)->p1.getAddress().getHouseNo().compareTo(p2.getAddress().getHouseNo())) .collect(Collectors.toList());
		
	}
}
