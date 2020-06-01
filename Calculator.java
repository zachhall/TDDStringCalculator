package Calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",");
        List<Integer> negativeNumbers = new ArrayList<Integer>();

        // Go through each number in our numbersArray and convert it from a String to an
        // integer
        for (String number : numbersArray) {
            if (!number.isEmpty()) {
                int numberInt = Integer.parseInt(number);
                // If its not possible to convert the item to an integer, parseInt will throw an
                // exception

                if (numberInt < 0) { // is it a negative number?
                    negativeNumbers.add(numberInt);
                } else if (numberInt <= 1000) {
                    returnValue += numberInt;
                }
            }
        }
        // Throw a RuntimeException if there are any items in my negativeNumbers List
        if (negativeNumbers.size() > 0) {
            throw new RuntimeException("Negatives are not allowed" + negativeNumbers.toString());
        }

        // Returns 0 (default value) if no items in array
        // Returns sum of item(s) if 1 or 2 items exist in array
        return returnValue;

    }
}