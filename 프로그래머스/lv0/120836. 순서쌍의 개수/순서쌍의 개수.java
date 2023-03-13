class Solution {
    public long solution(long n) {
        long answer = 0;
        for(int i=1; i<n+1; i++){
            if(n%i==0){
                answer += 1;
            } 
        }
        return answer;
    }
}