package br.com.educacao.educacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.educacao.educacao.model.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
}