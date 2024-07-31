import java.util.Arrays;

public class Anagram_strings {
    public static void main(String[] args) {
        String string1 = "anagram";
        String string2 = "nagaram";
        System.out.println(areAnagrams(string1, string2));
    }

//    method-1
//    public static boolean areAnagrams(String str1,String str2){
//        char[] s=str1.toCharArray();
//        char[] t=str2.toCharArray();
//
//        if(s.length != t.length)
//            return  false;
//        Arrays.sort(s);
//        Arrays.sort(t);
//        return  Arrays.equals(s,t);
//    }

//    method-2
public static boolean areAnagrams(String s,String t){
        if(s.length() != t.length()){
            return  false;
        }
        int[] check= new int[26];
        for(int i=0;i<s.length();i++){
            check[s.charAt(i)-'a']++;
            check[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(check[i] != 0){
                return false;
            }
        }
        return  true;
    }
}
