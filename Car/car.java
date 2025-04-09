package chapterThree;

public class car{
    private String model;
    private String year;
    private double price;

    public car(String Model, String Year, double price){
        this.model = Model;
        this.year = Year;
        setPrice(price);
    }

    public String  getModel() {
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getYear(){
        return year;
    }
    public void setYear(String year){
        this.year = year;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if(price > 0){
            this.price = 0;
        }

    }

    public void applyDiscount(double percentage){
        if(percentage > 0){
            this.price -= this.price * (percentage / 100 );
        }
    }
}