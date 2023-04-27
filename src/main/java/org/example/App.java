package org.example;

import java.util.Scanner;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        takeOperation();

        /* Kalkulator: napisz program kalkulator, który wspiera działania dodawania, odejmowania, mnożenia i dzielenia. Użytkownik wpisuje działanie, np 4 + 5 i otrzymuje wynik: 4 + 5 = 9.*/


    }

//Input
/*public static String takeName(){
        System.out.println("Give me your name: " );
        Scanner Scanner = new Scanner(System.in);
        String yourName = Scanner.nextLine();
        return yourName;
    }*/

    // Dekompozycja problemu:
    // 1. Wyświetlić prośbę o podanie działania
    // 2. Odczytać działanie
    // 3. Wyświetlić prośbę o podanie liczb
    // 4. Wykonać działanie (jeśli nie wybrano dzielenia, a druga z liczb nie jest 0)
    // 5. Wyświetlić wynik lub komunikat, że nie jest to możliwejud

    //give null

    public static String[] takeOperation() {
        System.out.println("Give operation and numbers, ex. 4 + 5: ");
        Scanner Scanner = new Scanner(System.in);
        String operation = Scanner.nextLine();

        String[] operationArray = operation.split(" ");
        for (String word : operationArray) {
            System.out.println(word);
        }
        return operationArray;
    }

    public static Integer numberA() {
        String[] charA = takeOperation();
        String characterA = charA[0];
        Integer numberA = Integer.parseInt(characterA);
        return numberA;
    }
    public static String operator() {
        String[] charOp = takeOperation();
        String operator = charOp[1];
        return operator;
    }
    public static Integer numberB() {
        String[] charB = takeOperation();
        String characterB = charB[2];
        Integer numberB = Integer.parseInt(characterB);
        return numberB;
    }
    
}

