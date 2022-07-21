import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Que12 {
    public static void main(String args[]){
        Predicate<List<Integer>> nonNullPredicate = Objects::nonNull;
        List<Integer> ch= new ArrayList<>();
        ch.add(1);
        System.out.println(nonNullPredicate.test(ch));
    }
}
