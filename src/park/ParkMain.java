package park;

import park.module.Park;
import park.service.ParkService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class ParkMain {
    public static void main(String[] args){

        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\Parks.csv"));

            String line = "";
            List<Park> parks = new ArrayList<>();

            br.readLine();
            while((line = br.readLine()) != null){
                String[] splitted = line.split(",");
                parks.add(new Park(splitted[0], splitted[1],
                        splitted[2], splitted[3], splitted[4], splitted[5]));

            }


            List<Park> orderedInscCities = ParkService.getCitiesOrderedINSC(parks);
            List<Park> orderedDescCities = ParkService.getCitiesOrderedDesc(parks);

            System.out.println("INSC: ");
            for(Park e: orderedInscCities){
                System.out.println(e.getCity());
            }

            System.out.println("DESC: ");
            for(Park e: orderedDescCities){
                System.out.println(e.getCity());
            }

//            Predicate<Park> p = new Predicate<Park>() {
//                @Override
//                public boolean test(Park park) {
//                    if(park.getParkAlias().equals("") || park.getParkAlias() == null) return true;
//                    else return false;
//                }
//            };

            System.out.println("before removeif: ");
            parks.forEach(p -> System.out.println(p.getParkAlias()));

            parks.forEach(System.out::println);
            parks.forEach(p -> System.out.println(p));

            //Name count order
            Collections.sort(parks, (o1, o2) -> (o1.getParkName().length() - o2.getParkName().length()));
            parks.forEach(p -> System.out.println(p));

            //remove not US
            parks.removeIf(park -> (!park.getCountry().equals("US")));
            parks.forEach(p -> System.out.println(p));

            parks.removeIf(park -> (park.getParkAlias().equals("") || park.getParkAlias() == null));

            System.out.println("after removeif: ");
            parks.forEach(p -> System.out.println(p.getParkAlias()));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
