package com.assignment;

import com.assignment.Player;
import com.assignment.Question;

public class Game
{
    Question[] questions = new Question[5];
    Player player = new Player();

    String[] questionsData =
            {
                    "\nQue:1. In which decade was the American Institute of Electrical Engineers (AIEE) founded?",
                    "\nQue:2. What is part of a database that holds only one type of information?",
                    "\nQue:3. 'OS' computer abbreviation usually means ?",
                    "\nQue:4. '.MOV' extension refers usually to what kind of file?",
                    "\nQue:5. Who developed Yahoo?"
            };

    String[] option1 = {"1850s", "Report", "Order of Significance", "Image file", "Dennis Ritchie & Ken Thompson"};
    String[] option2 = {"1880s", "Field", "Open Software", "Animation/movie file", "David Filo & Jerry Yang"};
    String[] option3 = {"1930s", "Record", "Operating System", "Audio file", "Vint Cerf & Robert Kahn"};
    String[] option4 = {"1950s", "File", "Optical Sensor", "MS Office document", "Steve Case & Jeff Bezos"};
    int[] answers = {2, 2, 3, 2, 2};

    public void initGame()
    {
        for (int i=0;i<5;i++)
        {
            questions[i]=new Question();
        }
//        questions[0].question = "\nQue:1. In which decade was the American Institute of Electrical Engineers (AIEE) founded?";
//        questions[0].option1 = "1850s";
//        questions[0].option2 = "1880s";
//        questions[0].option3 = "1930s";
//        questions[0].option4 = "1950s";
//        questions[0].correctAnswer = 2;
//
//        questions[1].question = "\nQue:2. What is part of a database that holds only one type of information?";
//        questions[1].option1 = "Report";
//        questions[1].option2 = "Field";
//        questions[1].option3 = "Record";
//        questions[1].option4 = "File";
//        questions[1].correctAnswer = 2;
//
//        questions[2].question = "\nQue:3. 'OS' computer abbreviation usually means ?";
//        questions[2].option1 = "Order of Significance";
//        questions[2].option2 = "Open Software";
//        questions[2].option3 = "Operating System";
//        questions[2].option4 = "Optical Sensor";
//        questions[2].correctAnswer = 3;
//
//        questions[3].question = "\nQue:4. '.MOV' extension refers usually to what kind of file?";
//        questions[3].option1 = "Image file";
//        questions[3].option2 = "Animation/movie file";
//        questions[3].option3 = "Audio file";
//        questions[3].option4 = "MS Office document";
//        questions[3].correctAnswer = 2;
//
//        questions[4].question = "\nQue:5. Who developed Yahoo?";
//        questions[4].option1 = "Dennis Ritchie & Ken Thompson";
//        questions[4].option2 = "David Filo & Jerry Yang";
//        questions[4].option3 = "Vint Cerf & Robert Kahn";
//        questions[4].option4 = "Steve Case & Jeff Bezos";
//        questions[4].correctAnswer = 2;

        for(int i = 0; i<5; i++)
        {
            questions[i].question=questionsData[i];
            questions[i].option1=option1[i];
            questions[i].option2=option2[i];
            questions[i].option3=option3[i];
            questions[i].option4=option4[i];
            questions[i].correctAnswer=answers[i];
        }
    }

    public void play()
    {
        player.getDetails();
        for(int i=0;i<5;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("Correct");
                player.score+=2;
            }
            else
            {
                System.out.println("Incorrect");
                player.score--;
            }
        }
        System.out.println("\n" + player.name + " your score is " + player.score + " out of 10.");
    }
}
