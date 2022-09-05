package com.devsuperior.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user") /* Anotação para relacionar com o banco */
public class User {

	@Id /* declara que vai ser chave primaria*/
	@GeneratedValue(strategy = GenerationType.IDENTITY) /* auto increment*/
	private Long id;
	private String name;
	private String email;
	
	@ManyToOne /* RELAÇÃO DAS TABELAS DO BANCO 'MUITOS PARA UM' */
	@JoinColumn(name = "department_id") /* CONFIGURAÇÃO DA CHAVE ESTRANJEIRA DO BANCO */
	private Department deparment;
	
	public User() {
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDeparment() {
		return deparment;
	}

	public void setDeparment(Department deparment) {
		this.deparment = deparment;
	}
	
}
