package dev.passingarguments;

import java.util.Scanner;

import dev.passingarguments.primenumbers.PrimeNumbers;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Prime Number Checker");
        System.out.print("Enter number: ");

        int userInput = Integer.valueOf(scanner.nextLine());

        // check if the number is prime
        boolean userInputIsPrime = PrimeNumbers.isPrime(userInput);

        if (userInputIsPrime) {
            System.out.println(userInput + " is a prime number.");
        } else {
            System.out.println(userInput + " is a composite number.");
        }

    }
}