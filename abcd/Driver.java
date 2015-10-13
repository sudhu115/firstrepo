import java.util.Scanner;
public class Driver
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    Coin myCoin = new Coin();
    boolean bSuccess, bResult;
   
    myCoin.setKey(7890);
    bSuccess = myCoin.flip(); // Should Fail, coin is locked
    System.out.println("Please enter the value");
    int keyGuess = scan.nextInt();
    bResult = myCoin.unlock(keyGuess);
    if (bResult) // coin is unlocked
    {
      myCoin.flip();
      boolean iValue = myCoin.isHeads();
      System.out.println("Unlocked");
    }
   
    else
    {
      System.out.println("You better remember the LOCK value");
    }
 
  }
 
}
