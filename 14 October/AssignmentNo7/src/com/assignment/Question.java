package com.assignment;
import java.util.Scanner;

public class Question
{
    Scanner scan = new Scanner(System.in);
    String question, option1, option2, option3, option4;
    int userAnswer,correctAnswer;

    public boolean askQuestion()
    {
        System.out.println(question);
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
        System.out.println("3. " + option3);
        System.out.println("4. " + option4);
        System.out.print("Enter your answer: ");
        userAnswer = scan.nextInt();

        if (userAnswer == correctAnswer)
        {
            return true;
        }
        return false;
    }
}
