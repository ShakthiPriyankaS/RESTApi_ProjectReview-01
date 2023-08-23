package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Profileentity;
import com.example.demo.repository.Profilerepo;

@Service
public class Profileservice {
	
	@Autowired
	Profilerepo pr;
	
	public Profileentity saveinfo(Profileentity pe)
	{
		return pr.save(pe);
	}
	
	public List<Profileentity> savedetails(List<Profileentity> pe)
	{
		return (List<Profileentity>)pr.saveAll(pe);
	}
	public List<Profileentity> showinfo()
	{
		return pr.findAll();
	}
}
