class A {

    private int a;

    public int divide (int a){
        return a/2;
    }

    public A multiply(int a){
        this.a=a*3;
        return this;
    }

    void display()
    {
        System.out.println("Display=" + a );
    }
}
public class Que17 {
    public static void main(String args[]){
        int a=8;
        new A().multiply(new A().divide(a)).display();
    }

}
