public class Braco {

    private int id;
    private Esteira esteira;

    public Braco(int id,Esteira esteira){
        setId(id);
        setEsteira(esteira);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pacote embalar(Produto[] produtos){
        Pacote pacote = new Pacote(1,produtos);
        return pacote;
    }

    public Produto[] desembalar(Pacote pacote){

        return pacote.getProdutos();

    }

    public Esteira getEsteira() {
        return esteira;
    }

    public void setEsteira(Esteira esteira) {
        this.esteira = esteira;
    }
}
