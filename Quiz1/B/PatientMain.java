package Quiz1.B;

import java.util.Arrays;

public class PatientMain {
    public static void main(String[] args) {
        int n = 3; 
        main[] patients = new main[n];

        patients[0] = new main("Patient1", 25, new int[]{30, 40, 50}, 100);
        patients[1] = new main("Patient2", 55, new int[]{20, 30, 40}, 150);
        patients[2] = new main("Patient3", 20, new int[]{25, 35, 45}, 120);
       
        double sumTotalFee = 0;
        int count = 0;
        for (main patient : patients) {
            if (patient.age() > 50) {
                sumTotalFee += patient.totalFee();
                count++;
            }
        }
        double averageTotalFee = (count == 0) ? 0 : sumTotalFee / count;

        System.out.println("Average Total Fee of Patients > 50: " + averageTotalFee);

        double smallestAvgMedPrice = Double.MAX_VALUE;
        main SmallestMedPrice = null;

        for (main patient : patients) {
            if (patient.age() >= 15 && patient.age() <= 30) {
                double averageMedicationPrice = patient.averageMedicationPrice();
                if (averageMedicationPrice < smallestAvgMedPrice) {
                    smallestAvgMedPrice = averageMedicationPrice;
                    SmallestMedPrice = patient;
                }
            }
        }

        System.out.println("Smallest Average Medication Price (15-30 years old): " + smallestAvgMedPrice);

        if (SmallestMedPrice != null) {
            System.out.println("Data of Patient with Smallest Medication Price:");
            SmallestMedPrice.printData();
        }
    }
}
