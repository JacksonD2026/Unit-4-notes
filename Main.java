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
      while (count <= 100000000){
         //Execute statments in the loop body
         System.out.println(count);
         //3. CHANGE your loop control variable
         count++; //equvalent to count - count + 1;
      }

   }
}
