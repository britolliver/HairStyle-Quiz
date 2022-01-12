package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import java.util.*;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("quiz")
public class QuizController {

    private static List<String> questions = new ArrayList<>();
    private static List<String> answers = new ArrayList<>();


    @GetMapping("question-one")
    public String displayQuizForm(Model model) {

        questions.add("What is your favorite genre of music?");
        model.addAttribute("question", questions.get(0));

        return "quiz/question-one";
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
//
//    @GetMapping("question-four")
//    public String displayQuestionFour(Model model) {
//        questions.add("What kind of earrings do you like to wear the most?");
//        model.addAttribute("questionFour", questions.get(3));
//
//        return "quiz/question-four";
//    }
//
//
//    @GetMapping("question-five")
//    public String displayQuestionFive(Model model) {
//        questions.add("What is your favorite season of the year?");
//        model.addAttribute("questionFive", questions.get(4));
//
//        return "quiz/question-five";
//    }
//
//    @GetMapping("question-six")
//    public String displayQuestionSix(Model model) {
//        questions.add("How long do you want to wear this style?");
//        model.addAttribute("questionSix", questions.get(5));
//
//        return "quiz/question-six";
//    }
//
//    @GetMapping("question-seven")
//    public String displayQuestionSeven(Model model) {
//        questions.add("What is your favorite 90's show?");
//        model.addAttribute("questionSeven", questions.get(6));
//
//        return "quiz/question-seven";
//    }
//
//    @GetMapping("question-eight")
//    public String displayQuestionEight(Model model) {
//        questions.add("How do you like to spend your days off?");
//        model.addAttribute("questionEight", questions.get(7));
//
//        return "quiz/question-eight";
//    }
//
//    @GetMapping("question-nine")
//    public String displayQuestionNine(Model model) {
//        questions.add("How do you like to wear your makeup");
//        model.addAttribute("questionNine", questions.get(8));
//
//        return "quiz/question-nine";
//    }
//
//    @GetMapping("question-ten")
//    public String displayQuestionTen(Model model) {
//        questions.add("What is your favorite house/room decor style?");
//        model.addAttribute("questionTen", questions.get(9));
//
//        return "quiz/question-ten";
//    }


    //keep track of answers
    //store answers
    //calculate answers

    @PostMapping("results")
    public String displayResults(Model model, @RequestParam(required=false) String answerChoicesForNumOne, @RequestParam(required=false) String answerChoicesForNumTwo, @RequestParam(required = false) String answerChoicesForNumThree) {
//        if(answerChoicesForNumOne.equals("answerA")){
//            model.addAttribute("answers", "answerA");
//        } else if (answerChoicesForNumOne.equals("answerB")){
//            model.addAttribute("answers", "answerB");
//        } else if (answerChoicesForNumOne.equals("answerC")){
//            model.addAttribute("answers", "answerC");
//        } else if(answerChoicesForNumOne.equals("answerD")){
//            model.addAttribute("answers", "answerD");
//        } else {
//            model.addAttribute("answers", "answerE");
//        }

        answers.add(answerChoicesForNumOne);
        answers.add(answerChoicesForNumTwo);
        answers.add(answerChoicesForNumThree);

        HashMap<String, Integer> userAnswer = new HashMap<>();
            for( String answer : answers){

                    if (!userAnswer.containsKey(answer)) {
                        userAnswer.put(answer, 1);
                    } else {
                        userAnswer.put(answer, userAnswer.get(answer) + 1);
                    }


            }

        int maxValueInMap = (Collections.max(userAnswer.values()));
            for(Map.Entry<String, Integer> choice : userAnswer.entrySet()){
                if(choice.getValue() == maxValueInMap){
                    model.addAttribute("answers", choice.getKey());
                }

            }



        return "quiz/results";
    }

//    @PutMapping("results")
//    public String getAnswers(@RequestParam String answerChoicesForNumOne, @RequestParam String answerChoicesForNumTwo, @RequestParam String answerChoicesForNumThree){
//
//        if (answerChoicesForNumOne.contains("answerA")){
//            answersForQuestionOne.add(answerChoicesForNumOne);
//
//        } else if (answerChoicesForNumOne.contains("answerB")){
//            answersForQuestionOne.add(answerChoicesForNumOne);
//        } else if(answerChoicesForNumOne.contains("answerC")){
//            answersForQuestionOne.add(answerChoicesForNumOne);
//        } else if(answerChoicesForNumOne.contains("answerD")){
//            answersForQuestionOne.add(answerChoicesForNumOne);
//        } else {
//            answersForQuestionOne.add(answerChoicesForNumOne);
//        }
//
//        return "redirect:/quiz/results";
//
//    }



    // on click display results of quiz

}
