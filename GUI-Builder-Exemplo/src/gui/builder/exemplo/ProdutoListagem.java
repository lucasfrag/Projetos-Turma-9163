/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.builder.exemplo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tiluc
 */
public class ProdutoListagem extends javax.swing.JFrame {

    /**
     * Creates new form ProdutoListagem
     */
    public ProdutoListagem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AreaDeBoasVindas = new javax.swing.JPanel();
        TextoDeBoasVindas = new javax.swing.JLabel();
        TextoDeFeedback = new javax.swing.JLabel();
        BotaoSair = new javax.swing.JButton();
        AreaDaTabela = new javax.swing.JPanel();
        ScrollDaTabela = new javax.swing.JScrollPane();
        TabelaDeProdutos = new javax.swing.JTable();
        BotaoNovoProduto = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        BotaoVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        TextoDeBoasVindas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextoDeBoasVindas.setText("Lista de Produtos");

        TextoDeFeedback.setText("Abaixo, estão todos os produtos cadastrados:");

        BotaoSair.setText("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AreaDeBoasVindasLayout = new javax.swing.GroupLayout(AreaDeBoasVindas);
        AreaDeBoasVindas.setLayout(AreaDeBoasVindasLayout);
        AreaDeBoasVindasLayout.setHorizontalGroup(
            AreaDeBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDeBoasVindasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AreaDeBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AreaDeBoasVindasLayout.createSequentialGroup()
                        .addComponent(TextoDeFeedback)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(AreaDeBoasVindasLayout.createSequentialGroup()
                        .addComponent(TextoDeBoasVindas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoSair)))
                .addContainerGap())
        );
        AreaDeBoasVindasLayout.setVerticalGroup(
            AreaDeBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaDeBoasVindasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(AreaDeBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoDeBoasVindas)
                    .addComponent(BotaoSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(TextoDeFeedback)
                .addContainerGap())
        );

        TabelaDeProdutos.setModel(montarTabela());
        ScrollDaTabela.setViewportView(TabelaDeProdutos);

        BotaoNovoProduto.setText("+ Novo Produto");
        BotaoNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoProdutoActionPerformed(evt);
            }
        });

        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        BotaoVender.setText("Vender");

        javax.swing.GroupLayout AreaDaTabelaLayout = new javax.swing.GroupLayout(AreaDaTabela);
        AreaDaTabela.setLayout(AreaDaTabelaLayout);
        AreaDaTabelaLayout.setHorizontalGroup(
            AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDaTabelaLayout.createSequentialGroup()
                .addGroup(AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollDaTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AreaDaTabelaLayout.createSequentialGroup()
                        .addComponent(BotaoNovoProduto)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoVender)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AreaDaTabelaLayout.setVerticalGroup(
            AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDaTabelaLayout.createSequentialGroup()
                .addComponent(ScrollDaTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AreaDaTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNovoProduto)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoVender))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AreaDeBoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AreaDaTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AreaDeBoasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AreaDaTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        TabelaDeProdutos.setModel(montarTabela());
        ScrollDaTabela.setViewportView(TabelaDeProdutos);
    }//GEN-LAST:event_formWindowGainedFocus

    private void BotaoNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoProdutoActionPerformed
        // TODO add your handling code here:
        ProdutoCadastro tela = new ProdutoCadastro();
        tela.setVisible(true);
    }//GEN-LAST:event_BotaoNovoProdutoActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        // TODO add your handling code here:
        ListaProduto.excluir(getPosicao());
        TabelaDeProdutos.setModel(montarTabela());
        ScrollDaTabela.setViewportView(TabelaDeProdutos);
    }//GEN-LAST:event_BotaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(ProdutoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoListagem().setVisible(true);
            }
        });
    }

    
    
    
    
    
    private DefaultTableModel montarTabela() {
        String[] colunas = {"ID", "Nome", "Valor", "Quantidade", "Estado", "Categoria"};
        
        // Criamos a tabela
        DefaultTableModel tabela = new DefaultTableModel(colunas, 0);
        
        //Pegar os dados da lista de produtos
        ArrayList<Produto> lista = ListaProduto.Listar();
        
        for (int i=0; i < lista.size(); i++) {
            Produto p = lista.get(i);
            String[] linha = {
                Integer.toString(p.getId()),
                p.getNome(),
                Double.toString(p.getPreco()),
                Integer.toString(p.getQuantidade()),
                p.getEstado(),
                p.getCategoria()
            };
            
            tabela.addRow(linha);
        }
        
        return tabela;
    }
    
    
    
    private int getPosicao() {
        int posicao = TabelaDeProdutos.getSelectedRow();
        
        if(posicao <= 0) {
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir.");
        }
                
        return posicao;
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AreaDaTabela;
    private javax.swing.JPanel AreaDeBoasVindas;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoNovoProduto;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton BotaoVender;
    private javax.swing.JScrollPane ScrollDaTabela;
    private javax.swing.JTable TabelaDeProdutos;
    private javax.swing.JLabel TextoDeBoasVindas;
    private javax.swing.JLabel TextoDeFeedback;
    // End of variables declaration//GEN-END:variables
}
