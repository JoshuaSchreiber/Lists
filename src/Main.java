public class Main {
    public static void main(String[] args) {
        stackTesting1();
    }

    public static void stackTesting1(){
        Stack stack = new Stack();

        stack.add(1);
        stack.add(2);
        stack.add(3);

        System.out.println(stack.getKnoten().getNext().getNext().getElement().getContent());
        System.out.println(stack.getKnoten().getNext().getElement().getContent());
        System.out.println(stack.getKnoten().getElement().getContent());

        System.out.println("---");
        // System.out.println(stack.peek().getElement().getContent());
        // .peak does not function
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