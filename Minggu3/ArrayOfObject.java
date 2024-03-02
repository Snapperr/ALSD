package Minggu3;

import java.util.Scanner;

public class ArrayOfObject {
    public static void main(String[] args) {
        Rectangle[] rectangleArray = new Rectangle[3];
        Scanner sc =  new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle "+ i);

            System.out.print("Input length : ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width : ");
            rectangleArray[i].width = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Rectangle " + i);
            System.out.println("Width : " + rectangleArray[0].width + ", Length: " + rectangleArray[0].length);
        }   
    }
}