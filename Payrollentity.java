package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payrollentity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private long tax;
	private int attendance;
	private long salary;
	private long bonus;
	public Payrollentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payrollentity(int id, long tax, int attendance, long salary, long bonus) {
		super();
		this.id = id;
		this.tax = tax;
		this.attendance = attendance;
		this.salary = salary;
		this.bonus = bonus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getTax() {
		return tax;
	}
	public void setTax(long tax) {
		this.tax = tax;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getBonus() {
		return bonus;
	}
	public void setBonus(long bonus) {
		this.bonus = bonus;
	}
  
}
