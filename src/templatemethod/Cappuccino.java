
package templatemethod;

public class Cappuccino extends Bebida {

    @Override
    protected void adicionarIngrediente() {
        System.out.println("Preparando expresso com leite...");
    }

    @Override
    protected void adicionarComplemento() {
        System.out.println("Adicionando canela e chocolate em pó...");
    }
}