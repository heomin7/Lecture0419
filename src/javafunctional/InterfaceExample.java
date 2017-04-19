package javafunctional;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class InterfaceExample {
    public static void main(String[] args){
        List<String> list = Arrays.asList(
                "kim", "leee", "parkkk", "choiiiii", "ryu", "jin");

 //       Collections.sort(list);
 //       Comparator c = new MyComparator();
        Comparator c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Collections.sort(list, c);
        System.out.println(list);
    }
}
