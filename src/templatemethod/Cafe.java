
package templatemethod;

public class Cafe extends Bebida {

    @Override
    protected void adicionarIngrediente() {
        System.out.println("Adicionando pó de café...");
    }

    @Override
    protected void adicionarComplemento() {
        System.out.println("Adicionando açúcar ao café...");
    }
}
