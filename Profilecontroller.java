package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Profileentity;
import com.example.demo.service.Profileservice;

@RestController
public class Profilecontroller {

	@Autowired 
	 Profileservice ss;
	
	@PostMapping("addprofile")
	public Profileentity add(@RequestBody Profileentity pp)
	{
		return ss.saveinfo(pp);
	}
	@PostMapping("addnprofile")
	public List<Profileentity> addn(@RequestBody List<Profileentity> pp)
	{
		return ss.savedetails(pp);
	}
	@GetMapping("showprofile")
	public List<Profileentity> show()
	{
		return ss.showinfo();
	}
}
