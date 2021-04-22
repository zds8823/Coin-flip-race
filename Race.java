//********************************************************************
//            Race.java           Author: Eric lavoie #100122593
// uses the coin class to flip a until it has landed heads or tails 
//  10000 times and prints the results
//********************************************************************

   public class Race
   {
   //-----------------------------------------------------------------
   //  Creates a Coin object, flips it, and prints the results.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
     //creates integers for heads and tails and sets them equal to 0
     int heads=0;
     int tails=0;
     //calls on the coin class coin
     Coin myCoin = new Coin();
      //creates a loop from  - 0 to a large arbitrary number
      for (int i=0;i<=1000000;i++)
      {
      // runs the flip method from the coin class
      myCoin.flip();
      
      //if the coin lands heads add to the heads count
      if (myCoin.isHeads())
       heads++;
      //else add to the tails count
      else
       tails++;
      
     //if heads equals 1000 then break loop
     if (heads ==10000)
      break;
     //if tails equals 1000 then break loop
     if (tails ==10000)
      break;
     }
      //once the loop has finished print the counts and lables them
      System.out.println ("Heads: "+heads + "\nTails: "+ tails);
      
     }
   }
