package com.mycompany.projetoquizb.seeders;

import com.mycompany.projetoquizb.model.Question;
import java.util.ArrayList;
import java.util.List;

public class QuizSeeder {

    public static List<Question> seedQuestions() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question("Qual foi a primeira capital do Brasil?",
                List.of("Rio de Janeiro", "Brasília", "Salvador", "São Paulo"), 2));

        questions.add(new Question("Quem descobriu o Brasil?",
                List.of("Cristóvão Colombo", "Pero Vaz de Caminha", "Lula", "Pedro Álvares Cabral"), 3));

        questions.add(new Question("Quem foi o primeiro presidente do Brasil?",
                List.of("Dom Pedro II", "Marechal Deodoro da Fonseca", "Getúlio Vargas", "Dom Pedro I"), 1));

        questions.add(new Question("Qual foi o principal produto econômico do Brasil durante o período colonial?",
                List.of("Açúcar", "Café", "Leite", "Soja"), 0));

        questions.add(new Question("O que era mais valioso no Brasil colonial?",
                List.of("Pau-brasil", "Ouro", "Nióbio", "Açúcar"), 0));

        questions.add(new Question("Quem declarou a independência do Brasil?",
                List.of("Dom Pedro II", "Marechal Deodoro da Fonseca", "Duque de Caxias", "Dom Pedro I"), 3));

        questions.add(new Question("Qual evento marcou o fim do período monárquico no Brasil e o início da república em 1889?",
                List.of("Proclamação da Independência", "Revolta da Chibata", "Proclamação da República", "Revolução"), 2));

        questions.add(new Question("Como o Brasil foi dividido na época colonial?",
                List.of("Estados", "Acres", "Hectares", "Capitanias Hereditárias"), 3));

        questions.add(new Question("Qual foi o movimento popular ocorrido em 1930 que resultou na ascensão de Getúlio Vargas ao poder?",
                List.of("Revolução Constitucionalista", "Revolta de Canudos", "União Ibérica", "Tratado de Tordesilhas"), 0));

        questions.add(new Question("Qual presidente instaurou os direitos trabalhistas?",
                List.of("Getúlio Vargas", "Juscelino Kubitschek", "Ayrton Senna", "Lula"), 0));

        return questions;
    }
}
