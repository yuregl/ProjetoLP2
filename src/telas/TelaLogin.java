package telas;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import simpleclass.Persistencia;
import simpleclass.Usuario;

public class TelaLogin extends javax.swing.JFrame {

    /**Variáveis*/
    private static Persistencia arquivo = new Persistencia();
    private static LinkedList<Usuario> userList = new LinkedList<Usuario>();
    private static int posicaoListaUser;//pegar a posição do usuário na LinkedList
    private static Usuario usuario;
       
    public TelaLogin() {
        arquivo.setupLer("logins.txt");
        if(arquivo.getContinua()){
            arquivo.readRecords();
            arquivo.cleanupLer();
            userList  = arquivo.getUser();
        }
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void getUsuario(Usuario usuario){//para poder pegar os dados do usuário sem precisar sempre passar a lista como parêmetro, será mais usado na classe TelaJogo
        this.usuario = usuario;
    }
    
    public int getPosicaoListaUser(){//ainda estou em decisão se deixo isso pq não tenho certeza se vou precisar mesmo
        return this.posicaoListaUser;
    }
        
    public static void addUsuarioLista(Usuario user){
        userList.add(user);
    }
    
    public static void alteraUsuario(Usuario user){
        userList.set(posicaoListaUser, user);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTelaLogin = new javax.swing.JPanel();
        lblTLNomeUsuario = new javax.swing.JLabel();
        txtTLNomeUsuario = new javax.swing.JTextField();
        lblTLSenha = new javax.swing.JLabel();
        btnTLEntra = new javax.swing.JButton();
        btnTLCadastra = new javax.swing.JButton();
        txtTLSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTLNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTLNomeUsuario.setText("Nome de Usuário:");

        txtTLNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTLNomeUsuarioActionPerformed(evt);
            }
        });

        lblTLSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTLSenha.setText("Senha:");

        btnTLEntra.setText("Entrar");
        btnTLEntra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTLEntraActionPerformed(evt);
            }
        });

        btnTLCadastra.setText("Cadastrar");
        btnTLCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTLCadastraActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/LOGOatt.png"))); // NOI18N

        javax.swing.GroupLayout pnlTelaLoginLayout = new javax.swing.GroupLayout(pnlTelaLogin);
        pnlTelaLogin.setLayout(pnlTelaLoginLayout);
        pnlTelaLoginLayout.setHorizontalGroup(
            pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaLoginLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTelaLoginLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnTLEntra)
                        .addGap(119, 119, 119)
                        .addComponent(btnTLCadastra))
                    .addGroup(pnlTelaLoginLayout.createSequentialGroup()
                        .addGroup(pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTLNomeUsuario)
                            .addComponent(lblTLSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTLNomeUsuario)
                            .addComponent(txtTLSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelaLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        pnlTelaLoginLayout.setVerticalGroup(
            pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTLNomeUsuario)
                    .addComponent(txtTLNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTLSenha)
                    .addComponent(txtTLSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(pnlTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTLEntra)
                    .addComponent(btnTLCadastra))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTLNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTLNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTLNomeUsuarioActionPerformed

    private void btnTLCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTLCadastraActionPerformed
        // TODO add your handling code here:     
        TelaCadastro cad = new TelaCadastro(userList);
        cad.setVisible(true);
    }//GEN-LAST:event_btnTLCadastraActionPerformed

    private void btnTLEntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTLEntraActionPerformed
        // TODO add your handling code here:
        posicaoListaUser = 0;
        int entra = 0, msgSenha = 0, msgUsuario = 0;
        String senha = new String(txtTLSenha.getPassword());
        for(Usuario us : userList){
            if(us.getNomeUsuario().equals(txtTLNomeUsuario.getText())){
                if(us.getSenha().equals(senha)){    
                    posicaoListaUser = userList.indexOf(us);
                    entra = 1;
                    break;
                }else{
                    msgSenha = 1;
                }
            }else{
                msgUsuario = 1;
            }
        }
        if(entra == 1){
            usuario = userList.get(posicaoListaUser);
            TelaInicio inic = new TelaInicio(usuario);
            entra = 0;
            inic.setVisible(true);
            this.dispose();            
        }else{
            if(msgUsuario == 1){
                JOptionPane.showMessageDialog(this, "Usuário não encontrado");
            }
            if(msgSenha == 1){
                JOptionPane.showMessageDialog(this, "Você digitou a senha errada");
            }
            txtTLNomeUsuario.setText("");
            txtTLSenha.setText("");
        }

    }//GEN-LAST:event_btnTLEntraActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        arquivo.setupGravar("logins.txt");
        arquivo.addRecords(userList);
        arquivo.cleanupGravar();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTLCadastra;
    private javax.swing.JButton btnTLEntra;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTLNomeUsuario;
    private javax.swing.JLabel lblTLSenha;
    private javax.swing.JPanel pnlTelaLogin;
    private javax.swing.JTextField txtTLNomeUsuario;
    private javax.swing.JPasswordField txtTLSenha;
    // End of variables declaration//GEN-END:variables
}
