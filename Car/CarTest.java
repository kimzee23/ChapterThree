package chapterThree;
import chapterThree.car;

public class CarTest{
    public static void main(String[] args) {
        car carOne = new car ("Porsche", "2026", 2000  );
        car carTwo = new car ("Audi", "2026",  6000  );

        System.out.println("The orginal prices ");
        System.out.println(carOne.getModel() + "(  $" + carOne.getPrice() + ")" + carOne.getYear() );
        System.out.println(carTwo.getModel() + "( $" + carTwo.getPrice()  + ")" + carTwo.getYear());

        carOne.applyDiscount(0.5);
        carTwo.applyDiscount(0.2);

        System.out.println("Car price after discount");
        System.out.println(carOne.getPrice());
        System.out.println(carTwo.getPrice());

        System.out.println("Set ");
    }
}

