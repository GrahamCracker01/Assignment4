//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Assignment4C {
    public static void main(String[] args) throws InterruptedException {

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        String strUser;
        int intBackspace;

        //initial output and get input
        System.out.println("[Backspace Animation]\nPlease enter your sentence:");
        strUser = scan.nextLine();
        System.out.println("How many letters do you want to backspace?");
        intBackspace = scan.nextInt();

        //relaying message
        System.out.println(strUser);

        //the magic (looping until backspaced the correct amount)
        for (int intCount = 0; intCount < intBackspace; intCount++) {
            //pause the program for .5 seconds
            Thread.sleep(500);
            strUser = (strUser + "\b");
            System.out.println(strUser);
        }

    }
}