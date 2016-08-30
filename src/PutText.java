

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carito
 */
public class PutText {
    public static void main (String[] args){
       System.out.println("Primera Función");
       func1.funcion1();
       func2.funcion2();
       System.out.println("Se termina Main");
    }
    
}

class func1{
    public static void funcion1() {
    System.out.println("Segunda Función");
}
}

class func2{
    public static void funcion2() {
    System.out.println("Tercera Función");
}
}