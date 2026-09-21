import java.util.Scanner;

public class App {

    public static String readUserText (String prompt, Scanner textScanner) {
        System.out.println (prompt);
        String usrInput = textScanner.nextLine();
        return usrInput;
    }

    public static int readUserNum (String prompt, int min, int max, Scanner numScanner) {
        System.out.println (prompt);
        int usrInput = numScanner.nextInt();

        if (min <= usrInput && usrInput <= max) {
            return usrInput;
        }
        else {
            System.out.println ("Value must be between 1 and 10. Default: 5");
            return 5;
        }
        
    }

    public static void main (String[] args) {
		Scanner textScanner = new Scanner(System.in);

        String catName = readUserText ("What is your cat's name?", textScanner);
        String catSound = readUserText ("What sound does your cat make?", textScanner);
        int catAge = readUserNum ("How old is your cat?", 0, 30, textScanner);
        String catStory = readUserText ("Tell me a story about your cat.", textScanner);
        int catEnergy = readUserNum ("From 1-10, how much energy does your cat have?", 1, 10, textScanner);

		// introduce cat with "Cat Name", "Cat Sound", Cat Age, "Cat Story", Cat Energy
        // System.out.println (Cat.introduceCat (catName, catSound, catAge, catStory, catEnergy));

        textScanner.close();

        //Evaluate cat and recommend activity
        System.out.println ("\n\n\nName: " + catName);
        System.out.println ("Age: " + catAge + " (" +Cat.classifyAge(catAge) + ")");
        System.out.println ("Activity: " + Cat.recommendActivity(catAge, catEnergy));
    }
}
