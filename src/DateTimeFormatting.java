import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class DateTimeFormatting {
    public static void main(String[] args){

        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        System.out.println(today + " " + now);
        //2017.04.19
        String formettedToday = DateTimeFormatter.ofPattern("yyyy.MM.dd.").format(today);
        System.out.println(formettedToday + " " + now);

        //2017.04.19 23:43
        LocalDateTime todaytime = LocalDateTime.now();
        String formattedDayTime = DateTimeFormatter.ofPattern("yyyy.MM.dd. HH:mm").format(todaytime);
        System.out.println(formattedDayTime);

        //하루 이내는 ~시간전, 하루 이상 지나면 년.월.일로 표기
        LocalDateTime posted = LocalDateTime.of(
                2017, 4, 17, 18, 30);
        LocalDateTime current = LocalDateTime.now();

        Duration timeInterval = Duration.between(posted, current);

        //60*60*24=86400
        if(timeInterval.getSeconds() >= 86400){
            System.out.println(DateTimeFormatter.ofPattern("yyyy.MM.dd. HH.mm").format(posted));
        }
        else{
            System.out.println(timeInterval.toHours());
        }


    }
}
