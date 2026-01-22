class Solution {
    public boolean isPalindrome(String s) {
        String s1 = new String() ;
        String s2 = new String() ;  
        int len = s.length() ;
        for(int i = 0 ; i< len ; i++ ){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                s1=s1 + c;
            }else{
                continue ;
            }
        }
        for (int i = s1.length() - 1 ; i>= 0 ; i--){
            char a = s1.charAt(i);
            s2 = s2 + a ;
        }
        if(s1.equalsIgnoreCase(s2)){
            return true ;
        }else{
            return false ;
        }
    }
}