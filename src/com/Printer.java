package com;

import java.util.Scanner;

public class Printer {
    private int INK_CAPACITY = 10;
    private int PAPER_CAPACITY = 20;

    private double inkRemaining;
    private int pagesRemaining;

    public Printer() {
        inkRemaining = INK_CAPACITY;
        pagesRemaining  = PAPER_CAPACITY;
    }

    /**
         *  ask the user how many pages they would like to print.
         *  if it is possible to print that many pages. Then print them.
         *  if it is not inform the user. And return them to the main menu
         * @param scan
         */
        protected void performPrint(Scanner scan){
            System.out.println("How many pages would you like to print");
            try {
                Integer numPages = scan.nextInt();
                reduceResources(numPages);
            }1
            catch(Exception e)      {

                System.out.println("Invalid input" + e);

            }


}


    /**
     *  adds a full cartridge of ink to the printer
     */
    protected void performInkAddition() {
        System.out.println("REMOVE ME AND IMPLement the perform ink ADDIDIONT METHOD");
    }


    /**
     *  adds a full rack of paper to the printer
     */
    protected void performPaperAddition() {
        System.out.println("REMOVE ME AND IMPLement the perform paper ADDIDIONT METHOD");
    }



    /**
     *  should reduce the amoount of ink in the printer by numPages * .185.
     *  should reduce the amount of paper in the printer by numPages.
     *
     *  if either of these can not occur it should in form the user (using system.out.println)
     *  that the operation can't be performed, the reason, and then return them to the menu.
     *
     */
    private void reduceResources(Integer numPages) {
        // you should probably do some checks here
        reducePaper(numPages);
        reduceInk(numPages);
        System.out.println("could you print the paper? are the resources reduced? the current resource is: " +
                "paper=" + pagesRemaining + " ink=" + inkRemaining);

    }


    /**
     *  should reduce the amoount of ink in the printer by numPages * .185.
     */
    private void reduceInk(Integer numPages) {

        System.out.println("REMOVE ME AND do the reduce ink");
    }

    /**
     *  should reduce the amoount of paper in the printer by numPage
     */
    private void reducePaper(Integer numPages) {
        System.out.println("REMOVE ME AND do the reduce paper");
    }
}