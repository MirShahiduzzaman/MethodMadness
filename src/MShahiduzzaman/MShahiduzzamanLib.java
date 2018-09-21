package MShahiduzzaman;

public class MShahiduzzamanLib
{
    public static void println(String str)
    {
        System.out.println(str);
    }

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

    public static String dateStr(String date)
    {
        int index = date.indexOf("/");

        while(index>=0)
        {
            date = date.substring(0,index) + "-" + date.substring((index+1));
            index = date.indexOf("/");
        }

        return(date);
    }

    public static int sumUpTo(int num)
    {
        int total = 0;
        for(int i = 1; i<=num; i++)
        {
            total += i;
        }
        return(total);
    }

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

    public static void fooBarBaz(int num1)
    {
        if(num1<=0)
        {
            println("");
        }
        else
        {
            String result = "";
            int n = 0; /**number of numbers atm*/
            int currentNum = 1; /**Numbers to check*/

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
}
