import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sumOfList = 0;
        for(int x : L){
            sumOfList += x;
        }
        return sumOfList;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> ret = new ArrayList<>();
        for(int x : L){
            if(x % 2 == 0){
                ret.add(x);
            }
        }
        return ret;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> l = new ArrayList<>();
        for(int x : L1){
            for(int y : L2){
                if(x == y){
                    l.add(x);
                }
            }
        }
        return l;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int cnt = 0;
        for(String s : words){
            for(char k : s.toCharArray()){
                if(c == k){
                    ++cnt;
                }
            }
        }
        return cnt;
    }
}
