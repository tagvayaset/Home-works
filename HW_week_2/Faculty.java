package HW_week_2;

public class Faculty extends Employee{
    String officeHours;
    String rank;

    public Faculty(String name, String adress, String phoneNumber, String email, String officeHours, String rank){
        super(name, adress, phoneNumber, email);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String toString(){
        return "Faculty " + this.name;
    }
}
