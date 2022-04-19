public class Pacote {

    private int id;
    private Produto produto;

    public Pacote(int id, Produto produto){
        setId(id);
        setProdutos(produto);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProdutos() {
        return produto;
    }

    public void setProdutos(Produto produto) {
        this.produto = produto;
    }
}
