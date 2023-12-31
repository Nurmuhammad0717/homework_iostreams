package model;

public class Employee {
   private String name;
   private String lastName;
   private double salaryPerHr;
   private int id;

   public Employee(String name, String lastName, double salaryPerHr, int id) {
      this.name = name;
      this.lastName = lastName;
      this.salaryPerHr = salaryPerHr;
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public double getSalaryPerHr() {
      return salaryPerHr;
   }

   public void setSalaryPerHr(double salaryPerHr) {
      this.salaryPerHr = salaryPerHr;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }
}
