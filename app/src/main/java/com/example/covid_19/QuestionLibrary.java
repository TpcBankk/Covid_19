package com.example.covid_19;

public class QuestionLibrary {
    private String mQuestion[] = {
            "Question 1",
            "Question 2",
            "Question 3"
    };

    private String mChoices[][] = {
            {"Yes", "No"},
            {"Yes", "No"},
            {"Yes", "No"}
    };

    private String mCorrectAnswer[] = {"Yes", "Yes", "Yes"};

    public String getQuestion(int a){
        String question = mQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return  choice0;
    }
    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return  choice1;
    }

    public  String getCorrentAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}


