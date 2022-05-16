public class Esteira {

    private int id;
    private int velocidade;

    public Esteira (int id, int velocidade){
        setId(id);
        setVelocidade(velocidade);
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

    public void moverFrente(int centimentos){
        // to be implemented (nao mexer por agora)
    }

    public void moverTras(int centimentos){
        // to be implemented (nao mexer por agora)
    }

}
