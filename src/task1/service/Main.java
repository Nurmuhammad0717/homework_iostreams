package task1.service;

import task1.service.model.Employee;
import task1.service.SalaryCalculator;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name :");
        String name = scanner.nextLine();

        System.out.print("Enter last name :");
        String lastName = scanner.nextLine();

        System.out.println("Enter salary per hour");
        double salaryPerHr = scanner.nextDouble();

        int size = 0;

        Employee worker1 = new Employee(name,lastName,salaryPerHr,size++);

        SalaryCalculator employee = new SalaryCalculator(worker1);

        System.out.println("$"+employee.salaryCal()+" for this week");



    }
}