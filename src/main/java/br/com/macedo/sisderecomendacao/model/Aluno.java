package br.com.macedo.sisderecomendacao.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "alunos")
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String nome;
    private String email;
    @NotNull
    private String fone;
    @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)
    private List<AlunoLivroAvaliacao> listaAlunoLivroAvaliacao = new ArrayList<>();

}
