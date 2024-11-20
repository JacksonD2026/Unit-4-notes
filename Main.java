import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      


      boolean condition = false;
      //Statments inside a WHILE LOOP BODY will repeat
      // until the condition is false
      while (condition) {
         //Statments (instructions_ to be repeated)
         System.out.println("You fool");
         //While condition is false, the body won't exucute
         // If we had set our condition to true, we'd have an infinite loop
      }

      // THREE STEPS TO WRITE A LOOP
      //1. Initialize the LOOP CONTROL variable
      int count = 1;
      //2. Test the CONDITION in the loop header
      //here, the condition is "count<=10"
      //but it could also just be a boolean value
      while (count <= 1){
         //Execute statments in the loop body
         System.out.println(count);
         //3. CHANGE your loop control variable
         count++; //equvalent to count - count + 1;
      }

         //Guessing game
         Scanner scan = new Scanner(System.in);
         // Choose a random number from 0-100
      int num = (int) (Math.random() * 100);
   
         // Ask the user to guess a number from 0 to 100
         System.out.println("SAY A NUMBER FROM 0-100 OR ELSE.");
         int guess = scan.nextInt();
         // Get the first guess using scan.nextInt();
         // Loop while the guess does not equal the random number,
      while (guess != num) {

         // If the guess is less than the random number, print out "Too low!"
   if (guess < num) {
System.out.println("TOO LOW YA DINGLEWEED");
   }
   // If the guess is greater than the random number, print out "Too high!"
   else if (guess > num) {
System.out.println("TOO HIGH YA FEATHER JUNK");
   }
        // Get a new guess (save it into the same variable) 
   System.out.println("Guess again.");
guess = scan.nextInt(); //LOOP CHANGE
        
   
      }

      System.out.println("YOU DID NOT DO IT >:(");
         // Print out something like "You got it!"
   
   }
}
