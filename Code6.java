public class Code6 {

    public static int add(int a,int b){
     int x = a+b;
     return x;
    }
    public static int add(int a,int b,int c){
      int y =a+b+c;
      return y;
    }
public static void main(String[] args) {
    int ans = add(20,30);
    int res = add(90,7,10);
    System.out.println("" +res);
    System.out.println("" +ans);
}
}
