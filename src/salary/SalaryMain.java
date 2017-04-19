package salary;

import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import salary.module.Salary;
import salary.service.SalaryService;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class SalaryMain {
    public static void main(String[] args){

        try {
            CSVReader reader = new CSVReader(new FileReader("src\\salaries.csv"));
            CSVParser parser = new CSVParser();
            String[] parts = null;
            List<Salary> salaries = new ArrayList<>();
            reader.readNext();
            while((parts = reader.readNext()) != null){
                salaries.add(new Salary(parts[0], parts[1],
                        parts[2], parts[3], Integer.parseInt(parts[4])));
            }

            List<Salary> inscSalary = SalaryService.getSalaryOrderInsc(salaries);

            for(Salary e: inscSalary){
                System.out.println(e);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
