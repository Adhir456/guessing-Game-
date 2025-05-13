/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberguessinggame;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author lab_services_student
 */
public class NumberGuessingGame {
    
    public static void main(String[] args) {
        //Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        //Create a random object to generate a random number
        Random random = new Random();
        //Generate a random number between 1 and 100 (inclusive)
        int numberToGuess = random.nextInt(100)+1;
        //Counter to keep track of the number of guesses the user makes 
        int numberOftries = 0;
        //Variable o store the users guess
        int guess;
        //BOolean flag to determine if the user has guessed correctly 
        boolean hasWon = false;
        //Welcome message to user
        System.out.println("Welcome to the number Guessing Game");
        System.out.println("I have selected number between 1 and 100 can you guess it? ");
        
        //Loop continues until the user guesses the correct number 
        
        while(!hasWon) {
            //Prompt the user to enter a guess
            System.out.print("Enter your Guess: ");
            guess = scanner.nextInt(); //Read the guess
           numberOftries++; //numberofTries = number of tries+1(Increment )
            
            //Check if the guess is lower than the target number
            if(guess<numberToGuess){
                System.out.println("Too low! Try again.");
            }
            //check if the guess is higher than the target number
            else if (guess<numberToGuess){
                System.out.println("Too high! try again.");
            }
            //if guess is correct
            else{
                hasWon = true;//Set flag to true to exit loop
                System.out.println("Congratulations!"
                + "You Guessed the number in " + numberOftries + "tries");
            }
        } 
        
        
        
    }
}
