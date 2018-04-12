package roundrobin;

public class Escalonador 
{

    private int quantum;
    private Fila filaPrincipal, filaSecundaria;

    public Escalonador(int quantum) 
    {
        this.quantum = quantum;
        filaPrincipal = new Fila();
        filaSecundaria = new Fila();
    }

    public void adicionar(Processo p) 
    {
        filaPrincipal.enqueue(p);
    }

    public String executar() 
    {
        String saida = "", fila, cpu, tempo, chegada, terminio = "", io = "";
        int contador = 0;
        //Processos Restantes
        int pR = filaPrincipal.getTamanho();
        while (pR > 0) 
        {
            Processo atual = null;
            //Repetição do Quantum
            for (int i = 0; i < quantum; i++) 
            {
                No ordem = filaPrincipal.peekPrimeiro();
                chegada = "";
                //Conferi se tem algum processo para entrar nesse momento do contador
                while (ordem != null) 
                {
                    if (ordem.getP().getChegada() == contador) 
                    {
                        filaSecundaria.enqueue(ordem.getP());
                        chegada = " Chegada do " + ordem.getP().getNome();
                    }
                    ordem = ordem.getProximo();
                }
                //Retira o primeiro processo da fila
                if (atual == null) 
                {
                    atual = filaSecundaria.dequeue();
                }
                //adiciona os dados a saida e retira um do tamanho do processo
                fila = "\nFila: " + filaSecundaria.showFila();
                cpu = "\nCPU: " + atual.toString();
                atual.procesar();
//                System.out.println("Processou");
                //Confere se ha io,se tiver acrescenta o processo de volta a fila
                if (atual.hasIo()) 
                {
                    tempo = "Tempo: " + contador;
                    io = "  Operação de I/O " + atual.getNome();
                    filaSecundaria.enqueue(atual);
                    saida += tempo + chegada + fila + cpu + "\n\n";
                    contador++;
                    atual = null;
                    break;
                }
                //Confere se terminou o processo, se sim diminui os processos restantes
                if (atual.isFinished()) 
                {
                    tempo = "Tempo: " + contador;
                    pR--;
                    terminio = " Fim do " + atual.getNome();
                    saida += tempo + chegada + fila + cpu + "\n\n";
                    contador++;
                    //Se acabou tudo imprimi os ultimos dados
                    if (filaSecundaria.isEmpty()) 
                    {
                        tempo = "Tempo: " + contador + " Fim do " + atual.getNome();
                        saida += tempo + chegada + fila + "\n\n";
                    }
                    break;
                }
                tempo = "Tempo: " + contador;
                //ifs para dizer se houve io ou se terminou o processo passado
                if (!terminio.equals("")) 
                {
                    tempo = "Tempo: " + contador + terminio;
                    terminio = "";
                }
                if (!io.equals("")) 
                {
                    tempo = "Tempo: " + contador + io;
                    io = "";
                }
                saida += tempo + chegada + fila + cpu + "\n\n";
                contador++;
                //se alcançou o fim do quantum coloca o processo na fila
                if (i == quantum - 1) 
                {
                    filaSecundaria.enqueue(atual);
                }
            }
            atual = null;
        }
        return saida;
    }

    public String imprimir() 
    {
        String saida = "*************************************** \n"
                + "******* Escalonador Round-Robin ******* \n"
                + "*************************************** \n\n";
        saida += executar() + "FIM";
        return saida;
    }
}
