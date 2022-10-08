import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;
    public static int currentYear = 2021; //LocalDate kullanarak yıl değerine otomatiik olarak güncelleme yapabiliriz.


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){

        double taxAmountOfEmployee = 0;
        double taxRate = 0.03;

        if(salary >= 1000){
                taxAmountOfEmployee = (salary * taxRate);
        }else taxAmountOfEmployee = 0;

        return taxAmountOfEmployee;
    }

    public int bonus(){

        final int workingHours = 40;
        final int bonusPerHour = 30;
        int bonusAmount = 0;

        if(workingHours<workHours){
            bonusAmount = (workHours - workingHours) * bonusPerHour;
        }

        return bonusAmount;

    }

    public double raiseSalary(){
       int employeeWorkYear =  currentYear - hireYear;
       double raiseSalary = 0;

       if (employeeWorkYear < 10){
           raiseSalary = (salary - tax()) * 0.05 ;
       }else if(employeeWorkYear < 20){
           raiseSalary = (salary - tax()) * 0.1 ;
       }else{
           raiseSalary = (salary - tax()) * 0.15 ;
       }

       return raiseSalary;

    }

    @Override
    public String toString(){
        return  "Name " + name + "\n" +
                "Hire Year: " + hireYear + "\n" +
                "Salary: " + salary + "\n" +
                "Hours of Work: " + workHours + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Tax: " + tax()+ "\n" +
                "Raise of Salary:"  + raiseSalary() + "\n" +
                "Total Salary: " + (salary + raiseSalary() + bonus()) + "\n" +
                "---------------------------------------";
    }
}
