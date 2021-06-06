package org.cop3330;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = in.nextLine();
        System.out.print("Who said it? ");
        String author = in.nextLine();

        System.out.printf(author + " says, \"" + quote + "\"\n");
    }
}
