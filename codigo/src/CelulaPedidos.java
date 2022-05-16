
class CelulaPedidos{
    private Pedido item;
    private CelulaPedidos proximo;

    CelulaPedidos(){
        item = new Pedido(0, null, 0);
        proximo = null;
    }

    public void setProximo(CelulaPedidos proximo){
        this.proximo = proximo;
    }
    public CelulaPedidos getProximo(){
        return proximo;
    }
    public void setItem(Pedido item){
        this.item = item;
    }
    public Pedido getItem(){
        return item;
    }
}