package park.service;

import park.module.Park;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class ParkService {

    public static List<Park> getCitiesOrderedINSC(List<Park> parks){

        List<Park> inscParks = new ArrayList<>();
        inscParks.addAll(parks);
        Collections.sort(inscParks, (o1, o2) -> o1.getCity().compareTo(o2.getCity()));

        return inscParks;
    }

    public static List<Park> getCitiesOrderedDesc(List<Park> parks){

        List<Park> descParks = new ArrayList<>();
        descParks.addAll(parks);

        Collections.sort(descParks, (o1, o2) -> o2.getCity().compareTo(o1.getCity()));

        return descParks;
    }


}
