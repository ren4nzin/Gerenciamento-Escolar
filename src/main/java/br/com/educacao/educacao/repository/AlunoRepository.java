package br.com.educacao.educacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.educacao.educacao.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}