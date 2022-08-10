package one.digitalinnovation.academia.entities;

import java.time.LocalDateTime;

public class AvaliacaoFisica {

	private Long id;
	private Aluno aluno;
	private LocalDateTime dataDaAvaliacao = LocalDateTime.now();
	private Double peso;
	private Double altura;

}
