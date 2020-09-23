package com.gestaofestas.controller;

import com.gestaofestas.repository.Convidados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvidadosController {
	@Autowired
	private Convidados convidados;

	@GetMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("lista-convidados");
		modelAndView.addObject("convidados", convidados.findAll());

		System.out.println("****** " + convidados.findAll().toString() + " *******");
		return modelAndView;
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}