package roundrobin;

public class Escalonador 
{
    private int quantum;
    private Fila filaPrincipal;
    public Escalonador(int quantum)
    {
        this.quantum = quantum;
        filaPrincipal = new Fila();
    }
     
     public void adicionar (Processo p)
    {
        filaPrincipal.enqueue(p);
    }
     
   
    public String executar()
    {
        String saida = "";
        
        
        return saida;
    }
     
     public String imprimir()
     {
         String saida = "*************************************** \n"  +
                        "******* Escalonador Round-Robin ******* \n"  +
                        "*************************************** \n\n";
        
        
        return saida;
     }
}
