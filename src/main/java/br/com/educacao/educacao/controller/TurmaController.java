package br.com.educacao.educacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import br.com.educacao.educacao.model.Turma;
import br.com.educacao.educacao.repository.TurmaRepository;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @Autowired
    private TurmaRepository turmaRepository;

    @PostMapping
    public Turma criar(@RequestBody Turma turma) {
        return turmaRepository.save(turma);
    }

    @GetMapping
    public List<Turma> listar() {
        return turmaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Turma buscar(@PathVariable Long id) {
        return turmaRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Turma atualizar(@PathVariable Long id, @RequestBody Turma turma) {
        turma.setId(id);
        return turmaRepository.save(turma);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        turmaRepository.deleteById(id);
    }
}