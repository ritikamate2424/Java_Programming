public class Program021
{

    public static void main(String A[])
    {
        Iteration iteration=new Iteration();
        iteration.Display();
    }
}
class Iteration
{
    public void Display() //Non-static
    {
        int icnt=0;

        for(icnt=1;icnt<=6;icnt++) //Static loop
        {
            System.out.println("Jay Ganesh.......");
        }
    }
} 

