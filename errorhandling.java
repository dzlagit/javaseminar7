// task one
/*public class Main {
    public static void main(String[] args) {
    int a = 10;
    int b = 0;
        try {
            System.out.println("Result: " + (a / b));
            } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
            }
        }
    }
*/

// task two

/* public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        
        try {
        System.out.println(numbers[5]);
        System.out.println(Integer.parseInt("XYZ"));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException fr");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException fr");
        }
    }
} */

// task three

/* import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);
            System.out.println("Test"); //used so i know if works as no file made
            // You can add code here to read from the file if needed
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file");
        } finally {
            System.out.println("bye!");
        }
    }
} */


// task four

/*
public class Main {
    public static void main(String[] args) {
        
        
        
        try {
            checkAge(21);
        } catch (UnderageException e) {
            System.out.println("Caught an underage exception: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("Underage person not allowed.");
        } else {
            System.out.println("Person is eligible.");
        }
    }

}

class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}
*/

//task five

/*
public class Main {
    public static void main(String[] args) {
        try {
            parseString("1234");
            parseString("abcd");
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void parseString(String str) throws NumberFormatException {
        int number = Integer.parseInt(str);
        System.out.println(number);
    }
}
*/

























