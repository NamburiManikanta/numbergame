import java.util.Scanner;
import java.util.Random;
public class numbergame
{
    public static void main(String args[])
    {
        Random rand=new Random();
        int count=10;
        int s1;
        int flag=0;
        int rand_int1=rand.nextInt(100);
        Scanner s =new Scanner(System.in);
        System.out.println("WELCOME TO GUESSING THE MAGIC NUMBER GAME");
        System.out.println("THE MAGIC NUMBER IS READY");
        System.out.println("PLEASE GUESS A NUMBER:");
        
            s1=s.nextInt();
            
            if(s1==rand_int1 && count==0)
            {
                System.out.println("U GUESSED THE MAGIC NUMBER, CONGRATS!");
                System.out.println("SCORE=10, PERFECT SCORE!");
            }
            else
            {
                while(flag==0)
                {
                    if(s1<rand_int1)
                    {
                        System.out.println("the guessed number is less than magic number");
                        s1=s.nextInt();
                        System.out.println("you entered the number "+s1);
                        
                    }
                    else if(s1>rand_int1)
                    {
                        System.out.println("the guessed number is greater than magic number");
                        s1=s.nextInt();
                        System.out.println("you entered the number "+s1);
                        
                    }
                    else if(s1==rand_int1)
                    {
                     
                        flag=1;

                    }
                    count--;
                    System.out.println("U GUESSED THE MAGIC NUMBER, CONGRATS!");
                    System.out.println("the number is "+s1);
                    System.out.println("score="+count);
                    
                }
            }
        
        
    }
}
