package com.mycompany.projetoquizb.model;

import java.util.List;

public class Question {
    private String title;
    private List<String> options;
    private int correctAnswerIndex;

    public Question(String title, List<String> options, int correctAnswerIndex) {
        if (options.size() != 4) {
            throw new IllegalArgumentException("Cada questão deve ter exatamente 4 opções.");
        }
        this.title = title;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestionText() {
        return title;
    }

    public List<String> getOptions() {
        return options;
    }

    public boolean isAnswerCorrect(int answerIndex) {
        return answerIndex == correctAnswerIndex;
    }
}
