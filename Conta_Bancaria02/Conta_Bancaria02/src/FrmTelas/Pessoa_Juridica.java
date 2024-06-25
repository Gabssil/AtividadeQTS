/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrmTelas;

/**
 *
 * @author kaua
 */
import Conexao.conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Pessoa_Juridica extends javax.swing.JFrame {
 conexao con_cliente;
    /**
     * Creates new form Pessoa_Juridica
     */
    public Pessoa_Juridica() {
        initComponents();
        con_cliente = new conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from pessoa_juridica order by id_juridica");
        preencherTabela();
        posicionarRegistror();
        pessoa_juridica.setAutoCreateRowSorter(true);
    }
public void preencherTabela() {
        pessoa_juridica.getColumnModel().getColumn(0).setPreferredWidth(100);
        pessoa_juridica.getColumnModel().getColumn(1).setPreferredWidth(100);
        pessoa_juridica.getColumnModel().getColumn(2).setPreferredWidth(100);
        pessoa_juridica.getColumnModel().getColumn(3).setPreferredWidth(120);
        pessoa_juridica.getColumnModel().getColumn(4).setPreferredWidth(100);
        pessoa_juridica.getColumnModel().getColumn(5).setPreferredWidth(100);
        pessoa_juridica.getColumnModel().getColumn(6).setPreferredWidth(100);
        pessoa_juridica.getColumnModel().getColumn(7).setPreferredWidth(100);
        pessoa_juridica.getColumnModel().getColumn(8).setPreferredWidth(100);
        pessoa_juridica.getColumnModel().getColumn(9).setPreferredWidth(100);

        DefaultTableModel modelo = (DefaultTableModel) pessoa_juridica.getModel();
        modelo.setNumRows(0);

        try {
            con_cliente.resultset.beforeFirst();
            while (con_cliente.resultset.next()) {
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("id_juridica"), 
                    con_cliente.resultset.getString("cnpj"),
                    con_cliente.resultset.getString("nome_fantasia"),
                    con_cliente.resultset.getString("razao_social"),
                    con_cliente.resultset.getString("rua"),
                    con_cliente.resultset.getString("bairro"), 
                    con_cliente.resultset.getString("cidade"),
                    con_cliente.resultset.getString("estado"),
                    con_cliente.resultset.getString("cep"), 
                    con_cliente.resultset.getString("telefone")                 
                });
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Erro ao listar dados da tabela!!:\n" + erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void posicionarRegistror() {
        try {
            con_cliente.resultset.first();
            //mostrar_Dados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel possivel posicionar registros:" + erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void mostrar_Dados() {
        try {
            id_juridica.setText(con_cliente.resultset.getString("id_juridica"));
            cnpj.setText(con_cliente.resultset.getString("cnpj"));
            nome_fantasia.setText(con_cliente.resultset.getString("nome_fantasia"));
            razao_social.setText(con_cliente.resultset.getString("razao_social"));
            rua.setText(con_cliente.resultset.getString("rua"));
            bairro.setText(con_cliente.resultset.getString("bairro"));
            cidade.setText(con_cliente.resultset.getString("cidade"));
            estado.setText(con_cliente.resultset.getString("estado"));
            estado.setText(con_cliente.resultset.getString("cep"));
            telefone.setText(con_cliente.resultset.getString("telefone"));
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não localizou dados: " + erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {
        int linha_selecionada = pessoa_juridica.getSelectedRow();
        id_juridica.setText(pessoa_juridica.getValueAt(linha_selecionada, 0).toString());
        cnpj.setText(pessoa_juridica.getValueAt(linha_selecionada, 1).toString());
        nome_fantasia.setText(pessoa_juridica.getValueAt(linha_selecionada, 2).toString());
        razao_social.setText(pessoa_juridica.getValueAt(linha_selecionada, 3).toString());
        rua.setText(pessoa_juridica.getValueAt(linha_selecionada, 4).toString());
        bairro.setText(pessoa_juridica.getValueAt(linha_selecionada, 5).toString());
        cidade.setText(pessoa_juridica.getValueAt(linha_selecionada, 6).toString());
        estado.setText(pessoa_juridica.getValueAt(linha_selecionada, 7).toString());
        estado.setText(pessoa_juridica.getValueAt(linha_selecionada, 8).toString());
        telefone.setText(pessoa_juridica.getValueAt(linha_selecionada, 9).toString());
    }

    private void tblClientesKeyPressed(java.awt.event.KeyEvent evt) {
        int linha_selecionada = pessoa_juridica.getSelectedRow();
        id_juridica.setText(pessoa_juridica.getValueAt(linha_selecionada, 0).toString());
        cnpj.setText(pessoa_juridica.getValueAt(linha_selecionada, 1).toString());
        nome_fantasia.setText(pessoa_juridica.getValueAt(linha_selecionada, 2).toString());
        razao_social.setText(pessoa_juridica.getValueAt(linha_selecionada, 3).toString());
        rua.setText(pessoa_juridica.getValueAt(linha_selecionada, 4).toString());
        bairro.setText(pessoa_juridica.getValueAt(linha_selecionada, 5).toString());
        cidade.setText(pessoa_juridica.getValueAt(linha_selecionada, 6).toString());
        estado.setText(pessoa_juridica.getValueAt(linha_selecionada, 7).toString());
        estado.setText(pessoa_juridica.getValueAt(linha_selecionada, 8).toString());
        telefone.setText(pessoa_juridica.getValueAt(linha_selecionada, 9).toString());
            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id_juridica = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nome_fantasia = new javax.swing.JTextField();
        razao_social = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pessoa_juridica = new javax.swing.JTable();
        novoo = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        alterarr = new javax.swing.JButton();
        cnpj = new javax.swing.JFormattedTextField();
        telefone = new javax.swing.JFormattedTextField();
        cep = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID");

        id_juridica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("CNPJ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nome Fantasia");

        nome_fantasia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        razao_social.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Razão Social");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Rua");

        rua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Telefone");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("CEP");

        estado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Estado");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Cidade");

        cidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Bairro");

        bairro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        pessoa_juridica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cnpj", "Nome_fanta", "Razao_social", "Rua", "Bairro", "Cidade", "Estado", "Cep", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(pessoa_juridica);

        novoo.setBackground(new java.awt.Color(153, 0, 153));
        novoo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        novoo.setText("Novo");
        novoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novooActionPerformed(evt);
            }
        });

        cadastrar.setBackground(new java.awt.Color(153, 0, 153));
        cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        excluir.setBackground(new java.awt.Color(153, 0, 153));
        excluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        alterarr.setBackground(new java.awt.Color(153, 0, 153));
        alterarr.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        alterarr.setText("Alterar");
        alterarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarrActionPerformed(evt);
            }
        });

        try {
            cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Digite seus Dados:");

        jButtonSair.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(alterarr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(novoo)
                .addGap(18, 18, 18)
                .addComponent(excluir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_juridica, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome_fantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(razao_social, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cidade, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(bairro, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(estado, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(telefone)
                    .addComponent(cep))
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSair))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonSair)
                .addGap(1, 1, 1)
                .addComponent(jLabel11)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_juridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nome_fantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(razao_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoo)
                    .addComponent(cadastrar)
                    .addComponent(excluir)
                    .addComponent(alterarr))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novooActionPerformed
        cnpj.setText("");
        telefone.setText("");
        nome_fantasia.setText("");
        razao_social.setText("");
        rua.setText("");
        bairro.setText("");
        cidade.setText("");
        estado.setText("");
        cep.setText("");
        id_juridica.setText("");

    }//GEN-LAST:event_novooActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:
        String cnpjj = cnpj.getText();
        String telefonee = telefone.getText();
        String razao_sociaal = razao_social.getText();
        String idpjj = id_juridica.getText();
        String ruaa = rua.getText();
        String bairroo= bairro.getText();
        String cidadee = cidade.getText();
        String nome_fantasiaa = nome_fantasia.getText();
        String estadoo = estado.getText();
        String ceep = estado.getText();
        try {
            String insertSql = "insert into pessoa_juridica (id_juridica, cnpj, nome_fantasia, razao_social, rua, bairro, cidade, estado, cep ,telefone) values ('" + idpjj + "', '" + cnpjj + "', '"+nome_fantasiaa+"','"+razao_sociaal+"','" + ruaa + "', '" + bairroo + "', '"+cidadee+"','"+estadoo+"','"+ceep+"','"+telefonee+"');";
            con_cliente.statement.executeUpdate(insertSql);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from pessoa_juridica order by id_juridica");
            con_cliente.resultset.first();
            mostrar_Dados();
            preencherTabela();

        } catch (SQLException errosql) {
            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
          // TODO add your handling code here:
        String sql = "";
        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro?  ", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION, 3);
            if (resposta == 0) {
                sql = "delete from pessoa_juridica where id_juridica = " + id_juridica.getText();
                int excluir = con_cliente.statement.executeUpdate(sql);
                if (excluir == 1) {
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("Select * from pessoa_juridica order by id_juridica");
                    con_cliente.resultset.first();
                    preencherTabela();
                    posicionarRegistror();
                } else {
                    JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuario!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão!" + excecao, "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void alterarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarrActionPerformed
          String cnpjj = cnpj.getText();
        String telefonee = telefone.getText();
        String razao_sociaal = razao_social.getText();
        String ruaa = rua.getText();
        String bairroo= bairro.getText();
        String cidadee = cidade.getText();
        String nome_fantasiaa = nome_fantasia.getText();
        String estadoo = estado.getText();
        String ceep = cep.getText();
        String sql = "";
        String msg = "";

        try {
            if (id_juridica.getText().equals("")) {
                sql =  "insert into pessoa_juridica ( cnpj, nome_fantasia, razao_social, rua, bairro, cidade, estado, cep ,telefone) values ( '" + cnpjj + "', '"+nome_fantasiaa+"','"+razao_sociaal+"','" + ruaa + "', '" + bairroo + "', '"+cidadee+"','"+estadoo+"','"+ceep+"','"+telefonee+"');";
                msg = "Gravação de um novo registro";
            } else {
                sql = "update pessoa_juridica set cnpj='" + cnpjj + "',nome_fantasia='" + nome_fantasiaa +"', razao_social='" + razao_sociaal + "', rua='" + ruaa + "', bairro='" + bairroo +"',cidade='" + cidadee + "',estado='" + estadoo +"',cep='" + ceep +"',telefone='" + telefonee + "' where id_juridica = " + id_juridica.getText(); ;
                msg = "Alteração de registro";
            }

            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, msg + "realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from pessoa_juridica order by id_juridica");
            con_cliente.resultset.first();
            mostrar_Dados();
            preencherTabela();

        } catch (SQLException errosql) {
            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_alterarrActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoActionPerformed

    private void cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(Pessoa_Juridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pessoa_Juridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pessoa_Juridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pessoa_Juridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pessoa_Juridica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarr;
    private javax.swing.JTextField bairro;
    private javax.swing.JButton cadastrar;
    private javax.swing.JFormattedTextField cep;
    private javax.swing.JTextField cidade;
    private javax.swing.JFormattedTextField cnpj;
    private javax.swing.JTextField estado;
    private javax.swing.JButton excluir;
    private javax.swing.JTextField id_juridica;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome_fantasia;
    private javax.swing.JButton novoo;
    private javax.swing.JTable pessoa_juridica;
    private javax.swing.JTextField razao_social;
    private javax.swing.JTextField rua;
    private javax.swing.JFormattedTextField telefone;
    // End of variables declaration//GEN-END:variables
}
