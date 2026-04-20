package br.com.educacao.educacao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.educacao.educacao.dto.AlunoRegistroDTO;
import br.com.educacao.educacao.model.Aluno;
import br.com.educacao.educacao.model.Usuario;
import br.com.educacao.educacao.repository.AlunoRepository;
import br.com.educacao.educacao.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    // =========================
    // CADASTRO DE USUÁRIO
    // =========================
    public Usuario cadastrar(Usuario usuario) {

        if (usuarioRepository.findByUsername(usuario.getUsername()).isPresent()) {
            throw new RuntimeException("Username já existe");
        }

        usuario.setPassword(encoder.encode(usuario.getPassword()));
        return usuarioRepository.save(usuario);
    }

    // =========================
    // CADASTRO DE ALUNO
    // =========================
    public Aluno registrarAluno(AlunoRegistroDTO dto) {

        if (usuarioRepository.findByUsername(dto.getUsername()).isPresent()) {
            throw new RuntimeException("Username já existe");
        }

        // Criar usuário
        Usuario usuario = new Usuario();
        usuario.setUsername(dto.getUsername());
        usuario.setPassword(encoder.encode(dto.getPassword()));
        usuario.setRole("ALUNO");

        usuarioRepository.save(usuario);

        // Criar aluno e vincular
        Aluno aluno = new Aluno();
        aluno.setNome(dto.getNome());
        aluno.setCpf(dto.getCpf());
        aluno.setUsuario(usuario);

        return alunoRepository.save(aluno);
    }

    // =========================
    // LOGIN
    // =========================
    public boolean login(String username, String password) {

        return usuarioRepository.findByUsername(username)
                .map(user -> encoder.matches(password, user.getPassword()))
                .orElse(false);
    }
}