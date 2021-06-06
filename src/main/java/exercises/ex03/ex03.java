package exercises.ex03;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex03 {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args)
    {
        ex03 example03 = new ex03();
        String in = example03.inputString();
        boolean answerCheck = example03.inputCheck9(in);
        String outputString = example03.generateOutputString(in, answerCheck);
        example03.printOutput(outputString);


    }
    private String inputString(){
        //input
        System.out.println("What is the quote? These aren't the droids you're looking for.");
        System.out.print("Who said it? ");
        String input = in.nextLine();
        return input;
    }

    private void printOutput(String outputString) {
        System.out.println(outputString);
    }

    private String generateOutputString(String in, boolean answerCheck) {
        if (answerCheck){
            return (in + "in says, \"These aren't the droids you're looking for.\"");
        }
        return "wrong";

    }

    private boolean inputCheck9(String in) {
        //sees if its a match to the right answer
        if(in.equals("Obi-Wan Kenobi"))
        {
            return true;
        }
        return false;

    }
}
