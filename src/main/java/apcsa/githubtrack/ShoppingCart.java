package apcsa.githubtrack;

// Implement your ShoppingCart class here
public class ShoppingCart{
    private ShoppingList list;
    private String custName;
    private boolean shopComplete;
    private int totalReturned;

    public ShoppingCart(ShoppingList list, String custName, boolean shopComplete){
        this.list = list;
        this.custName = custName;
        this.shopComplete = shopComplete;
    }
    public ShoppingCart(String custName, boolean shopComplete){
        this.list = new ShoppingList;
        this.custName = custName;
        this.shopComplete = shopComplete;
    }
    public boolean isCompleted(){
        int count = 0; 
        for (int i = 0; i < list.length; i++){
            if (!(list[i].getSold())){
                count++;
            }
        }
        if (count > 0){
            return false;
        }
        return true;
    }
    public void returnCart(){
        if (list.isCompleted()){
            totalReturned++; 

        }
    }

    public static int getTotalReturned(){
        return totalReturned;
    }



}
