package MShahiduzzaman;
/**Mir Shahiduzzaman 9/21/2018*/

import static MShahiduzzaman.MShahiduzzamanLib.println;
import static MShahiduzzaman.MShahiduzzamanLib.isPalindrome;
import static MShahiduzzaman.MShahiduzzamanLib.dateStr;
import static MShahiduzzaman.MShahiduzzamanLib.sumUpTo;
import static MShahiduzzaman.MShahiduzzamanLib.primePrinter;
import static MShahiduzzaman.MShahiduzzamanLib.fooBarBaz;
import static MShahiduzzaman.MShahiduzzamanLib.quadSolver;

public class TestFile
{
    public static void main(String[] args)
    {
        println("I love a cup of Java in the morning");

        System.out.println(isPalindrome("mommy"));
        System.out.println(dateStr("12/03/01"));
        System.out.println(sumUpTo(2));
        System.out.println(sumUpTo(8));
        System.out.println(sumUpTo(-1));

        primePrinter(21);
        primePrinter(3);
        primePrinter(13);
        primePrinter(-1);

        fooBarBaz(54);
        fooBarBaz(23);
        fooBarBaz(17);
        fooBarBaz(-1);

        println(quadSolver(4,4,1));
    }
}