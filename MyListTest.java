public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(4,10);
        System.out.println(myList.size());
        System.out.println(myList.remove(4));
        if(myList.contains(5))
        {
            System.out.println("True");
        }
        System.out.println(myList.indexOf(5));

    }
}
