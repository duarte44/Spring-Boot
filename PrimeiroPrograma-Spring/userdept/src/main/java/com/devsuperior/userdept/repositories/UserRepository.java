package com.devsuperior.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	/* UM OBJETO ESPECIFICO PARA ACESSAR OS DADOS DA ENTIDADE */
	
	/* Repositoris Spring JPA -- VOCÊ ACRESCENTA O 
	   "spring-boot-starter-data-jpa"  NO POM.XML  */       
	
	/* Repositoris Spring JPA -- SERVE PARA FAZER CONSULTAS NO BANCO DE DADOS */
}
