import org.joda.time.LocalDate;

public class Driver {
    public static void main(String[] args){
        System.out.println("hello");
        Student student = new Student("jan", 23, new LocalDate(1998, 2, 4), 1234512);
        System.out.println(student);
    }
}
