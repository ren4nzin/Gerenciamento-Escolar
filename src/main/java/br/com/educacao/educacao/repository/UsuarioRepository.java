package br.com.educacao.educacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.educacao.educacao.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByUsername(String username);

}