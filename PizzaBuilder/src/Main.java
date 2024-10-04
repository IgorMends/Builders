import builder.PizzaBuilder;
import entidades.Pizza;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new PizzaBuilder().setIngrediente("Tomate").setMassa("Leve").setTamanho("G").build();

        System.out.println(pizza.toString());
    }
}