public class WordReverse{

    public static String reverse(String word)
    {
        String ret = "";
	    for(int i= word.length() - 1; i >= 0; i--)
	    {
		    ret += word.charAt(i);
	    }
	    return ret;
    }

    public static String reverseWithStack(String word)
    {
        Stack stack = new Stack(word.length());
	    for(int i=0; i<word.length(); i++)
	    {
		    stack.push(word.charAt(i));
	    };
	    String ret = "";
	    while(!stack.isEmpty())
	    {
	    	ret += stack.pop();
	    }
	    return ret;
    }

    public static String reverseRecursively(String word)
    {
        String ret = "";
        //Base case 1 -- Empty String
        if(word.length()==0)
            return ret;
        //Base case 2 -- 1 character String
        if(word.length()==1)
            return ret + word.charAt(0);
        else
        {
            //If multi-character string, return last character of word as the beginning of 
            //response and recursively call reverse() function on the rest of the string
            return word.charAt(word.length()-1) + reverseRecursively(word.substring(0, word.length()-1));
        }
    }

    public static void main(String[] args)
    {
        String word = "word";
        String complexWord = "A far more complex string";
        System.out.println("Word reversed : " + reverse(word).toString());
        System.out.println("Word reversed with stack: " + reverseWithStack(word).toString());
        System.out.println("Word reversed recursively: " + reverseRecursively(word).toString());
    

        System.out.println("Complex word reversed : " + reverse(complexWord).toString());
        System.out.println("Complex word reversed with stack: " + reverseWithStack(complexWord).toString());
        System.out.println("Complex word reversed recursively: " + reverseWithStack(complexWord).toString());
    }

}