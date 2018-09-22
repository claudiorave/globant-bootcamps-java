/*2.Find a use case where multiple exception types could be thrown and catch'em all. Is the order relevant in here?
Answer: The order is relevant, as the first catch is usually more specific and wouldn't be activated if placed last. 
*/

try {

} catch (IndexOutOfBoundsException e) {
    System.err.println("IndexOutOfBoundsException: " + e.getMessage());
} catch (IOException e) {
    System.err.println("Caught IOException: " + e.getMessage());
}

