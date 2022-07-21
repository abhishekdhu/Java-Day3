import java.util.function.Predicate;

public class Que11 {
    public static void main(String args[]){
        Predicate<Integer> even = i -> (i % 2 ==0);
        System.out.println(even.test(10));
        System.out.println(even.test(9));
    }
}
