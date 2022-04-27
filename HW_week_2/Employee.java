package HW_week_2;

import java.util.Date;

public class Employee extends Person{
    String office;
    String salary;
    Date date;
    public Employee(String name, String adress, String phoneNumber, String email, String office, String salary, Date date){
        super(name, adress, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.date = date;

    }
    public Employee(String name, String adress, String phoneNumber, String email){
        super(name, adress, phoneNumber, email);
    }
    @Override
    public String toString(){
        return "Employee " + this.name;
    }
/*
    public String toDate(){
        return "Employee " + date;
    }
*/

}
