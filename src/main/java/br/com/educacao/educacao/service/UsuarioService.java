package br.com.educacao.educacao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.educacao.educacao.model.Usuario;
import br.com.educacao.educacao.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public Usuario cadastrar(Usuario usuario) {
        usuario.setPassword(encoder.encode(usuario.getPassword()));
        return repository.save(usuario);
    }

    public boolean login(String username, String password) {
        Usuario user = repository.findByUsername(username).orElse(null);

        if (user != null && encoder.matches(password, user.getPassword())) {
            return true;
        }
        return false;
    }
}