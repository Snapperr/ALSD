package Minggu3.AssignmentData;

import java.util.Scanner;

public class information {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        data[] students = new data[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter information for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            students[i] = new data(name, nim, gender, gpa);
        }
        data gpa_tertingi = students[0];
        for (int i = 1; i < 3; i++) {
            if (students[i].getGpa() > gpa_tertingi.getGpa()) {
                gpa_tertingi = students[i];
            }
        }
        System.out.println("Informasi Mahasiswa");
        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i + 1) + ":");
            students[i].displayInfo();
        }

        System.out.println("\nStudent with highest GPA:");
        gpa_tertingi.displayInfo(); 
    }
}