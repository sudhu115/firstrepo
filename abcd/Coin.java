public class Coin implements Lockable 
{
  private int key; // password to make it lockable
  private boolean locked; // if true, object is locked
  private final int HEADS = 0;
  private final int TAILS = 1;
  private int face;
 
  public boolean locked() 
  {
    return this.locked;
  }
 
  public void setKey(int password) 
  {
    this.key = password;
    this.locked = true;
 
  }
 
  public boolean lock(int password) 
  {
    if (password == this.key) 
    {
      this.locked = true;
      return true;
    } 
    else 
    {
      return false;
    }
  }
 
  public boolean unlock(int password) 
  {
    if (password == this.key) 
    {
      this.locked = false;
      return true;
    } 
    else 
    {
      return false;
    }
  }
 
  public Coin()
  {
    locked = true;
  }
 
  public boolean flip() 
  {
    if (this.locked == false) 
    {
      face = (int) (Math.random() * 2);
      return true;
    }
    return false;
  }
 
 
  public boolean isHeads() 
  {
    return (face == HEADS);
  }
 
  public String toString() 
  {
    if (this.locked == false) 
    {
 
      String faceName;
 
      if (face == HEADS)
        faceName = "Heads";
      else
        faceName = "Tails";
 
      return faceName;
    } 
    else
      return "";
  }
}