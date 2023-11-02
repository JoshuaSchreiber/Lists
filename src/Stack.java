public class Stack {
    private Knoten knoten;
    public Stack(){

    }

    public void add(Object object){
        Element element1 = new Element(object);
        Knoten k = new Knoten(element1);
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

    public Knoten peek(){ // .peak does not function
        Knoten k = knoten;
        k.setNext(null);
        return k;
    }

}
