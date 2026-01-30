class Student{
    int id;
    String  name;
    Student(int i , String name)
    {
        id=i;
        this.name=name;
    
    }
  void display()
  {
    System.out.println("id = " + id + ", name = "+name);
  }
}
class Code10
{
    public static void main(String[]args)
    {
        Student S1 = new Student(1,"Alice");
        Student S2 = new Student(2,"Bob");
        S1.display();
        S2.display();
        }
   }