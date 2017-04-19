package javafunctional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class SortExam {
    public static void main(String[] args){
        List<String > number = Arrays.asList(
                "110000", "100", "150", "200", "250", "300", "500", "1000", "5000", "10000");

//        Comparator c = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.parseInt(o2) - Integer.parseInt(o1);
//            }
//        };

        Collections.sort(number,
                (o1, o2) ->
                        Integer.parseInt(o1) - Integer.parseInt(o2));
        System.out.println(number);
    }
}
