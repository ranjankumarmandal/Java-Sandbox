class Student {
    String name;
    String address;
    int classNo;
    int age;
    long phoneNumber;
    int mathsMarks;
    int physicsMarks;
    int chemistryMarks;
}

class Employee {
    String name;
    int salary;
    String address;
}

public class ClassTutorial {
    public static void main(String[] args) {
        Student[] arr = new Student[20];
        Student prathap = new Student();
        Student ankit = new Student();
        ankit.name = "Ankit kumar";
        ankit.address = "D.No: 123, ABC Appt, DEF street, Delhi";
        ankit.classNo = 9;
        ankit.age = 14;
        ankit.phoneNumber = 234567;
        prathap.name = "Prathap Singh";
        prathap.address = "D.No: 1-2-3, ABC Street, DEF colony, Hyderabad";
        prathap.classNo = 10;
        prathap.age = 15;
        prathap.phoneNumber = 12345;
        prathap.mathsMarks = 100;
        prathap.physicsMarks = 99;
        prathap.chemistryMarks = 98;

        System.out.println("Prathap's Maths marks is " + prathap.mathsMarks + "\n Physics marks is " + prathap.physicsMarks);
    }
}