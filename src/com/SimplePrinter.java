package com;

import java.util.Scanner;

public class SimplePrinter {

    /**
     * @param args
     */
    public static void main(String[] args) {
        {

            System.out.println("I am a printer.");
            System.out.println("initialized");
            Scanner scan = new Scanner(System.in);

            String input;
            do
            {
                System.out.println("Press 1 to print, 2 to add ink, 3 to add paper");
                input = scan.next();
                if(input.equals("1"))
                {
                    System.out.println("You pressed 1");
                } else if (input.equals("2")){
                System.out.println("You pressed 2");
                } else if (input.equals("3")){
                System.out.println("You pressed 3");
                }
                else {
                System.out.println("invalid input");
            }
            }
            while (!input.equals("enter") || !input.equals("Enter") || !input.equals("leave") || !input.equals("Leave"));

        }
    }
}
