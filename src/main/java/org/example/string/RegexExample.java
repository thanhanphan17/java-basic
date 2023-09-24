package org.example.string;

import java.util.Scanner;

/*
    [abc]: a,b or c
    [^abc]: any except a,b and c
    [a-zA-Z]: a to z and A to Z
    [a-d[m-p]]: a to d or m to p

    X: X appears 1 times
    X?: X appears 0 or 1 times
    X+: X appears 1 or more times
    X*: X appears 0 or more times
    X{n}: X appears exactly n times
    X{n,m}: X appears between n and m times
    X{n,}: X appears at least n times
*/
public class RegexExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.println("Valid: " + isValidEmail(email));
    }

    public static boolean isValidEmail(String email) {
        String emailRegexPattern = "^(.+)@(\\S+)$";
        return email.matches(emailRegexPattern);
    }
}
