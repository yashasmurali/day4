class Student{
    int id;
    String  name;
    int age;
    Student(int i , String name,int age)
    {
        id=i;
        this.name=name;
        this.age=age;
    
    }
    Student(int i , int age)
    {
        id=i;
        this.age=age;
    }
  void display()
  {
    System.out.println("id = " + id + ", name = "+name + " , age = "+age);
  }
}
class code11
{
    public static void main(String[]args)
    {
        Student S1 = new Student(1,20);
        Student S2 = new Student(2,"Bob",20);
        S1.display();
        S2.display();
        
    }
}
