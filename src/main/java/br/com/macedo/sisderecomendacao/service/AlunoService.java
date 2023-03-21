package br.com.macedo.sisderecomendacao.service;

import br.com.macedo.sisderecomendacao.model.Aluno;
import br.com.macedo.sisderecomendacao.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno salvarAluno(Aluno aluno){
        return alunoRepository.save(aluno);
    }
    public List<Aluno> listarAlunos(){
        return alunoRepository.findAll();
    }
    public Optional<Aluno> buscarPorId(Long id){
        return alunoRepository.findById(id);
    }
    public void removerPorId(Long id){
        alunoRepository.deleteById(id);
    }
}
