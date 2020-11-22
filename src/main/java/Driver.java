import org.joda.time.LocalDate;

public class Driver {
    public static void main(String[] args){
        System.out.println("hello");
        Student s1 = new Student("Jan Fogerty", 23, new LocalDate(1998, 2, 4), 1234123);
        Student s2 = new Student("Jim Henderson", 21, new LocalDate(2000, 8, 10), 9708493);
        Student s3 = new Student("John Davis", 22, new LocalDate(1999, 3, 10), 1234567);
        Student s4 = new Student("Billy Blue", 18, new LocalDate(2002, 3, 8), 5123512);
        Student s5 = new Student("Jordan Blemmons", 18, new LocalDate(2002, 3, 7), 1823842);
        Student s6 = new Student("Rachel Hayes", 18, new LocalDate(2002, 2, 7), 1928304);

        Module m1 = new Module("Applied Mathematics 1", "MA112");
        Module m2 = new Module("Topology", "MA660");
        Module m3 = new Module("Fluid Dynamics", "SI801");

        Course c1 = new Course("Mathematical Science", new LocalDate(2021, 8, 1), new LocalDate(2024, 6, 29));
        Course c2 = new Course("Engineering", new LocalDate(2021, 8, 4), new LocalDate(2025, 6, 29));

        m1.addStudent(s1);
        m1.addStudent(s2);
        m1.addStudent(s3);
        m1.addStudent(s4);
        m1.addStudent(s5);
        m1.addStudent(s6);

        m2.addStudent(s1);
        m2.addStudent(s2);
        m2.addStudent(s3);

        m3.addStudent(s4);
        m3.addStudent(s5);
        m3.addStudent(s6);

        c1.addModule(m1);
        c1.addModule(m2);

        c2.addModule(m1);
        c2.addModule(m3);

        System.out.println(c2);
        System.out.println(c1);
    }
}





