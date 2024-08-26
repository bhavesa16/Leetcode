public class palindrome_string_recursion {
    public static boolean Ispalindrome(String s,int l,int r){
        if(l>=r)
            return true;
        if(s.charAt(l) != s.charAt(r))
            return false;
        return Ispalindrome(s,l+1,r-1);
    }

    public static void main(String[] args) {
        String str="nitin";
        int r= str.length()-1;
        System.out.println(Ispalindrome(str,0,r));
        String str2="batman";
        int r2=str2.length()-1;
        System.out.println(Ispalindrome(str2,0,r));
    }

}
