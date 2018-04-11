package roundrobin;

public class No 
{
    private No proximo;
    private Processo p;
    
    public No(Processo p)
    {
        proximo = null;
        this.p = p;
    }

    public No(Processo p,No proximo)
    {
        this.p=p;
        this.proximo=proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getProximo() {
        return proximo;
    }

    public Processo getP() {
        return p;
    }
    
    
}
