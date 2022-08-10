package one.digitalinnovation.academia.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import one.digitalinnovation.academia.entities.Aluno;
import one.digitalinnovation.academia.entities.AvaliacaoFisica;
import one.digitalinnovation.academia.repositories.AlunoRepository;
import one.digitalinnovation.academia.repositories.AvaliacaoFisicaRepository;
import one.digitalinnovation.academia.services.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

	@Autowired
	private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
		AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

		avaliacaoFisica.setAluno(aluno);
		avaliacaoFisica.setPeso(form.getPeso());
		avaliacaoFisica.setAltura(form.getAltura());

		return avaliacaoFisicaRepository.save(avaliacaoFisica);
	}

	@Override
	public AvaliacaoFisica get(Long id) {
		return null;
	}

	@Override
	public List<AvaliacaoFisica> getAll() {

		return avaliacaoFisicaRepository.findAll();
	}

	@Override
	public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}
}