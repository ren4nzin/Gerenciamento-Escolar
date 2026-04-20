package br.com.educacao.educacao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.educacao.educacao.model.Aluno;
import br.com.educacao.educacao.model.Usuario;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Optional<Aluno> findByUsuario(Usuario usuario);

}