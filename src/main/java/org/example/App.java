package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
<<<<<<< Updated upstream
=======
        boolean answer=palindrom();
        getAnswer(answer);

        // vacuum();

        //  calculator();

        /* Kalkulator: napisz program kalkulator, który wspiera działania dodawania, odejmowania, mnożenia i dzielenia. Użytkownik wpisuje działanie, np 4 + 5 i otrzymuje wynik: 4 + 5 = 9.*/
>>>>>>> Stashed changes

//        calculator();
//        stringVacuum();
//        palidrom();
        heterogram();
    }

<<<<<<< Updated upstream
    //ZAD 1. Kalkulator: napisz program kalkulator, który wspiera działania dodawania, odejmowania, mnożenia i dzielenia.
//        Użytkownik wpisuje działanie, np 4 + 5 i otrzymuje wynik: 4 + 5 = 9.
//    public static void calculator() {
//        String[] operation = takeOperation();
//        Integer numberA = getNumber(operation, 0);
//        Integer numberB = getNumber(operation, 2);
//        String operator = operator(operation);
//        while (operator.equals("/") && numberB == 0) {
//            numberB = divisionError();
//        }
//        float result = calculation(operator, numberA, numberB);
//        displayResult(numberA, numberB, operator, result);
//    }
//
//    public static String[] takeOperation() {
//        System.out.println("Give operation and numbers, ex. 4 + 5: ");
//        Scanner scanner = new Scanner(System.in);
//        String operation = scanner.nextLine();
//        String[] operationArray = operation.split(" ");
//        return operationArray;
//    }
//
//    public static Integer getNumber(String[] operation, Integer i) {
//        String characterA = operation[i];
//        Integer number = Integer.parseInt(characterA);
//        return number;
//    }
//
//    public static String operator(String[] operation) {
//
//        String operator = operation[1];
//        return operator;
//    }
//
//    public static Integer divisionError() {   // w jaki sposob mozemy wplywac na parametry przeslane do metody?
//        System.out.println("Nie można dzielić przez 0!!!");
//        System.out.print("Wprowadź liczbę różną od zera: ");
//        Scanner scanner = new Scanner(System.in);
//        Integer newNumber = scanner.nextInt();
//        return newNumber;
//    }
//
//    public static float calculation(String operator, Integer a, Integer b) {
//        if (operator.equals("+")) {
//            return a + b;
//        } else if (operator.equals("-")) {
//            return a - b;
//        } else if (operator.equals("*")) {
//            return a * b;
//        } else {
//            return a / b;
//        }
//    }
////
////    public static void displayResult(Integer a, Integer b, String operator, Float result) {
////        String messageFormatted = String.format("%d %s %d = %f", a, operator, b, result);
////        System.out.println(messageFormatted);
////    }

// ZAD 2. Odkurzacz do spacji: napisz program, który oczyszcza dany tekst ze wszystkich nadmiarowych spacji,
//        pozostawiając tylko pojedyncze między słowami. Np Ala   ma           kota                 -> Ala ma kota
//    public static void stringVacuum() {
//        String userText = takeText();
//
//        while (userText.contains("  ")) {
//            userText = userText.replace("  ", " ");
//        }
//        displayText(userText);
//    }
//
//    public static String takeText() {
//        System.out.println("Give text: ");
//        Scanner Scanner = new Scanner(System.in);
//        String userText = Scanner.nextLine();
//        return userText;
//    }
//
//    public static void displayText(String text) {
//        System.out.println(text);
//    }

    //    ZAD 3. Analiza stringów: napisz program, który sprawdza, czy dany string jest palindromem (odczytuje się go tak samo od przodu,
//    jak i od tyłu, np Anna), heterogramem (żadna litera się nie powtarza, np Mateusz), pangramem
//    (zawiera wszystkie litery alfabetu łacińskiego, np The quick brown fox jumps over a lazy dog), oraz, czy dane dwa stringi są
//    anagramami (składają się z tych samych liter, np Tom Marvolo Riddle - I am Lord Voldemort)


    //    public static void palidrom() {                      //Sprawdzenie czy tekst jest palidromem
//        String text = getText();
//        boolean isPalidrome = palidromeCheck(text);
//        displayResultPalidrome(isPalidrome);
//    }
//
    public static String getText() {
        System.out.print("Give text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    //
//    public static boolean palidromeCheck(String text) {
//        for (int i = 0; i < text.length(); i++) {
//            char charNormal = text.charAt(i);
//            char charReverse = text.charAt(text.length() - 1 - i);
//            if (charNormal != charReverse) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void displayResultPalidrome(boolean result) {
//        if (result == true) {
//            System.out.println("Podany String jest palidromem");
//        } else {
//            System.out.println("Podany String nie jest palidromem");
//        }
//    }
    public static void heterogram() {
        String userText = getText();
        boolean result = heterogramCheck(userText);
        displayResultHeterogram(result);
    }

    public static boolean heterogramCheck(String s) {
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                char nextLetter = s.charAt(j);
                if (i != j && letter == nextLetter) {
                    return false;
                }
            }
=======
    public static void calculator() {
        String[] operation = takeOperation();
        Integer numberA = getNumber(operation, 0);
        Integer numberB = getNumber(operation, 2);
        String operator = operator(operation);
        while (operator.equals("/") && numberB == 0) {
            divisionError();  // dodać metodę pobierającą nową wartość dla B
>>>>>>> Stashed changes
        }
        return true;
    }

<<<<<<< Updated upstream
    public static void displayResultHeterogram(boolean result) {
        if (result == true) {
            System.out.println("Podany wyraz jest heterogramem");
=======
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
>>>>>>> Stashed changes
        } else {
            System.out.println("Podany wyraz NIE JEST heterogramem");
        }
    }
<<<<<<< Updated upstream

=======

    public static void displayResult(Integer a, Integer b, String operator, Float result) {
        String messageFormatted = String.format("%d %s %d = %f", a, operator, b, result);
        System.out.println(messageFormatted);


    }

    //zad.2
    public static String takeText() {
        System.out.println("Give text: ");
        Scanner Scanner = new Scanner(System.in);
        String text = Scanner.nextLine();
        return text;
    }

    public static void vacuum() {
        String text = takeText();
        Character[] chars = new Character[text.length()];

        for (Integer i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ' && i < text.length() - 1) {
                if (text.charAt(i + 1) == ' ') {
                    continue;
                }
            }
            chars[i] = text.charAt(i);
            System.out.print(chars[i]);
        }
    }

    //zad.3
    public static void stringAnalysis() {
        String text = takeText();
        Character[] chars = new Character[text.length()];
        palindrom();
     /*   for (Integer i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' && i < text.length() - 1) {
                Character character = text.charAt(i);
                System.out.println(character);
            }
        }*/
    }

    public static boolean palindrom() {
        String text = takeText();
        boolean palindrom = true;

            for (Integer j = 0; j < text.length() / 2; j++) {
                if (text.charAt(j) == text.charAt(text.length() - j - 1)) {
                } else {
                    palindrom = false;
                    break;
                    //System.out.println("This isn't palindrom.");
                }
        }
        return palindrom;
    }

    public static void getAnswer(boolean answer){
        if (answer==true) {
            System.out.println("This is palindrom.");
        }
        else {
            System.out.println("This isn't palindrom.");
        }
    }
>>>>>>> Stashed changes
}



