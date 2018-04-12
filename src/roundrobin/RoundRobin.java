package roundrobin;

public class RoundRobin 
{

    public static void main(String[] args) 
    {
    int quantum = 4;
        
    Escalonador t1000 = new Escalonador(quantum);    

    String nome = "Processo1";
    int tamanho = 6;
    int chegada = 0;
    int[] n = {2};
//    char io ='n';
//    if(io=='s')
//    {
//        int entradas[] = {0,2};
//        t1000.adicionar(new Processo(nome,tamanho,chegada,entradas));
//    }
    t1000.adicionar(new Processo(nome,tamanho,chegada,n));
    t1000.adicionar(new Processo("Processo2",8,1));
    System.out.println(t1000.imprimir());
    
    
    }
    
    
}
