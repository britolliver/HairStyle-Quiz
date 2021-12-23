package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

//    @PostMapping("create")
//    public String processCreateEventForm(Model model) {
//        List<String> questions = new ArrayList<>();
//        questions.add("What is your favorite genre of music?");
//
//       model.addAttribute("question", questions);
//        return "templates/index";
//    }

}
