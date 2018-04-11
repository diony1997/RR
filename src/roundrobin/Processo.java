package roundrobin;


public class Processo 
{
    
    private int tamanho;
    private String nome;
    private int chegada;
    private int[] io;
    private int saida;
    
    public Processo(String nome,int tamanho,int chegada)
    {
        this.tamanho = tamanho;
        this.nome = nome;
        this.chegada = chegada;
    }
    
     public Processo(String nome,int tamanho,int chegada,int[] io)
    {
        this.tamanho = tamanho;
        this.nome = nome;
        this.chegada = chegada;
        this.io = io;
    }
    
    public boolean isFinished()
    {
        return (tamanho<=0);
    }
    
    public void procesar()
    {
        tamanho--;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getTamanho()
    {
        return tamanho;
    }
    
    public int getChegada()
    {
        return chegada;
    }
    
    public int getSaida()
    {
        return saida;
    }
    
    public void setIo(int[] entradas)
    {
       this.io = entradas;
    }
    
    public int[] getIo()
    {
        return io;
    }
    
    public boolean hasIo()
    {
        for (int i = 0; i < io.length; i++) {
            if(io[i]!=0)
            {
                return true;
            }
        }
        return false;
    }
    
    public void setSaida(int saida)
    {
        this.saida = saida;
    }

    @Override
    public String toString(){
        return nome+"("+tamanho+")  ";
    }
}
