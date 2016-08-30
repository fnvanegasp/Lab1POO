/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fnvanegasp
 */
public class Pig {
    public static void main(String[] args) {
    int maxscore = 20;
    int pcscore = 0;
    int plscore = 0; 
    boolean turn;
        turn = false;
    int[] computerturn;
    int[] playerturn;
 
    while((pcscore < maxscore) && (plscore < maxscore)){
        while (turn == false){
        computerturn = computer.computerturn();
        switch (computerturn[2]) {
            case 0:
                pcscore = 0;
                turn = true;
                break;
            case 1:
                pcscore = pcscore;
                turn = true;
                break;
            case 2:  
                pcscore = pcscore + computerturn[0] + computerturn[1];
                turn = true;
                break;
            default:
                turn = false;
                break;
        }
        System.out.println("el puntaje del PC es " + pcscore);
        }
        while (turn == true){
            if (pcscore >= maxscore){
            break;
            }
            playerturn = player.playerturn();
            switch(playerturn[2]) {
            case 0:
            plscore = 0;
            turn = false;
            break;
            case 1:
            plscore = plscore;
            turn = false;
            break;
            case 2:
            plscore = plscore + playerturn[0] + playerturn[1];
            turn = false;
            break;
            case 3:
            turn = true;
            break;
            }
            System.out.println("el puntaje del usuario es " + plscore);
        }
        }
    
    if(pcscore >= maxscore){
        System.out.println("el PC gana");
    } else if(plscore >= maxscore){
        System.out.println("el usuario gana");
    }
    
    }
    
}

class computer{
    public static int[] computerturn(){
        int[] dices;
        int turn;
        dices = dice.rolldice();
        if (dices[2] == 0){
            System.out.println("Par de unos, mala suerte! el puntaje del PC será reiniciado a cero");
            System.out.println("Es turno del usuario"); 
        } else if (dices[2] == 1){
            System.out.println("Rayos, un uno! el puntaje total del PC sigue igual");
            System.out.println("Es turno del usuario");        
        } else {
            turn = (((int) (Math.random() * 1)) + (2));
            dices [2] = turn;
            if(turn == 2){
                System.out.println("El PC escojió adicionar al acumulado.");
            } else {                  
                System.out.println("El PC escojió hacer otro lanzamiento. Se mantiene el último acumulado");        
            }
        }
     return dices;  
    }
    
}

class player{
        public static int[] playerturn(){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int[] dices;
        int turn;
        dices = dice.rolldice();
        if (dices[2] == 0){
            System.out.println("Par de unos, mala suerte! su puntaje será reiniciado a cero");
            System.out.println("Es turno del PC"); 
        } else if (dices[2] == 1){
            System.out.println("Rayos, un uno! su puntaje total sigue igual");
            System.out.println("Es turno del PC");        
        } else {
            System.out.println("desea adicionar los dados a su acumulado, o lanzar de nuevo?");
            System.out.println("2 para adicionar al total y dar el turno al siguiente jugador");
            System.out.println("3 para tirar de nuevo los dados ");
            turn = lectura.nextInt();
            dices[2] = turn;
            if(turn == 2){        
                System.out.println("El usuario escojió adicionar al acumulado. Ahora es turno del PC");
            } else if (turn == 3){
                System.out.println("El usuario escojió hacer otro lanzamiento. Se mantiene el último acumulado");
            }
        }
        return dices;
    }
}

class dice{
    public static int[] rolldice(){
        int[] dices = new int[3];
        dices[0] = ((int) (Math.random() * 5)) + 1;
        dices[1] = ((int) (Math.random() * 5)) + 1;
        if(dices[0] == 1 && dices[1] == 1){
            dices[2] = 0;            
        } else if(dices[0] == 1 || dices[1] == 1){
            dices[2] = 1; 
        } else {
            dices[2] = 2; 
        }
        System.out.println();
        System.out.println("los dados son" +" "+ dices[0] +" y "+ dices[1]);
        System.out.println("el total es " + (dices[0] + dices[1]));   

        return dices;
    }
}