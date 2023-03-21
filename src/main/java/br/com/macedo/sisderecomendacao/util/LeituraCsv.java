package br.com.macedo.sisderecomendacao.util;

import br.com.macedo.sisderecomendacao.model.Aluno;
import br.com.macedo.sisderecomendacao.repository.AlunoRepository;
import br.com.macedo.sisderecomendacao.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
public class LeituraCsv {

    private final String DELIMITADOR = ",";
    private final AlunoService alunoService;

    @Autowired
    public LeituraCsv(AlunoService alunoService) {
        this.alunoService = alunoService;
    }


    public void lerArquivo(String arquivo) throws IOException{

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))){
            String linha;
            while ((linha = br.readLine())!= null){
                String[] colunas = linha.split(DELIMITADOR);
                Aluno aluno = criarAluno(colunas);
                alunoService.salvarAluno(aluno);
            }
        }
    }
    private Aluno criarAluno(String[] colunas){
        Aluno aluno = new Aluno();
        aluno.setNome(colunas[0]);
        aluno.setEmail(colunas[1]);
        aluno.setFone(colunas[2]);

        return aluno;
    }

}
