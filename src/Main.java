public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        String one = "1";
        Element element1 = new Element(one);
        Knoten knoten1 = new Knoten(element1);
        queue.add(knoten1);

        String two = "2";
        Element element2 = new Element(two);
        Knoten knoten2 = new Knoten(element2);
        queue.add(knoten2);

        String three = "3";
        Element element3 = new Element(three);
        Knoten knoten3 = new Knoten(element3);
        queue.add(knoten3);

        System.out.println(queue.getKnoten().getElement().getContent());
        System.out.println(queue.getKnoten().getNext().getElement().getContent());
        System.out.println(queue.getKnoten().getNext().getNext().getElement().getContent());

        System.out.println(queue.remove().getElement().getContent());
        System.out.println(queue.remove().getElement().getContent());
        System.out.println(queue.remove().getElement().getContent());
    }
}