public class Palindrome {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String str = String.valueOf(x);
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}