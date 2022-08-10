package one.digitalinnovation.academia.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.academia.entities.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

	/**
	 *
	 * @param bairro bairro referência para o filtro
	 * @return lista de alunos matriculados que residem no bairro passado como
	 *         parâmetro
	 */
	@Query(value = "SELECT * FROM tb_matriculas m " + "INNER JOIN tb_alunos a ON m.aluno_id = a.id "
			+ "WHERE a.bairro = :bairro", nativeQuery = true)
	// @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
	List<Matricula> findAlunosMatriculadosBairro(String bairro);

	// List<Matricula> findByAlunoBairro(String bairro);
}