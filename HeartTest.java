package chapterThree;

import chapterThree.HeartRate;

public class HeartTest {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter you firstname:");
        String firstName = input.nextLine();
        System.out.println("Enter you lastname:");
        String lastName = input.nextLine();
        System.out.println("Enter mouth of birth");
        String monthOfBirth = input.nextLine();
        System.out.println("Enter day of birth");
        int dayOfBirth = input.nextInt();
        System.out.println("Enter year of birth");
        int yearOfBirth = input.nextInt();

        HeartRate person = new HeartRate(null,null,0,0,0);

        System.out.println("Enter the current year");
        int currentYears = input.nextInt();

        System.out.println("Heart rate info");
        System.out.println("First Name: " + firstName + " Last Name: " + lastName);
        System.out.println("Month of Birth: " + monthOfBirth +",   "+ " Day of Birth: " + dayOfBirth +",  "+ "  Year of Birth: " + yearOfBirth);
        System.out.println("Age:" + person.getAge(currentYears)  + "Years");
        System.out.println("Maximum heart range" + person.getHeartRateCalculation(currentYears));
        System.out.println("Target Heart Range" + person.getHearRateInRange(currentYears));

    }
}