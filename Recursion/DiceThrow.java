package Recursion;

import java.util.ArrayList;

public class DiceThrow {

    public static void main(String[] args) {

     //   throwDice( "", 3);
        System.out.println( throwDiceList("", 4));


    }

    static void throwDice ( String p, int target)

    {
        if ( target == 0 )
        {
            System.out.println( p);
            return ;
        }

        for ( int i =1; i<=6 && i<= target; i++)
        {
            throwDice(p+i, target -i);
        }

    }

    static ArrayList < String > throwDiceList ( String p, int target)
    {

        if ( target == 0)
        {
            ArrayList <String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList <String> list = new ArrayList<>();

        for ( int i =1; i <= target; i++)
        {

            list.addAll( throwDiceList(p+i, target - i));

        }

        return list;
    }

}
