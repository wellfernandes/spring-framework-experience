package wellfernandes.com.github.application;

import java.time.LocalDate;

import wellfernandes.com.github.dominio.Bootcamp;
import wellfernandes.com.github.dominio.Curso;
import wellfernandes.com.github.dominio.Dev;
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

		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("bootcamp java developer");
		bootcamp1.setDescricao("descrição bootcamp java developer");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria1);

		Dev dev1 = new Dev();
		dev1.setNome("Dev 1");
		dev1.inscreverBootCamp(bootcamp1);
		System.out.println("Conteúdos inscritos do Dev1" + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("Conteúdos inscritos do Dev1" + dev1.getConteudosInscritos());
		System.out.println("Conteúdos concluídos do Dev1" + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());

		System.out.println("---------------------------------------------");

		Dev dev2 = new Dev();
		dev2.setNome("Dev 2");
		dev2.inscreverBootCamp(bootcamp1);
		System.out.println("Conteúdos inscritos do Dev2" + dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("Conteúdos inscritos do Dev2" + dev2.getConteudosInscritos());
		System.out.println("Conteúdos concluídos do Dev2" + dev2.getConteudosConcluidos());
		dev2.progredir();
		System.out.println("XP: " + dev2.calcularTotalXp());
	}
}
