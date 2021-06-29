// Do this with 5 objects

package NultipleThreadExample;

import java.io.*;

public class SerialDeserial {

    public static void main(String[] args) throws IOException {
        Student student = new Student("Sherman", 30, 100);

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("C:\\New folder\\student.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            System.out.println("Serialzation Done!!");
        } catch (IOException ioe) {
            System.out.println(ioe);
        } finally {
            oos.close();
            fos.close();
        }

        Student newStudent = null;
        try {
            FileInputStream fis = new FileInputStream("C:\\New folder\\student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            newStudent = (Student) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Student calss is not found.");
            cnfe.printStackTrace();
            return;
        }

        System.out.println("Student Name: " + newStudent.getName());
        System.out.println("Student age: " + newStudent.getAge());
        System.out.println("Student scroe: " + newStudent.getScore());
    }

}


class Student implements Serializable {

    private String name;
    private int age;
    private int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
