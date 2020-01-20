package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Ativada quando entrar em alguma URL do servidor
@RestController 
public class ControllerTeste {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "<marquee>Hello World! Nosso primeiro projeto SpringBoot</marquee>";
	}
	@GetMapping("/tchal")
	public String tchal() {
		System.out.println(" \" ");
		return "<marquee><h1> Adeus, Matheus </h1></marquee>";
	}
}
