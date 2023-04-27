package org.example;

import java.util.Scanner;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        calculator();

        /* Kalkulator: napisz program kalkulator, który wspiera działania dodawania, odejmowania, mnożenia i dzielenia. Użytkownik wpisuje działanie, np 4 + 5 i otrzymuje wynik: 4 + 5 = 9.*/

    }

    public static void calculator() {
        String [] operation = takeOperation();
        Integer numberA = getNumber(operation, 0);
        Integer numberB = getNumber(operation, 2);
        String operator = operator(operation);
        while (operator.equals("/") && numberB == 0) {
            divisionError();  // dodać metodę pobierającą nową wartość dla B
        }
        float result = calculation(operator, numberA, numberB);
        displayResult(numberA, numberB, operator, result);
    }

    public static String[] takeOperation() {
        System.out.println("Give operation and numbers, ex. 4 + 5: ");
        Scanner Scanner = new Scanner(System.in);
        String operation = Scanner.nextLine();
        String[] operationArray = operation.split(" ");
        return operationArray;
    }

    public static Integer getNumber(String[] operation, Integer i) {
        String characterA = operation[i];
        Integer number = Integer.parseInt(characterA);
        return number;
    }
    public static String operator(String[] operation) {

        String operator = operation[1];
        return operator;
    }

    public static void divisionError() {   // w jaki sposob mozemy wplywac na parametry przeslane do metody?
        System.out.println("Nie można dzielić przez 0!!!");
        System.out.println("Wprowadź liczbę różną od zera");
    }
    public static float calculation(String operator, Integer a, Integer b) {
        if (operator.equals("+")) {
            return a + b;
        } else if (operator.equals("-")) {
            return a - b;
        } else if (operator.equals("*")) {
            return a * b;
        } else {
            return a / b;
        }
    }
    public static void displayResult(Integer a, Integer b, String operator, Float result) {
        String messageFormatted = String.format("%d %s %d = %f", a, operator, b, result);
        System.out.println(messageFormatted);
    }
}

