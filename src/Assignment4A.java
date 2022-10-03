//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Assignment4A {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intItaly = 0;
        int intCostaRica = 0;
        int intPaxBisonica = 0;
        int intGhana = 0;
        int intStudent = 1;
        int intQuit = 0;
        String strInput;
        String strLargest = "two places at once. Seems there was a tie";

        //initial output
        System.out.println("[CCSE Study Abroad Survey]");

        //loop for repeating survey
        while (intQuit == 0) {
            System.out.println("Student #" + intStudent + ": Which country should we go to for our next study abroad program?\nItaly\nCosta Rica\nPax Bisonica\nGhana\n(Type Quit to end the survey)");
            strInput = scan.nextLine();
            if (strInput.equals("Italy")) {
                intItaly++;
            }
            else if (strInput.equals("Costa Rica")) {
                intCostaRica ++;
            }
            else if (strInput.equals("Pax Bisonica")) {
                intPaxBisonica ++;
            }
            else if (strInput.equals("Ghana")) {
                intGhana ++;
            }
            else if (strInput.equals("Quit")) {
                intQuit++;
            }
            else {
                System.out.println("Please check your spelling!");
                intStudent --;
            }
            System.out.println("Thank you!\n");
            intStudent++;
        }

        //loops finding largest value
        if (intItaly > intCostaRica && intItaly > intPaxBisonica && intItaly > intGhana) {
            strLargest = "Italy";
        }
        else if (intCostaRica > intItaly && intCostaRica > intPaxBisonica && intCostaRica > intGhana) {
            strLargest = "Costa Rica";
        }
        else if (intPaxBisonica > intItaly && intPaxBisonica > intCostaRica && intPaxBisonica > intGhana) {
            strLargest = "Pax Bisonica";
        }
        else if (intGhana > intItaly && intGhana > intCostaRica && intGhana > intPaxBisonica) {
            strLargest = "Ghana";
        }

        //final output
        System.out.println("Italy: " + intItaly + "\nCosta Rica: " + intCostaRica + "\nPax Bisonica: " + intPaxBisonica + "\nGhana: " + intGhana + "\n\nNext year's study abroad program will take place in " + strLargest + ".");
    }
}