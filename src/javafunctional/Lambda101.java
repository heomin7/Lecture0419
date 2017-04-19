package javafunctional;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class Lambda101 {
    public static void main(String[] args){
//        (int a, int b) -> {
//            return a > b ? a : b;
//        }
//        //lambda
//        (a, b) -> a > b ? a : b;
//
//        a -> a % 2 == 0;
//
//        //howManyChar
//        s -> s.length();

        int i = Interface101.howManyChar("hello world");
        System.out.println(i);

    }

    int max(int a, int b){
        return a > b ? a : b;
    }

    int howManyChar(String s){
        return s.length();
    }
}
