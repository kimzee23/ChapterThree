package chapterThree;

public class PetrolPurchase {
    private String customerID;
    private String petrolType;
    private double amount;
    private String location;
    private int quantity;
    private double discount;
    private double pricePerLiter;
public PetrolPurchase(String customerID, String petrolType, String location, double amount, int quantity, double discount) {
    this.customerID = customerID;
    this.petrolType = petrolType;
    this.location = location;
    this.amount = amount;
    this.quantity = quantity;
    this.discount = discount;
}
public int getPurchaseAmount() {
    double totalCost = amount * pricePerLiter - discount;
    return (int) totalCost;
}
public void displayPurchaseDetails() {
    System.out.println("Customer ID: " + customerID);
    System.out.println("Petrol Type: " + petrolType);
    System.out.println("Location: " + location);
    System.out.println("Amount: " + amount);
    System.out.println("Quantity: " + quantity);
    System.out.println("Discount: " + discount);
}

}