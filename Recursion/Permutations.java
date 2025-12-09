package Recursion;

import java.util.ArrayList;

public class Permutations {


    public static void main(String[] args) {

       // findPermutation( "", "abc");
     //   ArrayList< String> ans = permutationsList("","abc");
       // System.out.println(ans);

        System.out.println( permutationCount("", "abc"));
    }


     static void findPermutation ( String p, String up)
     {

         if ( up.isEmpty())
         {
             System.out.println(p);
             return;
         }

         char ch = up.charAt( 0);
         for ( int i=0; i< p.length() + 1; i++)
         {
             String f = p.substring(0,i);
             String l = p.substring(i, p.length());
             findPermutation(f + ch + l, up.substring(1));
         }
     }

    static ArrayList<String> permutationsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

        static  int count = 0;
    static  int permutationCount ( String p, String up)
    {


        if ( up.isEmpty())
        {
            count ++;
            return count;
        }

        char ch = up.charAt(0);

        int c =0 ;

        for ( int i =0; i < p.length() +1; i++)
        {

            String f = p.substring(0, i);
            String l = p.substring( i, p.length());

             c = permutationCount( f+ch+l, up.substring(1));
        }
        return  c;


    }

}
