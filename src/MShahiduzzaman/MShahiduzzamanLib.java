package MShahiduzzaman;
/**Mir Shahiduzzaman 9/21/2018*/

public class MShahiduzzamanLib
{
    /**
     * prints the string parameter to the system
     *
     * @param str String to be printed
     */
    public static void println(String str)
    {
        System.out.println(str);
    }

    /**
     * Checks whether a word is a palindrome
     *
     * @param word the word the user wants to check
     *
     * @return true if word is a palindrome and false if it isn't
     */
    public static boolean isPalindrome(String word)
    {
        String check = "";

        for(int i = (word.length()-1);i>=0;i--)
        {
            check += word.substring(i,i+1);
        }

        if(check.equals(word))
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }

    /**
     * Takes String date in the format mm/dd/yyyy and changes the format to dd-mm-yyyy
     *
     * @param date user input of date with slashes
     *
     * @return String date in the format dd-mm-yyyy
     */
    public static String dateStr(String date)
    {
        int index = date.indexOf("/");

        while(index>=0)
        {
            date = date.substring(0,index) + "-" + date.substring((index+1));
            index = date.indexOf("/");
        }

        return(date.substring(3,6) + date.substring(0,3) + date.substring(6));
    }

    /**
     * returns the sum of numbers from 0 to num (the input)
     *
     * @param num number to sum up to
     *
     * @return sum of numbers from 0 to num
     */
    public static int sumUpTo(int num)
    {
        int total = 0;
        for(int i = 1; i<=num; i++)
        {
            total += i;
        }
        return(total);
    }

    /**
     * prints the first num prime numbers, where num is the input
     *
     * @param num number of prime numbers the user wants to print
     */
    public static void primePrinter(int num)
    {
        if(num <= 0)
        {
            println("");
        }
        else
        {
            String allPrime = "";
            int check = 2;
            boolean correct = true;
            int n = 0;

            while (n < num) {
                for (int i = 2; i < check; i++) {
                    if ((check % i) == 0) {
                        correct = false;
                    }
                }

                if (correct) {
                    allPrime += check + " ";
                    n++;
                }
                check++;
                correct = true;
            }

            String shown = (allPrime.substring(0, (allPrime.length() - 1)));

            println(shown);
        }
    }

    /**
     * prints a list of numbers from 1 to num1, replacing multiples of 3 with foo, multiples of 5 with bar, and
     * multiples of both 3 and 5 with baz
     *
     * @param num1 represents the maximum number in the list
     */
    public static void fooBarBaz(int num1)
    {

        if(num1<=0)
        {
            println("");
        }
        else
        {
            String result = "";
            int n = 0; //number of numbers atm
            int currentNum = 1; //Numbers to check

            while (n < num1)
            {
                if (currentNum % 3 == 0 && currentNum % 5 == 0)
                {
                    result += "baz";
                }
                else
                {
                    if (currentNum % 3 == 0)
                    {
                        result += "foo";
                    }
                    else {
                        if (currentNum % 5 == 0) {
                            result += "bar";
                        } else {
                            result += currentNum;
                        }
                    }
                }
                n++;
                currentNum++;

                if (n < num1)
                {
                    result += ", ";
                }
            }
            println(result);
        }
    }

    /**
     * Finds the roots of a quadratic equation using the quadratic formula, given a, b, and c.
     *
     * @param a represents "a" in the quadratic equation
     * @param b represents "b" in the quadratic equation
     * @param c represents "c" in the quadratic equation
     *
     * @return String with roots, given the values of a, b, and c. If there are any imaginary roots, it will
     * return an explanation for this. Also, if a is 0, it will return an explanation that the equation the parameters
     * are describing is not quadratic.
     */
    public static String quadSolver(double a,double b,double c)
    {
        if(a == 0)
        {
            return("Not a quadratic equation because a is 0.");
        }
        else
        {
            double rad = (b *b) - (4*a*c);

            if(rad<0)
            {
                return("The roots are imaginary because the discriminant is less than 0.");
            }

            double top1 = -b + (Math.sqrt(rad));
            double top2 = -b - (Math.sqrt(rad));
            double bot = 2*a;

            if(rad == 0)
            {
                return("The only root is " + (top1/bot) + ".");
            }
            else
            {
                return ("The roots are " + (top1 / bot) + " and " + (top2 / bot) + ".");
            }
        }
    }

    /**
     * Determines the least common multiple between 3 numbers
     *
     * @param num1 first number
     * @param num2 second number
     * @param num3 third number
     *
     * @return an integer representing the least common multiple of the parameters
     */
    public static int leastCommonMultiple(int num1, int num2, int num3)
    {
        if(num1 == 0 || num2 == 0 || num3 == 0)
        {
            return(0);
        }
        if(num1<0)
        {
            num1 = num1 * -1;
        }
        if(num2<0)
        {
            num2 = num2 * -1;
        }
        if(num3<0)
        {
            num3 = num3 * -1;
        }
        int check1 = 0; //0 to continue while loop, 1 to get out
        int mult1 = 1; //multiplies num1 by mult1 until answer mod num 2 is 0
        int temp1 = 0; //answer to mult1 *check1

        int check2 = 0;
        int mult2 = 1;
        int temp2 = 0;

        while (check1 == 0)
        {
            temp1 = num1 * mult1;
            if(temp1%num2 == 0)
            {
                check1 =1;
            }
            mult1++;
        }

        while (check2 == 0)
        {
            temp2 = temp1 * mult2;
            if(temp2%num3 == 0)
            {
                check2 =1;
            }
            mult2++;
        }

        return(temp2);
    }
}
