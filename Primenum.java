package DSA;

import java.util.Scanner;

public class Primenum {
public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter the number:");
	int num  = scn.nextInt();
	boolean isPrime = true;
    if (num <= 1) {
        isPrime = false;
    } else if (num <= 3) {
        isPrime = true;
    } else if (num % 2 == 0 || num % 3 == 0) {
        isPrime = false;
    } else {
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                isPrime = false;
                break;
            }
        }
    }
    if (isPrime) {
        System.out.println(num + " is a prime number.");
    } else {
        System.out.println(num + " is not a prime number.");
    }
}
}

