package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import java.util.*;

/**
 * Created by Chris Bays
 */
@Controller
@RequestMapping("quiz")
public class QuizController {

    private static List<String> questions = new ArrayList<>();

    private static List<String> allAnswers = new ArrayList<>();

    private static ArrayList<String> answerA =new ArrayList<>();
    private static ArrayList<String> answerB= new ArrayList<>();
    private static ArrayList<String> answerC = new ArrayList<>();
    private static ArrayList<String> answerD = new ArrayList<>();
    private static ArrayList<String> answerE = new ArrayList<>();





    @GetMapping("question-one")
    public String displayQuizForm(Model model) {

        questions.add("What is your favorite genre of music?");
        questions.add("What is your favorite meal?");
        questions.add("What is your main fashion style?");
        questions.add("What kind of earrings do you like to wear the most?");
        questions.add("What is your favorite season of the year?");
        questions.add("How long do you want to wear this style?");
        questions.add("What is your favorite 90's show?");
        questions.add("How do you like to spend your days off?");
        questions.add("How do you like to wear your makeup");
        questions.add("What is your favorite house/room decor style?");
        model.addAttribute("question", questions.get(0));
        model.addAttribute("questionTwo", questions.get(1));
        model.addAttribute("questionThree", questions.get(2));
        model.addAttribute("questionFour", questions.get(3));
        model.addAttribute("questionFive", questions.get(4));
        model.addAttribute("questionSix", questions.get(5));
        model.addAttribute("questionSeven", questions.get(6));
        model.addAttribute("questionEight", questions.get(7));
        model.addAttribute("questionNine", questions.get(8));
        model.addAttribute("questionTen", questions.get(9));

        return "quiz/question-one";
    }


    //keep track of answers
    //store answers
    //calculate answers
    //display Resultd

    @PostMapping("results")
    public String getAndDisplayResults(Model model, @RequestParam(required = false) String answerChoicesForNumOne, @RequestParam(required=false) String answerChoicesForNumTwo, @RequestParam(required = false) String answerChoicesForNumThree,
                                 @RequestParam(required = false) String answerChoicesForNumFour, @RequestParam(required = false) String answerChoicesForNumFive, @RequestParam(required = false) String answerChoicesForNumSix,
                                 @RequestParam(required = false) String answerChoicesForNumSeven, @RequestParam(required = false) String answerChoicesForNumEight, @RequestParam(required = false) String answerChoicesForNumNine,
                                 @RequestParam(required = false) String answerChoicesForNumTen) {


        if(answerChoicesForNumOne.equals("answerA")){
            answerA.add(answerChoicesForNumOne);
        } else if (answerChoicesForNumOne.equals("answerB")){
            answerB.add(answerChoicesForNumOne);
        } else if (answerChoicesForNumOne.equals("answerC")){
            answerC.add(answerChoicesForNumOne);
        } else if(answerChoicesForNumOne.equals("answerD")){
            answerD.add(answerChoicesForNumOne);
        } else {
            answerE.add(answerChoicesForNumOne);
        }

        if(answerChoicesForNumTwo.equals("answerA")){
            answerA.add(answerChoicesForNumTwo);
        } else if (answerChoicesForNumTwo.equals("answerB")){
            answerB.add(answerChoicesForNumTwo);
        } else if (answerChoicesForNumTwo.equals("answerC")){
            answerC.add(answerChoicesForNumTwo);
        } else if(answerChoicesForNumTwo.equals("answerD")){
            answerD.add(answerChoicesForNumTwo);
        } else {
            answerE.add(answerChoicesForNumTwo);
        }

        if(answerChoicesForNumThree.equals("answerA")){
            answerA.add(answerChoicesForNumThree);
        } else if (answerChoicesForNumThree.equals("answerB")){
            answerB.add(answerChoicesForNumThree);
        } else if (answerChoicesForNumThree.equals("answerC")){
            answerC.add(answerChoicesForNumThree);
        } else if(answerChoicesForNumThree.equals("answerD")){
            answerD.add(answerChoicesForNumThree);
        } else {
            answerE.add(answerChoicesForNumThree);
        }

        if(answerChoicesForNumFour.equals("answerA")){
            answerA.add(answerChoicesForNumFour);
        } else if (answerChoicesForNumFour.equals("answerB")){
            answerB.add(answerChoicesForNumFour);
        } else if (answerChoicesForNumFour.equals("answerC")){
            answerC.add(answerChoicesForNumFour);
        } else if(answerChoicesForNumFour.equals("answerD")){
            answerD.add(answerChoicesForNumFour);
        } else {
            answerE.add(answerChoicesForNumFour);
        }

        if(answerChoicesForNumFive.equals("answerA")){
            answerA.add(answerChoicesForNumFive);
        } else if (answerChoicesForNumFive.equals("answerB")){
            answerB.add(answerChoicesForNumFive);
        } else if (answerChoicesForNumFive.equals("answerC")){
            answerC.add(answerChoicesForNumFive);
        } else if(answerChoicesForNumFive.equals("answerD")){
            answerD.add(answerChoicesForNumFive);
        } else {
            answerE.add(answerChoicesForNumFive);
        }

        if(answerChoicesForNumSix.equals("answerA")){
            answerA.add(answerChoicesForNumSix);
        } else if (answerChoicesForNumSix.equals("answerB")){
            answerB.add(answerChoicesForNumSix);
        } else if (answerChoicesForNumSix.equals("answerC")){
            answerC.add(answerChoicesForNumSix);
        } else if(answerChoicesForNumSix.equals("answerD")){
            answerD.add(answerChoicesForNumSix);
        } else {
            answerE.add(answerChoicesForNumSix);
        }

        if(answerChoicesForNumSeven.equals("answerA")){
            answerA.add(answerChoicesForNumSeven);
        } else if (answerChoicesForNumSeven.equals("answerB")){
            answerB.add(answerChoicesForNumSeven);
        } else if (answerChoicesForNumSeven.equals("answerC")){
            answerC.add(answerChoicesForNumSeven);
        } else if(answerChoicesForNumSeven.equals("answerD")){
            answerD.add(answerChoicesForNumSeven);
        } else {
            answerE.add(answerChoicesForNumSeven);
        }

        if(answerChoicesForNumEight.equals("answerA")){
            answerA.add(answerChoicesForNumEight);
        } else if (answerChoicesForNumEight.equals("answerB")){
            answerB.add(answerChoicesForNumEight);
        } else if (answerChoicesForNumEight.equals("answerC")){
            answerC.add(answerChoicesForNumEight);
        } else if(answerChoicesForNumEight.equals("answerD")){
            answerD.add(answerChoicesForNumEight);
        } else {
            answerE.add(answerChoicesForNumEight);
        }

        if(answerChoicesForNumNine.equals("answerA")){
            answerA.add(answerChoicesForNumNine);
        } else if (answerChoicesForNumNine.equals("answerB")){
            answerB.add(answerChoicesForNumNine);
        } else if (answerChoicesForNumNine.equals("answerC")){
            answerC.add(answerChoicesForNumNine);
        } else if(answerChoicesForNumNine.equals("answerD")){
            answerD.add(answerChoicesForNumNine);
        } else {
            answerE.add(answerChoicesForNumNine);
        }

        if(answerChoicesForNumTen.equals("answerA")){
            answerA.add(answerChoicesForNumTen);
        } else if (answerChoicesForNumTen.equals("answerB")){
            answerB.add(answerChoicesForNumTen);
        } else if (answerChoicesForNumTen.equals("answerC")){
            answerC.add(answerChoicesForNumTen);
        } else if(answerChoicesForNumTen.equals("answerD")){
            answerD.add(answerChoicesForNumTen);
        } else {
            answerE.add(answerChoicesForNumTen);
        }



        ArrayList<ArrayList<String>> bigList = new ArrayList<ArrayList<String>>();
        bigList.add(answerA);
        bigList.add(answerB);
        bigList.add(answerC);
        bigList.add(answerD);
        bigList.add(answerE);

        ArrayList<String> biggestListInList = bigList.get(0);

        for(int i =1; i < bigList.size(); i++){
          if(bigList.get(i).size() > biggestListInList.size()){
              biggestListInList=bigList.get(i);
          }
        }
        if(biggestListInList.contains("answerA")){
            model.addAttribute("answer", "wigs/sew-in/locs");
        } else if(biggestListInList.contains("answerB")){
            model.addAttribute("answer", "braids");
        } else if(biggestListInList.contains("answerC")){
            model.addAttribute("answer", "twists");
        } else if(biggestListInList.contains("answerD")){
            model.addAttribute("answer", "natural");
        } else if(biggestListInList.contains("answerE")){
            model.addAttribute("answer", "updo");
        } else {
            model.addAttribute("answer", "don't know yet");
        }


        return "quiz/results";
    }

}
