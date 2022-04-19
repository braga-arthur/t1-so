public class Esteira {

    private int id;
    private int velocidade;
    private Braco braco;

    public Esteira (int id, int velocidade, Braco braco){
        setId(id);
        setVelocidade(velocidade);
        setBraco(braco);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Braco getBraco() {
        return braco;
    }

    public void setBraco(Braco braco) {
        this.braco = braco;
    }

    public void moverFrente(int centimentos){
        // to be implemented (nao mexer por agora)
    }

    public void moverTras(int centimentos){
        // to be implemented (nao mexer por agora)
    }

}
