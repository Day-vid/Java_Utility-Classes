/**
* Validation Class which enables user input validation for the program.
*
* @author David Bryant
* @version 04 February 2022
*/
public class Validation
{
    /**
    * Constructor for objects of Validation class
    */
    public Validation()
    {

    }

    /**
    * Class method to get check against blank input from user
    *
    * @param    value   The value that needs to be validated
    * @return   blank   boolean value to ascertain if the String is blank
    */
    public boolean stringIsBlank(String value)
    {
        boolean blank = false;
        if (value.trim().length() == 0)
            blank = true;
        return blank;
    }

    /**
    * Validation Class Method to check if the input value from the user is within range
    *
    * @param    value   The value that needs to be validated
    * @param    min     the minimum value set for validation
    * @param    max     the maximum value set for validation
    * @return   withinRange     returns the value whether the input was true or false based on validation logic
    */
    public boolean stringIsWithinRange(String value, int min, int max)
    {
        boolean withinRange = false;
        if ((value.trim().length() >= min) && (value.trim().length() <= max ))
            withinRange = true;
        return withinRange;
    }
}
