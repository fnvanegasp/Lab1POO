/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carito
 */
public class Lottery {
    
    public static void main(String[] args) {
    java.util.Scanner lectura = new java.util.Scanner(System.in);
        
    int[] lottery = new int[3];
    int[] player = new int[3];
    int randomNum;
    int punkte = 0;

    for (int j = 0; j < 3; j++){
        System.out.print("Ingrese la opción " + (j+1) + " ");
        player[j] = lectura.nextInt();
    }
    
    System.out.println("Sus números escojidos en el respéctivo orden fueron: " + player[0] + " "+ player[1] +" "+ player[2]);
    
    for (int i = 0; i < 3; i++) {
        randomNum = (int) (Math.random() * 9); // Random number created here.
           /* for (int x = 0; x < i; x++) {
            if (lottery[x] == randomNum) // 
            {
                randomNum = (int) (Math.random() * 9);
                x = -1;
            } 

        }*/
        lottery[i] = randomNum; 
    }
        
    System.out.println("Los números escojidos por la máquina fueron: ");
        
    for (int i = 0; i < lottery.length; i++){
        System.out.print(lottery[i] + " ");
    }
    
    if(player[2] == lottery[2] && player[1] == lottery[1] && player[0] == lottery[0]){
        punkte = 1000000;
    }
    else if((player[2] == lottery[2] || player[2] == lottery[1] || player[2] == lottery[0]) &&
       (player[1] == lottery[2] || player[1] == lottery[1] || player[1] == lottery[0]) &&
       (player[0] == lottery[2] || player[0] == lottery[1] || player[0] == lottery[0])) {
        punkte = 1000;
    }
    else if((player[2] == lottery[2] || player[2] == lottery[1] || player[2] == lottery[0])&&(player[1] == lottery[2] || player[1] == lottery[1] || player[1] == lottery[0]) ||
       (player[2] == lottery[2] || player[2] == lottery[1] || player[2] == lottery[0])&&(player[0] == lottery[2] || player[0] == lottery[1] || player[0] == lottery[0]) ||
       (player[0] == lottery[2] || player[0] == lottery[1] || player[0] == lottery[0])&&(player[1] == lottery[2] || player[1] == lottery[1] || player[1] == lottery[0])){
        punkte = 100;
    }
    else if((player[2] == lottery[2] || player[2] == lottery[1] || player[2] == lottery[0]) ||
       (player[1] == lottery[2] || player[1] == lottery[1] || player[1] == lottery[0]) ||
       (player[0] == lottery[2] || player[0] == lottery[1] || player[0] == lottery[0])) {
        punkte = 10;
    } else {
        punkte = 0;
    }

    System.out.println("Su premio es: " + punkte);
}
    
}
