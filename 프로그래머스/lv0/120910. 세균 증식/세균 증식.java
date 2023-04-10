class Solution {
    public int solution(int n, int t) {
        double tt = Math.pow(2, t);
        int answer = (int)tt * n;
        return answer;
    }
}