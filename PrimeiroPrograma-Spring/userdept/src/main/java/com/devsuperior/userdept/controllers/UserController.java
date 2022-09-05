package com.devsuperior.userdept.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;

@RestController /* DECLARA QUE VAI SER UM CONTROLADOR (VAI FAZER REQUISIÇÕES CRUD) */
@RequestMapping(value = "/users") /* CAMINHO QUE VAI RESPONDER */
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping(value = "/{id}") //PEGA UM ID QUE O USUÁRIO VAI PASSAR
	public User find(@PathVariable Long id){
		User result = repository.findById(id).get();
		return result;
	}
	// RETORNA O USUÁRIO DO ID QUE FOI PASSADO NA URL	
		
	/*@GetMapping
	public List<User> findAll(){
		List<User> result = repository.findAll();
		return result;
		RETORNA TODOS OS USUÁRIOS
		*/
		
		@PostMapping //"INSERT" Salva um novo usuário
		public User insert(@RequestBody User user){
			User result = repository.save(user); //Salva um novo usuário no banco
			return result;
		
	}
}
