package salary.service;

import salary.module.Salary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class SalaryService {
    public static List<Salary> getSalaryOrderInsc(List<Salary> salaries){

        List<Salary> inscSalary = new ArrayList<>();
        inscSalary.addAll(salaries);
        Collections.sort(inscSalary, (o1, o2) -> (int)(o1.getSalary() - o2.getSalary()));

        return inscSalary;
    }
}
