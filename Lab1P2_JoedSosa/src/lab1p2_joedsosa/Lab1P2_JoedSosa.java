/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_joedsosa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author joeds
 */
public class Lab1P2_JoedSosa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {

        
        Menu();
    }
    public static void Menu() throws ParseException{
        Scanner sc = new Scanner(System.in);
        Scanner stc = new Scanner(System.in);
        String resp = "";
        do {
            System.out.println("######################Bienvenido al Laboratorio 1 ######################");
            System.out.println("  #################### Hola Andresito Neuer Nuila ####################");
            System.out.println("1) Torres de Hanoi");
            System.out.println("2) Split Strings");
            System.out.println("3) Aproximar Pi");
            int opciones = sc.nextInt();
            switch (opciones) {

                case 1:// llamar metodo
                {
                    System.out.println(" ###################### Bienvenido a el Ejercicio 1; Torres de Hanoi ###################### ");
                    EjercicioHanoi();
                    break;
                }

                case 2: // llamar metodo
                {
                    System.out.println("Bienvenido a el Ejercicio 2: Split Strings ");
                   Ejercicio2();
                    break;
                }
                case 3: {
                    System.out.println("Bienvenido al Ejercicio 3: Aproximar Pi");
                    Ejercicio3();
                    break;
                }
                    

            }
            System.out.println("Desea continuar S para continuar, cualquier otra tecla para salir!");
            resp = stc.nextLine();
        } while ("s".equalsIgnoreCase(resp) || "S".equalsIgnoreCase(resp));

    
    }
        public static void EjercicioHanoi(){
        Scanner cathy = new Scanner(System.in);
        int num;
        System.out.println("Ingese la cantidad de discos: ");
        num=cathy.nextInt();
        Hanoi(num,1,2,3);
    }
    public static void Hanoi(int num, int ori, int aux, int fin ){
        if(num==1){
            System.out.println("mover disco 1 de " + ori + " a " + fin);  
        
        }else {
            Hanoi(num-1,ori,fin,aux);
            System.out.println("mover disco "+ num + " de " + ori + " a " + fin);
            Hanoi(num-1,aux,ori,fin);
        }
    } 
    public static void Ejercicio2() throws ParseException{
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ingrese una cadena en el siguiente formato: nombre,dd/mm/yyyy,palabra123,carrp,dd/mm/yyyy.....");
        String cadena = sc1.nextLine() ;
        String [] palabras = cadena.split(",");
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        for (String word : palabras) {
            if(word.contains("/")&& word.length()==10){
                Date hola = fecha.parse(word);
                
                System.out.println(hola);
            }
        }
        
        
    }
    
   public static void Ejercicio3(){
       Scanner sc2 = new Scanner(System.in);
       System.out.println("Ingrese un numero: ");
       int num = sc2.nextInt();
       System.out.println(pi(num,0,0));
       
   }
   public static double pi(int num, int numero, double total){
       if(numero==num){
           return 4*total;
       
       }else{
           double sum = (Math.pow(-1,numero))/((2*numero)+1);
           total+=sum;
           return pi(num,numero+1,total);
           }
   }
}


        
        
       
    
    

