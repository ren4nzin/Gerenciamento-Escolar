package br.com.educacao.educacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.educacao.educacao.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}