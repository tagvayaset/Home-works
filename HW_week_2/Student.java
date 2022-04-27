package HW_week_2;

public class Student extends Person {
    final String status;

    public Student(String name, String adress, String phoneNumber, String email, String status) {
        super(name, adress, phoneNumber, email);
        this.status = status;

    }
    @Override
    public String toString(){
        return "Student " + this.name;
    }


}
