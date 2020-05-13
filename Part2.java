
/**
 * Write a description of class Part2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Part2
{
    //2a
    public static boolean isValid(int numWithCheckDigit)
    {
        int num = numWithCheckDigit/10;
        int correctCheck = getCheck(num);
        int check = numWithCheckDigit%10;
        if(check==correctCheck)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //2b
    /**
     * I Would make an instance field of private int invalidCheck
     * and add a constructor to the CheckDigit class, which initializes
     * invalidCheck to zero, then every time isValid returns false, 
     * I would add 1 to invalidCheck. I would have to change the method
     * headers for getCheck and isValid by taking out the word static.
     */
}
