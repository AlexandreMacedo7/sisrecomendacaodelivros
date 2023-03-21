package br.com.macedo.sisderecomendacao.repository;

import br.com.macedo.sisderecomendacao.model.Avaliacao;
import br.com.macedo.sisderecomendacao.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
}
