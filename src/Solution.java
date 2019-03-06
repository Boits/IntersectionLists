import java.util.*;

public class Solution {
    public static void main(String[] args) {
//        intersectionLists();
        intersectionSets();
    }

    private static void intersectionSets() {
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C", "L", "C"));
        Set<String> set2 = new HashSet<>(Arrays.asList("D", "A", "C", "E", "K", "B"));

        Set<String> set3 = new HashSet<>();
        for (String s : set2) {
            if (set1.contains(s)) {
                set3.add(s);
            }
        }

        for (String s : set3) {
            System.out.print(s + " ");
        }
    }

    private static void intersectionLists() {
        List<String> list1 = Arrays.asList("A", "B", "C", "L");
        List<String> list2 = Arrays.asList("D", "A", "C", "E", "K", "B");

        List<String> list3 = new ArrayList<>();

        for (int i = 0; i < list2.size(); i++) {
            if (list1.contains(list2.get(i))) {
                list3.add(list2.get(i));
            }
        }

        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + " ");
        }
    }
    
}
