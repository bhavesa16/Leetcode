import java.util.*;
public class Balanced_paranthesis {
        public static boolean isValid(String s) {
            Stack<Character> st= new Stack<Character>();
            for(Character i:s.toCharArray()){
                if(i=='(' || i=='[' || i=='{'){
                    st.push(i);
                }
                else{
                    if(st.isEmpty()){
                        return false;
                    }
                    else{
                        char c=st.pop();
                        if((i==')' && c=='(') || (i==']' && c=='[') || (i=='}' && c=='{')) continue;
                        else return false;
                    }
                }
            }
            return st.isEmpty();
        }

    public static void main(String[] args) {
            String s="()";
            System.out.println(isValid(s));
            String s2="(){[]}";
            String s3="()}";
            System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }
}