class OverloadAddMethod {
     void add(int a,int b)
     {
            System.out.println("This is two parameter Add method calling");
     }
    void add(int a,int b, int c)
    {
        System.out.println("This is Three parameter add method calling");
    }
}
public class OverlodingProg
{
  public static void main(String args[])
  {
    OverloadAddMethod w=new OverloadAddMethod();
      w.add(10,30);
      w.add(30,30,20);
  }
}
