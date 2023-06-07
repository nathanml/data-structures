public class DelimiterMatcher{

    /*
     * Method that utilizes the stack class to determine if input string delimiters match
     */
    public static boolean isMatch(String input)
    {
	    int length = input.length();
	    Stack stack = new Stack(length);
	    for(int i=0; i<=length-1; i++)
	    {
		    char current = input.charAt(i);
			if(current=='{' || current=='[' || current=='(')
			{
				stack.push(current);
			}
			else if(current=='}' || current==']' || current==')')
			{
				if(stack.isEmpty())
					    return false;
				    else
                    {
					    char top = stack.pop();
					    if(current == ')' && top != '(' || 
					        current== ']' && top!='[' || 
					        current== '}' && top!='{')
                            return false;
				    }

			}

	    }
	    return true;
    }

	public static void main(String[] args)
	{
		String success1 = "{[()]}";
        String success2 = "{}[]()";
        String success3 = "{outer(middle[innertest]test)test}";
        
        String fail1 = "{[(]}";
        String fail2 = "[sfdds{fds(fs])}]";
        String fail3 = ")";


        if(isMatch(success1) && isMatch(success2) && isMatch(success3))
            System.out.println("SUCCESS CASES PASS");
        else System.out.println("SUCCESS CASES FAIL");

        if(!isMatch(fail1) && !isMatch(fail2) && !isMatch(fail3))
            System.out.println("FAIL CASES PASS");
        else System.out.println("FAIL CASES FAIL");
	}
}