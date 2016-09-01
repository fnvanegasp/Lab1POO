
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Freddy Nicolay Vanegas
 */


public class Translator {
    public static void main(String[] args){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        palabras.lista();
        String[] deutsch = diccionario.deutsch();
        String[] english = diccionario.english();
        String[] español = diccionario.español();
        String[] français = diccionario.français();
        int ciclo;
        boolean status;
            status = false;
        while(status == false){
                    System.out.println("ingrese el idioma de entrada: 1: alemán, 2: inglés, 3: español, 4: francés");
        int entrada = lectura.nextInt();
        System.out.println("ingrese el idioma de salida: 1: alemán, 2: inglés, 3: español, 4: francés");
        int salida = lectura.nextInt();
        System.out.println("ingrese la palabra que desea traducir");
        String palabra = lectura.next();
        if(entrada == 1){
            if (salida == 2) {
                for(int x = 0; x < 20; x++){
                    if (palabra == null ? deutsch[x] == null : palabra.equals(deutsch[x])){
                        System.out.println(palabra + " en inglés se dice " + english[x]);
                    }
                }
            }
            if (salida == 3) {
                for(int x = 0; x < 20; x++){
                    if (palabra == null ? deutsch[x] == null : palabra.equals(deutsch[x])){
                        System.out.println(palabra + " en español se dice " + español[x]);
                    }
                }
            }
            if (salida == 4) {
                for(int x = 0; x < 20; x++){
                    if (palabra == null ? deutsch[x] == null : palabra.equals(deutsch[x])){
                        System.out.println(palabra + " en francés se dice " + français[x]);
                    }
                }
            }
        }
        if(entrada == 2){
            if (salida == 1) {
                for(int x = 0; x < 20; x++){
                    if (palabra == null ? english[x] == null : palabra.equals(english[x])){
                        System.out.println(palabra + " en alemán se dice " + deutsch[x]);
                    }
                }
            }
            if (salida == 3) {
                for(int x = 0; x < 20; x++){
                    if (palabra == null ? english[x] == null : palabra.equals(english[x])){
                        System.out.println(palabra + " en español se dice " + español[x]);
                    }
                }
            }
            if (salida == 4) {
                for(int x = 0; x < 20; x++){
                    if (palabra == null ? english[x] == null : palabra.equals(english[x])){
                        System.out.println(palabra + " en francés se dice " + français[x]);
                    }
                }
            }
        }
        if(entrada == 3){
            if (salida == 1) {
                for(int x = 0; x < 20; x++){
                    if (palabra == null ? español[x] == null : palabra.equals(español[x])){
                        System.out.println(palabra + " en alemán se dice " + deutsch[x]);
                    }
                }
            }
            if (salida == 2) {
                for(int x = 0; x < 20; x++){
                    if (palabra == null ? español[x] == null : palabra.equals(español[x])){
                        System.out.println(palabra + " en inglés se dice " + english[x]);
                    }
                }
            }
            if (salida == 4) {
                for(int x = 0; x < 20; x++){
                    if (palabra == null ? español[x] == null : palabra.equals(español[x])){
                        System.out.println(palabra + " en francés se dice " + français[x]);
                    }
                }
            }
        }
        if(entrada == 4){
            if (salida == 1) {
                for(int x = 0; x < 20; x++){
                    if (palabra == null ? français[x] == null : palabra.equals(français[x])){
                        System.out.println(palabra + " en alemán se dice " + deutsch[x]);
                    }
                }
            }
            if (salida == 2) {
                for(int x = 0; x < 20; x++){
                    if (palabra == null ? français[x] == null : palabra.equals(français[x])){
                        System.out.println(palabra + " en inglés se dice " + english[x]);
                    }
                }
            }
            if (salida == 3) {
                for(int x = 0; x < 20; x++){
                    if (palabra == null ? français[x] == null : palabra.equals(français[x])){
                        System.out.println(palabra + " en español se dice " + español[x]);
                    }
                }
            }
        }
        
        System.out.println("¿Desea traducir otra palabra, o terminar? (ingrese 1 para salir, otro número para continuar)");
        ciclo = lectura.nextInt();
        if (ciclo == 1){
            status = true;
        }
        }
    System.out.println("Gracias por usar el diccionario de java");
    }
    
}

class palabras{
    public static void lista(){
    String[] deutsch = diccionario.deutsch();
    String[] english = diccionario.english();
    String[] español = diccionario.español();
    String[] français = diccionario.français();
    System.out.println("Bienvenido al diccionario básico de java");
    System.out.println("Aquí encontrará una breve lista de 20 palabras en alemán, ingles, español y francés");
    System.out.println("Antes de explicar el alcance del diccionario, le mostramos el vocabulario disponible\n");
    System.out.println("deutsch" +"\t\t"+ "english"+"\t\t"+ "español" +"\t\t"+ "français\n");
    for(int x = 0; x < 20; x++){
        System.out.println(deutsch[x] +"\t\t"+ english[x] +"\t\t"+ español[x] +"\t\t"+ français[x]);
    }
    
    System.out.println("\nEl diccionario puede traducir entre cualquier idioma");
    System.out.println("Primero seleccione el idioma de origen, y luego el idioma de destino");
    System.out.println("digite cualquier caracter para continuar");
    java.util.Scanner lectura = new java.util.Scanner(System.in);
    char entrada = lectura.next(".").charAt(0);
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    
}
}

class diccionario{
    public static String[] deutsch(){
        String[] aleman = new String[20];
        aleman[0] = "Hallo";
        aleman[1] = "Tschuß";
        aleman[2] = "Leute";
        aleman[3] = "ich";
        aleman[4] = "Sie";
        aleman[5] = "er";
        aleman[6] = "es";
        aleman[7] = "sie";
        aleman[8] = "wir";
        aleman[9] = "ihr";
        aleman[10] = "trinken";
        aleman[11] = "horen";
        aleman[12] = "essen";
        aleman[13] = "sein";
        aleman[14] = "brauchen";
        aleman[15] = "heissen";
        aleman[16] = "Morgen";
        aleman[17] = "Abend";
        aleman[18] = "Tage";
        aleman[19] = "Zeit";
        return aleman;
    }
    public static String[] english(){
        String[] ingles = new String[20];
        ingles[0] = "Hello";
        ingles[1] = "Bye";
        ingles[2] = "people";
        ingles[3] = "I";
        ingles[4] = "You";
        ingles[5] = "he";
        ingles[6] = "it";
        ingles[7] = "she";
        ingles[8] = "we";
        ingles[9] = "they";
        ingles[10] = "trink";
        ingles[11] = "hear";
        ingles[12] = "eat";
        ingles[13] = "be";
        ingles[14] = "need";
        ingles[15] = "be called";
        ingles[16] = "morning";
        ingles[17] = "evening";
        ingles[18] = "day";
        ingles[19] = "time";
        return ingles;
    }
    public static String[] español(){
        String[] español = new String[20];
        español[0] = "Hola";
        español[1] = "Adiós";
        español[2] = "gente";
        español[3] = "yo";
        español[4] = "usted";
        español[5] = "el";
        español[6] = "eso";
        español[7] = "ella";
        español[8] = "nosotros";
        español[9] = "ellos";
        español[10] = "beber";
        español[11] = "escuchar";
        español[12] = "comer";
        español[13] = "ser";
        español[14] = "necesitar";
        español[15] = "llamarse";
        español[16] = "manana";
        español[17] = "noche";
        español[18] = "dia";
        español[19] = "tiempo";
        return español;
    }
    public static String[] français(){
        String[] frances = new String[20];
        frances[0] = "bonjour";
        frances[1] = "au revoir";
        frances[2] = "personnes";
        frances[3] = "Je";
        frances[4] = "vous";
        frances[5] = "la";
        frances[6] = "que";
        frances[7] = "elle";
        frances[8] = "nous";
        frances[9] = "ils";
        frances[10] = "boire";
        frances[11] = "ecouter";
        frances[12] = "manger";
        frances[13] = "etre";
        frances[14] = "besoin";
        frances[15] = "s'appeler";
        frances[16] = "matin";
        frances[17] = "nuit";
        frances[18] = "jour";
        frances[19] = "temps";
        return frances;
    }
}

