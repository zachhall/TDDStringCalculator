package Calculator;

public class Calculator {
    public static final int add(final String numbers) {
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers seperated by comma(,) are allowed.");
        } else {
            // Go through each number in our numbersArray and convert it from a String to an
            // integer
            for (String number : numbersArray) {
                if (!number.isEmpty()) {
                    Integer.parseInt(number);
                    // If its not possible to convert the item to an integer, parseInt will throw an
                    // exception
                }
            }
        }
        return 0;
    }
}