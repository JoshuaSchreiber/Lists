public class Queue {
    private Knoten knoten;
    public Queue(){

    }

    public void add(Knoten k){
        k.setNext(knoten);
        knoten = k;
    }

    public Knoten remove(){

        knoten = knoten.getNext();
        return knoten;
    }

    public Knoten getKnoten(){
        return knoten;
    }

}
