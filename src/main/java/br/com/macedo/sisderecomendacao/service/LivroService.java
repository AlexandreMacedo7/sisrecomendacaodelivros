package br.com.macedo.sisderecomendacao.service;

import br.com.macedo.sisderecomendacao.model.Livro;
import br.com.macedo.sisderecomendacao.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public Livro salvarLivro(Livro Livro){
        return livroRepository.save(Livro);
    }
    public List<Livro> listarLivros(){
        return livroRepository.findAll();
    }
    public Optional<Livro> buscarPorId(Long id){
        return livroRepository.findById(id);
    }
    public void removerPorId(Long id){
        livroRepository.deleteById(id);
    }
}
