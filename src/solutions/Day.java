package solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

public abstract class Day {
    private int day;

    public Day(int day) {
        this.day = day;
        try {
            solution();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * The solutions for an advent of code day
     */
    abstract void solution() throws IOException;


    /**
     * Reads the input file based on the day given in the constructor
     * It will look for the file inputs/day<day>.txt
     * @return - a collection of all the lines in the file
     * @throws IOException
     */
    Collection<String> readInput() throws IOException {
        Collection<String> list = new LinkedList<String>();
        BufferedReader reader = new BufferedReader(new FileReader("inputs/day" + day + ".txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            list.add(line);
        }
        reader.close();
        return list;
    }
}
