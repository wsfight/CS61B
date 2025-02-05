import java.util.*;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        char[] letter = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Map<Character,Integer> ret = new HashMap<>();
        for(int i = 1;i <= 26;i++){
            ret.put(letter[i - 1],i);
        }
        return ret;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer,Integer> ret = new HashMap<>();
        for(int x : nums){
            ret.put(x, (int) Math.pow(x,2));
        }
        return ret;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String,Integer> ret = new HashMap<>();
        Set<String> l = new HashSet<>(words);
        for(String i : l){
            int cnt = 0;
            for(String k : words){
                if(i.equals(k)){
                    cnt++;
                }
            }
            ret.put(i,cnt);
        }
        return ret;
    }
}
