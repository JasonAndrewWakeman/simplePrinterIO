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
boolean shouldQuit = false;
            String input;
            do
            {
                System.out.println("Press 1 to print, 2 to add ink, 3 to add paper, or QUIT to quit");
                input = scan.next();
                if(input.equals("1"))
                {
                    System.out.println("You pressed 1");
                } else if (input.equals("2")){
                System.out.println("You pressed 2");
                } else if (input.equals("3")){
                System.out.println("You pressed 3");
                }else if (input.equalsIgnoreCase("quit")){
                    System.out.println("FINE THEN!!!");
                    shouldQuit = true;
                }
                else {
                System.out.println("invalid input");
            }
            }
            while (shouldQuit != true);

        }
    }
}
