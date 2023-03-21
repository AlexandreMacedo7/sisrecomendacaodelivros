package br.com.macedo.sisderecomendacao;

import br.com.macedo.sisderecomendacao.service.AlunoService;
import br.com.macedo.sisderecomendacao.util.LeituraCsv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SisderecomendacaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SisderecomendacaoApplication.class, args);

        //Criação de Alunos

        LeituraCsv leituraCsv = new LeituraCsv(new AlunoService());
        String caminhoArquivo = "alunos.csv";

        try {
            leituraCsv.lerArquivo(caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
