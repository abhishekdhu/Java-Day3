import java.util.ArrayList;
import java.util.List;

public class Que9 {
    public static void main(String args[]){
        int marks[]= new int[5];
        marks[0]=10;
        marks[1]=9;
        marks[2]=10;
        List<Integer> list= new ArrayList<>(marks.length);
        for(int i : marks){
            list.add(i);
        }
        System.out.println(list);
    }
}
