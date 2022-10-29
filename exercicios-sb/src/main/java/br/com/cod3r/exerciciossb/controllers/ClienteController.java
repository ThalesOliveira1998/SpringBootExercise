package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Cliente;



@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28 , "pedro", "10223");
	}

	@GetMapping("/{id}")
	public Cliente obterClientePorId(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654");
	}
}
