class A
{
    int i = 30;
}
 
class B extends A
{
    int i = 50;

 

   public static void main(String[] args)
    {
        A a = new B();
 
        System.out.println(a.i);
    }
}