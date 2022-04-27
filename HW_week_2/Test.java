package HW_week_2;

import java.util.Date;

public class Test {
    public static void main(String[] args){
        Person person = new Person("Stas Asket", "Ukrain","9 900 90 9000", "stasasket@gmail.com");
        Student student = new Student("Aset Tagvay", "Kazakhstan", "87053402103", "aset@gmail.com","freshman");
        Employee employee = new Employee("Timur Yeslamgaliev", "AbylaiKhan 1", "8 777 777 7777", "timur@gmail.com", "SDU","10000$",new Date());
        Faculty faculty = new Faculty("Engineering and Natural sciences ", "SDU", "875487887", "ens@sdu.edu.kz", "Friday", "Dean");
        Staff staff = new Staff("Azamat Zhamanov","SDU", "787876548","ens@sdu.edu.kz","dean");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
}
