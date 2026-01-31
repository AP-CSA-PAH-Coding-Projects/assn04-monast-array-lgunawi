
// Implement the ShoppingList class here
public class ShoppingList implements MyList {
    private int capacity = 8;
    private int size = 0;
    private ShoppingItem[] storage = new ShoppingItem[8];

    
    public void addToEnd(ShoppingItem item){
       /*  for (int i = 0; i < size -1; i++){
            if (storage[i] == null){
                storage[i] = item; 
                i = capacity;
            }
            
        } */
        if (size + 1 > capacity){
            makeCapacity(capacity * 2);
            
        }
        storage[size] = item;
        size++; 
    }
    public void insertAt(int index, ShoppingItem item){
      

        if (index < 0 || index > size){
            System.out.println("Invalid index!");
        }
        
        if (size + 1 > capacity){
            makeCapacity(size + 1);

        }
        for (int i = size - 1; i >= index; i--){
            storage[i+1] = storage[i];

        }
        storage[index] = item;
        size++; 
        

    }
    public void removeAt(int index){
        if (index < 0 || index > size){
            System.out.println("Invalid index!");
        }

        for (int i = index; i < size -1; i++){
            storage[i] = storage[i+1];
        }
        
        size--;

    }
    public ShoppingItem getAt(int index){
        if (index < 0 || index > size || storage[index] == null){
            System.out.println("Invalid index!");
        }
        ShoppingItem item = storage[index];
        return item;
    }
  
    public int getCapacity(){
        return capacity;
    }
    public int getSize(){
        /*int count = 0;
        for (int i = 0; i < storage.length; i++){
            if (storage[i] != null){
                count++;
            }
        } */
        return size;
    }

    public void makeCapacity(int minCapacity){
        if (minCapacity > storage.length || minCapacity != capacity){
            if (capacity > minCapacity){
                capacity = 8;
            } else if (minCapacity > capacity){
                capacity = minCapacity;
            }
        }
        ShoppingItem[] temp = new ShoppingItem[capacity];
        for (int i = 0; i < storage.length; i++){
            temp[i] = storage[i];
        }
        storage = temp;
    }
    public void trimExcess(){
        makeCapacity(size);
    }

    public void goShopping(){
        for (int i = 0; i < size; i++){
            storage[i].buy();
        }
    }
    public void goShopping(ShoppingList toBuy){
        for (int i = 0; i < toBuy.getSize() ; i++){
            for (int j = 0; j < size; j++){
                if (toBuy.getAt(i).getName().equals(storage[j].getName())){
                    storage[j].buy();
                }
            }
        }
    }
    public double totalPrice(){
        double total = 0;
        for (int i = 0; i < size; i++){
            total += storage[i].getPrice();
        }
        return total;
    }
   
    public boolean isIdentical(ShoppingList other){
        if(other.getSize() != this.size){
            return false;
        }

        int numPairs = 0; 
        for (int i = 0; i < size; i++){


            for (int j = 0; j < size; j++){
                if (storage[i].equals(other.getAt(j))){
                    numPairs++;
                }
            }
            /*for (int k = 0; k < size; k++){
                if (storage[i] == storage[k]){
                    count++;
                }
            } */
           
            
        }
        if (numPairs == size){
                return true;
            }
        return false; 
    }
    

}

