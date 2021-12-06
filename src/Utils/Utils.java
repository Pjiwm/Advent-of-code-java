package Utils;
import java.util.Arrays;

public class ArrayUtils {
    
    /**
     * Actually prints a 2d array instead of printing an array of memory adresses.
     * @param <T> - Any object we have a 2d array of
     * @param array - 2d array we want to print
     */
    public static <T>void print2DArray(T[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
