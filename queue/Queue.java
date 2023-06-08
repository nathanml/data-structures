public class Queue{
	int[] elements;
	int front;
	int rear;
	int maxSize;
	int numItems;

	public Queue(int maxSize){
		this.maxSize = maxSize;
		this.elements = new int[maxSize];
		this.front = 0;
		this.rear = -1;
		this.numItems = 0;
	}

	public void insert(int n){
		if(rear==maxSize-1)
			rear=-1;	//wraparound if needed
		rear++; 		//increment rear
        elements[rear] = n;	//Inert item in array
        numItems++;		//Increment num items
    }

    public int remove()
    {
	    int ret = elements[front];	//Get element to return
	    front++;			//Increment front
	    if(front==maxSize)		//Wraparound if needed
	    	front=0;
    	numItems--;
	    return ret;
    }

    public int peek()
    {
	    return elements[front];
    }

    public boolean isEmpty()
    {
	    return numItems==0;
    }

    public boolean isFull()
    {
	    return numItems==maxSize;
    }

    public int size()
    {
	    return numItems;
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        if(queue.peek()==1)
            System.out.println("QUEUE PEEK TEST PASSED");
        if(queue.isFull()==true)
            System.out.println("QUEUE IS FULL TEST PASSED");
        if(queue.isEmpty()==false)
            System.out.println("QUEUE IS EMPTY TEST PASSED");
        if(queue.remove()==1)
            System.out.println("QUEUE REMOVE TEST PASSED");
        if(queue.size()==4)
            System.out.println("QUEUE SIZE TEST PASSED");
        if(queue.remove()==2 && queue.remove()==3 && 
        queue.remove()==4 && queue.remove()==5)
            System.out.println("QUEUE REMOVE TEST PASSED");
        if(queue.isEmpty()==true)
            System.out.println("QUEUE IS EMPTY TEST PASSED");
    }
}
