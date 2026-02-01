package apcsa.githubtrack;

// Implement your Main class (with the main method) here
public class Main {
public static void main(String[] args){
    ShoppingList breakfastEssentials = new ShoppingList();
    ShoppingCart cart1 = new ShoppingCart( "Linda", breakfastEssentials);
    breakfastEssentials.addToEnd(new ShoppingItem("milk", 350)); // to be removed
    breakfastEssentials.addToEnd(new ShoppingItem("eggs", 350));
    breakfastEssentials.addToEnd(new ShoppingItem("zucchini", 275));
    breakfastEssentials.addToEnd(new ShoppingItem("frozen berries", 515));
    breakfastEssentials.insertAt(1, new ShoppingItem("smoked salmon", 999));
    breakfastEssentials.removeAt(0); 




    ShoppingList dormRun = new ShoppingList();
    ShoppingCart cart2 = new ShoppingCart("Bob", dormRun);
    dormRun.addToEnd(new ShoppingItem("eggs", 350));
    dormRun.addToEnd(new ShoppingItem("tissues", 100));
    dormRun.addToEnd(new ShoppingItem("zucchini", 275));
    dormRun.addToEnd(new ShoppingItem("frozen berries", 515));
    dormRun.addToEnd(new ShoppingItem("smoked salmon", 999));
    dormRun.removeAt(1);
    dormRun.insertAt(2, (new ShoppingItem("tissues", 100)));

    System.out.println("Are the lists identical?");
    dormRun.isIdentical(breakfastEssentials);

    dormRun.removeAt(4); // removes tissues
    dormRun.removeAt(3); // removes smoked salmon

    breakfastEssentials.getAt(0).buy(); // buys eggs
    breakfastEssentials.getAt(1).buy(); // buys smoken salmon

    System.out.println("Is dormRun completed?"); // Prints whether dormRun is completed
    cart2.isCompleted();

    breakfastEssentials.goShopping(); // buys all items in list

 //   System.out.println("Number of carts returned: " + getTotalCartsReturned());

    cart1.returnCart(); // Attempting to return carts
    cart2.returnCart(); 

 //   System.out.println("Number of carts returned: " + getTotalCartsReturned()); // printing # of carts returned again

    System.out.println("compareTo returned value:");
    breakfastEssentials.getAt(0).compareTo(dormRun.getAt(2)); // comparing first item of BE to third item of DR

    System.out.println("DormRun's cart includes the following items:");
    for (int i = 0; i < dormRun.getSize(); i++){
        System.out.print(dormRun.getAt(i) + ", ");
    
    }
    System.out.println(" for a total of $" + dormRun.totalPrice() + ".");
    System.out.println("It is completed.");










}
}