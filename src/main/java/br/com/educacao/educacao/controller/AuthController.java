package br.com.educacao.educacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.educacao.educacao.dto.AlunoRegistroDTO;
import br.com.educacao.educacao.model.Aluno;
import br.com.educacao.educacao.model.Usuario;
import br.com.educacao.educacao.service.UsuarioService;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private UsuarioService service;

    @PostMapping("/register/aluno")
    public Aluno registrarAluno(@RequestBody AlunoRegistroDTO dto) {
    return service.registrarAluno(dto);
    }
   

    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {
        boolean ok = service.login(usuario.getUsername(), usuario.getPassword());

        if (ok) {
            return "LOGIN OK";
        } else {
            return "LOGIN INVALIDO";
        }
    }
}