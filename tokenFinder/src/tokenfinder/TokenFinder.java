package tokenfinder;

import java.util.List;

public class TokenFinder {
    
    public static void main(String[] args) {
        // TODO code application logic here
        String test = "He is a very very good boy, isn't he?";
        String tokens = "[ .,?!']+";
        String[] ut = test.split(tokens);
        int num = 0;
        for(int i = 0; i < test.length() - 1; i++) {
            for(int j = 0; j < tokens.length(); j++) {
                if(test.charAt(i) == tokens.charAt(j)) {
                    num++;
                }
            }
        }
        System.out.println(num);
        for(int i = 0; i < ut.length; i++) {
            System.out.println(ut[i]);
        }
    }
    
}
