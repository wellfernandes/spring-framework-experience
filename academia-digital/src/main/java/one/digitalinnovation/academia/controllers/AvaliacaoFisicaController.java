package one.digitalinnovation.academia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.academia.entities.AvaliacaoFisica;
import one.digitalinnovation.academia.entities.form.AvaliacaoFisicaForm;
import one.digitalinnovation.academia.services.impl.AvaliacaoFisicaServiceImpl;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

	@Autowired
	private AvaliacaoFisicaServiceImpl service;

	@PostMapping
	public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
		return service.create(form);
	}

	@GetMapping
	public List<AvaliacaoFisica> getAll() {
		return service.getAll();
	}

}