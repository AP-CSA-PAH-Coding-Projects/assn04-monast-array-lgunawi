package apcsa.githubtrack;

// Implement your Main class (with the main method) here
public class Main {
public static void main(String[] args){
    ShoppingList breakfastEssentials = new ShoppingList();
    ShoppingCart cart1 = new ShoppingCart(breakfastEssentials, "Linda", false);
    breakfastEssentials.addToEnd(new ShoppingItem("milk", 350, false)); // to be removed
    breakfastEssentials.addToEnd(new ShoppingItem("eggs", 350, false));
    breakfastEssentials.addToEnd(new ShoppingItem("zucchini", 275, false));
    breakfastEssentials.addToEnd(new ShoppingItem("frozen berries", 515, false));
    breakfastEssentials.insertAt(1, new ShoppingItem("smoked salmon", 999, false));
    breakfastEssentials.removeAt(0); 




    ShoppingList dormRun = new ShoppingList();
    ShoppingCart cart2 = new ShoppingCart(dormRun, "Bob", false);
    dormRun.addToEnd(new ShoppingItem("eggs", 350, false));
    dormRun.addToEnd(new ShoppingItem("tissues", 100, false));
    dormRun.addToEnd(new ShoppingItem("zucchini", 275, false));
    dormRun.addToEnd(new ShoppingItem("frozen berries", 515, false));
    dormRun.addToEnd(new ShoppingItem("smoked salmon", 999, false));
    dormRun.removeAt(1);
    dormRun.insertAt(2, (new ShoppingItem("tissues", 100, false)));

    System.out.println("Are the lists identical?");
    dormRun.isIdentical(breakfastEssentials);

    dormRun.removeAt(4); // removes tissues
    dormRun.removeAt(3); // removes smoked salmon

    breakfastEssentials[0].buy(); // buys eggs
    breakfastEssentials[1].buy(); // buys smoken salmon

    System.out.println("Is dormRun completed?"); // Prints whether dormRun is completed
    dormRun.isCompleted();

    breakfastEssentials.goShopping(); // buys all items in list

    System.out.println("Number of carts returned: " + getTotalReturned());

    cart1.returnCart(); // Attempting to return carts
    cart2.returnCart(); 

    System.out.println("Number of carts returned: " + getTotalReturned()); // printing # of carts returned again

    System.out.println("compareTo returned value:");
    breakfastEssentials[0].compareTo(dormRun[2]); // comparing first item of BE to third item of DR

    System.out.println("DormRun's cart includes the following items:");
    for (int i = 0; i < dormRun.getSize(); i++){
        System.out.print(dormRun.getAt(i) + ", ");
    
    }
    System.out.println(" for a total of $" + dormRun.totalPrice() + ".");
    System.out.println("It is completed.");










}
}