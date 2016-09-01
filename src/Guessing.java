/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Freddy Nicolay Vanegas
 */
public class Guessing {
    public static void main(String[] args){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int answer;
        answer = ((int) (Math.random() * 100)) + 1;
        char playAgain = 'y';
        while(playAgain == 'y'){
            answer = ((int) (Math.random() * 100)) + 1;
            game.guessing(answer);
            System.out.println("Would you like to play again?");
            playAgain = lectura.next(".").charAt(0);
        }
        
    }
}

class game{
    public static void guessing(int answer){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int guess = 0;
        int numGuesses = 1;
        
        while((numGuesses <= 7) && answer != guess){
            System.out.println("Guess a number");
            guess = lectura.nextInt();
            
            if(guess < answer){
                System.out.println("Higher...");
            } else if(guess > answer){
                System.out.println("Lower...");
            } else {
                System.out.println("You win!");
            }
            
            numGuesses += 1;
        }
        
        if(numGuesses > 7){
            System.out.println("You lose :( ");
            System.out.println("The answer is " + answer);
        }
    }
}