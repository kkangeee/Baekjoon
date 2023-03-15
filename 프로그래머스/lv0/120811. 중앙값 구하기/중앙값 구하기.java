import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int m = (int)(array.length / 2);
        Arrays.sort(array);
        return array[m];
    }
}


