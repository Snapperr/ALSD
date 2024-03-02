package Minggu3.AssignmentData;

public class data {
    public String name;
    public String nim;
    public String gender;
    public double gpa;

    public data(String nam, String num, String gen, double gp) {
        name = nam;
        nim = num;
        gender = gen;
        gpa = gp;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("Gender: " + gender);
        System.out.println("GPA: " + gpa);
    }

    public double getGpa() {
        return gpa;
    }
}