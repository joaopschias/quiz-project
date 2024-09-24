package com.mycompany.projetoquizb.view;

import com.mycompany.projetoquizb.controller.QuizController;
import com.mycompany.projetoquizb.model.Question;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class QuizView extends JFrame {

    private QuizController controller;

    private JLabel questionLabel;
    private JLabel scoreLabel;
    private JLabel resultLabel;
    private JButton optionButton1;
    private JButton optionButton2;
    private JButton optionButton3;
    private JButton optionButton4;
    private JPanel panel;

    public QuizView(QuizController controller) {
        this.controller = controller;
        initComponents();
        updateQuestion();
    }

    private void initComponents() {
        panel = new JPanel();
        questionLabel = new JLabel();
        scoreLabel = new JLabel();
        resultLabel = new JLabel();
        optionButton1 = new JButton();
        optionButton2 = new JButton();
        optionButton3 = new JButton();
        optionButton4 = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz Game");

        panel.setLayout(new java.awt.GridLayout(6, 1));
        panel.add(questionLabel);
        panel.add(optionButton1);
        panel.add(optionButton2);
        panel.add(optionButton3);
        panel.add(optionButton4);
        panel.add(scoreLabel);
        panel.add(resultLabel);

        optionButton1.addActionListener(evt -> submitAnswer(0));
        optionButton2.addActionListener(evt -> submitAnswer(1));
        optionButton3.addActionListener(evt -> submitAnswer(2));
        optionButton4.addActionListener(evt -> submitAnswer(3));

        add(panel);
        pack();
    }

    private void updateQuestion() {
        if (controller.isQuizOver()) {
            showGameOverScreen();
        } else {
            Question currentQuestion = controller.getCurrentQuestion();
            questionLabel.setText(currentQuestion.getQuestionText());
            optionButton1.setText(currentQuestion.getOptions().get(0));
            optionButton2.setText(currentQuestion.getOptions().get(1));
            optionButton3.setText(currentQuestion.getOptions().get(2));
            optionButton4.setText(currentQuestion.getOptions().get(3));
        }
    }

    private void showGameOverScreen() {
        resultLabel.setText(controller.getFinalResult());
        scoreLabel.setText("Your score: " + controller.getScore() + " out of " + controller.getTotalQuestions());
    }

    private void submitAnswer(int optionIndex) {
        controller.submitAnswer(optionIndex);
        updateQuestion();
    }
}
