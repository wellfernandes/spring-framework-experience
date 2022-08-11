package one.digitalinnovation.academia.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.academia.entities.Aluno;
import one.digitalinnovation.academia.entities.Matricula;
import one.digitalinnovation.academia.entities.form.MatriculaForm;
import one.digitalinnovation.academia.repositories.AlunoRepository;
import one.digitalinnovation.academia.repositories.MatriculaRepository;
import one.digitalinnovation.academia.services.IMatriculaService;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;

	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public Matricula create(MatriculaForm form) {
		Matricula matricula = new Matricula();
		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

		matricula.setAluno(aluno);

		return matriculaRepository.save(matricula);
	}

	@Override
	public Matricula get(Long id) {
		return matriculaRepository.findById(id).get();
	}

	@Override
	public List<Matricula> getAll(String bairro) {

		if (bairro == null) {
			return matriculaRepository.findAll();
		} else {
			return matriculaRepository.findAlunosMatriculadosBairro(bairro);
		}
	}

	@Override
	public void delete(Long id) {
	}
}