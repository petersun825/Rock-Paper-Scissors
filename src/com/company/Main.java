package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Welcome Player
        String playerSelection = null;

        player name = new player();
        System.out.println("Welcome " + name.name() + "!");
        name.input();

    }

       /* System.out.println("What is your selection? Rock Paper or Scissors?");
        Scanner selection = new Scanner(System.in);
        playerSelection = selection.nextLine();
        player sel = new player(playerSelection);
*/



        // while (playerSelection != "Rock" || playerSelection !="rock")





      /*  System.out.println("What is your selection? Rock Paper or Scissors?");
        Scanner playerInput = new Scanner (System.in);
        String playerSelection = playerInput.nextLine();*/


        /* testing for get string into Java
        String str;
        Scanner input=new Scanner(System.in);
        System.out.println("What's your name?");
        str=input.nextLine();
        System.out.println("So your name is: "+str);
        */

    }


class player {
    static String playerName;
    static String selection;
    String playerInput;


    String name() {

        System.out.println("Welcome to Rock Scissor Paper Game");
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        playerName = input.nextLine();
        return playerName;
    }

    String input() {
        System.out.println("What is your selection? Rock Paper or Scissor?");
        Scanner in = new Scanner(System.in);
        selection = in.nextLine();
        // && evaluates if all of the statements are true.  So if one of them isn't true (i.e. selection = "rock") then returns false and ends while loop.
          while (!selection.equals("rock") && !selection.equals("Rock") && !selection.equals("paper") && !selection.equals("Paper") && !selection.equals("scissor") && !selection.equals("Scissor"))  {
           System.out.println("please input correct");
           selection = in.nextLine(); }

           System.out.println("you selected " + selection);
            return selection;
        }
}
    //constructor
  /*  public player(String selection) {
        this.selection = selection;
        if (selection != "Rock") {
            System.out.println("What is your selection? Rock Paper or Scissors?");


        }  */
    //methods





    class game {
        public String Rock;
        public String Paper;
        public String Scissor;


    }





/* overview of what's needed.
//Computer generator

//logic for game

//user error handling

//Get String from user

//arraylist storage

Variables need keep track of: userInput
Rock=1;
Paper=2;
Scissor=3;

use math.random to generate number, if 0-0.33 = rock, if 0.33-0.66 = paper, if 0.66-1 = scissor


RockPaperScissors
Have a main menu with options to enter "play" or "history":
If the user enters "play", they should be able to play Rock Paper Scissors against the computer
If the user enters "history", the program should display previous game history
Handle invalid user input
Use Arrays or ArrayLists to store game history
A Git repository, hosted on GitHub, that includes a link to your hosted game and frequent commits dating back to the beginning of the project.
A README.md file with explanations of:
Technologies used.
Your process/approach.
Installation instructions.
Unsolved problems.
Your biggest wins and challenges.
*/