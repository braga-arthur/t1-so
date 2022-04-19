public class Pedido {

    private int id;
    private Cliente cliente;

    public Pedido(int id, Cliente cliente){
        setId(id);
        setCliente(cliente);
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

    // fazer lista de pedidos aqui public Pedidos
    public void gerarPedido(Pacote pacote){

    }
}
