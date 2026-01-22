class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int y = x;
        while(x != 0){
            int i = 0 ;
            if(x<0){
                return false ;
            }
            else{
                i=x%10;
                x/=10;
                reversed = reversed*10 + i ; 
            }
        }
        if (reversed == y ){
            return true ; 
        }
        else {
            return false ;
        }
    }
}