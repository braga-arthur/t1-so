class ListaPedidos{
    private CelulaPedidos primeiro;
    private CelulaPedidos ultimo;

    public ListaPedidos(){
        primeiro = new CelulaPedidos();
        primeiro = ultimo;
    }

    public void inserirNoFinal(Pedido request){
        CelulaPedidos aux = new CelulaPedidos();
        ultimo.setProximo(aux);
        aux.setItem(request);
        ultimo = ultimo.getProximo();

    }
    
    public Pedido retirar(int id){
        CelulaPedidos aux , anterior;
        anterior = primeiro;
        aux = primeiro.getProximo();

        while (aux!=null){
            if(aux.getItem().getId() == id){
                anterior.setProximo(aux.getProximo());
                if(aux==ultimo){
                    ultimo=anterior;
                }
                return aux.getItem();
            } else{
                anterior = aux;
                aux = aux.getProximo();
            }
        }
        return null;
    }

    public Pedido localizar(int id){
        CelulaPedidos aux;
        aux = primeiro.getProximo();

        while(aux!=null){
            if(aux.getItem().getId() == id){
                return aux.getItem();
            }else{
                aux = aux.getProximo();
            }
        }
        return null;
    }

    public boolean listaVazia(){
       
        if(ultimo == primeiro){
            return true;
        }else{
            return false;
        }
    }

}