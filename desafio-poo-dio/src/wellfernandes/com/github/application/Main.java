package wellfernandes.com.github.application;

import java.time.LocalDate;

import wellfernandes.com.github.dominio.Curso;
import wellfernandes.com.github.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		// data mock
		Curso curso1 = new Curso();

		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição do curso java");
		curso1.setCargaHoraria(8);

		System.out.println(curso1);

		Curso curso2 = new Curso();

		curso2.setTitulo("curso javascript");
		curso2.setDescricao("descrição do curso javascript");
		curso2.setCargaHoraria(4);

		System.out.println(curso2);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria de java");
		mentoria1.setDescricao("descrição da mentoria de java");
		mentoria1.setData(LocalDate.now());

		System.out.println(mentoria1);
	}
}
