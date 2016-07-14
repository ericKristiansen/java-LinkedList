import java.io.*;

/**
 * Main Client Class
 */
public class Main
{

    public static void main(String [ ] args)
    {
        try
        {
            String temp;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Please Enter Some Junk: ");
            temp = br.readLine();
            System.out.println();
            System.out.println("temp: " + temp);
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
            ex.printStackTrace();
        }
    }

}
