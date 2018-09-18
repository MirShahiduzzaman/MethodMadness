package MShahiduzzaman;

import static MShahiduzzaman.MShahiduzzamanLib.println;
import static MShahiduzzaman.MShahiduzzamanLib.isPalindrome;
import static MShahiduzzaman.MShahiduzzamanLib.dateStr;
import static MShahiduzzaman.MShahiduzzamanLib.sumUpTo;

public class TestFile
{
    public static void main(String[] args)
    {
        println("I love a cup of Java in the morning");

        System.out.println(isPalindrome("mom"));
        System.out.println(dateStr("12/20/01"));
        System.out.println(sumUpTo(2));
    }
}
