package com.paltecno.tennisplayerspringdatarest.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String nationality;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date birthDate;
	private int titles;

	public Player() {
		super();
	}

	public Player(String name, String nationality, Date birthDate, int titles) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.birthDate = birthDate;
		this.titles = titles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getTitles() {
		return titles;
	}

	public void setTitles(int titles) {
		this.titles = titles;
	}

}
