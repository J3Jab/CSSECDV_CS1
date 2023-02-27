
package View;

import Controller.Secure;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JPanel {

    public Frame frame;
    
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerBtn = new javax.swing.JButton();
        passwordFld = new javax.swing.JPasswordField();
        usernameFld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        confpassFld = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_length = new javax.swing.JLabel();
        lbl_uppercase = new javax.swing.JLabel();
        lbl_lowercase = new javax.swing.JLabel();
        lbl_number = new javax.swing.JLabel();
        lbl_specialChar = new javax.swing.JLabel();
        SecQuestionFld = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SecAnswerFld = new javax.swing.JTextField();
        lbl_whiteSpace = new javax.swing.JLabel();

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        passwordFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFldKeyReleased(evt);
            }
        });

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        confpassFld.setBackground(new java.awt.Color(240, 240, 240));
        confpassFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confpassFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confpassFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PASSWORD REQUIREMENTS");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl_length.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_length.setText("At least 12 characters");

        lbl_uppercase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_uppercase.setText("At least one uppercase letter [A-Z]");

        lbl_lowercase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_lowercase.setText("At least one lowercase letter [a-z]");

        lbl_number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_number.setText("At least one numeric character [0-9]");

        lbl_specialChar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_specialChar.setText("At least one special character (i.e. !@#$%&*()'+,-./)");

        SecQuestionFld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your first dog?", "What is your mother's maiden name?", "Where were you born?" }));
        SecQuestionFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecQuestionFldActionPerformed(evt);
            }
        });

        jLabel3.setText("SECURITY QUESTION");

        jLabel4.setText("Your Answer");

        SecAnswerFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecAnswerFldActionPerformed(evt);
            }
        });

        lbl_whiteSpace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_whiteSpace.setText("Should not contain white spaces");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SecAnswerFld))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SecQuestionFld, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                            .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameFld, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(confpassFld, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_length, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_uppercase, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(lbl_lowercase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_number, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_specialChar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_whiteSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(83, 83, 83)))
                        .addGap(131, 131, 131))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confpassFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SecQuestionFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SecAnswerFld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_length, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_number, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_uppercase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_specialChar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_lowercase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_whiteSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        boolean registerFlag = false;
        
        if(usernameFld.getText().isEmpty() || passwordFld.getText().isEmpty() || confpassFld.getText().isEmpty() || SecAnswerFld.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: one or more fields are empty", "Error: Registration", JOptionPane.ERROR_MESSAGE);
        }
        else if(usernameFld.getText().contains(" ")){
            JOptionPane.showMessageDialog(null, "Error: Username should not contain empty spaces.", "Error: Registration", JOptionPane.ERROR_MESSAGE);
        }
        else if(!frame.secure.chkIfSame(passwordFld.getText(), confpassFld.getText())){
            JOptionPane.showMessageDialog(null, "Error: password and confirm password are not the same", "Error: Registration", JOptionPane.ERROR_MESSAGE);
        }
        else if (!checkString(passwordFld.getText())){
            JOptionPane.showMessageDialog(null, "Error: password does not meet requirements", "Error: Registration", JOptionPane.ERROR_MESSAGE);
        }
        else if(frame.main.sqlite.checkIfUsernameTaken(usernameFld.getText())){
            JOptionPane.showMessageDialog(null, "Error: username already taken", "Error: Registration", JOptionPane.ERROR_MESSAGE);
        }
        else{
            frame.registerAction(usernameFld.getText(), Secure.encrypt(passwordFld.getText()), confpassFld.getText(), SecQuestionFld.getSelectedItem().toString(), Secure.encrypt(SecAnswerFld.getText()));
            frame.main.sqlite.addLogs("REGISTER SUCCESS", usernameFld.getText(), "User Registration Successful", null);
            usernameFld.setText("");
            passwordFld.setText("");
            confpassFld.setText("");
            JOptionPane.showMessageDialog(null, "Registration Successful!");
            frame.loginNav();
            registerFlag = true;
        }
        
        if(!registerFlag){
            frame.main.sqlite.addLogs("REGISTER FAIL", usernameFld.getText(), "User Registration Failure", null);
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        usernameFld.setText("");
        passwordFld.setText("");
        confpassFld.setText("");
        frame.loginNav();
    }//GEN-LAST:event_backBtnActionPerformed

    private boolean checkString(String str) {
    char ch;
    boolean upperCaseFlag = false;
    boolean lowerCaseFlag = false;
    boolean numberFlag = false;
    boolean lengthFlag = false;
    boolean specialFlag = false;
    boolean whiteSpaceFlag = false;
    
    String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
    
    if(str.length() >= 12){
        lengthFlag = true;
        lbl_length.setForeground(Color.green.darker());
    }
    for(int i=0;i < str.length();i++) {
        ch = str.charAt(i);
        if(Character.isWhitespace(ch)){
            whiteSpaceFlag = true;
            lbl_whiteSpace.setForeground(Color.red);
        }
        if(Character.isDigit(ch)) {
            numberFlag = true;
            lbl_number.setForeground(Color.green.darker());
        }
        if (Character.isUpperCase(ch)) {
            upperCaseFlag = true;
            lbl_uppercase.setForeground(Color.green.darker());
        } 
        if (Character.isLowerCase(ch)) {
            lowerCaseFlag = true;
            lbl_lowercase.setForeground(Color.green.darker());
        } 
        
        if(specialCharactersString.contains(Character.toString(ch))) {
            specialFlag = true;
            lbl_specialChar.setForeground(Color.green.darker());
        }
    }
    
    if(!whiteSpaceFlag)
        lbl_whiteSpace.setForeground(Color.green.darker());
    
    if(!numberFlag)
            lbl_number.setForeground(Color.red);
        
    if(!upperCaseFlag)
        lbl_uppercase.setForeground(Color.red);

    if(!lowerCaseFlag)
        lbl_lowercase.setForeground(Color.red);

    if(!lengthFlag)
        lbl_length.setForeground(Color.red);
    
    if(!specialFlag)
        lbl_specialChar.setForeground(Color.red);
    
    if(numberFlag && upperCaseFlag && lowerCaseFlag && lengthFlag && specialFlag)
        return true;
    else
        return false;
}
    private void passwordFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFldKeyReleased
       checkString(passwordFld.getText());
    }//GEN-LAST:event_passwordFldKeyReleased

    private void SecAnswerFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecAnswerFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecAnswerFldActionPerformed

    private void SecQuestionFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecQuestionFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecQuestionFldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SecAnswerFld;
    private javax.swing.JComboBox<String> SecQuestionFld;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField confpassFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_length;
    private javax.swing.JLabel lbl_lowercase;
    private javax.swing.JLabel lbl_number;
    private javax.swing.JLabel lbl_specialChar;
    private javax.swing.JLabel lbl_uppercase;
    private javax.swing.JLabel lbl_whiteSpace;
    private javax.swing.JTextField passwordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
