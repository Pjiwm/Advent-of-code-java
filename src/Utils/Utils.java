package Utils;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Utils {
    
    /**
     * Actually prints a 2d array instead of printing an array of memory adresses.
     * 
     * @param <T> - Any object we have a 2d array of
     * @param array - 2d array we want to print
     */
    public static <T>void print2DArray(T[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
    /**
     * Prints a line to seperate the output while debugging.
     */
    public void line() {
        System.out.println("-----------------------------------------------------");
    }

    /**
     * Converts a collection of strings to a collection of integers.
     * 
     * @param input - a collection of strings that only has numbers in it.
     * @return - Returns A Collection of integers that were all parsed fron strings.
     */
    public static Collection<Integer> inputAsIntegers(Collection<String> input) {
        Collection<Integer> output = new LinkedList<>();
        for (String s : input) {
            output.add(Integer.parseInt(s));
        }
        return output;
    }

}
