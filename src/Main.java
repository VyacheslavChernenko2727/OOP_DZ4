import gb_collections.Gblist;
import gb_collections.lists.GbLinkedList;

public class Main {
    public static void main(String[] args) {
        Gblist<Integer> Linkedlist = new GbLinkedList<>();
        Linkedlist.add(257);
        Linkedlist.add(53);
        Linkedlist.add(5);
        Linkedlist.add(4657);
        Linkedlist.add(47);
        Linkedlist.removeByIndex(3);
        System.out.println(Linkedlist);
    }
}