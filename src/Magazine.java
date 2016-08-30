/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carito
 */
public class Magazine {
    public static void main(String[] args){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        boolean status;
            status = true;
        int dato = 0;    
        
        int x = 0;
        int[] age = new int[100];
        int[] money = new int[100];
        String[] sex = new String[100];
        
        while(status == true){
        age[x] = info.entryAge();
        money[x] = info.entryMoney();
        sex[x] = info.entrySex();
        x++;
        
        System.out.println("Desea agregar más info? (1 para salir, otro número para continuar)");
        dato = lectura.nextInt();
        if(dato == 1){
            status = false;
        }
        }
        
        calcular.edadesysexo(age,sex);
        calcular.money(money);
    }
    
}

class info{
    public static int entryAge(){
    java.util.Scanner lectura = new java.util.Scanner(System.in);
    int age = 0;
    
        System.out.println("Ingrese la edad");
        age = lectura.nextInt();
    
        return age;
         
}
    
    public static int entryMoney(){
    java.util.Scanner lectura = new java.util.Scanner(System.in);
    int money = 0;
    
        System.out.println("Ingrese los ingresos");
        money = lectura.nextInt();
    
        return money;
         
}
    
    public static String entrySex(){
    java.util.Scanner lectura = new java.util.Scanner(System.in);
    String sex = null;
    int status = 0;
    int x = 0;
    
        System.out.println("Ingrese el sexo (M/F)");
        sex = lectura.next();
    
        return sex;
         
}
    
}

class calcular{
    public static void edadesysexo(int[] age, String[] sex){
        
        int cuenta20f = 0;
        int cuenta29f = 0;
        int cuenta39f = 0;
        int cuenta49f = 0;
        int cuenta50f = 0;
        int cuenta20m = 0;
        int cuenta29m = 0;
        int cuenta39m = 0;
        int cuenta49m = 0;
        int cuenta50m = 0;
        
        for(int x = 0; x < 100; x++){
            if(age[x] < 20 && "F".equals(sex[x])){
                cuenta20f++;
            }
            if(20 <= age[x] && age[x] <= 29 && "F".equals(sex[x])){
                cuenta29f++;
            }
            if(30 <= age[x] && age[x] <= 39 && "F".equals(sex[x])){
                cuenta39f++;
            }
            if(40 <= age[x] && age[x] <= 49 && "F".equals(sex[x])){
                cuenta49f++;
            }
            if(50 <= age[x] && "F".equals(sex[x])){
                cuenta50f++;
            }
            if(age[x] < 20 && "M".equals(sex[x])){
                cuenta20m++;
            }
            if(20 <= age[x] && age[x] <= 29 && "M".equals(sex[x])){
                cuenta29m++;
            }
            if(30 <= age[x] && age[x] <= 39 && "M".equals(sex[x])){
                cuenta39m++;
            }
            if(40 <= age[x] && age[x] <= 49 && "M".equals(sex[x])){
                cuenta49m++;
            }
            if(50 <= age[x] && "M".equals(sex[x])){
                cuenta50m++;
            }            
        }
    System.out.println("Hay " + cuenta20f + " mujeres menores de 20 años");
    System.out.println("Hay " + cuenta29f + " mujeres de 20 a 29 años");
    System.out.println("Hay " + cuenta39f + " mujeres de 30 a 39 años");
    System.out.println("Hay " + cuenta49f + " mujeres de 40 a 49 años");
    System.out.println("Hay " + cuenta50f + " mujeres mayores de 50 años\n");
    System.out.println("Hay " + cuenta20m + " hombres menores de 20 años");
    System.out.println("Hay " + cuenta29m + " hombres de 20 a 29 años");
    System.out.println("Hay " + cuenta39m + " hombres de 30 a 39 años");
    System.out.println("Hay " + cuenta49m + " hombres de 40 a 49 años");
    System.out.println("Hay " + cuenta50m + " hombres mayores de 50 años\n");
    }
    
    public static void money(int[] money){
        
        int cuenta = 0;
        int cuenta30000 = 0;
        int cuenta49999 = 0;
        int cuenta69999 = 0;
        int cuenta70000 = 0;
        
        
        for(int x = 0; x < 100; x++){
            cuenta++;
            if(money[x] < 30000){
                cuenta30000++;
            }
            if(30000 <= money[x] && money[x] <= 49999){
                cuenta49999++;
            }
            if(50000 <= money[x] && money[x] <= 69999){
                cuenta69999++;
            }
            if(70000 <= money[x]){
                cuenta70000++;
            }
            
        }
    System.out.println("Hay " + (100 - cuenta30000) + " que compran menos de $30000");
    System.out.println("Hay " + cuenta49999 + " que compran entre $30000 y 49999");
    System.out.println("Hay " + cuenta69999 + " que compran entre $50000 y 69999");
    System.out.println("Hay " + cuenta70000 + " que compran mas de $70000");

    }
}