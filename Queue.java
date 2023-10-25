public class Queue {
    Node first;
    Node last;

    public Queue() {first=null;last=null;}
    public void enqueue(Object pContent) {
        Node newEntry = new Node(pContent);
        if(self.isEmpty()) {
            first = newEntry;
            last = newEntry;
            return;
        }
        last.setNext(newEntry);
        last = newEntry;
    }
    public void dequeue() {
        if(self.isEmpty()) return;
        if(first == last) last = null;
        first = first.getNext();
    }
    public Object first() {
        return first.getContent();
    }
    public boolean isEmpty() {
        return first == null;
    }
}
