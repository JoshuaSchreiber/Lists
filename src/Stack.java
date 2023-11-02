public class Stack {
    private Knoten knoten;
    public Stack(){

    }

    public void add(Knoten k){
        k.setNext(knoten);
        knoten = k;
    }

    public Knoten remove() {
        if (knoten == null) {
            return new Knoten(new Element("Empty"));
        }
        Knoten k = knoten;
        knoten = knoten.getNext();
        k.setNext(null);
        return k;
    }

    public Knoten getKnoten(){
        return knoten;
    }

}
