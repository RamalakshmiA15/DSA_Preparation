package Recursion;

import java.util.ArrayList;

public class subSequence {

    public static void main(String[] args) {
    //    ArrayList<String> ans=    subseqRet( "", "abc");
       sequenceAScii ( "", "ab");
          //  sequence("", "abc");
    }

    static void sequence ( String p, String up)
    {

        if ( up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        sequence( p + up.charAt(0), up.substring(1));
        sequence( p, up.substring(1));

    }


    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }


    static void sequenceAScii ( String p, String up)
    {

        if ( up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        sequenceAScii( p + up.charAt(0), up.substring(1));
        sequenceAScii( p, up.substring(1));
        sequenceAScii( p +(up.charAt(0) + 0), up.substring(1));

    }

}
