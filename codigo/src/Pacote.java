public class Pacote {

    private int id;
    private Produto[] produtos;

    public Pacote(int id, Produto produtos[]){
        setId(id);
        setProdutos(produtos);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produto) {
        this.produtos = produto;
    }
}
