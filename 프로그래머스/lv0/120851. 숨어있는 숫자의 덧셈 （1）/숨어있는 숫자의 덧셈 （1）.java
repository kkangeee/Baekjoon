class Solution {
    public int solution(String my_string) {
            int answer = 0;
            int sum = 0;
            String my_string1 = my_string.replaceAll("[^0-9]", "");
            for(int i = 0; i<my_string1.length();i++) {
                    sum += my_string1.charAt(i) - '0';
                }
            return sum;
        }
    }