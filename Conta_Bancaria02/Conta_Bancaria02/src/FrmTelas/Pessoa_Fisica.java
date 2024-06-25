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
public class Pessoa_Fisica extends javax.swing.JFrame {
conexao con_cliente;
    /**
     * Creates new form Pessoa_Fisica
     */
    public Pessoa_Fisica() {
        initComponents();
        con_cliente = new conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from pessoa_fisica order by id_fisica");
        preencherTabela();
        posicionarRegistror();
        pessoa_fisica.setAutoCreateRowSorter(true);
    }
 public void preencherTabela() {
        pessoa_fisica.getColumnModel().getColumn(0).setPreferredWidth(100);
        pessoa_fisica.getColumnModel().getColumn(1).setPreferredWidth(100);
        pessoa_fisica.getColumnModel().getColumn(2).setPreferredWidth(100);
        pessoa_fisica.getColumnModel().getColumn(3).setPreferredWidth(120);
        pessoa_fisica.getColumnModel().getColumn(4).setPreferredWidth(100);
        pessoa_fisica.getColumnModel().getColumn(5).setPreferredWidth(100);
        pessoa_fisica.getColumnModel().getColumn(6).setPreferredWidth(100);
        pessoa_fisica.getColumnModel().getColumn(7).setPreferredWidth(100);
        pessoa_fisica.getColumnModel().getColumn(8).setPreferredWidth(100);
        pessoa_fisica.getColumnModel().getColumn(9).setPreferredWidth(100);

        DefaultTableModel modelo = (DefaultTableModel) pessoa_fisica.getModel();
        modelo.setNumRows(0);

        try {
            con_cliente.resultset.beforeFirst();
            while (con_cliente.resultset.next()) {
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("id_fisica"), 
                    con_cliente.resultset.getString("cpf"),
                    con_cliente.resultset.getString("nome"),
                    con_cliente.resultset.getString("DATA_NASC"),
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
            id_fisica.setText(con_cliente.resultset.getString("id_fisica"));
            cpf.setText(con_cliente.resultset.getString("cpf"));
            nome.setText(con_cliente.resultset.getString("nome"));
            data_nasc.setText(con_cliente.resultset.getString("DATA_NASC"));
            ruaa.setText(con_cliente.resultset.getString("rua"));
            bairro.setText(con_cliente.resultset.getString("bairro"));
            cidade.setText(con_cliente.resultset.getString("cidade"));
            estado.setText(con_cliente.resultset.getString("estado"));
            cep.setText(con_cliente.resultset.getString("cep"));
            telefone.setText(con_cliente.resultset.getString("telefone"));
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não localizou dados: " + erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {
        int linha_selecionada = pessoa_fisica.getSelectedRow();
        id_fisica.setText(pessoa_fisica.getValueAt(linha_selecionada, 0).toString());
        cpf.setText(pessoa_fisica.getValueAt(linha_selecionada, 1).toString());
        nome.setText(pessoa_fisica.getValueAt(linha_selecionada, 2).toString());
        data_nasc.setText(pessoa_fisica.getValueAt(linha_selecionada, 3).toString());
        ruaa.setText(pessoa_fisica.getValueAt(linha_selecionada, 4).toString());
        bairro.setText(pessoa_fisica.getValueAt(linha_selecionada, 5).toString());
        cidade.setText(pessoa_fisica.getValueAt(linha_selecionada, 6).toString());
        estado.setText(pessoa_fisica.getValueAt(linha_selecionada, 7).toString());
        cep.setText(pessoa_fisica.getValueAt(linha_selecionada, 8).toString());
        telefone.setText(pessoa_fisica.getValueAt(linha_selecionada, 9).toString());
    }
    private void tblClientesKeyPressed(java.awt.event.KeyEvent evt) {
        int linha_selecionada = pessoa_fisica.getSelectedRow();
        id_fisica.setText(pessoa_fisica.getValueAt(linha_selecionada, 0).toString());
        cpf.setText(pessoa_fisica.getValueAt(linha_selecionada, 1).toString());
        nome.setText(pessoa_fisica.getValueAt(linha_selecionada, 2).toString());
        data_nasc.setText(pessoa_fisica.getValueAt(linha_selecionada, 3).toString());
        ruaa.setText(pessoa_fisica.getValueAt(linha_selecionada, 4).toString());
        bairro.setText(pessoa_fisica.getValueAt(linha_selecionada, 5).toString());
        cidade.setText(pessoa_fisica.getValueAt(linha_selecionada, 6).toString());
        estado.setText(pessoa_fisica.getValueAt(linha_selecionada, 7).toString());
        cep.setText(pessoa_fisica.getValueAt(linha_selecionada, 8).toString());
        telefone.setText(pessoa_fisica.getValueAt(linha_selecionada, 9).toString());        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        pessoa_fisica = new javax.swing.JTable();
        novoo = new javax.swing.JButton();
        entrar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        estado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        telefone = new javax.swing.JFormattedTextField();
        alterarr = new javax.swing.JButton();
        cep = new javax.swing.JFormattedTextField();
        bairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ruaa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        data_nasc = new javax.swing.JFormattedTextField();
        nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id_fisica = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cpf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pessoa_fisica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CPF", "NOME", "DATA_NASC", "RUA", "BAIRRO", "CIDADE", "ESTADO", "CEP", "TELEFONE"
            }
        ));
        jScrollPane2.setViewportView(pessoa_fisica);

        novoo.setBackground(new java.awt.Color(153, 0, 153));
        novoo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        novoo.setText("Novo");
        novoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novooActionPerformed(evt);
            }
        });

        entrar.setBackground(new java.awt.Color(153, 0, 153));
        entrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        entrar.setText("Cadastrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        excluir.setBackground(new java.awt.Color(153, 0, 153));
        excluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        excluir.setForeground(new java.awt.Color(255, 255, 255));
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        jButtonSair.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("CEP");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Telefone");

        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        alterarr.setBackground(new java.awt.Color(153, 0, 153));
        alterarr.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        alterarr.setText("Alterar");
        alterarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarrActionPerformed(evt);
            }
        });

        try {
            cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Bairro");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Cidade");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Estado");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Rua");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Data Nascimento");

        try {
            data_nasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nome");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Digite seus Dados:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("CPF");

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(ruaa, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(data_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(id_fisica, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(6, 6, 6)))))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(312, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSair))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(alterarr)
                .addGap(18, 18, 18)
                .addComponent(entrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(novoo)
                .addGap(18, 18, 18)
                .addComponent(excluir)
                .addGap(14, 14, 14))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addComponent(jButtonSair))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_fisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(data_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluir)
                    .addComponent(entrar)
                    .addComponent(novoo)
                    .addComponent(alterarr))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novooActionPerformed
        cpf.setText("");
        telefone.setText("");
        data_nasc.setText("");

        ruaa.setText("");
        ruaa.setText("");
        bairro.setText("");
        cidade.setText("");
        nome.setText("");
        estado.setText("");
        cep.setText("");
        id_fisica.setText("");
    }//GEN-LAST:event_novooActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        String cpff = cpf.getText();
        String telefonee = telefone.getText();
        String datanasci = data_nasc.getText();
        String idpf = id_fisica.getText();
        String rua = ruaa.getText();
        String bairroo= bairro.getText();
        String cidadee = cidade.getText();
        String nomee = nome.getText();
        String estadoo = estado.getText();
        String ceep = cep.getText();
        try {
            String insertSql = "insert into pessoa_fisica (id_fisica, cpf, nome, data_nasc, rua, bairro, cidade, estado, cep ,telefone) values ('" + idpf + "', '" + cpff + "', '"+nomee+"','"+datanasci+"','" + rua + "', '" + bairroo + "', '"+cidadee+"','"+estadoo+"','"+ceep+"','"+telefonee+"');";
            con_cliente.statement.executeUpdate(insertSql);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from pessoa_fisica order by id_fisica");
            con_cliente.resultset.first();
            mostrar_Dados();
            preencherTabela();

        } catch (SQLException errosql) {
            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_entrarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:
        String sql = "";
        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro?  ", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION, 3);
            if (resposta == 0) {
                sql = "delete from pessoa_fisica where id_fisica = " + id_fisica.getText();
                int excluir = con_cliente.statement.executeUpdate(sql);
                if (excluir == 1) {
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("Select * from pessoa_fisica order by id_fisica");
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

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void alterarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarrActionPerformed
        String cpff = cpf.getText();
        String telefonee = telefone.getText();
        String datanasci = data_nasc.getText();
        String rua = ruaa.getText();
        String bairroo= bairro.getText();
        String cidadee = cidade.getText();
        String nomee = nome.getText();
        String estadoo = estado.getText();
        String ceep = cep.getText();
        String sql = "";
        String msg = "";

        try {
            if (id_fisica.getText().equals("")) {
                sql =  "insert into pessoa_fisica ( cpf, nome, data_nasc, rua, bairro, cidade, estado, cep ,telefone) values ( '" + cpff + "', '"+nomee+"','"+datanasci+"','" + rua + "', '" + bairroo + "', '"+cidadee+"','"+estadoo+"','"+ceep+"','"+telefonee+"');";
                msg = "Gravação de um novo registro";
            } else {
                sql = "update pessoa_fisica set cpf='" + cpff + "',nome='" + nomee +"', data_nasc='" + datanasci + "', rua='" + rua + "', bairro='" + bairroo +"',cidade='" + cidadee + "',estado='" + estadoo +"',cep='" + ceep +"',telefone='" + telefonee + "' where id_fisica = " + id_fisica.getText(); ;
                msg = "Alteração de registro";
            }
            
            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, msg + "realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from pessoa_fisica order by id_fisica");
            con_cliente.resultset.first();
            mostrar_Dados();
            preencherTabela();
            

        } catch (SQLException errosql) {
            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_alterarrActionPerformed

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
            java.util.logging.Logger.getLogger(Pessoa_Fisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pessoa_Fisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pessoa_Fisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pessoa_Fisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pessoa_Fisica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarr;
    private javax.swing.JTextField bairro;
    private javax.swing.JFormattedTextField cep;
    private javax.swing.JTextField cidade;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JFormattedTextField data_nasc;
    private javax.swing.JButton entrar;
    private javax.swing.JTextField estado;
    private javax.swing.JButton excluir;
    private javax.swing.JTextField id_fisica;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nome;
    private javax.swing.JButton novoo;
    private javax.swing.JTable pessoa_fisica;
    private javax.swing.JTextField ruaa;
    private javax.swing.JFormattedTextField telefone;
    // End of variables declaration//GEN-END:variables
}
