import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            integers.add(random.nextInt(1, 100));
        }
        System.out.print(integers + " ");
        System.out.println(integers.size());

        ArrayList<Integer> evenNumber = new ArrayList<>();
                System.out.print("even number: ");
        for (Integer integer1 : integers) {
            if (integer1 % 2 == 0) {
                evenNumber.add(integer1);
                System.out.print(integer1 + " ");
            }
            }
            ArrayList<Integer> exentNumber = new ArrayList<>();
                    System.out.print("\nexent number: ");
            for (Integer integer1 : integers) {
                if (integer1 % 2 == 1) {
                    exentNumber.add(integer1);
                    System.out.print(integer1+" ");
                }
            }
        }
    }


