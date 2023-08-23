package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payrollentity;
import com.example.demo.repository.Payrollrepo;

@Service
public class Payrollservice {
	
	@Autowired
	Payrollrepo pr;
	
	public Payrollentity saveinfo(Payrollentity pp)
	{
		return pr.save(pp);
	}
	public List<Payrollentity> savedetails(List<Payrollentity> ps)
	{
		return (List<Payrollentity>)pr.saveAll(ps);
	}
	public String updateinfobyid(int id,Payrollentity ss)
	{
		pr.saveAndFlush(ss);
		if(pr.existsById(id))
		{
			return "updated";
		}
		else
		{
			return "Enter valid id";
		}
	}
	public Optional<Payrollentity> showbyid(int id)
	{
		return pr.findById(id);
	}
	public Payrollentity changeinfo(Payrollentity ss)
	{
		return pr.saveAndFlush(ss);
	}
	public List<Payrollentity> showinfo()
	{
		return pr.findAll();
	}
}
