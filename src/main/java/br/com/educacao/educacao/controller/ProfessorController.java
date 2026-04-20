package br.com.educacao.educacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import br.com.educacao.educacao.model.Professor;
import br.com.educacao.educacao.repository.ProfessorRepository;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @PostMapping
    public Professor criar(@RequestBody Professor professor) {
        return professorRepository.save(professor);
    }

    @GetMapping
    public List<Professor> listar() {
        return professorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Professor buscar(@PathVariable Long id) {
        return professorRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Professor atualizar(@PathVariable Long id, @RequestBody Professor professor) {
        professor.setId(id);
        return professorRepository.save(professor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        professorRepository.deleteById(id);
    }
}