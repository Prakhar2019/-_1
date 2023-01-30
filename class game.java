import java.util.Random;
import java.util.Scanner;

class game
{
    static int score=0;

    public static void stage1()
    {
        Scanner sc=new Scanner(System.in);
        Random e=new Random();
        System.out.println("You have 5 chances in round 1");
        int times=5;
        int s;
        int element;
        s=e.nextInt(100);
        for(int i=1;i<=times;i++)
        {
            System.out.println(" guess your number");
            element=sc.nextInt();
            if (element==s)
            {
                System.out.println("your guess number is correct");
                score++;
                stage2();
                break;
            }
            else if(element<s)
            {
                System.out.println("Your guess number is lower ");
            }
            
            else 
            {
                System.out.println("Your guess number is large ");
            }
            
        }
    }
    public static void stage2()
    {
        Scanner sc=new Scanner(System.in);
        Random e=new Random();
        System.out.println("You have 3 chances in round 2");
        int times=3;
        int s;
        int element;
        s=e.nextInt(100);
        for(int i=1;i<=times;i++)
        {
            System.out.println(" guess your number");
            element=sc.nextInt();
            if (element==s)
            {
                System.out.println("your guess number is correct");
                score++;
                stage3();
                break;
                
            }
            else if(element<s)
            {
                System.out.println("Your guess number is lower ");
            }
            
            else 
            {
                System.out.println("Your guess number is large ");
            }
            
        }

    }
        public static void stage3()
        {
            Scanner sc=new Scanner(System.in);
            Random e=new Random();
            System.out.println("You have 2 chances in round 3");
            int times=2;
            int s;
            int element;
            s=e.nextInt(100);
            for(int i=1;i<=times;i++)
            {
                System.out.println(" guess your number");
                element=sc.nextInt();
                if (element==s)
                {
                    System.out.println("your guess number is correct");
                    score++;
                   break;
                }
                else if(element<s)
                {
                    System.out.println("Your guess number is lower ");
                }
                
                else 
                {
                    System.out.println("Your guess number is large ");
                }
                
            }
          
        }
           
   
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random e=new Random();
        System.out.println("Game Started");
        game play=new game();
        play.stage1();
        if (score==0)
        {
            System.out.println("You lose the game");
        }
        else{
            System.out.println("your score is: " +score + " out of 3");
        }
        
       

    }
}