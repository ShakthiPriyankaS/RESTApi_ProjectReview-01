package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payrollentity;
import com.example.demo.service.Payrollservice;

@RestController
public class Payrollcontroller {

	@Autowired
	Payrollservice pe;
	
	@PostMapping("addpayroll")
	public Payrollentity add(@RequestBody Payrollentity pp)
	{
		return pe.saveinfo(pp);
	}
	@PostMapping("addnpayroll")
	public List<Payrollentity> addn(@RequestBody List<Payrollentity> pp)
	{
		return pe.savedetails(pp);
	}
	@PutMapping("updatebyid/{id}")
	public String modeifybyId(@PathVariable int id,@RequestBody Payrollentity pp)
	{
		return pe.updateinfobyid(id,pp);
	}
	@PutMapping("update")
	public Payrollentity modify(@RequestBody Payrollentity ss)
	{
		return pe.changeinfo(ss);
	}
	@GetMapping("showpId/{id}")
	public Optional<Payrollentity> getbyId(@PathVariable int id )
	{
		return pe.showbyid(id);

	}
	@GetMapping("showpayroll")
	public List<Payrollentity> show()
	{
		return pe.showinfo();
	}
	
}
