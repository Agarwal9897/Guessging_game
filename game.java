import java.util.Random;
import java.util.Scanner;
class game{
    static int score=0;
    public static void show_score()
    {
        System.out.println(game.score);
    }
    public static void start_game(int guess){
        Random random=new Random();
        int num=random.nextInt(101); 
        if(num==guess)
        {
            System.out.println("Your guess is right.");
            game.score++;
        }
        else if(num>guess)
        {
            System.out.println("Your guess is a low.");
        }
        else if(num<guess)
        {
            System.out.println("Your guess is a High.");
        }
        else if(num!=guess)
        {
            System.out.println("Your guess is a low.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ch=0;
        do{
            System.out.println("Welcome to the Guessing Game");
            System.out.println("1 to Start Game");
            System.out.println("2 to Show Score");
            System.out.println("3 to Exit");
            System.out.print("Enter your choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.print("Enter Your Guess(Between 1 to 100): ");
                int guess=sc.nextInt();
                start_game(guess);
                break;
                case 2:
                show_score();
                break;
                case 3:
                break;
                default:
                System.out.println("Incorrect Choice");
                break;
            }
        }while(ch!=3);
    }
}