package Calculator;

public class Calculator {
    public static void add(final String numbers) {
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers seperated by comma(,) are allowed.");
        } else {
            // Go through each number in our numbersArray and convert it from a String to an
            // integer
            for (String number : numbersArray) {
                Integer.parseInt(number);
                // If its not possible to convert the item to an integer, parseInt will throw an
                // exception
            }
        }
    }
}