package com.mycompany.projetoquizb.model;

import java.util.List;

public class Quiz {
    private List<Question> questions;
    private int currentQuestionIndex;
    private Score score; // Usa a classe Score para gerenciar a pontuação

    public Quiz(List<Question> questions) {
        if (questions.size() < 10) {
            throw new IllegalArgumentException("O quiz deve conter no mínimo 10 questões.");
        }
        this.questions = questions;
        this.currentQuestionIndex = 0;
        this.score = new Score(questions.size()); // Inicializa com o número total de perguntas
    }

    public Question getCurrentQuestion() {
        return questions.get(currentQuestionIndex);
    }

    public boolean answerQuestion(int answerIndex) {
        Question currentQuestion = getCurrentQuestion();

        boolean isCorrect = currentQuestion.isAnswerCorrect(answerIndex);

        if (isCorrect) {
            score.incrementCorrectAnswers(); // Atualiza a pontuação usando a classe Score
        }

        currentQuestionIndex++;

        return isCorrect;
    }

    public boolean isQuizOver() {
        return currentQuestionIndex >= questions.size();
    }

    public int getScore() {
        return score.getCorrectAnswers();
    }

    public int getTotalQuestions() {
        return score.getTotalQuestions();
    }

    public String getFinalResult() {
        if (isQuizOver()) {
            double percentage = score.getPercentageScore();
            if (percentage >= 70) {
                return "Parabéns! Você foi muito bem no quiz.";
            } else {
                return "Você não atingiu a pontuação necessária. Tente novamente!";
            }
        }
        return "O quiz ainda não terminou.";
    }
}
