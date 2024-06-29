package com.ProyectoSENA.modulo;

import com.ProyectoSENA.modulo.controllers.InformacionClientes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Anotación que indica que esta clase es un controlador REST de Spring
@RestController

// Anotación que indica que esta es una aplicación Spring Boot
@SpringBootApplication

public class Programa {

	// Método principal que arranca la aplicación Spring Boot
	public static void main(String[] args) {
		SpringApplication.run(Programa.class, args);
	}

	// Este método responde a las solicitudes 'get' que se hacen a la URL "/clientes"
	@GetMapping("/clientes")
	
	// Método que devuelve una instancia de InformacionClientes
	public InformacionClientes messageView(){

		// Retorna una nueva instancia de InformacionClientes con los valores escritos en su respectivo campo
		return new InformacionClientes(1, "Eduardo", "Mcnugget", 1000230445, 1234567890);
	}
}
