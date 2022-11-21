import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;

public class Main {
    public static String s;
    public static String s2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("PLease enter something: ");
        s = in.nextLine();
        System.out.println("You eneterd: \"" + s + "\"");
        if (isNumeric(s)) {
            s2 = "is";
        } else {
            s2 = "is not";
        }
        System.out.println("\"" + s + "\" " + s2 + " a number.");
        System.out.println("Flipped Case: " + swapCase(s));
        System.out.println("Reversed: " + reverse(s));
    }
}
