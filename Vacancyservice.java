package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.VacancyEntity;
import com.example.demo.repository.Vacancyrepo;

@Service
public class Vacancyservice {
	
	@Autowired
	Vacancyrepo vr;
	
	public VacancyEntity savinfo(VacancyEntity vv)
	{
		return vr.save(vv);
	}
	
	public List<VacancyEntity> savedetails(List<VacancyEntity> vv)
	{
		return (List<VacancyEntity>)vr.saveAll(vv);
	}
    
	public List<VacancyEntity> showinfo()
	{
		return vr.findAll();
	}
	public void deleteid(int id)
	{
		vr.deleteById(id);
	}
}
