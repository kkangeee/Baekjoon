class Solution {
    public int[] solution(int[] num_list) {
        int [] arr = new int[2];
        for(int x : num_list){
            if(x % 2 == 1) {
                arr[1] += 1;
            }else {
                arr[0] += 1;
            }
        }
        return arr;
    }
}