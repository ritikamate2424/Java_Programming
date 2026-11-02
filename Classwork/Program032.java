 import java.util.Scanner;

public class Program032
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
        int icnt=0; //default value of icnt is 0

        icnt=1; 

        do //tail checking
        {
            System.out.println("-----------------------");
            System.out.println(icnt + ". " + " Jay Ganesh.......");
            System.out.println("-----------------------");

            icnt++;
        }
        while(icnt<=iNo);
    }
} 


