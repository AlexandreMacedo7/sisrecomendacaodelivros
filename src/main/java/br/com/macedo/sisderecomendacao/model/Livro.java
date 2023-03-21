package br.com.macedo.sisderecomendacao.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String titulo;
    @NotNull
    private String autor;
    @NotNull
    private String editora;
    @NotNull
    @Column(name = "ano_publicacao")
    private Integer anoPublicaao;

}
