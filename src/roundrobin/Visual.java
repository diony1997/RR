/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundrobin;

/**
 *
 * @author Samsung
 */
public class Visual extends javax.swing.JFrame {

    /**
     * Creates new form Visual
     */
    Escalonador round;
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
        labelProcesso = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        textoDuracao = new javax.swing.JTextField();
        textoChegada = new javax.swing.JTextField();
        labelIO = new javax.swing.JLabel();
        botaoSim = new javax.swing.JRadioButton();
        botaoNao = new javax.swing.JRadioButton();
        textoIO = new javax.swing.JTextField();
        botaoAdicionar = new javax.swing.JButton();
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

        labelProcesso.setText("Novo Processo");

        textoNome.setText("Nome");
        textoNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoNomeMouseClicked(evt);
            }
        });
        textoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeActionPerformed(evt);
            }
        });

        textoDuracao.setText("Duração");
        textoDuracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoDuracaoMouseClicked(evt);
            }
        });
        textoDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDuracaoActionPerformed(evt);
            }
        });

        textoChegada.setText("Chegada");
        textoChegada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoChegadaMouseClicked(evt);
            }
        });
        textoChegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoChegadaActionPerformed(evt);
            }
        });

        labelIO.setText("Tem I/O ?");

        grupoIO.add(botaoSim);
        botaoSim.setText("Sim");
        botaoSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSimActionPerformed(evt);
            }
        });

        grupoIO.add(botaoNao);
        botaoNao.setText("Não");
        botaoNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNaoActionPerformed(evt);
            }
        });

        textoIO.setText("Ex.:2,8");
        textoIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoIOMouseClicked(evt);
            }
        });
        textoIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIOActionPerformed(evt);
            }
        });

        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoNao))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textoIO, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelIO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelProcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textoQuantum)
                                    .addComponent(labelQuantum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(botaoQuantum)))
                        .addComponent(textoNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textoDuracao, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textoChegada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelQuantumFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDados, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExec, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoQuantum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIO, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoNao)
                    .addComponent(botaoSim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoIO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoQuantumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoQuantumActionPerformed
        // TODO add your handling code here:
        round = new Escalonador(Integer.parseInt(textoQuantum.getText()));
        botaoQuantum.setVisible(false);
        labelQuantum.setVisible(false);
        textoQuantum.setVisible(false);
        botaoAdicionar.setVisible(true);
        botaoNao.setVisible(true);
        botaoSim.setVisible(true);
        labelIO.setVisible(true);
        labelProcesso.setVisible(true);
        textoChegada.setVisible(true);
        textoDuracao.setVisible(true);
        textoIO.setVisible(true);
        textoNome.setVisible(true);
        botaoSim.setSelected(true);
        labelDados.setVisible(true);
        labelQuantumFinal.setVisible(true);
        botaoExec.setVisible(true);
        areaTabela.setVisible(true);
        areaFinal.setVisible(true);
        labelQuantumFinal.setText("Quantum : "+round.getQuantum());
    }//GEN-LAST:event_botaoQuantumActionPerformed

    private void botaoNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNaoActionPerformed
        // TODO add your handling code here:
        textoIO.setVisible(false);
    }//GEN-LAST:event_botaoNaoActionPerformed

    private void botaoSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSimActionPerformed
        // TODO add your handling code here:
        textoIO.setVisible(true);
    }//GEN-LAST:event_botaoSimActionPerformed

    private void textoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_textoNomeActionPerformed

    private void textoDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDuracaoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textoDuracaoActionPerformed

    private void textoChegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoChegadaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textoChegadaActionPerformed

    private void textoIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIOActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textoIOActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        // TODO add your handling code here:
        if(botaoSim.isSelected()){
            String nome,nomes[];
            int duracao,io[],chegada;
            nome = textoNome.getText();
            duracao = Integer.parseInt(textoDuracao.getText());
            chegada = Integer.parseInt(textoChegada.getText());
            
            nomes = textoIO.getText().split(",");
            io = new int[nomes.length];
            for (int i = 0; i < nomes.length; i++) {
                io[i] =Integer.parseInt(nomes[i]);
            }
    
            round.adicionar(new Processo(nome,duracao,chegada,io));
        } else {
            String nome;
            int duracao,chegada;
            nome = textoNome.getText();
            duracao = Integer.parseInt(textoDuracao.getText());
            chegada = Integer.parseInt(textoChegada.getText());
            round.adicionar(new Processo(nome,duracao,chegada));
        }
        textoChegada.setText("Chegada");
        textoDuracao.setText("Duração");
        textoIO.setText("Ex.:2,8");
        textoNome.setText("Nome");
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void textoQuantumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoQuantumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textoQuantumMouseClicked

    private void textoNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoNomeMouseClicked
        // TODO add your handling code here:
        textoNome.setText("");
    }//GEN-LAST:event_textoNomeMouseClicked

    private void textoDuracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoDuracaoMouseClicked
        // TODO add your handling code here:
    textoDuracao.setText("");
    }//GEN-LAST:event_textoDuracaoMouseClicked

    private void textoChegadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoChegadaMouseClicked
        // TODO add your handling code here:
        textoChegada.setText("");
    }//GEN-LAST:event_textoChegadaMouseClicked

    private void textoIOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoIOMouseClicked
        // TODO add your handling code here:
        textoIO.setText("");
    }//GEN-LAST:event_textoIOMouseClicked

    private void botaoExecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExecActionPerformed
        // TODO add your handling code here:
        areaFinal.setText(round.imprimir());
        areaTabela.setText(round.imprimirTabela());
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
public void iniciar(){
        botaoAdicionar.setVisible(false);
        botaoNao.setVisible(false);
        botaoSim.setVisible(false);
        labelIO.setVisible(false);
        labelProcesso.setVisible(false);
        textoChegada.setVisible(false);
        textoDuracao.setVisible(false);
        textoIO.setVisible(false);
        textoNome.setVisible(false);
        labelDados.setVisible(false);
        labelQuantumFinal.setVisible(false);
        botaoExec.setVisible(false);
        areaTabela.setVisible(false);
        areaFinal.setVisible(false);
        }
public void checar(boolean erro){
    if(erro==true){
        
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaFinal;
    private javax.swing.JTextArea areaTabela;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoExec;
    private javax.swing.JRadioButton botaoNao;
    private javax.swing.JButton botaoQuantum;
    private javax.swing.JRadioButton botaoSim;
    private javax.swing.ButtonGroup grupoIO;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDados;
    private javax.swing.JLabel labelIO;
    private javax.swing.JLabel labelProcesso;
    private javax.swing.JLabel labelQuantum;
    private javax.swing.JLabel labelQuantumFinal;
    private javax.swing.JTextField textoChegada;
    private javax.swing.JTextField textoDuracao;
    private javax.swing.JTextField textoIO;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoQuantum;
    // End of variables declaration//GEN-END:variables
}
