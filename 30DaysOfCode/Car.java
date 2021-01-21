public class Car extends Vehicle 
{
    String model="Q7";
    public static void main(String args[])
    {
    
    Car obj= new Car();
    obj.horn();
    System.out.println(obj.model);
    }
}
class Vehicle 
{
    public void horn()
    {
        System.out.println("Horn horn");
    }
}