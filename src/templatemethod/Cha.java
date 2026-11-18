
package templatemethod;

public class Cha extends Bebida {

    @Override
    protected void adicionarIngrediente() {
        System.out.println("Colocando o chá em infusão...");
    }

    @Override
    protected void adicionarComplemento() {
        System.out.println("Adicionando limão ao chá...");
    }
}
