import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solution {
    public static void main(String[] args) {
        System.out.println("Enter text and press \"Enter\"");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String s = reader.readLine();
            printStrReverse(s);
            printStrInColumn(s);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void printStrReverse(String s)
    {
        for (int i = s.length()-1; i>=0; i--)
        {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
    public static void printStrInColumn(String s)
    {
        for (int i = 0; i<s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}
