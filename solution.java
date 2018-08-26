import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String s = reader.readLine();
            printReverse(s);
            printStrInColumn(s);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void printReverse(String s)
    {
        char[] ar = s.toCharArray();
        for (int i = ar.length-1; i>=0; i--)
        {
            System.out.print(ar[i]);
        }
        System.out.println();
    }
    public static void printStrInColumn(String s)
    {
        char[] ar = s.toCharArray();
        for (int i = 0; i<ar.length; i++)
        {
            System.out.println(ar[i]);
        }
    }
}
