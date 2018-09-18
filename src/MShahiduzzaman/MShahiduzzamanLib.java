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
}
