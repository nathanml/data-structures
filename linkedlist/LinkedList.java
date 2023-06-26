import java.util.Objects;

public class LinkedList{
    private Link head;

    public Link getHead()
    {
        return head;
    }

    public void setHead(Link head)
    {
        this.head = head;
    }

    public String toString()
    {
        return "LINKEDLIST -> " + head.toString();
    }

    //Insert data at the head of the list
    public void insert(int data)
    {
        Link newLink = new Link();
        newLink.setData(data);
        newLink.setNext(head);
        head = newLink;
    }

    //Find
    public Link find(int key)
    {
        //If linked list is null, return null
        if(Objects.isNull(this))
            return null;
        Link current = head;
        while(current.getData() != key)
        {
                        //If object not found in list, return null

            if(Objects.isNull(current.getNext()))
                return null;
            else current = current.getNext();
        }
        return current;
    }

    //DELETE
    public Link delete(int key)
    {
        //If linked list is null, return null
        if(Objects.isNull(this))
            return null;
        Link currentLink = head;
        Link previousLink = head;

        //Searching for link to delete
        while(currentLink.getData() != key)
        {
            //If object not found in list, return null
            if(Objects.isNull(currentLink.getNext()))
                return null;
            else{
                previousLink = currentLink;
                currentLink = currentLink.getNext();
            }
        }

        //LINK FOUND! Deleting from list and returning
        if(currentLink==head)
            head = head.getNext();
        else{
            previousLink.setNext(currentLink.getNext());
        }
        return currentLink;
    }
}