package com.telco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_customer_details")
public class CustomersDetails {

	/////this will keep track of customers full details
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;


	@Column(name = "surname")
	private String surname;

	@Column(name = "First_name")
	private  String First_name;

	@Column(name = "second_name")
	private String second_name;
	
	
	@Column(name = "id_number")
	private  String id_number;
	
	@Column(name = "phone_number")
	private  String phone_number;

	@Column(name = "reg_date")
	private  String reg_date;
	
	
	///active/ inactive
	@Column(name = "status")
	private  String status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirst_name() {
		return First_name;
	}

	public void setFirst_name(String first_name) {
		First_name = first_name;
	}

	public String getSecond_name() {
		return second_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}

	public String getId_number() {
		return id_number;
	}

	public void setId_number(String id_number) {
		this.id_number = id_number;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CustomersDetails(long id, String surname, String first_name, String second_name, String id_number,
			String phone_number, String reg_date, String status) {
		super();
		this.id = id;
		this.surname = surname;
		First_name = first_name;
		this.second_name = second_name;
		this.id_number = id_number;
		this.phone_number = phone_number;
		this.reg_date = reg_date;
		this.status = status;
	}
	
	
	
	
	
	
	
}
