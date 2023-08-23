package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.VacancyEntity;
import com.example.demo.service.Vacancyservice;

@RestController
public class Vacancycontroller {
	
	@Autowired
	Vacancyservice sser;
	
	@PostMapping("addvacancy")
	public VacancyEntity add(@RequestBody VacancyEntity vs)
	{
		return sser.savinfo(vs);
	}
	@PostMapping("addnvacancy")
	public List<VacancyEntity> addn(@RequestBody List<VacancyEntity> vs)
	{
		return sser.savedetails(vs);
	}
	@DeleteMapping("deleteId/{id}")
	public void deleteById(@PathVariable int id)
	{
		sser.deleteid(id);

	}
    @GetMapping("showvacancy")
	public List<VacancyEntity> show()
	{
		return sser.showinfo();
	}
}
