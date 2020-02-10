
class Main {
    public static void main(String[] args) {

        MyList<Integer> myList1 = new MyList<>();
        myList1.addLast(111);
        myList1.addLast(222);
        myList1.addLast(333);
        System.out.println("my list 1: " + myList1);

        MyList<String> myList2 = new MyList<>();
        myList2.insertFirst("abc");
        myList2.insertFirst("def");
        myList2.insertFirst("ghj");
        System.out.println("my list 2: " + myList2);


    }
}
