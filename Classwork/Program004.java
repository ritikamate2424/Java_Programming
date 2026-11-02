import java.util.Scanner;

public class Program004
 {
    public static void main(String A[])
    {
        Scanner scanner=null;//reference refer the object of Scanner class
        String sName = null;

        scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        sName=scanner.nextLine();

        System.out.println("WELCOME : "+sName);
    } 
}
// buffered non-buffered