public class Stack{
    private int size;
    private char[] elements;
    private int top;

    public Stack(int size)	//Constructor
	{
		this.size = size;
		this.elements = new char[size];
		this.top = -1;	//top initialized to negative
	}

    public void setSize(int s)
    {
        this.size = s;
    }

    public int getSize()
    {
        return size;
    }

    public void setElements(char[] elements)
    {
        this.elements = elements;
    }

    public char[] getElements()
    {
        return elements;
    }

    public void setTop(int t)
    {
        this.top = t;
    }

    public int getTop()
    {
        return top;
    }

	public void push(char i)	//Add element to stack
	{
		top++;	//Increment top element index
		elements[top] = i;	//Add element to elements list
	}

    public char pop()	//Remove top item from stack
	{
		top--;
		return elements[top+1];	//Return element being removed from stack
	}

	public int peek()	//Peek at top of stack
	{
		return elements[top];
	}

	public boolean isEmpty()
	{
		return (top==-1);
	}

	public boolean isFull()
	{
		return(top==size-1);
	}

    public static void main(String[] args)
    {
        Stack s = new Stack(5);
        s.push('1');
        s.push('2');
        s.push('3');
        s.push('4');
        s.push('5');
        if(s.pop()=='5' && s.pop()=='4' && s.pop()=='3' &&
         s.pop()=='2' && s.pop()=='1')
            System.out.println("STACK TEST PASSED");
        else System.out.println("STACK TEST FAILED");
    }

}