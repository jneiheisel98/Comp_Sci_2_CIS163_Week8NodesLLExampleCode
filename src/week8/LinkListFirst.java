package week8;

import java.util.ArrayList;

public class LinkListFirst<E> {
    private Node top;


    public LinkListFirst() {
        top = null;
    }

    // too easy for final exam
    public void addfirst(String data) {
        Node temp = new Node();
        temp.setData(data);
        temp.setNext(top);
        top = temp;
    }

    // too easy for final exam
    public void addBottom(String data) {
            // case 0 : no list
            if (top == null)
                top = new Node (data, null);

            // case 1: the list exist
            else {
                Node temp = top;
                while (temp.getNext() != null)
                    temp = temp.getNext();

                temp.setNext(new Node(data, null));

            }
    }



    public void display() {
//		System.out.println(top.getData());
//		System.out.println(top.getNext().getData());
//		System.out.println(top.getNext().getNext().getData());

        Node temp = top;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    // too easy for final exam
    public int size() {
        int total = 0;

        Node temp = top;
        while (temp != null) {
            total++;
            temp = temp.getNext();
        }

       return total;
    }

    // Example of a Lab exam question.
    public boolean addAt (String data, int index) {
        // write this

        return false;
    }



    public static void main(String[] args) {
        LinkListFirst list = new LinkListFirst();

//        list.addfirst("pizza4");
//        list.addfirst("pizza3");
//        list.addfirst("pizza2");
//        list.addfirst("pizza1");
//        list.addfirst("pizza0");

        list.addBottom("pizza4"); //case 0
        list.addBottom("pizza3"); // case 1
        list.addBottom("pizza2");
        list.addBottom("pizza1");
        list.addBottom("pizza0");
        list.display();

    }

}

