import java.util.Scanner;

public class Cypher {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a message to encode or decode:");
        String message = scan.nextLine();
        String output = "";
        char key = 13;

        for (int x = 0; x < message.length(); x++) {
        output += (char) (message.charAt(x) + key);
        }//end of for loop
    }//end of main method
}//end of Cypher Class


