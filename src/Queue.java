public class Queue {
    private Knoten knoten;
    public Queue(){

    }

    public void add(Knoten k){
        k.setNext(knoten);
        knoten = k;
    }

    public Knoten remove(){
        Knoten k = knoten;
        knoten = knoten.getNext();
        return k;
    }

    public Knoten getKnoten(){
        return knoten;
    }

}
