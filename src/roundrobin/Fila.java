package roundrobin;

public class Fila 
{
    private No primeiro,ultimo;
    private int tamanho;
    
    public Fila()
    {
        primeiro = ultimo = null;
        tamanho = 0;
    }
    
    public boolean isEmpty()
    {
        return (primeiro == null);
    }
    
    public void enqueue(Processo p1)
    {
        No novo = new No(p1);
        if(isEmpty())
        {
            primeiro = ultimo = novo;
        }
        else
        {
            ultimo.setProximo(novo);
            ultimo = novo;
        }
        tamanho++;
    }
    
    public Processo dequeue()
    {
        Processo p1 = primeiro.getP();
        if(primeiro == ultimo)
        {
            primeiro = ultimo = null;
        }
        else
        {
            primeiro = primeiro.getProximo();
        }
        tamanho--;
        return p1;
    }
    
    public String showFila()
    {
        String saida = "";
        No atual = primeiro;
        while(atual.getProximo()!=null)
        {
            saida+=atual.toString();
            atual=atual.getProximo();
        }
        return saida;
    }
    
    public int getTamanho()
    {
        return tamanho;
    }
    
}
