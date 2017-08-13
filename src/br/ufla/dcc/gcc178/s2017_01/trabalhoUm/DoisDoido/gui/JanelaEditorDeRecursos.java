/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.gcc178.s2017_01.trabalhoUm.DoisDoido.gui;

import br.ufla.dcc.gcc178.s2017_01.trabalhoUm.DoisDoido.entities.Ambiente;
import br.ufla.dcc.gcc178.s2017_01.trabalhoUm.DoisDoido.entities.Item;
import br.ufla.dcc.gcc178.s2017_01.trabalhoUm.DoisDoido.entities.NPC;
import static br.ufla.dcc.gcc178.s2017_01.trabalhoUm.DoisDoido.gui.UtilitariosGUI.CAMINHO_DOS_BACKGROUNDS;
import static br.ufla.dcc.gcc178.s2017_01.trabalhoUm.DoisDoido.gui.UtilitariosGUI.CAMINHO_DOS_MAPAS;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author filip
 */
public class JanelaEditorDeRecursos extends javax.swing.JFrame {
    private Ambiente ambienteAtual;
    private String nomeDoMundo;
    private boolean alterouAlgumaCoisa;
    private List<String> nomesDeTodosOsAmbientes;
    
    /**
     * Creates new form JanelaEditorDeAmbientes
     */
    public JanelaEditorDeRecursos() {
        initComponents();
        initAtributos();
    }
    
    private void initAtributos() {
        criarNovoMundo();
    }
    
    private void criarNovoMundo() {
        ambienteAtual = new Ambiente("Ambiente atual");
        carregarAmbiente();
        nomesDeTodosOsAmbientes = new ArrayList<>();
        nomeDoMundo = null;
        alterouAlgumaCoisa = false;
        campoDeLog.append("***INICIADO NOVO AMBIENTE VAZIO!\n");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        painelItensENPCs = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        painelItens = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        painelNPCs = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        painelInformacoesDoAmbiente = new javax.swing.JPanel();
        painelEditor = new javax.swing.JPanel();
        painelAmbiente = new javax.swing.JPanel();
        painelImagem = new javax.swing.JPanel();
        labelImagem = new javax.swing.JLabel();
        botaoOeste = new javax.swing.JButton();
        botaoSul = new javax.swing.JButton();
        botaoLeste = new javax.swing.JButton();
        botaoNorte = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        barraDeStatus = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDeLog = new javax.swing.JTextArea();
        barraDeMenus = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuItemNovo = new javax.swing.JMenuItem();
        menuItemAbrir = new javax.swing.JMenuItem();
        menuItemSalvar = new javax.swing.JMenuItem();
        menuItemSalvarComo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemSair = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuItemEditorDeItens = new javax.swing.JMenuItem();
        menuItemAdicionarNPC = new javax.swing.JMenuItem();
        menuItemDescricaoAmbiente = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuItemAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("O Manicômio de Zulu - Editor de Ambientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        painelItensENPCs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelItensENPCs.setPreferredSize(new java.awt.Dimension(300, 595));
        painelItensENPCs.setLayout(new java.awt.GridLayout(2, 1));

        jPanel1.setPreferredSize(new java.awt.Dimension(300, 595));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        jLabel6.setText("Itens");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel6, gridBagConstraints);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        painelItens.setMinimumSize(new java.awt.Dimension(100, 100));
        painelItens.setLayout(new javax.swing.BoxLayout(painelItens, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(painelItens);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jScrollPane2, gridBagConstraints);

        painelItensENPCs.add(jPanel1);

        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        jPanel3Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel3.setLayout(jPanel3Layout);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        painelNPCs.setMinimumSize(new java.awt.Dimension(100, 100));
        painelNPCs.setLayout(new javax.swing.BoxLayout(painelNPCs, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane3.setViewportView(painelNPCs);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane3, gridBagConstraints);

        jLabel7.setText("NPCs");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel3.add(jLabel7, gridBagConstraints);

        painelItensENPCs.add(jPanel3);

        getContentPane().add(painelItensENPCs, java.awt.BorderLayout.WEST);

        painelInformacoesDoAmbiente.setLayout(new java.awt.BorderLayout());

        painelEditor.setLayout(new java.awt.GridBagLayout());

        painelAmbiente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelAmbiente.setMaximumSize(new java.awt.Dimension(968, 520));
        painelAmbiente.setMinimumSize(new java.awt.Dimension(968, 520));
        painelAmbiente.setPreferredSize(new java.awt.Dimension(968, 520));
        painelAmbiente.setLayout(new java.awt.GridBagLayout());

        painelImagem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelImagem.setMaximumSize(new java.awt.Dimension(804, 404));
        painelImagem.setMinimumSize(new java.awt.Dimension(804, 404));
        painelImagem.setPreferredSize(new java.awt.Dimension(804, 404));

        labelImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem.setIcon(new javax.swing.ImageIcon("res/images/icons/imagem.png"));
        labelImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelImagemMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImagemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelImagemLayout = new javax.swing.GroupLayout(painelImagem);
        painelImagem.setLayout(painelImagemLayout);
        painelImagemLayout.setHorizontalGroup(
            painelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        painelImagemLayout.setVerticalGroup(
            painelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        painelAmbiente.add(painelImagem, gridBagConstraints);

        botaoOeste.setText("Oeste");
        botaoOeste.setFocusable(false);
        botaoOeste.setMaximumSize(new java.awt.Dimension(76, 50));
        botaoOeste.setMinimumSize(new java.awt.Dimension(76, 50));
        botaoOeste.setPreferredSize(new java.awt.Dimension(76, 50));
        botaoOeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOesteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 0.1;
        painelAmbiente.add(botaoOeste, gridBagConstraints);

        botaoSul.setText("Sul");
        botaoSul.setFocusable(false);
        botaoSul.setMaximumSize(new java.awt.Dimension(76, 50));
        botaoSul.setMinimumSize(new java.awt.Dimension(76, 50));
        botaoSul.setPreferredSize(new java.awt.Dimension(76, 50));
        botaoSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSulActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.2;
        painelAmbiente.add(botaoSul, gridBagConstraints);

        botaoLeste.setText("Leste");
        botaoLeste.setFocusable(false);
        botaoLeste.setMaximumSize(new java.awt.Dimension(76, 50));
        botaoLeste.setMinimumSize(new java.awt.Dimension(76, 50));
        botaoLeste.setPreferredSize(new java.awt.Dimension(76, 50));
        botaoLeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLesteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        painelAmbiente.add(botaoLeste, gridBagConstraints);

        botaoNorte.setText("Norte");
        botaoNorte.setFocusable(false);
        botaoNorte.setMaximumSize(new java.awt.Dimension(76, 50));
        botaoNorte.setMinimumSize(new java.awt.Dimension(76, 50));
        botaoNorte.setPreferredSize(new java.awt.Dimension(76, 50));
        botaoNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNorteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        painelAmbiente.add(botaoNorte, gridBagConstraints);

        jLabel2.setMaximumSize(new java.awt.Dimension(16, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(16, 16));
        jLabel2.setPreferredSize(new java.awt.Dimension(16, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        painelAmbiente.add(jLabel2, gridBagConstraints);

        jLabel3.setMaximumSize(new java.awt.Dimension(16, 16));
        jLabel3.setMinimumSize(new java.awt.Dimension(16, 16));
        jLabel3.setPreferredSize(new java.awt.Dimension(16, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        painelAmbiente.add(jLabel3, gridBagConstraints);

        jLabel4.setMaximumSize(new java.awt.Dimension(16, 16));
        jLabel4.setMinimumSize(new java.awt.Dimension(16, 16));
        jLabel4.setPreferredSize(new java.awt.Dimension(16, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        painelAmbiente.add(jLabel4, gridBagConstraints);

        jLabel5.setMaximumSize(new java.awt.Dimension(16, 16));
        jLabel5.setMinimumSize(new java.awt.Dimension(16, 16));
        jLabel5.setPreferredSize(new java.awt.Dimension(16, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        painelAmbiente.add(jLabel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(75, 121, 60, 107);
        painelEditor.add(painelAmbiente, gridBagConstraints);

        painelInformacoesDoAmbiente.add(painelEditor, java.awt.BorderLayout.CENTER);

        barraDeStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        barraDeStatus.setPreferredSize(new java.awt.Dimension(1233, 150));

        campoDeLog.setEditable(false);
        campoDeLog.setColumns(20);
        campoDeLog.setRows(5);
        jScrollPane1.setViewportView(campoDeLog);

        javax.swing.GroupLayout barraDeStatusLayout = new javax.swing.GroupLayout(barraDeStatus);
        barraDeStatus.setLayout(barraDeStatusLayout);
        barraDeStatusLayout.setHorizontalGroup(
            barraDeStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
        );
        barraDeStatusLayout.setVerticalGroup(
            barraDeStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );

        painelInformacoesDoAmbiente.add(barraDeStatus, java.awt.BorderLayout.SOUTH);

        getContentPane().add(painelInformacoesDoAmbiente, java.awt.BorderLayout.CENTER);

        menuArquivo.setText("Arquivo");

        menuItemNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuItemNovo.setText("Novo mundo");
        menuItemNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNovoActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemNovo);

        menuItemAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuItemAbrir.setText("Abrir mundo...");
        menuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAbrirActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemAbrir);

        menuItemSalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSalvar.setText("Salvar");
        menuItemSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalvarActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSalvar);

        menuItemSalvarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemSalvarComo.setText("Salvar mundo como...");
        menuItemSalvarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalvarComoActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSalvarComo);
        menuArquivo.add(jSeparator1);

        menuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSair);

        barraDeMenus.add(menuArquivo);

        menuEditar.setText("Editar");

        menuItemEditorDeItens.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuItemEditorDeItens.setText("Itens");
        menuItemEditorDeItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEditorDeItensActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemEditorDeItens);

        menuItemAdicionarNPC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuItemAdicionarNPC.setText("NPCs");
        menuItemAdicionarNPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAdicionarNPCActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemAdicionarNPC);

        menuItemDescricaoAmbiente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuItemDescricaoAmbiente.setText("Editar nome do ambiente");
        menuItemDescricaoAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDescricaoAmbienteActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemDescricaoAmbiente);

        barraDeMenus.add(menuEditar);

        menuAjuda.setText("Ajuda");

        menuItemAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuItemAjuda.setText("Sobre");
        menuItemAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAjudaActionPerformed(evt);
            }
        });
        menuAjuda.add(menuItemAjuda);

        barraDeMenus.add(menuAjuda);

        setJMenuBar(barraDeMenus);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void receberNome(Ambiente atual) {
        if (atual != null && !atual.taMarcado()) {
            atual.setMarcado(true);
            if (!nomesDeTodosOsAmbientes.contains(atual.getDescricao())) {
                nomesDeTodosOsAmbientes.add(atual.getDescricao());
            }
            
            receberNome(atual.getAmbiente("norte"));
            receberNome(atual.getAmbiente("sul"));
            receberNome(atual.getAmbiente("leste"));
            receberNome(atual.getAmbiente("oeste"));
        }
    }
    
    private void desmarcarTodos(Ambiente atual) {
        if (atual != null && atual.taMarcado()) {
            atual.setMarcado(false);
            receberNome(atual.getAmbiente("norte"));
            receberNome(atual.getAmbiente("sul"));
            receberNome(atual.getAmbiente("leste"));
            receberNome(atual.getAmbiente("oeste"));
        }
    }
    
    private void receberTodosOsNomes(Ambiente ambiente) {
        nomesDeTodosOsAmbientes = new ArrayList<>();
        receberNome(ambiente);
        desmarcarTodos(ambiente);
    }
    
    private void botaoRemoverActionPerformed(NavegacaoEvent evt) {
        String comando = evt.getLinhaDeComando();
        String[] palavras = comando.split(" ");
        if (palavras.length == 3) {
            if (palavras[1].equals("item")) {
                ambienteAtual.recolherItem(palavras[2]);
            } else if (palavras[1].equals("npc")) {
                ambienteAtual.removerNPC(palavras[2]);
            }
            carregarAmbiente();
        }
    }
    
    private void mudarImagem(String nomeDaImagem) {
        labelImagem.setIcon(new ImageIcon(new ImageIcon(CAMINHO_DOS_BACKGROUNDS + nomeDaImagem)
                .getImage().getScaledInstance(800, 400, Image.SCALE_SMOOTH)));
    }
    
    private void colocarItens() {
        painelItens.removeAll();
        for (Item item : ambienteAtual.getItens()) {
            ModeloDeNavegacao modelo = new ModeloDeNavegacao(TipoDeGUI.EDITOR_ITEM, item.getNome(), 
                    item.getDescricao(), item.getIcone());
            modelo.addInterfaceDeNavegacaoListener(new InterfaceDeNavegacaoListenter() {
                @Override
                public void solicitacaoDeNavegacaoPerformed(NavegacaoEvent evt) {
                    botaoRemoverActionPerformed(evt);
                }
            });
            painelItens.add(modelo);
        }
        revalidate();
        repaint();
    }
    
    private void colocarNPCs() {
        painelNPCs.removeAll();
        for (NPC npc : ambienteAtual.getNPCs()) {
            ModeloDeNavegacao modelo = new ModeloDeNavegacao(TipoDeGUI.EDITOR_NPC, npc.getNome(), 
                    npc.getNome(), npc.getImagem());
            modelo.addInterfaceDeNavegacaoListener(new InterfaceDeNavegacaoListenter() {
                @Override
                public void solicitacaoDeNavegacaoPerformed(NavegacaoEvent evt) {
                    botaoRemoverActionPerformed(evt);
                }
            });
            painelNPCs.add(modelo);
        }
        revalidate();
        repaint();
    }
    
    private void ajustarSaidas() {
        desativarSaidas();
        if (ambienteAtual != null) {
            Ambiente ambiente = ambienteAtual.getAmbiente("norte");
            if (ambiente != null) {
                botaoNorte.setBackground(Color.green);
                botaoNorte.setToolTipText(ambiente.getDescricao());
            }
            ambiente = ambienteAtual.getAmbiente("sul");
            if (ambiente != null) {
                botaoSul.setBackground(Color.green);
                botaoSul.setToolTipText(ambiente.getDescricao());
            }
            ambiente = ambienteAtual.getAmbiente("leste");
            if (ambiente != null) {
                botaoLeste.setBackground(Color.green);
                botaoLeste.setToolTipText(ambiente.getDescricao());
            }
            ambiente = ambienteAtual.getAmbiente("oeste");
            if (ambiente != null) {
                botaoOeste.setBackground(Color.green);
                botaoOeste.setToolTipText(ambiente.getDescricao());
            }
        }
    }
    
    private void desativarSaidas() {
        botaoNorte.setBackground(Color.orange);
        botaoSul.setBackground(Color.orange);
        botaoLeste.setBackground(Color.orange);
        botaoOeste.setBackground(Color.orange);
        String tipText = "Não há saída aqui! Clique aqui para adicionar uma!";
        botaoNorte.setToolTipText(tipText);
        botaoSul.setToolTipText(tipText);
        botaoLeste.setToolTipText(tipText);
        botaoOeste.setToolTipText(tipText);
    }
    
    private void carregarAmbiente() {
        mudarImagem(ambienteAtual.getImagem());
        colocarItens();
        colocarNPCs();
        ajustarSaidas();
        alterouAlgumaCoisa = true;
    }
    
    private String getDirecaoOposta(String direcao) {
        if (direcao.equals("norte")) {
            return "sul";
        }
        if (direcao.equals("sul")) {
            return "norte";
        }
        if (direcao.equals("leste")) {
            return "oeste";
        }
        if (direcao.equals("oeste")) {
            return "leste";
        }
        return "invalido";
    }
    
    public boolean jaTemAmbiente(String nomeNovo) {
        for (String nome : nomesDeTodosOsAmbientes) {
            if (nome.equals(nomeNovo)) {
                return true;
            }
        }
        return false;
    }
    
    private void selecionarOuAdicionarAmbiente(String direcao) {
        Ambiente ambiente = ambienteAtual.getAmbiente(direcao);
        if (ambiente != null) {
            ambienteAtual = ambiente;
            carregarAmbiente();
            campoDeLog.append("Mudando para ambiente nomeado \"" + ambiente.getDescricao() + "\"\n");
        } else {
            String nome = JOptionPane.showInputDialog(this, "Qual o nome desse novo ambiente?", 
                    "O Manicômio de Zulu", JOptionPane.QUESTION_MESSAGE);
            if (nome != null) {
                if (jaTemAmbiente(nome)) {
                    JOptionPane.showMessageDialog(this, "Já existe um ambiente com esse nome!", 
                            "Atenção", JOptionPane.WARNING_MESSAGE);
                } else {
                    ambienteAtual.ajustarSaida(direcao, new Ambiente(nome));
                    ambienteAtual.getAmbiente(direcao).ajustarSaida(getDirecaoOposta(direcao), ambienteAtual);
                    ambienteAtual = ambienteAtual.getAmbiente(direcao);
                    nomesDeTodosOsAmbientes.add(nome);
                    carregarAmbiente();
                    campoDeLog.append("Ambiente " + ambienteAtual.getDescricao() + " criado com sucesso!\n");
                }
            }
        }
    }
    
    private void labelImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImagemMouseClicked
        String nomeDoBackground = DialogoNavegadoraDeRecursos.selecionarImagem(this);
        if (nomeDoBackground != null) {
            ambienteAtual.setImagem(nomeDoBackground);
            mudarImagem(nomeDoBackground);
            alterouAlgumaCoisa = true;
        }
        campoDeLog.append("Concluído!\n");
    }//GEN-LAST:event_labelImagemMouseClicked

    private void botaoNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNorteActionPerformed
        selecionarOuAdicionarAmbiente("norte");
    }//GEN-LAST:event_botaoNorteActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        requerirSaida(true);
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuItemNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNovoActionPerformed
        requerirSaida(false);
    }//GEN-LAST:event_menuItemNovoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        requerirSaida(true);
    }//GEN-LAST:event_formWindowClosing

    private void labelImagemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImagemMousePressed
        campoDeLog.append("Aguarde, carregando imagens.......");
    }//GEN-LAST:event_labelImagemMousePressed

    private void menuItemSalvarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalvarComoActionPerformed
        salvarComo();
    }//GEN-LAST:event_menuItemSalvarComoActionPerformed

    private void menuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrirActionPerformed
        boolean querSaida = requerirSaida(false);
        if (querSaida) {
            Ambiente ambiente = DialogoSelecionarMapa.getMapa(this);
            if (ambiente != null) {
                ambienteAtual = ambiente;
                receberTodosOsNomes(ambiente);
                carregarAmbiente();
            }
        }
    }//GEN-LAST:event_menuItemAbrirActionPerformed

    private void botaoSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSulActionPerformed
        selecionarOuAdicionarAmbiente("sul");
    }//GEN-LAST:event_botaoSulActionPerformed

    private void botaoLesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLesteActionPerformed
        selecionarOuAdicionarAmbiente("leste");
    }//GEN-LAST:event_botaoLesteActionPerformed

    private void botaoOesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOesteActionPerformed
        selecionarOuAdicionarAmbiente("oeste");
    }//GEN-LAST:event_botaoOesteActionPerformed

    private void menuItemEditorDeItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEditorDeItensActionPerformed
        adicionarItemNoAmbiente();
    }//GEN-LAST:event_menuItemEditorDeItensActionPerformed

    private void menuItemAdicionarNPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAdicionarNPCActionPerformed
        adicionarNPCNoAmbiente();
    }//GEN-LAST:event_menuItemAdicionarNPCActionPerformed

    private void menuItemSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalvarActionPerformed
        if (nomeDoMundo == null) {
            salvarComo();
        } else {
            salvar();
        }
    }//GEN-LAST:event_menuItemSalvarActionPerformed

    private void menuItemDescricaoAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDescricaoAmbienteActionPerformed
        String nome = JOptionPane.showInputDialog(this, "Digite o novo nome do ambiente:", 
                    "O Manicômio de Zulu", JOptionPane.QUESTION_MESSAGE);
        if (!nome.equals(ambienteAtual.getDescricao())) {
            if (jaTemAmbiente(nome)) {
                JOptionPane.showMessageDialog(this, "Já existe um ambiente com esse nome!", 
                            "Atenção", JOptionPane.WARNING_MESSAGE);
            } else {
                nomesDeTodosOsAmbientes.add(nome);
                nomesDeTodosOsAmbientes.remove(ambienteAtual.getDescricao());
                ambienteAtual.setDescricao(nome);
                campoDeLog.append("Ambiente renomeado para \"" + nome + "\"!");
            }
        } else {
            
        }
    }//GEN-LAST:event_menuItemDescricaoAmbienteActionPerformed

    private void menuItemAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAjudaActionPerformed
        new DialogoSobre(this, true).setVisible(true);
    }//GEN-LAST:event_menuItemAjudaActionPerformed

    private void adicionarItemNoAmbiente() {
        campoDeLog.append("Aguarde, carregando Itens.......");
        Item itemNovo = DialogoNavegadoraDeRecursos.selecionarItem(this);
        if (itemNovo != null) {
            ambienteAtual.colocarItem(itemNovo);
            carregarAmbiente();
            campoDeLog.append(" Adicionado " + itemNovo.getNome() + "!\n");
        } else {
            campoDeLog.append(" Cancelado!\n");
        }
    }
    
    private void adicionarNPCNoAmbiente() {
        campoDeLog.append("Aguarde, carregando NPCs.......");
        NPC npcNovo = DialogoNavegadoraDeRecursos.selecionarNPC(this);
        if (npcNovo != null) {
            ambienteAtual.colocarNPC(npcNovo);
            carregarAmbiente();
            campoDeLog.append(" Adicionado NPC " + npcNovo.getNome() + "!\n");
        }
    }
    
    private void sairDoMundo(boolean querFecharJanela) {
        if (querFecharJanela) {
            dispose();
        } else {
            criarNovoMundo();
        }
    }
    
    private boolean requerirSaida(boolean querFecharJanela) {
        if (alterouAlgumaCoisa) {
            int opcao = JOptionPane.showOptionDialog(this, "Você deseja salvar suas alterações?", "O Manicômio de Zulu", 
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, new String[]{"Sim", "Não", "Cancelar"}, null);
            switch (opcao) {
                case JOptionPane.CANCEL_OPTION:
                    return false;
                case JOptionPane.YES_OPTION:
                    salvar();
                default:
                    sairDoMundo(querFecharJanela);
            }
        } else {
            sairDoMundo(querFecharJanela);
        }
        return true;
    }
    
    private boolean jaExisteArquivo(String nome) {
        File folder = new File(CAMINHO_DOS_MAPAS);
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile() && file.getName().substring(0, file.getName().length() - 4).equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    private void salvar() {
        campoDeLog.append("Salvando " + nomeDoMundo + "... ");
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fout = new FileOutputStream(new File(CAMINHO_DOS_MAPAS + nomeDoMundo + ".dat"));
            oos = new ObjectOutputStream(fout);
            oos.writeObject(ambienteAtual);
            alterouAlgumaCoisa = false;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Nenhum registro encontrado! Iniciando novos registros!", 
                    "O Manicômio de Zulu", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu algum problema com sua unidade de armazenamento!", 
                    "OH MY GOD!!", JOptionPane.ERROR_MESSAGE);
            campoDeLog.append("Não foi possível salvar!\n");
            ex.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                    campoDeLog.append("Salvo com sucesso!\n");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Ocorreu algum problema com sua unidade de armazenamento!", 
                            "OH MY GOD!!", JOptionPane.ERROR_MESSAGE);
                    campoDeLog.append("Não foi possível salvar!\n");
                }
            } else {
                campoDeLog.append("Não foi possível salvar!\n");
            }
        }
        JOptionPane.showMessageDialog(this, "Mundo salvo!", "O Manicômio de Zulu", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void salvarComo() {
        String nome;
        boolean salvou = false;
        do {
            nome = JOptionPane.showInputDialog(this, "Qual o nome desse mapa?", 
                        "O Manicômio de Zulu", JOptionPane.QUESTION_MESSAGE);
            if (nome != null) {
                if (jaExisteArquivo(nome)) {
                    int opcao = JOptionPane.showOptionDialog(this, 
                        "Já existe um mapa com esse nome. Deseja sobrescrever?",
                        "O Manicômio de Zulu", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.WARNING_MESSAGE, null, 
                        new String[]{"Sim", "Não"}, null);
                    if (opcao == JOptionPane.YES_OPTION) {
                        nomeDoMundo = nome;
                        salvar();
                        salvou = true;
                    }
                } else {
                    nomeDoMundo = nome;
                    salvar();
                    salvou = true;
                }
            }
        } while (nome != null && !salvou);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenus;
    private javax.swing.JPanel barraDeStatus;
    private javax.swing.JButton botaoLeste;
    private javax.swing.JButton botaoNorte;
    private javax.swing.JButton botaoOeste;
    private javax.swing.JButton botaoSul;
    private javax.swing.JTextArea campoDeLog;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuItemAbrir;
    private javax.swing.JMenuItem menuItemAdicionarNPC;
    private javax.swing.JMenuItem menuItemAjuda;
    private javax.swing.JMenuItem menuItemDescricaoAmbiente;
    private javax.swing.JMenuItem menuItemEditorDeItens;
    private javax.swing.JMenuItem menuItemNovo;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuItemSalvar;
    private javax.swing.JMenuItem menuItemSalvarComo;
    private javax.swing.JPanel painelAmbiente;
    private javax.swing.JPanel painelEditor;
    private javax.swing.JPanel painelImagem;
    private javax.swing.JPanel painelInformacoesDoAmbiente;
    private javax.swing.JPanel painelItens;
    private javax.swing.JPanel painelItensENPCs;
    private javax.swing.JPanel painelNPCs;
    // End of variables declaration//GEN-END:variables
}
