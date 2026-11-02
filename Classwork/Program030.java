 import java.util.Scanner;

public class Program030
{

    public static void main(String A[])
    {
        Scanner scanner= new Scanner(System.in);
        int iValue=0;

        Iteration iteration=new Iteration();

        System.out.println("Enter the frequency:");

        iValue =scanner.nextInt();

        iteration.Display(iValue);

    }
}
class Iteration
{
    public void Display(int iNo) //Non-static
    {
        int icnt=0;

        for(icnt=iNo;icnt>=1;icnt--) //Dynamic loop (Backward)
        {
            System.out.println("-----------------------");
            System.out.println(icnt + ". " + " Jay Ganesh.......");
            System.out.println("-----------------------");
        }
    }
} 

