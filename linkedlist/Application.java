public class Application {

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        System.out.println(list.toString());
        list.delete(3);
        System.out.println("--------------------");
        System.out.println(list.toString());
        System.out.println("--------------------");
        System.out.println("FIND 2 : " + list.find(2));
        System.out.println("--------------------");
        System.out.println("FIND 3 : " + list.find(3));
    }
    
}
