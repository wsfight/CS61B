import edu.princeton.cs.algs4.In;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        // TODO: Fill in this function.
        int[] arr  = new int[6];
        for(int i = 1;i <= 6;i++){
            arr[i - 1] = i;
        }
        return arr;
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        // TODO: Fill in this function.
        String[] l1;
        if (customer.equals("Ergun")) {
            l1 = new String[]{"beyti", "pizza", "hamburger", "tea"};
        } else if (customer.equals("Erik")) {
            l1 = new String[]{"sushi","pasta","avocado","coffee"};
        } else{
            l1 = new String[3];
        }
        return l1;
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        // TODO: Fill in this function.
        int maxOfArray = array[0];
        int minOfArray = array[0];
        for(int i = 1;i < array.length;i++){
            if(array[i] > maxOfArray){
                maxOfArray = array[i];
            }else if(array[i] < minOfArray){
                minOfArray = array[i];
            }else{
                continue;
            }
        }
        int ret = maxOfArray - minOfArray;
        return ret;
    }

    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {

        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        // TODO: Fill in this function.
        list.add(x);
        while(x != 1){
            if(x % 2 == 0){
                x = x / 2;
            }else{
                x = 3 * x + 1;
            }
            list.add(x);
        }

        return list;
    }
}

