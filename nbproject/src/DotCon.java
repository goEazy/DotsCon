
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class DotCon extends javax.swing.JFrame implements MouseListener 
{
    public DotCon() 
    {
        initComponents();
        
    }
    private void update(String lab)
    {
        String axis = lab.substring(0,1);
        int pos = Integer.parseInt(lab.substring(1));
        int temp = (pos%8)*8 + (pos/8 - 1);
        if(axis.equalsIgnoreCase("x") && arrX[pos] == 0 && ((sc1 + sc2) < 64))
        {          
            marksX[pos].setBackground(Color.BLACK);
            arrX[pos] = 1;
            change = true;
            if((pos > 7) && (arrY[temp] == 1 && arrY[temp + 8] == 1 && arrX[pos - 8] == 1))
            {
                change = false;
                if(player)
                {
                    sc1++;
                    score1.setText(sc1 + "");
                    box[pos - 8].setBackground(Color.YELLOW);
                }
                else
                {                   
                    sc2++;
                    score2.setText(sc2+ "");
                    box[pos - 8].setBackground(Color.RED);
                }
            }
            temp++;
            if((pos < 64)&& (arrY[temp] == 1 && arrY[temp + 8] == 1 && arrX[pos + 8] == 1))
            {
                change = false;
                if(player)
                {
                    sc1++;
                    score1.setText(sc1 + "");
                    box[pos].setBackground(Color.YELLOW);
                }
                else
                {                   
                    sc2++;
                    score2.setText(sc2 + "");
                    box[pos].setBackground(Color.RED);
                }
            }
            if(change)
                player = !player;
        }
        if(axis.equalsIgnoreCase("y") && arrY[pos] == 0 && (sc1 + sc2) < 64)  
        {
            change = true;
            marksY[pos].setBackground(Color.BLACK);
            arrY[pos] = 1;
            if((pos > 8) &&(arrX[temp] == 1 && arrX[temp + 8] == 1 && arrY[pos - 8] == 1))
            {
                change = false;
                if(player)
                {
                    sc1++;
                    score1.setText(sc1 + "");
                    box[temp].setBackground(Color.YELLOW);
                }
                else
                {                   
                    sc2++;
                    score2.setText(sc2 + "");
                    box[temp].setBackground(Color.RED);
                }
            }
            temp++;
            if((pos < 64)&& (arrX[temp] == 1 && arrX[temp + 8] == 1 && arrY[pos + 8] == 1))
            {
                change = false;
                if(player)
                {
                    sc1++;
                    score1.setText(sc1 + "");
                    box[temp].setBackground(Color.YELLOW);
                }
                else
                {                   
                    sc2++;
                    score2.setText(sc2 + "");
                    box[temp].setBackground(Color.RED);
                }
            }
            if(change)
                player = !player;
        }
        if(player)
        {
            player1.setBackground(Color.orange);
            player2.setBackground(Color.white);
        }
        else
        {
            player2.setBackground(Color.orange);
            player1.setBackground(Color.white);
        }    
        if(sc1 + sc2 == 64)
        {
            jLabel8.setVisible(true);
            if(sc1 > sc2)
            {
                jLabel8.setText(player1.getText() + "  WON");
            }
            else if(sc1 == sc2)
            {
                jLabel8.setText("MATCH DRAW");
            }
            else
            {
                jLabel8.setText(player2.getText() + "  WON");
            }
        }
    }
    private void newGame()
    {
        for(i= 0; i < 72; i++)
            arrX[i] = 0;
        for(i= 0; i < 72; i++)
            arrY[i] = 0;
        count = 0;
        for(i = 0; i < 9; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                marksY[count].setBackground(new java.awt.Color(204, 204, 255));
                marksX[count].setBackground(new java.awt.Color(204, 204, 255));
                count++;
            }
        }
        count = 0;
        for(i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                box[count].setBackground(Color.WHITE);
                count++;
            }
        }
        score1.setText("0");
        score2.setText("0");
        jLabel8.setVisible(false);
        change = true;
    }
    private void initComponents() 
    {
        
        jPanel1 = new javax.swing.JPanel();
        dots = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1400, 900));
        setMinimumSize(new java.awt.Dimension(1400, 900));
        setPreferredSize(new java.awt.Dimension(1400, 900));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1400, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(1400, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 900));
        jPanel1.setLayout(null);
        
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        
        player2 = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        
        score2 = new javax.swing.JLabel();
        score1 = new javax.swing.JLabel();

        jButton1 = new javax.swing.JButton();
        
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1400, 900));
        setMinimumSize(new java.awt.Dimension(1400, 900));
        setPreferredSize(new java.awt.Dimension(1400, 900));
        getContentPane().setLayout(null);
        
        jPanel1.setLayout(null);

        dots.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harsh\\Pictures\\dotsall\\qwe.png")); // NOI18N
        dots.setMaximumSize(new java.awt.Dimension(520, 520));
        dots.setMinimumSize(new java.awt.Dimension(520, 520));
        dots.setPreferredSize(new java.awt.Dimension(520, 520));
        jPanel1.add(dots);
        dots.setBounds(30, 20, 520, 510);

        
        jLabel1.setBackground(java.awt.Color.red);
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(670, 310, 50, 50);

        jLabel2.setBackground(java.awt.Color.yellow);
        jLabel2.setOpaque(true);
        
        jPanel1.add(jLabel2);
        jLabel2.setBounds(670, 240, 50, 50);

        player1.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        
        player1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player1.setText("");
        player1.setBackground(Color.orange);
        player1.setVisible(false);
        player1.setOpaque(true);
        jPanel1.add(player1);
        player1.setBounds(730, 250, 50, 30);
        
        player2.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        
        player2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player2.setText("");
        player2.setVisible(false);
        player2.setOpaque(true);
        player2.setBackground(Color.white);
        jPanel1.add(player2);
        player2.setBounds(730, 320, 50, 30);

        score2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        score2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(score2);
        score2.setBounds(820, 310, 50, 50);

        score1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        score1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(score1);
        score1.setBounds(820, 240, 50, 50);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(730, 250, 80, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(730, 320, 80, 30);

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel6.setText("Enter the Players Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(670, 194, 220, 20);
 	
        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel8.setText("");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1010, 280, 360, 50);
        jLabel8.setVisible(false);
        count = 0;
        for(i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                box[count] = new JLabel();
                jPanel1.add(box[count]);
                box[count].setBounds(50+ 60*j, 40 + 60*i, 50, 50);
                box[count].setOpaque(true);
                count++;
            }
        }
        count = 0;
        for(i = 0; i < 9; i++)
        {
            for(int j = 0; j < 8; j++)
            {
		marksY[count] = new JLabel();
                jPanel1.add(marksY[count]);
                marksY[count].setBounds(40+ 60*i, 40 + 60*j, 10, 50);
                marksY[count].setName("y" + count);
                marksY[count].setOpaque(true);
                marksY[count].addMouseListener(this);
                marksY[count].setEnabled(false);
                
                marksX[count] = new JLabel();
                jPanel1.add(marksX[count]);
                marksX[count].setBounds(50+ 60*j, 30 + 60*i, 50, 10);
                marksX[count].setOpaque(true);
                marksX[count].setName("x" + count);
                marksX[count].addMouseListener(this);
                
                count++;
            }
        }
        jButton1.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(700, 450, 130, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1400, 900);
        newGame();
    }// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(DotCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DotCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DotCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DotCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DotCon().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JLabel dots;
    private javax.swing.JLabel marksX[] = new JLabel[72];
    private javax.swing.JLabel marksY[] = new JLabel[72];
    private javax.swing.JLabel box[] = new JLabel[64];
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JLabel score1;
    private javax.swing.JLabel score2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private int arrX[] = new int[72];
    private int arrY[] = new int[72];
    private int i, count = 0;
    private int sc1 = 0,sc2 = 0;
        
    private boolean gamePlay = false;
    private boolean change = true;
    private boolean player = true;
    // End of variables declaration                   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(jTextField3.getText().length() > 1 && jTextField4.getText().length() > 1)
        {
            
            jTextField3.setVisible(false);
            
            jTextField4.setVisible(false);
            player1.setVisible(true);
            player2.setVisible(true);
            player1.setText(jTextField3.getText());
            player2.setText(jTextField4.getText());
            jLabel6.setVisible(false);
            jButton1.setText("Restart");
            gamePlay = true;
            newGame();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please Fill the Names");
        }
        
    } 
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() instanceof JLabel && gamePlay)
        {
                String text = ((JLabel)e.getSource()).getName();
                update(text);
                
            
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
