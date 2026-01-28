package apcsa.githubtrack;

// Implement your ShoppingItem class here
public class ShoppingItem{
    private String name;
    private int price;
    private boolean sold;

    public ShoppingItem(String name, int price, boolean sold){
        this.name = name;
        this.price = price;
        this.sold = sold;
    }

    public void buy(){
        sold = true;
    }

    public boolean equals(ShoppingItem other){
        if (name.equals(other.getName()) && price == other.getPrice()){
            return true;
        }
    }

    public int compareTo(ShoppingItem other){
        if (!(name.equals(other.getName()))){
            System.out.println("Error: Different items!");
            return null;
        }
        else if ((name.equals(other.getName()))){
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
    }

    public String getName(){
        return name;

    }
    public int getPrice(){
        double dollars = ((double) price) / 100;
        return dollars;
    }
    public boolean getSold(){
        return sold;

    }







}
