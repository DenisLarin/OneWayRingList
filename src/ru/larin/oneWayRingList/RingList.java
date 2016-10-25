package ru.larin.oneWayRingList;

/**
 * Created by mrden on 24.10.2016.
 */
public class RingList {
    private Node first;
    private Node start;

    public RingList() {
        this.first = null;
        this.start = null;
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else return false;
    }

    public void add(Object object) {
        Node node = new Node(object);
        if(isEmpty()){
            start = node;
            first = node;
        }
        else {
            first.setNextElementLink(node);
            first = node;
        }
        if (node.getNextElementLink() == null) {
            node.setNextElementLink(start);
        }
    }
    public void printRightToLeft(){
        if(!isEmpty()){
            Node node = start;
            do{
                System.out.println(node.getData().toString());
                node = node.getNextElementLink();
            }while (node!=first.getNextElementLink());
        }
    }

    public int size() {
        int returnSize = 0;
        if (!isEmpty()) {
            Node node = start;
            do {
                returnSize++;
                node = node.getNextElementLink();
            } while (node != first.getNextElementLink());
        }
        return returnSize;
    }

    public Node removeFirst() {
        if (!isEmpty()) {
            Node removenode = start;
            start = removenode.getNextElementLink();
            removenode.setNextElementLink(null);
            first.setNextElementLink(start);
            if (removenode == first) {
                start = null;
                first = null;
            }
            return removenode;
        }
        return null;
    }

    public void cleanList() {
        while (!isEmpty()) {
            removeFirst();
        }
    }
}
