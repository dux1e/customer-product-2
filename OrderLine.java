
/**
 * @author (FEN) 
 * @version (13.09.2019)
 */
public class OrderLine{
    private int amount;
    private Product product;// is connected to one product

    public OrderLine(int newAmount, Product newProduct){
       amount = newAmount;
       product = newProduct;
    }
    
    public double getPrice(){
        double price = amount * product.getPrice();
        return price;
    }
    
    public Product getProduct(){
        return product;
    }
    
    public void printInfo(){
        //print product info:
        product.printInfo();
        System.out.println("Antal: " + amount);
        System.out.println("Subtotal: " + getPrice());
        System.out.println("");
    }

}
