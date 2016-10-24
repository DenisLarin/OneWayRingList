package ru.larin.oneWayRingList;

/**
 * Created by mrden on 24.10.2016.
 */
public class Node {
    private Object data;
    private Node nextElementLink;

    public Node(Object data){
        this.data = data;
    }

    public Node getNextElementLink() {
        return nextElementLink;
    }

    public void setNextElementLink(Node nextElementLink) {
        this.nextElementLink = nextElementLink;
    }

    public Object getData() {
        return data;
    }
}
