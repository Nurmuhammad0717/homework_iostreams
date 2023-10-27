package task1.model.service;

import task1.model.Employee;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SalaryCalculator {
    private String start;
    private String end;
    private Employee employee;
    List<String> weekDays = new ArrayList<String>(List.of("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"));

    public SalaryCalculator(Employee employee) {
        this.employee = employee;
    }


    Scanner scanner = new Scanner(System.in);

    public double calculateTime() throws ParseException {
        DateFormat sdf = new SimpleDateFormat("hh:mm");

        double sum = 0;
        for (String weekDay : weekDays) {
            System.out.print(weekDay + " start time :");
            start = scanner.nextLine();
            Date d1 = sdf.parse(start);
            System.out.print(weekDay + " end time :");
            end = scanner.nextLine();
            Date d2 = sdf.parse(end);
            long diff = d2.getTime() - d1.getTime();
            diff = diff / 60_000;
            sum += diff;
        }

        System.out.println(sum/60+" hours");
        return sum / 60;
    }
        double workedHr;

    {
        try {
            workedHr = calculateTime();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public double salaryCal() throws ParseException {
        System.out.print("Enter the threshold :");
        int threshold = scanner.nextInt();
        if (workedHr < threshold) {
            System.out.println("You haven't reached overtime");
            double salaryPerHr = employee.getSalaryPerHr();
            return salaryPerHr * workedHr;
        }
        double overTime = workedHr - threshold;
        double salary = threshold * employee.getSalaryPerHr() + (overTime * (employee.getSalaryPerHr() + employee.getSalaryPerHr() / 2));
        return salary;
    }

}
