class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray(); // String -> char[]
        char[] reversedArr = new char[arr.length];
        for(int i=0; i<arr.length; i++){
            reversedArr[arr.length-1-i] = arr[i];
        }

        String reversedStr = new String(reversedArr);
        return reversedStr;
    }
}