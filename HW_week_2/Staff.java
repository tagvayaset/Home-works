package HW_week_2;

public class Staff extends Employee{
    String title;

    public Staff(String name, String adress, String phoneNumber, String email, String title){
        super(name, adress, phoneNumber, email);
        this.title = title;
    }
    @Override
    public String toString(){
        return "Staff " + this.name;
    }
}
