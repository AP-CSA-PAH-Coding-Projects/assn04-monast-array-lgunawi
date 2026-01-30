
// Implement your ShoppingItem class here
public class ShoppingItem{
    private String name;
    private int price;
    private boolean sold = false;

    public ShoppingItem(String name, int price){
        this.name = name;
        this.price = price;

    }

    public void buy(){
        this.sold = true;
    }

    public boolean equals(ShoppingItem other){
        if (name.equals(other.getName()) && price == other.getPrice()){
            return true;
        }
        return false;
    }

    public int compareTo(ShoppingItem other){
        
        
        if ((name.equals(other.getName()))){
            return price -  (int) other.getPrice();
            
        }
        else 
           { System.out.println("Error: Different items!");
        return 0; }
    }

    public String getName(){
        return name;

    }
    public double getPrice(){
      double dollars = ((double) price) / 100;
        return dollars;
    }
    public boolean isSold(){
        return sold;

    }







}
