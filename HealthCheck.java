package sd;

import java.util.Scanner;

public class HealthCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce your age ");
        int age = scanner.nextInt();
        System.out.println("Please introduce your weight in kg ");
        double weight = scanner.nextDouble();
        System.out.println("Please introduce your height in cm");
        double height = scanner.nextDouble();
        bmiTable(bodyMassIndex(weight, height, age));
        dailyProteinIntake(weight);
    }

    static double bodyMassIndex(double weight, double height, int age) {
        double heightInMeters = height / 100.00;
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.println("Your Body Mass index is " + bmi + "gramms");

        return bmi;
    }

    static void bmiTable(double bmi) {
        if (bmi <= 16.00) {
            System.out.println("Severe Thinness");
        } else if (bmi <= 17.00) {
            System.out.println("Moderate Thinnese");
        } else if (bmi <= 18.5) {
            System.out.println("Mild Thinnese");
        } else if (bmi <= 25.0) {
            System.out.println("Normal");
        } else if (bmi <= 30.00) {
            System.out.println("Overweight");
        } else if (bmi <= 35.0) {
            System.out.println("Obese Class I");
        } else if (bmi <= 40.0) {
            System.out.println("Obese Class II");
        } else {
            System.out.println("Obese Class III");
        }

    }

    static void dailyProteinIntake(double weight) {
        double dailyIntake = weight * 2.0;
        System.out.println("Your daily protein intake should be about" + dailyIntake + "grams");
        int eggsAmount = (int) (dailyIntake / 6);
        System.out.println("Which is equvalent of " + eggsAmount + " big eggs");
        int chickenBreast = (int) (dailyIntake / 90);
        System.out.println("Or " + chickenBreast + " Chicken Breast(s)");

    }


}
