package com.pazzo;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Attempt all questions\n");

        String question1 = "What is the capital city of Rwanda?" + "\n"
                + "1.Dar Es Salam\n" +
                "2.Kigali\n" +
                "3.Kampala\n" +
                "4.Ottawa";

        String question2 = "Who is the president of USA?" + "\n"
                + "1.Barrack Obama\n" +
                "2.Donald Trump\n" +
                "3.Joe Biden\n" +
                "4.Paul Kagame";

        String question3 = "Where the next world Cup will be held?" + "\n"
                + "1.Russia\n" +
                "2.Qatar\n" +
                "3.USA\n" +
                "4.Tanzania";

        String question4 = "Who won the last World Cup?" + "\n"
                + "1.Spain\n" +
                "2.France\n" +
                "3.Italy\n" +
                "4.Germany";

        Question[] questions = {
                new Question(question1, "2"),
                new Question(question2, "3"),
                new Question(question3, "2"),
                new Question(question4, "2"),
        };

        takeTest(questions);

    }

    public static void takeTest(Question[] questions) {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i].questionSet);
            System.out.print("Answer:\t");

            String answer = scanner.nextLine();

            if (answer.equals(questions[i].answer)) {
                System.out.println("Correct Answer\n");
                score++;
            } else {
                System.out.println("Wrong Answer\n");
            }

            System.out.println("current score: " + score);
        }

        System.out.println("You scored " + score + "/" + questions.length);

        float percentile = ((float) score / questions.length) * 100;

        System.out.println("Your percentile is " + percentile);

    }

    public static void previousQuestion() {


    }

}
