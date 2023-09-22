import java.util.*;

class NumGame
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int start = 1; 
		int end = 100 ;
		int maxAttempts = 10;
		int rounds = 0;
		int total_attempts = 0;
		
		System.out.println("$$$---Welcome to the Number Game !---$$$");
		System.out.println("You have to guess the number which I was thinking between " + start + " and " + end);
		
		boolean Retry = true;
		
		while(Retry)
		{
		    int target = ran.nextInt(end - start + 1) + start;
		    int attempts = 0;
		    
		    System.out.println("Round " + (rounds + 1) + " =>");
		    
		    while(true)
		    {
		        System.out.println("Enter your Guess:");
		        int guess = sc.nextInt();
		        attempts++;
		        
		        if (guess < start || guess > end) 
                {
                    System.out.println("Please guess a number within" + start + " to " + end);
                } 
                else if (guess < target) 
                {
                    System.out.println("Too low! Try again.");
                } 
                else if (guess > target) 
                {
                    System.out.println("Too high! Try again.");
                } 
                else 
                {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    
                    total_attempts += attempts;
                    break;
                }
                
                if (attempts >= maxAttempts) 
                {
                    System.out.println("Out of attempts. The number was " + target);
                    break;
                }
            
		    }
		    
		    rounds ++;
		    
		    System.out.print("Do you want to play again? (yes/no): ");
            String onceMore = sc.next().toLowerCase();
            if (!onceMore.equals("yes")) 
            {
                Retry = false;
            }
		}
		
		double averageAttempts = (double) total_attempts / rounds;
		System.out.println();
        System.out.println("Thanks for playing!");
        System.out.println("Rounds played: " + rounds);
        System.out.println("Average attempts per round: " + averageAttempts);
		
		    
		}
		
	}
