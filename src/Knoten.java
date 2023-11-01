public class Knoten {
    private int number;
    private Element element;
    private Knoten next;
    private Knoten previous;

    public Knoten(Element element){
        this.element = element;
    }

    public Knoten getNext() {
        return next;
    }

    public void setNext(Knoten next) {
        this.next = next;
    }

    public Knoten getPrevious() {
        return previous;
    }

    public void setPrevious(Knoten previous) {
        this.previous = previous;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
