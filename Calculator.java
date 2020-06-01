package Calculator;

public class Calculator {
    public static final int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",");
        // if (numbersArray.length > 2) {
        // throw new RuntimeException("Up to 2 numbers seperated by comma(,) are
        // allowed.");
        // }

        // Go through each number in our numbersArray and convert it from a String to an
        // integer
        for (String number : numbersArray) {
            if (!number.isEmpty()) {
                // Coverts number String to int, adds to returnValue
                returnValue += Integer.parseInt(number);
                // If its not possible to convert the item to an integer, parseInt will throw an
                // exception
            }
        }
        return returnValue;
        // Returns 0 (default value) if no items in array
        // Returns sum of item(s) if 1 or 2 items exist in array
    }
}