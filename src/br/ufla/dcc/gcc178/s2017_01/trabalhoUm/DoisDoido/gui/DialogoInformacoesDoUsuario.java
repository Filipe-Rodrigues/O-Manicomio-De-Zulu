/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.gcc178.s2017_01.trabalhoUm.DoisDoido.gui;

import br.ufla.dcc.gcc178.s2017_01.trabalhoUm.DoisDoido.core.ManicomioDeZulu;
import br.ufla.dcc.gcc178.s2017_01.trabalhoUm.DoisDoido.entities.Resultado;
import br.ufla.dcc.gcc178.s2017_01.trabalhoUm.DoisDoido.user.Usuario;
import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.InputMap;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author filip
 */
public class DialogoInformacoesDoUsuario extends javax.swing.JDialog {

    Usuario usuarioAtual;
    JanelaPrincipal interfaceDoGame;
    JanelaNovoJogo rankingGeral;
    boolean novoComeco;

    /**
     * Creates new form DialogoInformacoesDoUsuario
     */
    public DialogoInformacoesDoUsuario(Usuario usuarioAtual, JanelaNovoJogo parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initAtributos(usuarioAtual);
        preencherTabelaScores();
        this.setTitle("Registros e jogos de " + usuarioAtual.getNome());
        this.setLocationRelativeTo(parent);
        rankingGeral = parent;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Pontuação", "Data", "Zerado"
            }
        ){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        tabelaDeJogos = new javax.swing.JTable(model) {

            private static final long serialVersionUID = 1L;

            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return Integer.class;
                    case 1:
                    return String.class;
                    case 2:
                    return String.class;
                    default:
                    return Boolean.class;
                }
            }
        };
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoContinuar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        botaoNovoJogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tabelaDeJogos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDeJogosMouseClicked(evt);
            }
        });
        tabelaDeJogos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                atualizarLabelDeStatus(evt);
            }
        });

        tabelaDeJogos.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        tabelaDeJogos.getColumnModel().getColumn(0).setMinWidth(25);
        tabelaDeJogos.getColumnModel().getColumn(0).setMaxWidth(30);
        jScrollPane1.setViewportView(tabelaDeJogos);

        botaoContinuar.setText("Continuar");
        botaoContinuar.setEnabled(false);
        botaoContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(botaoContinuar)
                        .addGap(0, 6, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 30));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 30));
        jPanel2.setPreferredSize(new java.awt.Dimension(419, 30));

        jLabel1.setText("Status:");

        labelStatus.setText("-Selecione um valor da tabela-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(labelStatus))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(419, 50));
        jPanel3.setRequestFocusEnabled(false);

        botaoNovoJogo.setText("Novo Jogo");
        botaoNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoNovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoNovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoJogoActionPerformed
        novoComeco = true;
        iniciarJogo(null);
    }//GEN-LAST:event_botaoNovoJogoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        rankingGeral.setVisible(true);
        rankingGeral.atualizarRanking();
    }//GEN-LAST:event_formWindowClosed

    private void tabelaDeJogosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDeJogosMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            int pos = (int) tabelaDeJogos.getModel().getValueAt(tabelaDeJogos.getSelectedRow(), 0) - 1;
            novoComeco = false;
            iniciarJogo(usuarioAtual.getInformacoesDeJogos().get(pos).getJogo());
        }
    }//GEN-LAST:event_tabelaDeJogosMouseClicked

    private void botaoContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarActionPerformed
        int pos = (int) tabelaDeJogos.getModel().getValueAt(tabelaDeJogos.getSelectedRow(), 0) - 1;
        novoComeco = false;
        iniciarJogo(usuarioAtual.getInformacoesDeJogos().get(pos).getJogo());
    }//GEN-LAST:event_botaoContinuarActionPerformed

    private void iniciarJogo(ManicomioDeZulu jogo) {
        this.setVisible(false);
        interfaceDoGame = new JanelaPrincipal(jogo, this);
        
        //this.getParent().setVisible(false);
    }
    
    private void atualizarLabelDeStatus(ListSelectionEvent evt) {
        if (!tabelaDeJogos.getSelectionModel().isSelectionEmpty()) {
            int pos = (int) tabelaDeJogos.getModel().getValueAt(tabelaDeJogos.getSelectedRow(), 0) - 1;
            Resultado resultado = usuarioAtual.getInformacoesDeJogos().get(pos).getEstadoDoProtagonista();
            boolean zerou = usuarioAtual.getInformacoesDeJogos().get(pos).isZerado();
            botaoContinuar.setEnabled(true);
            switch (resultado) {
                case SUCESSO:
                    if (zerou) {
                        labelStatus.setText("César conseguiu se controlar a tempo!");
                        labelStatus.setForeground(new Color(0f, 0.8f, 0f));
                    } else {
                        labelStatus.setText("César ainda precisa de remédio!");
                        labelStatus.setForeground(new Color(0f, 0f, 0f));
                    }
                    break;
                case ATOR_ASSASSINADO:
                    labelStatus.setText("César foi assassinado!");
                    labelStatus.setForeground(new Color(1f, 0f, 0f));
                    break;
                case ATOR_ENLOUQUECIDO:
                    labelStatus.setText("César pirou de vez, agora não há mais volta!");
                    labelStatus.setForeground(new Color(1f, 0.5f, 0f));
            }
        } else {
            botaoContinuar.setEnabled(false);
        }
    }
    
    private void initAtributos(Usuario usuarioAtual) {
        this.usuarioAtual = usuarioAtual;
    }
    
    private void tornarCheckBoxSomenteLeitura(JCheckBox box){
        MouseListener[] ml = box.getListeners(MouseListener.class);
        for (MouseListener mouseListener : ml) {
            box.removeMouseListener(mouseListener);
        }
        InputMap im = box.getInputMap();
        im.put(KeyStroke.getKeyStroke("SPACE"), "none");
        im.put(KeyStroke.getKeyStroke("released SPACE"), "none");
        box.setFocusable(false);
    }
    
    private void preencherTabelaScores() {
        DefaultTableModel model = (DefaultTableModel) tabelaDeJogos.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        int i = 1;
        for (InformacoesDeJogo informacoes : usuarioAtual.getInformacoesDeJogos()) {
            JCheckBox box = new JCheckBox();
            box.setSelected(informacoes.isZerado());
            tornarCheckBoxSomenteLeitura(box);
            model.addRow(new Object[] {i++, informacoes.getPontuacao(), informacoes.getData(), informacoes.isZerado()});
        }
    }
    
    /**
     * Método receberFinalizacaoDeJogo.
     * 
     * responsável por receber se o joogo deve ser finalizado.
     * 
     * @param informacoesDeJogo Contém todos os dados do jogo executado.
     */
    public void receberFinalizacaoDeJogo (InformacoesDeJogo informacoesDeJogo) {
        if (novoComeco) {
            usuarioAtual.adicionarJogo(informacoesDeJogo);
        } else {
            int pos = (int) tabelaDeJogos.getModel().getValueAt(tabelaDeJogos.getSelectedRow(), 0) - 1;
            usuarioAtual.atualizarInformacoesDoJogo(pos, informacoesDeJogo);
        }
        preencherTabelaScores();
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoContinuar;
    private javax.swing.JButton botaoNovoJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JTable tabelaDeJogos;
    // End of variables declaration//GEN-END:variables
}
