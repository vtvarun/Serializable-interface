import java.io.*;
import java.util.*;

class Employee implements Serializable{
    String name;
    int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    Employee(String name, int salary){
        this.salary = salary;
        this.name = name;
    }

}

public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee emp = new Employee("Tanwar",123123);
        Student student1 = new Student("varun",1232,emp);

        // now, i would like to serialize it and serialization means to
        // convert an object into stream of bytes, so that it can be stored in file or database
        File fileName = new File("serialized.txt");
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream dos = new ObjectOutputStream(fos);

        // writing an object to the declared file
        dos.writeObject(student1);

        // static attribute do not get serialized
        emp.name = "Rajput";

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        // deserialization is happening
        Student obj = (Student)ois.readObject();

        System.out.println(obj.toString());

    }
}


class Student implements Serializable{
    String studentName;

    transient int studentRollNo;

    static Employee emp1;

    public Student(String studentName, Integer studentRollNo, Employee e){
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.emp1 = e;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentRollNo=" + studentRollNo +
                ", emp1=" + emp1.toString() +
                '}';
    }
}


