import java.util.Scanner;
/**
* Input Class which enables users to input data into the program.
*
* @author David Bryant
* @version 02 February 2022
*/
public class Input
{
    /**
    * Default Constructor for objects of Input class
    */
    public Input()
    {

    }

    /**
    * Method to get character input from keyboard
    *
    * @param    displayMessage  A message in String to inform user of the input
    * @param    position    The index position for the desired character  
    * @return   The character from user input based on the index position
    */
    public char acceptCharInput(String displayMessage, int position)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(displayMessage);
        String input = console.nextLine();
        return input.charAt(position);
    }

    /**
    * Method to get number input from keyboard
    *
    * @param    displayMessage  A message in String to inform user of the input
    * @return   The number from user input based on the number
    */
    public double acceptDoubleInput(String displayMessage)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(displayMessage);
        return Double.parseDouble(console.nextLine());
    }

    /**
    * Method to get number input from keyboard
    *
    * @param    displayMessage  A message in String to inform user of the input
    * @return   The number from user input based on the index position
    */
    public int acceptIntegerInput(String displayMessage)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(displayMessage);
        int input = Integer.parseInt(console.nextLine());
        return input;
    }

    /**
    * Method to get string input from keyboard
    *
    * @param    displayMessage  A message in String to inform user of the input
    * @return   The string from user input based on the index position
    */
    public String acceptStringInput(String displayMessage)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(displayMessage);
        String input = console.nextLine();
        return input;
    }

    /**
    * Method to get string input from keyboard
    *
    * @param    displaymessage  A message in String to inform user of the input
    * @return   The string from user input based on the index position
    */
    public String acceptInput(String displayMessage)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(displayMessage);
        String input = console.nextLine();
        return input;
    }
}
