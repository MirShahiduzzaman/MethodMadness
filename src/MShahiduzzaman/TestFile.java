package MShahiduzzaman;
/**Mir Shahiduzzaman 9/21/2018*/

import static MShahiduzzaman.MShahiduzzamanLib.println;
import static MShahiduzzaman.MShahiduzzamanLib.isPalindrome;
import static MShahiduzzaman.MShahiduzzamanLib.dateStr;
import static MShahiduzzaman.MShahiduzzamanLib.sumUpTo;
import static MShahiduzzaman.MShahiduzzamanLib.primePrinter;
import static MShahiduzzaman.MShahiduzzamanLib.fooBarBaz;
import static MShahiduzzaman.MShahiduzzamanLib.quadSolver;
import static MShahiduzzaman.MShahiduzzamanLib.leastCommonMultiple;

public class TestFile
{
    public static void main(String[] args)
    {
        //Prints the string in the parameter
        println("I love a cup of Java in the morning");

        println("");

        //This should return false because the input is not a palindrome
        System.out.println(isPalindrome("mommy"));

        //This should return true because the input is a palindrome
        System.out.println(isPalindrome("mom"));

        println("");

        //Formats date to 03-08-2001
        System.out.println(dateStr("08/03/2001"));

        println("");

        //takes the sum from 0 to 2
        System.out.println(sumUpTo(2));

        //takes the sum from 0 to 2
        System.out.println(sumUpTo(8));

        //Prints 0 because num is less than 0
        System.out.println(sumUpTo(-1));

        println("");

        //prints num number of prime numbers
        primePrinter(21);
        primePrinter(3);
        primePrinter(13);

        //both print an empty string because num is less than 1
        primePrinter(0);
        primePrinter(-1);

        println("");

        //prints a list of numbers from 0 to num1
        fooBarBaz(54);
        fooBarBaz(23);
        fooBarBaz(17);

        //both print a line with an empty string
        fooBarBaz(0);
        fooBarBaz(-1);

        println("");

        //prints one root
        println(quadSolver(4,4,1));

        //both print two roots
        println(quadSolver(3,4,1));
        println(quadSolver(-3.34,4,1));

        //prints an explanation of why this results in imaginary roots
        println(quadSolver(4,3,1));

        //prints an explanation of why this is not a quadratic equation
        println(quadSolver(0,3,1));

        println("");

        //prints 0 because at least one parameter is 0
        System.out.println(leastCommonMultiple(0,44,88));

        //both print the least common multiple of the parameters. The answer is always positive.
        System.out.println(leastCommonMultiple(5,30,50));
        System.out.println(leastCommonMultiple(-22,44,88));
    }
}