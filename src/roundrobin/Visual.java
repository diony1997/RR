/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundrobin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Samsung
 */
public class Visual extends javax.swing.JFrame {

    /**
     * Creates new form Visual
     */
    Escalonador round;
    File arquivoEntrada = new File("Entrada.txt");
    File arquivoSaida = new File("Saida.txt");

    public Visual() {
        initComponents();
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoIO = new javax.swing.ButtonGroup();
        labelQuantum = new javax.swing.JLabel();
        textoQuantum = new javax.swing.JTextField();
        botaoQuantum = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTabela = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaFinal = new javax.swing.JTextArea();
        botaoExec = new javax.swing.JButton();
        labelDados = new javax.swing.JLabel();
        labelQuantumFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelQuantum.setText("Insira O Quantum");

        textoQuantum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoQuantumMouseClicked(evt);
            }
        });

        botaoQuantum.setText("Confirmar");
        botaoQuantum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoQuantumActionPerformed(evt);
            }
        });

        areaTabela.setColumns(20);
        areaTabela.setRows(5);
        jScrollPane1.setViewportView(areaTabela);

        areaFinal.setColumns(20);
        areaFinal.setRows(5);
        jScrollPane2.setViewportView(areaFinal);

        botaoExec.setText("Executar");
        botaoExec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExecActionPerformed(evt);
            }
        });

        labelDados.setText("PID | Duração | Chegada | IO | Espera | TurnAround");

        labelQuantumFinal.setText("Quantum");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textoQuantum)
                        .addComponent(labelQuantum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(botaoQuantum))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExec, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDados, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelQuantumFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(labelDados, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoExec, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelQuantumFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoQuantum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoQuantumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoQuantumActionPerformed
        // TODO add your handling code here:
        round = new Escalonador(Integer.parseInt(textoQuantum.getText()));
        botaoQuantum.setVisible(false);
        labelQuantum.setVisible(false);
        textoQuantum.setVisible(false);
        labelDados.setVisible(true);
        labelQuantumFinal.setVisible(true);
        botaoExec.setVisible(true);
        areaTabela.setVisible(true);
        areaFinal.setVisible(true);
        labelQuantumFinal.setText("Quantum : " + round.getQuantum());
    }//GEN-LAST:event_botaoQuantumActionPerformed

    private void textoQuantumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoQuantumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textoQuantumMouseClicked

    private void botaoExecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExecActionPerformed
        // TODO add your handling code here:
        String processos[] = lerArquivo().split("\n\n");
        for (int i = 0; i < processos.length; i++) {
            String dados[] = processos[i].split("\n");
            String nome;
            int tamanho,io[],chegada;
            nome = dados[0];
            tamanho = Integer.parseInt(dados[1]);
            chegada = Integer.parseInt(dados[2]);
            if(dados[3].equalsIgnoreCase("sim")){
                String ios[] = dados[4].split(" ");
                int IO[] = new int[ios.length];
                for (int j = 0; j < ios.length; j++) {
                    IO[j] = Integer.parseInt(ios[j]);
                }
                io = IO;
                round.adicionar(new Processo(nome,tamanho,chegada,io));
            } else {
                round.adicionar(new Processo(nome,tamanho,chegada));
            }
        }
        areaFinal.setText(round.imprimir());
        areaTabela.setText(round.imprimirTabela());
        salvarArquivo();
    }//GEN-LAST:event_botaoExecActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visual().setVisible(true);
            }
        });

    }

    public void iniciar() {
        labelDados.setVisible(false);
        labelQuantumFinal.setVisible(false);
        botaoExec.setVisible(false);
        areaTabela.setVisible(false);
        areaFinal.setVisible(false);

        
    }
    public String lerArquivo(){
        String saida ="";
        try (FileReader reader = new FileReader(arquivoEntrada);BufferedReader leitor = new BufferedReader(reader)) {
            
            String checar;
            while((checar = leitor.readLine()) != null){
                
                saida += checar+"\n";
            }
            
        } catch (Exception e) {
            System.out.println("Problema na Entrada de Processos :\n"+e);
        }
        return saida;
    } 
    
    public void salvarArquivo(){
        try (FileWriter writer = new FileWriter(arquivoSaida);BufferedWriter escritor = new BufferedWriter(writer)) {
            String imprimir [] = areaFinal.getText().split("\n");
            for (int i = 0; i < imprimir.length; i++) {
                escritor.write(imprimir[i]);
                escritor.newLine();
            }
            escritor.flush();
        } catch (Exception e) {
            System.out.println("Problema na Saida de Processos :\n"+e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaFinal;
    private javax.swing.JTextArea areaTabela;
    private javax.swing.JButton botaoExec;
    private javax.swing.JButton botaoQuantum;
    private javax.swing.ButtonGroup grupoIO;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDados;
    private javax.swing.JLabel labelQuantum;
    private javax.swing.JLabel labelQuantumFinal;
    private javax.swing.JTextField textoQuantum;
    // End of variables declaration//GEN-END:variables
}
