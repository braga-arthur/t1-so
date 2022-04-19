public class Produto {

    private int id;
    private int lote;

    public Produto(int id, int lote){
        setId(id);
        setLote(lote);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }
}
