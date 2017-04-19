package javafunctional;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public interface Interface101 {
    //모든 변수는 public static final 이다.
    int A_NUMBER = 5;

    //모든 메소드는 public abstract 이다.
    int max(int a, int b);

    //자바8에서 새로운 메소드인 default 메소드 등장(구현 함수로 제공)
    default boolean isEven(int a){
        return a % 2 == 0;
    }

    //자바 8에서는 static 메소드도 지원한다.
    public static int howManyChar(String s){
        return s.length();
    }

    //추상 메소드를 인터페이스에 추가하면 implement하고 있는 클래스 에러 발생
    //int min(int a);

    //인터페이스에 메소드 추가 시 추상 메서드가 아닌 default 메소드로 하면 해당 클래스에 에러 발생 안함
    default int min(int a){
        return a;
    }


}
