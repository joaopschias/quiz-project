package com.mycompany.projetoquizb.controller;

import com.mycompany.projetoquizb.model.Question;
import com.mycompany.projetoquizb.model.Quiz;

public class QuizController {
    private Quiz quiz;

    public QuizController(Quiz quiz) {
        this.quiz = quiz;
    }

    public Question getCurrentQuestion() {
        return quiz.getCurrentQuestion();
    }

    public boolean submitAnswer(int answerIndex) {
        return quiz.answerQuestion(answerIndex);
    }

    public boolean isQuizOver() {
        return quiz.isQuizOver();
    }

    public int getScore() {
        return quiz.getScore();
    }

    public String getFinalResult() {
        return quiz.getFinalResult();
    }

    public int getTotalQuestions() {
        return quiz.getTotalQuestions();
    }
}
