import java.util.Arrays;
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        Arrays.sort(array);
        for (int x : array) {
            if(height < x){
                answer += 1;
            }
        }
        return answer;
    }
}