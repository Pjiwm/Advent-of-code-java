# Advent of code Java
This is the skeleton for a project for advent of code.
It contains a couple utility methods as well to help you along the way...

## Creating a new solution
Copy the input from advent of code
and go in the `inputs` folder.
Create a new file and name it day<number>.txt
(e.g) day1.txt, day2.txt

Now create a new class in the `src/solutions` package
A good rule of thumb would be to name them based on the day: `Day1.java` `Day2.java` `Day3.java`
Make sure to extend the class with the abstract class Day.
  
In the constructor write as super parameter the number of the day corresponding to the day number in your text file.
```Java
public class SampleDay extends Day {

    public SampleDay() {
        super(1);
    }
```
In the solution method that was generated when we extended the class on the abstract Day we can get retrieve the input from the file.
The super class has a method that returns the input as a Collection of Strings
`super.readInput()`
We can now use any datastructure from the collection framework!

### Java collections framework:
<img src="https://3.bp.blogspot.com/-C1o1u8il4J8/XGGvQJlvA1I/AAAAAAAACs8/MCU7ydkwW0oF63BNiVA62OkWtHwIGk0SACLcBGAs/s1600/Screenshot%2B%2528286%2529.png">
  
### Example:
```Java
      @Override
  public void solution() throws IOException {
      // We retrieve the input from the file and put it in a datastructure of our choice
      ArrayList<String> arrList = new ArrayList<>();
      Stack<String> stack = new Stack<>();
      Set<String> set = new HashSet<>();
      set.addAll(super.readInput());
      stack.addAll(super.readInput());
      arrList.addAll(super.readInput());
  
      // looping over each...
      for(String s : set) {
          System.out.println(s);
      }
      for(String s : stack) {
          System.out.println(s);
      }
      for(String s : arrList) {
          System.out.println(s);
      }
  }
```
To run the code go to your App.java and add a new object for your solution:
```Java
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Solutions:");
        new Day1();
        // add day2, 3...
    }
}
```

## Utilities
There's a Utils class with a couple methods that can come in handy.
 
### line
line prints a line with dashes, makes it easier to seperate stuff that's printed in the console:
```Java
 Utils.line();
```
Output:
```
Some text
-----------------------------------------------------
Some text below a line of dashes...
```

### print2DArray
print2DArray prints out an entire 2D array of any type in the console:
```Java
 Utils.print2DArray(my2DArray);
```
This is useful because if you normally loop over a 2d array and print it, it'll only show the memory adresses of each array.
With print2DArray method:
```
[a, b, c]
[d, e, f]
[g, h, i]
```
without:
```
[Ljava.lang.String;@5d22bbb7]
[Ljava.lang.String;@41a4555e]
[Ljava.lang.String;@3830f1c0]
```
### Collection data type converters
It's possible to get the input of a file as numbers instead of strings.
This is possible for the following datatyped: int, long, double
For example we can get the input as a collection of integers:
```Java
Stack<Integer> stack = new Stack<>();
stack.addAll(
  Utils.inputAsInteger(super.readInput())
);
```
The following methods are available:
```Java
  Utils.inputAsInteger(myCollection);
  Utils.inputAsDouble(myCollection);
  Utils.inputAsLong(myCollection);
```
