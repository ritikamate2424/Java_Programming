import java.util.Scanner;

public class Program024
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

        //Input Updater
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(icnt=1;icnt<=iNo;icnt++) //Dynamic loop
        {
            System.out.println("Jay Ganesh.......");
        }
    }
} 
