public class Node {
    private Node next;
    private Object content;

    public Node(Object pContent) {
        next = null;
        content = pContent;
    }
    public Object getContent() {return content;}
    public void setNext(Node pNext) {next = pNext;}
    public Node getNext() {return next;}
