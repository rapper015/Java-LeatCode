class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int s=0;
        while(n>0){
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==x){
            return true;
        }
        else{
            return false;
        }
    }
}
