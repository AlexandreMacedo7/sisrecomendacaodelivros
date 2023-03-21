package br.com.macedo.sisderecomendacao.service;

import br.com.macedo.sisderecomendacao.model.Avaliacao;
import br.com.macedo.sisderecomendacao.repository.AvaliacaoRepository;
import br.com.macedo.sisderecomendacao.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public Avaliacao salvarAvaliacao(Avaliacao Avaliacao){
        return avaliacaoRepository.save(Avaliacao);
    }
    public List<Avaliacao> listarAvaliacaos(){
        return avaliacaoRepository.findAll();
    }
    public Optional<Avaliacao> buscarPorId(Long id){
        return avaliacaoRepository.findById(id);
    }
    public void removerPorId(Long id){
        avaliacaoRepository.deleteById(id);
    }
}
