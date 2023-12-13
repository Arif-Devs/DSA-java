



public class Abstruct {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Tiger t = new Tiger();
        t.eat();
        t.walk();
        System.out.println(t.color);
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "black";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "white";
    }
    void walk() {
        System.out.println("horse run faster");
    }
}

class Tiger extends Animal {
    void changeColor() {
        color = "brown and black mix";
    }
    void walk() {
        System.out.println("cheta run faster then horse");
    }
}
