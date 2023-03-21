package br.com.macedo.sisderecomendacao.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String nome;
    private String email;
    @NotNull
    private String fone;
    @OneToMany(mappedBy = "aluno")
    private List<AlunoLivroAvaliacao> listaAlunoLivroAvaliacao = new ArrayList<>();

}
