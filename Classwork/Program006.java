import java.util.Scanner;

public class Program006
 {
    public static void main(String A[])
    {
        Scanner scanner=null;
        //reference refer the object of Scanner class
        String sName = null;
        int iAge=0;
        float fMarks=0.0; //error :Lossy Conversion: Possible lossy conversion from double to float

        scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        sName=scanner.nextLine();//next() method is used to read single word from user (next vs nextline)

        System.out.println("Enter your age : ");
        iAge=scanner.nextInt();

        System.out.println("Enter your marks : ");
        fMarks=scanner.nextFloat();

        System.out.println("WELCOME : "+sName);
        System.out.println("Your age is : "+iAge);
        System.out.println("Your marks are : "+fMarks);
    } 
}
