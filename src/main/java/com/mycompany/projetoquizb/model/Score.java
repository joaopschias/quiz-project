package com.mycompany.projetoquizb.model;

public class Score {
    private int totalQuestions;
    private int correctAnswers;

    public Score(int totalQuestions) {
        this.totalQuestions = totalQuestions;
        this.correctAnswers = 0;
    }

    public void incrementCorrectAnswers() {
        correctAnswers++;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public double getPercentageScore() {
        return ((double) correctAnswers / totalQuestions) * 100;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public boolean isPassingScore() {
        return getPercentageScore() >= 70;
    }
}
