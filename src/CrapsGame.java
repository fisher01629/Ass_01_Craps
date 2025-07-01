import java.util.Random;
import java.util.Scanner;

public class CrapsGame
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int die1,die2, sum,thePoint;
        boolean done = false;
        do{
            die1 = rnd.nextInt(6)+1;
            die2 = rnd.nextInt(6)+1;
            sum = die1 + die2;
            System.out.println("Die one: " + die1);
            System.out.println("Die two: " + die2);
            System.out.println("Sum: " + sum);
            if(sum == 2 || sum == 3 || sum == 12){
                System.out.println("You rolled a "+sum+". You crapped out!");
                done = true;
            }
            else if(sum == 7 || sum == 11){
                System.out.println("You rolled a "+sum+". You win with a natural!");
                done = true;
            }
            else{
                thePoint = sum;
                while(!done){
                    die1 = rnd.nextInt(6)+1;
                    die2 = rnd.nextInt(6)+1;
                    sum = die1 + die2;
                    System.out.println("Die one: " + die1);
                    System.out.println("Die two: " + die2);
                    System.out.println("Sum: " + sum);
                    if(sum == thePoint){
                        System.out.println("You rolled the point! You win!");
                        done = true;
                    }else if(sum == 7){
                        System.out.println("You rolled a 7. You crapped out!");
                        done = true;
                    }
                    else{
                        System.out.println("Trying for point...");
                    }


                }
            }
            System.out.print("Do you want to roll again?(Y/N(any other key to quit)):");
            String answer = in.nextLine();
            if(answer.equalsIgnoreCase("Y")){
                done = false;
            }
            else{
                done = true;
            }
        }while(!done);
    }
}