import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Que14 {
    public static List<String> contains (List<String> a , Predicate<String> p){
        List<String> result = new ArrayList();
        for (String user: a)
            if (p.test(user))
                result.add(user);
        return result;
    }
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("Jhalak");
        list.add("And");
//        System.out.println(list);
//        System.out.println(list.get(1).charAt(0));
        List check = contains(list , (String i) -> i.charAt(0)=='A');
        System.out.println(check);
    }
}
