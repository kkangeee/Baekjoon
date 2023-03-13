class Solution {
    public int solution(int slice, int n) {
        if(n % slice == 0){
            return n/slice;
        }else if(n > slice){
            return (int)(n/slice) + 1;
        }else {
            return 1;
        }
    }
}