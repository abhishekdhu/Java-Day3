import java.util.function.Predicate;

public class Que13 {
    public static void main(String args[]){
    Predicate<Integer> g = i -> (i>10);
    Predicate<Integer> l = i -> (i<20);
        System.out.println(g.and(l).test(15));
        System.out.println(g.and(l).test(9));
}
}
