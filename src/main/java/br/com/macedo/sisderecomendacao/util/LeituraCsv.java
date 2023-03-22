package br.com.macedo.sisderecomendacao.util;

import br.com.macedo.sisderecomendacao.model.Aluno;
import br.com.macedo.sisderecomendacao.service.AlunoService;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.stereotype.Component;


import java.io.FileReader;
import java.io.IOException;

@Component
public class LeituraCsv {

    private final AlunoService alunoService;

    public LeituraCsv(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    public void lerArquivo(String arquivo) throws IOException {
        try (CSVReader reader = new CSVReader(new FileReader(arquivo))) {
            String[] colunas;
            while ((colunas = reader.readNext()) != null) {
                Aluno aluno = criarAluno(colunas);
                alunoService.salvarAluno(aluno);
            }
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
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
