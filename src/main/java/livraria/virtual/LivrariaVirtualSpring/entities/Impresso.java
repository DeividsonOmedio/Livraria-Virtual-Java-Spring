package livraria.virtual.LivrariaVirtualSpring.entities;

public class Impresso extends Livro{
    private float frete;
    private int estoque;

    public float getFrete() {
        return frete;
    }

    public void setFrete(float frete) {
        this.frete = frete;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
