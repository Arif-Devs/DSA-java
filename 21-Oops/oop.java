

public class oop {
    public static void main(String args[]) {
        Pen matador = new Pen();
        matador.setColor("black");
        matador.setTip(5);
        matador.setPrice(10);
        System.out.println(matador.getColor());
        System.out.println(matador.getTip());
        System.out.println(matador.getPrice());


    }
}

class Pen {
    private String color;
    private int tip;
    private int price;
    //Setter
    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }

    void setPrice(int price) {
        this.price = price;

    }
    //Getter
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    int getPrice() {
        return this.price;
    }
}
