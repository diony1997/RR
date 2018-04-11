package roundrobin;

public class Escalonador {

    private int quantum;
    private Fila filaPrincipal, filaSecundaria;

    public Escalonador(int quantum) {
        this.quantum = quantum;
        filaPrincipal = new Fila();
        filaSecundaria = new Fila();
    }

    public void adicionar(Processo p) {
        filaPrincipal.enqueue(p);
    }

    public String executar() {
        String saida = "", fila, cpu, tempo, chegada;
        int contador = 0;
        //Processos Restantes
        int pR = filaPrincipal.getTamanho();

        while (pR > 0) {
            Processo atual = null;
            Processo anterior = null;
            for (int i = 0; i < quantum; i++) {
                No ordem = filaPrincipal.peekPrimeiro();
                chegada = "";
                while (ordem != null) {
                    if (ordem.getP().getChegada() == contador) {
                        filaSecundaria.enqueue(ordem.getP());
                        chegada = " Chegada do " + ordem.getP().getNome();
                    }
                    ordem = ordem.getProximo();
                }

                if (atual == null) {
                    atual = filaSecundaria.dequeue();
                    anterior = atual;
                }
                if (atual != null) {
                    fila = "\nFila: " + filaSecundaria.showFila();
                    cpu = "\nCPU: " + atual.toString();
                    atual.procesar();
                    System.out.println("Processou");
                    if (atual.hasIo()) {
                        tempo = "Tempo: " + contador + "  Operação de I/O " + atual.getNome();
                        filaSecundaria.enqueue(atual);
                        saida += tempo + chegada + "\n" + fila + "\n" + cpu + "\n\n";
                        contador++;

                        break;
                    } else if (atual.isFinished()) {
                        tempo = "Tempo: " + contador + " Fim do " + atual.getNome();
                        pR--;
                        saida += tempo + chegada + fila + cpu + "\n\n";
                        contador++;
                        break;
                    } else {
                        tempo = "Tempo: " + contador;
                        saida += tempo + chegada + fila + cpu + "\n\n";
                        contador++;

                    }
                } else {
                    tempo = "Tempo: " + contador;
                    saida += tempo + chegada + "\nFila: " + filaSecundaria.showFila() + "\nCPU: " + atual.toString() + "\n\n";
                    contador++;
                }
            }
            atual = null;
        }
        return saida;
    }

    public String imprimir() {
        String saida = "*************************************** \n"
                + "******* Escalonador Round-Robin ******* \n"
                + "*************************************** \n\n";
        saida += executar() + "FIM";

        return saida;
    }
}
