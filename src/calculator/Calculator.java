/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/*TP0 Calculator
 *TDB1
 *Bertolin Loïc
 *Bematol Ilona
 *27/09/2021
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Affichage
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        //demande entier utilisateur
        int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter the operateur 1 to 5 :");
        operateur = sc.nextInt();
        if (operateur < 1 || operateur > 5) {
            System.out.println("Error, I need the operateur between 1 to 5");
            System.exit(0);
        }

        int operande1;
        System.out.println(" Please enter the first number :");
        operande1 = sc.nextInt();

        int operande2;
        System.out.println(" Please enter the second number :");
        operande2 = sc.nextInt();

        int addS;
        int substractS;
        int multiplyS;
        int divideS;
        int moduloS;

        switch (operateur) {
            case 1 -> {
                addS = operande1 + operande2;
                System.out.println(addS);
            }
            case 2 -> {
                substractS = operande1 - operande2;
                System.out.println(substractS);
            }
            case 3 -> {
                multiplyS = operande1 * operande2;
                System.out.println(multiplyS);
            }
            case 4 -> {
                divideS = operande1 / operande2;
                System.out.println(divideS);
            }
            case 5 -> {
                moduloS = operande1 % operande2;
                System.out.println(moduloS);
            }
            //default -> System.out.println("Erreur");   parti ex 7
        }
    }
}
