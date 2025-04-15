public class schmng {
    public static void main(String[]args) {
        Student student = new Student("John Wesley Bagacina", 420, "College");
        Teacher teacher = new Teacher("Jack Hoe Lee", 421, "Science");
        Staff staff = new Staff("Cole", 419, "Admin");
 
        System.out.println("Student Information: ");
        student.displayInfo();
 
        System.out.println("\nTeacher Information: ");
        teacher.displayInfo();
 
        System.out.println("\nStaff Information: ");
        staff.displayInfo();
    }
}