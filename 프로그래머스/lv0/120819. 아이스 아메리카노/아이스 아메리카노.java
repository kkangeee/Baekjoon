class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int num1 = money / 5500;
        int num2 = money % 5500;
        answer[0] = num1;
        answer[1] = num2;
        return answer;
    }
}