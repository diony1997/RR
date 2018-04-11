package roundrobin;

public class RoundRobin 
{

    public static void main(String[] args) 
    {
        int quantum = 2;
        
    Escalonador t1000 = new Escalonador(quantum);    

    String nome = "Nome 1";
    int tamanho = 10;
    int chegada = 0;
    char io ='n';
    if(io=='s')
    {
        int entradas[] = {0,2};
        t1000.adicionar(new Processo(nome,tamanho,chegada,entradas));
    }
    t1000.adicionar(new Processo(nome,tamanho,chegada));
    
    
    
    
    }
    
    
}
