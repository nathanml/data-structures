import java.util.Objects;

public class Link{
    private int data;
    private Link next;

    public int getData()
    {
        return data;
    }
     
    public void setData(int data)
    {
        this.data = data;
    }

    public Link getNext()
    {
        return next;
    }
     
    public void setNext(Link next)
    {
        this.next = next;
    }

    public String toString()
    {
        return "DATA : " + data + 
            (Objects.nonNull(next) ? " \nNEXT-> " + next.toString() : "");
    }
}