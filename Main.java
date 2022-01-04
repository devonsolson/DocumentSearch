import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        //this creates an object utilizing java scanner for user input
        Scanner word = new Scanner(System.in);
        //this string will be the user input
        String userInput;

        System.out.print("Enter the search term: ");
        userInput = word.nextLine();
        System.out.println();


        System.out.println("Search Method: 1) String Match 2) Regular Expression 3) Indexed");
        //this creates an object utilizing java scanner for user input
        System.out.print("Enter the search method: ");
        Scanner selection = new Scanner(System.in);
        //this string will be the user input
        String userSelection;
        userSelection = selection.nextLine();

        //begin functions & start timer
        long beginTimer = System.currentTimeMillis();
        int[] timesFound = search.main(userSelection, userInput);
        long stopTimer = System.currentTimeMillis();
        //subtract the end time from the begining
        long finalTime = stopTimer - beginTimer;

        String format = "\n\t";
        System.out.println("\n" + "Search results:");
        System.out.println(format + "french_armed_forces.txt - " + timesFound[0] + " " + "matches");
        System.out.println(format + "hitchhikers.txt - " + timesFound[1] + " " + "matches");
        System.out.println(format + "warp_drive.txt - " + timesFound[2] + " " + "matches");


        //print out the time in milliseconds
        System.out.println("\n" + "Elapsed time: " + finalTime + " ms");

    }
}
