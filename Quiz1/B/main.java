package Quiz1.B;

import java.util.Arrays;

public class main {
    private String name;
    private int age;
    private int[] medicationPrice = new int[3];
    private int doctorFee;

    public main(String name, int age, int[] medicationPrice, int doctorFee) {
        name = name;
        age = age;
        medicationPrice = medicationPrice;
        doctorFee = doctorFee;
    }

    public int age() {
        return age;
    }

    public double averageMedicationPrice() {
        int sum = 0;
        for (int price : medicationPrice) {
            sum += price;
        }
        return (double) sum / medicationPrice.length;
    }

    public double totalFee() {
        return averageMedicationPrice() + doctorFee;
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Medication Prices: " + Arrays.toString(medicationPrice));
        System.out.println("Doctor Fee: " + doctorFee);
        System.out.println("Average Medication Price: " + averageMedicationPrice());
        System.out.println("Total Fee: " + totalFee());
    }
}
