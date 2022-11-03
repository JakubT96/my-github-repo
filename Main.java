
import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        System.out.println("Domácí úkol z lekce č.3 ");
        for (int number = 1; number <= 100; number++) //vytvoření počítadla do 100
        {
            if (((number % 3) == 0) && ((number % 5) == 0))
                System.out.println("FIZZ-BUZZ");
            else if ((number % 3) == 0)
                System.out.println("FIZZ");
            else if ((number % 5) == 0)
                System.out.println("BUZZ");
            else
                System.out.println(number);
        }
    }
}

