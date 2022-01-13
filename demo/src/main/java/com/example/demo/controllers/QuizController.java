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
        questions.add("What is your favorite meal?");
        model.addAttribute("question", questions.get(0));
        model.addAttribute("questionTwo", questions.get(1));

        return "quiz/question-one";
    }

//    @GetMapping("question-two")
//    public String displayQuestionTwo(Model model) {
//        questions.add("What is your favorite meal?");
//        model.addAttribute("questionTwo", questions.get(1));
//
//        return "quiz/question-two";
//    }
//
//    @GetMapping("question-three")
//    public String displayQuestionThree(Model model) {
//        questions.add("What is your main fashion style?");
//        model.addAttribute("questionThree", questions.get(2));
//
//        return "quiz/question-three";
//    }
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
    public String displayResults(Model model, @RequestParam(required = false) String answerChoicesForNumOne, @RequestParam(required=false) String answerChoicesForNumTwo) {


        if(answerChoicesForNumOne.equals("answerA")){
            answers.add(answerChoicesForNumOne);
            model.addAttribute("answers", answers);
        } else if (answerChoicesForNumOne.equals("answerB")){
            answers.add(answerChoicesForNumOne);
            model.addAttribute("answers", answers);
        } else if (answerChoicesForNumOne.equals("answerC")){
            answers.add(answerChoicesForNumOne);
            model.addAttribute("answers", answers);
        } else if(answerChoicesForNumOne.equals("answerD")){
            answers.add(answerChoicesForNumOne);
            model.addAttribute("answers", answers);
        } else {
            answers.add(answerChoicesForNumOne);
            model.addAttribute("answers", answers);
        }

        if(answerChoicesForNumTwo.equals("answerG")){
            answers.add(answerChoicesForNumTwo);
            model.addAttribute("answers", answers);
        } else if (answerChoicesForNumTwo.equals("answerF")){
            answers.add(answerChoicesForNumTwo);
            model.addAttribute("answers", answers);
        } else if (answerChoicesForNumTwo.equals("answerH")){
            answers.add(answerChoicesForNumTwo);
            model.addAttribute("answers", answers);
        } else if(answerChoicesForNumTwo.equals("answerI")){
            answers.add(answerChoicesForNumTwo);
            model.addAttribute("answers", answers);
        } else {
            answers.add(answerChoicesForNumTwo);
            model.addAttribute("answers", answers);
        }



//        answers.add(answerChoicesForNumOne);
//        answers.add(answerChoicesForNumTwo);
//        answers.add(answerChoicesForNumThree);

//        HashMap<String, Integer> userAnswer = new HashMap<>();
//            for( String answer : answers){
//
//                    if (!userAnswer.containsKey(answer)) {
//                        userAnswer.put(answer, 1);
//                        model.addAttribute("answers", userAnswer.get(0));
//                    } else {
//                        userAnswer.put(answer, userAnswer.get(answer) + 1);
//                        model.addAttribute("answers", userAnswer.get(1));
//                    }
//
//            }

//        int maxValueInMap = (Collections.max(userAnswer.values()));
//            for(Map.Entry<String, Integer> choice : userAnswer.entrySet()){
//                if(choice.getValue() == maxValueInMap){
//                    model.addAttribute("answers", choice.getKey());
//                } else {
//                    model.addAttribute("answers", "Answer not available");
//                }
//
//            }



        return "quiz/results";
    }

//    @PostMapping()
//    public String getAnswers( Model model, @RequestParam String answerChoicesForNumTwo){
//
//        if(answerChoicesForNumTwo.equals("answerA")){
//            answers.add(answerChoicesForNumTwo);
//            model.addAttribute("answers", answers.get(1));
//        } else if (answerChoicesForNumTwo.equals("answerB")){
//            model.addAttribute("answers", "answerB");
//        } else if (answerChoicesForNumTwo.equals("answerC")){
//            model.addAttribute("answers", "answerC");
//        } else if(answerChoicesForNumTwo.equals("answerD")){
//            model.addAttribute("answers", "answerD");
//        } else {
//            model.addAttribute("answers", "answerE");
//        }
//
//        return "redirect:/quiz/results";
//
//    }



    // on click display results of quiz

}
