/*
 *TP0 Calculator
 * BARBERAN Baptiste
 * Septembre 2021
 */
package calculator;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Baptiste
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operateur;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter the operator:\n");
        System.out.print("1) add \n");
        System.out.print("2) substract \n");
        System.out.print("3) multiply \n");
        System.out.print("4) divide \n");
        System.out.print("5) modulo \n");

        
        System.out.println("");
        operateur = sc.nextInt(); // On demande a sc de donner le prochain entier
        while (operateur<0 ||operateur>5){
            System.out.print("\n Entrer un opérateur entre 1 et 5 :");
            System.out.println("Please enter the operator:\n");
            operateur = sc.nextInt();
        }
        
        float operande1;
        System.out.println("\n Entrer le premier nombre :");
        operande1 = sc.nextFloat(); // On demande a sc de donner un nombre
        
        float operande2;
        System.out.println("\n Entrer le deuxieme nombre :");
        operande2 = sc.nextFloat(); // On demande a sc de donner un nombre
        
        switch(operateur){
            case 1://addition 
                float result = operande1 +operande2;
                System.out.print("le résultat est "+result);
                break;
            case 2://soustractrion
                result = operande1 - operande2;
                System.out.print("le résultat est "+result);
                break;
            case 3 ://multiplication
                result = operande1*operande2;
                System.out.print("le résultat est "+result);
                break;
            case 4:// division
                result = operande1/operande2;
                System.out.print("le résultat est "+result);
                break;
            case 5:// Modulo
                result = operande1%operande2;
                System.out.print("le résultat est "+result);
                break;
        }
                
        System.out.print("\n enregistré sur github (verif)")  ;
        
                
        
        
                
         
                
    }
}

