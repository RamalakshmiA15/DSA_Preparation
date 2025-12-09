package Recursion;

public class RemoveChar {

    public static void main(String[] args) {

        //System.out.println( skipApple("appleram"));
        System.out.println(skip("deqwafsd"));
    }

    static String remove ( String a, String b)
    {
        if ( a.isEmpty())
            return b;
        char ch = a.charAt(0);
        if ( ch == 'a')
            return remove(  a.substring(1), b);
        else
            return remove( a.substring(1), b+ch );

    }

    static String skip ( String a)
    {

        if (a.isEmpty() )
        {
            return "";
        }
        char ch = a.charAt(0);
        if ( ch == 'a')
            return  skip( a.substring(1));
        else
            return ch + skip(  a.substring(1));

    }

    static  String skipApple ( String str)
    {
        if ( str.isEmpty())
            return "";

        if( str.startsWith("apple"))
        {
            return skipApple( str.substring(5));
        }
        else
            return str.charAt(0) + skipApple( str.substring(1));
    }
}
