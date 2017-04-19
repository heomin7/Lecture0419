package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class DataFormat {
    public static void main(String[] args){
        System.out.println(DateTimeFormatter.ofPattern("yyyy.MM.dd").
                format(LocalDate.of(2017, 2, 1)));

        LocalDate today = LocalDate.of(2017, 3, 11);

        System.out.println(today.getDayOfWeek());

    }
}
