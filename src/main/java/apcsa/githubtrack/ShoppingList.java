package apcsa.githubtrack;

// Implement your ShoppingList class here
public class ShoppingList{
    private int capacity = 8;
    private int size = 0;
    private ShoppingItem[] storage = new ShoppingItem[8];

    
    public void addToEnd(ShoppingItem item){
        int count = 0;
        for (int i = 0; i < storage.length; i++){
            if (storage[i] == null){
                storage[i] = item; 
                i = storage.length;
            }
            if (storage[i] != null){
                count++;
            }
        }
        if (count == storage.length){
            storage.makeCapacity(storage.length * 2);
            storage[count] = item;
        }

    }
    public void insertAt(int index, ShoppingItem item){
        int count = 0;

        if (index < 0 || index > storage.getSize){
            System.out.println("Invalid index!");
        }
        for (int i = 0; i < storage.length; i++){
            if (storage[i] != null){
                count++;
            }
        }
        if (count >= storage.length){
            makeCapacity(storage.length + 1);

        }
        ShoppingItem[] temp = new ShoppingItem[storage.length];
        for (int i = 0; i < index; i++){
            temp[i] = storage[i];
        }
        for (int i = index; i < temp.length; i++){
            temp[i+1] = storage[i];
        }
        temp[index] = item;
        storage = temp;
    }
    public void removeAt(int index){
        if (index < 0 || index > storage.getSize){
            System.out.println("Invalid index!");
        }
        ShoppingItem[] temp = new ShoppingItem[storage.length];
        for (int i = 0; i < index; i++){
            temp[i] = storage[i];
        }
        for (int i = index; i < storage.length; i++){
            temp[i] = storage[i+1];
        }
        storage = temp;

    }
    public ShoppingItem getAt(int index){
        if (index < 0 || index > storage.getSize){
            System.out.println("Invalid index!");
        }
        ShoppingItem item = storage[index];
        return item;
    }
  
    public int getCapacity(){
        return capacity;
    }
    public int getSize(){
        int count = 0;
        for (int i = 0; i < storage.length; i++){
            if (storage[i] != null){
                count++;
            }
        }
        return count;
    }

    public void makeCapacity(int minCapacity){
        if (minCapacity > storage.getSize() || minCapacity != capacity){
            if (capcity > minCapacity){
                capacity = 8;
            } else if (minCapacity > capacity){
                capcity = minCapacity;
            }
        }
        ShoppingItem[] temp = new ShoppingItem[capacity];
        for (int i = 0; i < storage.length; i++){
            temp[i] = storage[i];
        }
        storage = temp;
    }
    public void trimExcess(){
        makeCapcity(storage.getSize());
    }

    public void goShopping(){
        for (int i = 0; i < storage.length; i++){
            storage[i].buy();
        }
    }
    public void goShopping(ShoppingList toBuy){
        for (int i = 0; i < toBuy.length; i++){
            for (int j = 0; i < storage.length; j++){
                if (toBuy[i].getName().equals(storage[j].getName())){
                    storage[j].buy();
                }
            }
        }
    }
    public double totalPrice(){
        double total = 0;
        for (int i = 0; i < storage.length; i++){
            total += storage[i].getPrice();
        }
        return total;
    }
    // REITTERINATE THROUGH THE WHOLE THING 
    public boolean isIdentical(ShoppingList other){
        if(other.getSize() != storage.getSize()){
            return false;
        }
        for (int i = 0; i < storage.length && i < other.length; i++){
            if (storage[i] != other[i]){
                return false;
            }
        }
        return true;
    }
    public boolean isIdentical(ShoppingList other){
        if(other.getSize() != storage.getSize()){
            return false;
        }


        for (int i = 0; i < storage.length; i++){
            int count = 0;
            for (int j = 0; j < storage.length; j++){
                if (storage[i] == other[j]){
                    count++;
                }
            }
            for (int k = 0; k < storage.length; k++){
                if (storage[i] == storage[k]){
                    count++;
                }
            }
            if (count != 2){
                return false;
            } 
        
        }
        return true; 
    }
    

}

public class ShoppingList implements MyList {}
