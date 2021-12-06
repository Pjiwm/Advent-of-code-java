package solutions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SampleDay extends Day {

    public SampleDay() {
        // looks for the input file day1.txt
        super(1);
    }

    /**
     * Program your solution here
     * @throws IOException
     */
    @Override
    public void solution() throws IOException {
        // We retrieve the input from the file and put it in a datatype of our choice
        ArrayList<String> input = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        Set<String> set = new HashSet<>();

        set.addAll(super.readInput());
        stack.addAll(super.readInput());
        input.addAll(super.readInput());
        // looping over each...
        for(String s : set) {
            System.out.println(s);
        }
        for(String s : stack) {
            System.out.println(s);
        }
        for(String s : input) {
            System.out.println(s);
        }        
    }

}
