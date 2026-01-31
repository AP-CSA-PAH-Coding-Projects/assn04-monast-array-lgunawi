package apcsa.githubtrack;

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
            if (price == other.getPrice()){
                return 0;
            } else if (price < other.getPrice()){
                int num = other.getPrice() - price;
                return num;
            } else if (price > other.getPrice()){
                int num = other.getPrice() - price;
                return num;
            }
        }
        else 
            System.out.println("Error: Different items!");
        return 0;
    }

    public String getName(){
        return name;

    }
    public int getPrice(){
      //  double dollars = ((double) price) / 100;
        return price;
    }
    public boolean isSold(){
        return sold;

    }







}
