/**
 * @author Christian
 */
public class Television {
    private String brand;
    private double price;
    /**
     * @param brand this is the brand of the Television
     * @param price this is the price of the Television
     */
    
    //Default constructor
    public Television() {}
    
    // Parameterized constructor
    public Television(String brand, double price) {
    this.brand = brand;
        this.price = price;
    }
    
    // Getter mehtod
    public String getBrand() {
        // Return value
        return brand;
    }
    // Gettter method
    public double getPrice() {
        // Return value
        return price;
    }
    // Setter method
    public void setBrand(String brand) {
        this.brand = brand;
    }
    // Setter method
    public void setPrice(double price) {
        this.price = price;
    }
    // toString method
    public String toString() {
        return "The Brand Name is " + getBrand() + " and the price is " + getPrice() + "$";
    }
    // equals method
    public boolean equals(Television television2) {
        // If it is equal return true, else false    
        if(getBrand().equals(television2.getBrand()) && getPrice() == television2.getPrice()) {
            return true;
        } else{
            return false;
        }
     
     }
}