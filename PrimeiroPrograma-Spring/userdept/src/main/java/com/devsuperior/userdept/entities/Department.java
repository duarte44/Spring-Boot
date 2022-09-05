package com.devsuperior.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_department") /* Anotação para relacionar com o banco */
public class Department {
	
	@Id /* declara que vai ser chave primaria*/
	@GeneratedValue(strategy = GenerationType.IDENTITY) /* auto increment*/
	private Long id;
	private String name;
	
	public Department() {
		
	}
		

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
