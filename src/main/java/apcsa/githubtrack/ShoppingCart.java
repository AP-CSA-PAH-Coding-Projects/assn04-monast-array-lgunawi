package apcsa.githubtrack;

// Implement your ShoppingCart class here
public class ShoppingCart{
    private ShoppingList list;
    private String custName;
    private boolean shopComplete = false;
    private static int totalReturned = 0;
    private int cartReturned = 0; 

    public ShoppingCart(String custName, ShoppingList list){
        this.list = list;
        this.custName = custName;
      
    }
    public ShoppingCart(){
        this.list = new ShoppingList();
      

    }

    public boolean isCompleted(){
        int count = 0; 
        for (int i = 0; i < list.getSize(); i++){
            if (list.getAt(i) != null && (list.getAt(i).isSold())){
                count++;
            }
        }
        if (list.getSize() == count){
           shopComplete = true; 

        }
        return shopComplete;

    }
    public void returnCart(){
        this.isCompleted(); 
        if (this.shopComplete == true && cartReturned < 1){
            
            cartReturned++; 
            totalReturned++; 
        }
       

    }

    public static int getTotalCartsReturned(){
        return totalReturned;
    }
    public String getName(){
        return custName; 

    }


}
