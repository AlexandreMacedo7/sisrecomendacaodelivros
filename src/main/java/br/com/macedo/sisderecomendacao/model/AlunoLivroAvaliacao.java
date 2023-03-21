package br.com.macedo.sisderecomendacao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class AlunoLivroAvaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Aluno aluno;
    @ManyToOne
    private Livro livro;
    @ManyToOne
    private Avaliacao avaliacao;
}
