public class Main {
    public static void main(String[] args) {
        stackTesting2();
    }

    public static void stackTesting1(){
        Stack stack = new Stack();

        String one = "1";
        Element element1 = new Element(one);
        Knoten knoten1 = new Knoten(element1);
        stack.add(knoten1);

        String two = "2";
        Element element2 = new Element(two);
        Knoten knoten2 = new Knoten(element2);
        stack.add(knoten2);

        String three = "3";
        Element element3 = new Element(three);
        Knoten knoten3 = new Knoten(element3);
        stack.add(knoten3);

        System.out.println(stack.getKnoten().getNext().getNext().getElement().getContent());
        System.out.println(stack.getKnoten().getNext().getElement().getContent());
        System.out.println(stack.getKnoten().getElement().getContent());

        System.out.println("---");

        System.out.println(stack.remove().getElement().getContent());
        System.out.println(stack.remove().getElement().getContent());
        System.out.println(stack.remove().getElement().getContent());
        System.out.println(stack.remove().getElement().getContent());
    }

    public static void stackTesting2(){
        Stack stack = new Stack();
        for(int i = 0; i < 30; i++){
            Element element = new Element(String.valueOf(i));
            Knoten knoten = new Knoten(element);
            stack.add(knoten);
            System.out.println(element.getContent());
        }
        System.out.println("---");
        for(int i = 0; i < 30; i++){
            System.out.println(stack.remove().getElement().getContent());
        }
        
    }
}