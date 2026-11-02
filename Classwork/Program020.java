public class Program020
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

        for(icnt=1;icnt<=4;icnt++) //Static loop
        {
            System.out.println("Jay Ganesh.......");
        }
    }
} 
