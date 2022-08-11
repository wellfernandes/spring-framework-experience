package one.digitalinnovation.academia.services.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.academia.entities.Aluno;
import one.digitalinnovation.academia.entities.AvaliacaoFisica;
import one.digitalinnovation.academia.entities.form.AlunoForm;
import one.digitalinnovation.academia.entities.form.AlunoUpdateForm;
import one.digitalinnovation.academia.infra.utils.JavaTimeUtils;
import one.digitalinnovation.academia.repositories.AlunoRepository;
import one.digitalinnovation.academia.services.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService {

	@Autowired
	private AlunoRepository repository;

	@Override
	public Aluno create(AlunoForm form) {
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setCpf(form.getCpf());
		aluno.setBairro(form.getBairro());
		aluno.setDataDeNascimento(form.getDataDeNascimento());

		return repository.save(aluno);
	}

	@Override
	public Aluno get(Long id) {
		return null;
	}

	@Override
	public List<Aluno> getAll(String dataDeNascimento) {

		if (dataDeNascimento == null) {
			return repository.findAll();
		} else {
			LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
			return repository.findByDataDeNascimento(localDate);
		}

	}

	@Override
	public Aluno update(Long id, AlunoUpdateForm formUpdate) {
		return null;
	}

	@Override
	public void delete(Long id) {
	}

	@Override
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

		Aluno aluno = repository.findById(id).get();

		return aluno.getAvaliacoes();

	}

}
