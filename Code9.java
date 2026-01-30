class Car{
    String color;
    void Car()  //default constructor
    {
        this.color=color;
         System.out.println(""+color);
    }
    void run()
    {
        System.out.println("speed");
    }
}
class Code9
{
    public static void main(String[]args)
    {
        Car RR = new Car();
        RR.color="white and black";
        RR.run();
        RR.Car();

    
    }
}