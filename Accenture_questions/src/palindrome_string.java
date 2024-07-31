public class palindrome_string {
    public static void main(String[] args) {
        String s="nitin";
        System.out.println("is "+s+" palindrome= "+ isPalindrome(s));
        String s2="hello";
        System.out.println("is "+s2+" palindrome= "+ isPalindrome(s2));
    }
    public static boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
