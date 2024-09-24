/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoquizb;

import com.mycompany.projetoquizb.model.Quiz;
import com.mycompany.projetoquizb.controller.QuizController;
import com.mycompany.projetoquizb.view.QuizView;
import com.mycompany.projetoquizb.seeders.QuizSeeder;

import javax.swing.SwingUtilities;

/**
 *
 * @author Aluno
 */
public class ProjetoQuizB {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Quiz quiz = new Quiz(QuizSeeder.seedQuestions());

            QuizController controller = new QuizController(quiz);

            QuizView view = new QuizView(controller);
            view.setVisible(true);
        });
    }
}

