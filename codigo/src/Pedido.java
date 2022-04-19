public class Pedido {

    private int id;
    private Cliente cliente;
    private int segundos;

    public Pedido(int id, Cliente cliente, int segundos){
        setId(id);
        setCliente(cliente);
        setSegundos(segundos);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    // fazer lista de pedidos aqui public Pedidos
    public void gerarPedido(Pacote pacote){

    }
}
