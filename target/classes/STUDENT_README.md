*Optional README file to write up your code explanation/reflection*

Explain what your program does at a high level
Explain why your logic works, especially for array resizing, shifting elements, and shopping logic
Mention any challenges, assumptions, or design decisions you made along the way


At a high level, I created this program to use arrays in the context of a grocery shopping to replace arraylists, which are much more versatile and can change sizes. These normal arrays are unable to change size after initiated, so my program has many methods to adjust these arrays of shopping lists accordingly. 

This logic for array resizing works, as I created a method makeCapacity(int minCapacity) which creates a new array with the desired length and then replaces the original array with the new array, so that it is extended in length. For shifting elements, I made a method insertAt(int index, ShoppingItem item) which also creates a new array to temporarily hold the values of the new desired array, and it calls the method to increase the capacity, if the current array does not have enough space. To buy the items in a list, I made a goShopping() method which called buy(), which marks the boolean variable sold as true, which means it has been purchased.

Some challenges I encountered was looking for whether the errors during debugging were external or internal problems, and whether my accessor methods were returning something different than what I thought. For example, the getPrice() method returned the price in dollars, but the variable of price was an integer that counted the price in cents. When I was comparing the prices of two objects, I did not realize that I did not use getPrice() for both of them, but used getPrice() and .price instead, so the JUnit test did not pass because I was comparing different units. I had to carefully design how each item, list, and cart was being tracked. 

