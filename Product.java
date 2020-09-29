
/**
 * Write a description of class Product here.
 * 
 * @author (Kis Boisen Hansen - FEN) 
 * @version (2010.09.23 - 2019.09.13)
 */
public class Product{
    private int id;
    private String description;
    private double price;
    private int stock;

    public Product(int newId, String newDescription, double newPrice, int newStock){
        id = newId;
        description = newDescription;
        price = newPrice;
        stock = newStock;      
    }

    public String getDescription(){
        return description;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void printInfo(){
        System.out.println("Varenr. " + id + ": " + description
                + ". Kr.: " + price);
    }
    
}
