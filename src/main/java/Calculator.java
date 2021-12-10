
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public Calculator() {
        initComponents();
        setSize(220, 420);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerate    /**
ted by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jT1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton8.setText("jButton8");

        jButton23.setText("jButton23");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(39, 25));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT1ActionPerformed(evt);
            }
        });
        getContentPane().add(jT1);
        jT1.setBounds(0, 30, 200, 50);

        jButton1.setText("=");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton1.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 330, 50, 50);

        jButton2.setText("+");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton2.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 280, 50, 50);

        jButton3.setText("-");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton3.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(150, 230, 50, 50);

        jButton4.setText("×");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton4.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(150, 180, 50, 50);

        jButton6.setText("< -");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton6.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(150, 80, 50, 50);

        jButton5.setText("÷");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton5.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(150, 130, 50, 50);

        jButton7.setText(".");
        jButton7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton7.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(100, 330, 50, 50);

        jButton9.setText("6");
        jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton9.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(100, 230, 50, 50);

        jButton10.setText("9");
        jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton10.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(100, 180, 50, 50);

        jButton11.setText("%");
        jButton11.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton11.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(100, 130, 50, 50);

        jButton12.setText("C");
        jButton12.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton12.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(100, 80, 50, 50);

        jButton13.setText("3");
        jButton13.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton13.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(100, 280, 50, 50);

        jButton14.setText("0");
        jButton14.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton14.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(50, 330, 50, 50);

        jButton15.setText("2");
        jButton15.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton15.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(50, 280, 50, 50);

        jButton16.setText("5");
        jButton16.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton16.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(50, 230, 50, 50);

        jButton17.setText("8");
        jButton17.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton17.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(50, 180, 50, 50);

        jButton18.setText("x^2");
        jButton18.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton18.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(50, 130, 50, 50);

        jButton19.setText("M-");
        jButton19.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton19.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(50, 80, 50, 50);

        jButton20.setText("7");
        jButton20.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton20.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20);
        jButton20.setBounds(0, 180, 50, 50);

        jButton21.setText("1");
        jButton21.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton21.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21);
        jButton21.setBounds(0, 280, 50, 50);

        jButton22.setText("4");
        jButton22.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton22.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22);
        jButton22.setBounds(0, 230, 50, 50);

        jButton24.setText("1/x");
        jButton24.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton24.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24);
        jButton24.setBounds(0, 130, 50, 50);

        jButton25.setText("+/--");
        jButton25.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton25.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton25);
        jButton25.setBounds(0, 330, 50, 50);

        jButton26.setText("M+");
        jButton26.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton26.setPreferredSize(new java.awt.Dimension(39, 25));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton26);
        jButton26.setBounds(0, 80, 50, 50);

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("CALCULATOR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(4, 0, 200, 30);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
double a=0;
String sym;         
double ans;
double b=0;
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
   String a=jT1.getText();
        jT1.setText(a+"9");
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      b=Integer.parseInt(jT1.getText());
     if(sym=="+"){
         ans=a+b;
         jT1.setText(ans+"");
     }
     if(sym=="*"){
         ans=a*b;
         jT1.setText(ans+"");
     }
     if(sym=="-"){
         ans=a-b;
         jT1.setText(ans+"");
     }
     if(sym=="/"){
         ans=a/b;
         jT1.setText(ans+"");
     }
     if(sym=="%"){
         ans=(a*b)/100;
         jT1.setText(ans+"");
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
   String a=jT1.getText();
        jT1.setText(a+"8");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT1ActionPerformed
        
    }//GEN-LAST:event_jT1ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
   String a=jT1.getText();
        jT1.setText(a+"7");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
   String a=jT1.getText();
        jT1.setText(a+"0");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        String a=jT1.getText();
        jT1.setText(a+"3");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
          String a=jT1.getText();// TODO add your handling code here:
         jT1.setText(a+"1");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
   String a=jT1.getText();
        jT1.setText(a+".");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
   String a=jT1.getText();
        jT1.setText(a+"2");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
   String a=jT1.getText();
        jT1.setText(a+"4");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
   String a=jT1.getText();
        jT1.setText(a+"5");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
   String a=jT1.getText();
        jT1.setText(a+"6");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
  a=Double.parseDouble(jT1.getText());
   double br=1/a;
        jT1.setText(br+"");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
   a=Double.parseDouble(jT1.getText());
        jT1.setText(a*a +"");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 a=Double.parseDouble(jT1.getText());
    sym="*";
        jT1.setText("");
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 a=Double.parseDouble(jT1.getText());
 sym="-";
        jT1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 a=Double.parseDouble(jT1.getText());
    sym="+";
        jT1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
a=Double.parseDouble(jT1.getText());
    sym="/";
        jT1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
a=Double.parseDouble(jT1.getText());
    sym="%";
        jT1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       jT1.setText(jT1.getText().substring(0, jT1.getText().length()-1));
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       ans=0;
       a=0;
       sym=null;
       b=0;
        jT1.setText("");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
a=Double.parseDouble(jT1.getText());

jT1.setText("-"+a);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed

        jT1.setText(a+"");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
      
        jT1.setText(b+"");
    }//GEN-LAST:event_jButton26ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jT1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
