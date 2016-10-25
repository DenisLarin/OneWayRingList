package ru.larin.oneWayRingList;

/**
 * Created by mrden on 24.10.2016.
 */
public class RingList {
    private Node first;
    private Node start;
    private Node end;

    public RingList() {
        this.first = null;
        this.start = null;
        end = null;
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else return false;
    }

    public void add(Object object) {
        Node node = new Node(object);
        if (isEmpty()) {
            first = node;
            end = node;
            start = node;
            node.setNextElementLink(end);
        } else {
            first = node;
            end.setNextElementLink(first);
            end = first;
            if (first.getNextElementLink() == null) {
                first.setNextElementLink(start);
            }
        }
    }

    public void print() {
        if(!isEmpty()) {
            Node node = start;
            Node ringtemp = first.getNextElementLink();
            do {
                System.out.println(node.getData().toString());
                node = node.getNextElementLink();
            } while (node != ringtemp);
        }
    }

    public int size() {
        int returnSize = 0;
        if(!isEmpty()) {
            Node node = start;
            Node ringtemp = first.getNextElementLink();
            do {
                returnSize++;
                node = node.getNextElementLink();
            } while (node != ringtemp);
        }
        return returnSize;
    }
    public Node removeFirst(){
        if(!isEmpty()) {
            Node removenode = start;
            start = removenode.getNextElementLink();
            removenode.setNextElementLink(null);
            end.setNextElementLink(start);
            if(removenode == end){
                start = null;
                first = null;
                end = null;
            }
            return removenode;
        }
        return null;
    }
    public void cleanList(){
        while (!isEmpty()){
            removeFirst();
        }
    }
}
