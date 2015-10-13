public interface Lockable
{
  boolean locked();
  void setKey(int password);
  boolean lock(int password);
  boolean unlock(int password);
 
  }