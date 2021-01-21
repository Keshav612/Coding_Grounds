public class Polymorphism {
    public static void main(String args[])
    {
        animal ob1=new animal();
        animal ob2=new Pig();
        animal ob3=new Dog();
        ob1.sound();
        ob2.sound();
        ob3.sound();
    }
}
class animal 
{
    public void sound()
    {
        System.out.println("Animals make sound");
    }
}
class Pig extends animal 
{
    public void sound()
    {
        System.out.println("Pig make sound");
    }
}
class Dog extends animal 
{
    public void sound()
    {
        System.out.println("Dog make sound");
    }
}


