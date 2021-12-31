package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("quiz")
public class QuizController {

    private static List<String> questions = new ArrayList<>();


    @GetMapping("create")
    public String displayQuizForm(Model model) {

        questions.add("What is your favorite genre of music?");
        model.addAttribute("question", questions.get(0));

        return "quiz/create";
    }

    @GetMapping("question-two")
    public String displayQuestionTwo(Model model) {
        questions.add("What is your favorite meal?");
        model.addAttribute("questionTwo", questions.get(1));

        return "quiz/question-two";
    }

    @GetMapping("question-three")
    public String displayQuestionThree(Model model) {
        questions.add("What is your main fashion style?");
        model.addAttribute("questionThree", questions.get(2));

        return "quiz/question-three";
    }

    @GetMapping("question-four")
    public String displayQuestionFour(Model model) {
        questions.add("What kind of earrings do you like to wear the most?");
        model.addAttribute("questionFour", questions.get(3));

        return "quiz/question-four";
    }


    @GetMapping("question-five")
    public String displayQuestionFive(Model model) {
        questions.add("What is your favorite season of the year?");
        model.addAttribute("questionFive", questions.get(4));

        return "quiz/question-five";
    }

    @GetMapping("question-six")
    public String displayQuestionSix(Model model) {
        questions.add("How long do you want to wear this style?");
        model.addAttribute("questionSix", questions.get(5));

        return "quiz/question-six";
    }

    @GetMapping("question-seven")
    public String displayQuestionSeven(Model model) {
        questions.add("What is your favorite 90's show?");
        model.addAttribute("questionSeven", questions.get(6));

        return "quiz/question-seven";
    }

    @GetMapping("question-eight")
    public String displayQuestionEight(Model model) {
        questions.add("How do you like to spend your days off?");
        model.addAttribute("questionEight", questions.get(7));

        return "quiz/question-eight";
    }

    @GetMapping("question-nine")
    public String displayQuestionNine(Model model) {
        questions.add("How do you like to wear your makeup");
        model.addAttribute("questionNine", questions.get(8));

        return "quiz/question-nine";
    }

    @GetMapping("question-ten")
    public String displayQuestionTen(Model model) {
        questions.add("What is your favorite house/room decor style?");
        model.addAttribute("questionTen", questions.get(9));

        return "quiz/question-ten";
    }


    //keep track of answers
    //store answers
    //calculate answers

    @PostMapping("create")
    public String processCreateEventForm(Model model, HttpServletRequest request) throws ServletException, IOException {
        String choices = request.getParameter("answerChoices");
        model.addAttribute("answerChoices", choices);
        return "templates/index";
    }

    // on click display results of quiz
}
