package chapterThree;

import chapterThree.PetrolPurchase;

public class PetrolPurchaseTest{

    public static void  main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        PetrolPurchase purchase = new PetrolPurchase("33bb22", "petrol", "lagos", 1.5000, 5,5.5);
        purchase.displayPurchaseDetails();

    }
}

//     System.out.println("Enter account ID:");
//int accountID = input.nextInt();
//        System.out.println("Enter petrol Type:");
//double petrolType = input.nextDouble();
//        System.out.println("Enter petrol amount:");
//double amount = input.nextDouble();
//
//
//       PetrolPurchase purchase = new PetrolPurchase("33bb22", "petrol", "lagos", 1.5000, 5,5.5);