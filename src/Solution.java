import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C", "L"));
        List<String> list2 = new ArrayList<>(Arrays.asList("D", "A", "C", "E", "K", "B"));

        List<String> list3 = new ArrayList<>();

        for (int i = 0; i < list2.size(); i++) {
            if(list1.contains(list2.get(i))){
                list3.add(list2.get(i));
            }
        }

        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + " ");
        }
    }
}
