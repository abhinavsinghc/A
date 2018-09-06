class A
{
    int i = 100;
}
 
class B extends A
{
    int i = 100;

 

   public static void main(String[] args)
    {
        A a = new B();
 
        System.out.println(a.i);
    }
}