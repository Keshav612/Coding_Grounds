public class InnerClass {
    public static void main(String args[])
    {
        OuterClass ob1=new OuterClass();
        OuterClass.InnerClass2 ob2=ob1.new InnerClass2();
        System.out.println(ob1.x+ob2.y);
    }
}
class OuterClass
{
    int x=5;
    class InnerClass2
    {
        int y=50;
    }
}