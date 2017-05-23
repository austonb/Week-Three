package chapter18;
import java.util.Scanner;
public class Exercise18_9 {

    System.out.print("Enter an integer: ");
    int value = new Scanner(System.in).nextInt();
    reverseDisplay(value);

}

public static void reverseDisplay(int value) {

    if (value <= 0)
        return;

    System.out.print(value % 10);
    reverseDisplay(value / 10);
}
}
