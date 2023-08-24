
import java.util.Scanner;

public class task1 {
      /*TASK 1 : TO GENERATE A NUMBER IN A GIVEN RANGE AND TAKE A INPUT FROM A USER 
    AND COMPARE IT WITH THE GENERATED NUMBER AND PROVIDE FEEDBACK */


    private static final Scanner sc = new Scanner(System.in);


    static void numberGame(int max){
        int generated_num = (int)(Math.random()*(max));
        int i = 0;
        
        
        
        System.out.println("THERE WILL BE ONLY THREE CHANCES TO GUESS. ALL THE BEST!");
        
        int maxAttempts=10;
        int attempts=0;
        while(i<maxAttempts){
            
            System.out.println("ENTER THE GUESS FOR GENERATED NUMBER:");
            int guessed_num = sc.nextInt();
            //giving feeback on the basis of guessed number
            if(guessed_num == generated_num){
            System.out.println("HURRAY! YOUR GUESS WAS CORRECT.");
            break;
            }
            else if(guessed_num<generated_num && Math.abs(generated_num-guessed_num)>0){
                System.out.println("OOPS! THE GUESS WAS TOO LOW");
            }
           
        
            else if (guessed_num<generated_num && Math.abs(generated_num-guessed_num)<10){
                System.out.println("OHHH! YOU WAS NEAR THE CORRECT ANSWER.");
            }

            else if (guessed_num>generated_num ){    
                System.out.println("OHH! GUESSED NUMBER IS GREATER THAN GENERATED ONE.");
            }

            else{
                System.out.println("GUESSED NUMBER IS HIGH ");
            }

            i++;
            attempts++;
           
        }
            

        //providing score out of 15 on the basis of attempts 
        int score = maxAttempts - attempts;
    
        if (i == maxAttempts) {
            System.out.println("Out of attempts. The correct number was: " + generated_num);
        }
        System.out.println(score);
        

    }

    public static void main(String args[]){
        numberGame(100);
    }
    
}

    

