import java.util.*;
public class Solution {
    private static int kaprekar(int n) {
        // Edge cases: Number has to be 4 digit and atleast 2 unique digits;
        Set<Integer> set = new HashSet<>();
        int digits = 0;
        while (n != 0) {
            set.add(n % 10);
            n = n / 10;
            digits++;
        }

        if (digits != 4 || set.size() < 2) return -1;

        
    }
    public static void main(String[] args) {

    }
}