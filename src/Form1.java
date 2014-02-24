
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Form1.java
 *
 * Created on 07-abr-2013, 13:55:56
 */
/**
 *
 * @author GonzaloSV
 */
public class Form1 extends javax.swing.JFrame {

    Lista l1 = new Lista();
    boolean vf = true;
    /** Creates new form Form1 */
    public Form1() {
        initComponents();
        l1.cantidadPisos();
    }
    
    Timer timer1  = new javax.swing.Timer(1500, new java.awt.event.ActionListener() {
        public void actionPerformed(ActionEvent e) {
            activarTimer();
        }
    });

    void activarTimer() {
        timer1.stop();
        l1.nextP();
        mostrarPA();
        l1.vfsp();
        txtP.setText(Integer.toString(l1.cantPersona()));
        l1.vfep();
        txtP.setText(Integer.toString(l1.cantPersona()));
        personasAscensor();
        cantidaVisita();
        timer1.start();
    }

    void pisos() {
        txt0.setText(Integer.toString(l1.pActual()));
        txt5.setText(Integer.toString(0));
        txt1.setText(Integer.toString(l1.pActual()));
        txt6.setText(Integer.toString(1));
        txt2.setText(Integer.toString(l1.pActual()));
        txt7.setText(Integer.toString(2));
        txt3.setText(Integer.toString(l1.pActual()));
        txt8.setText(Integer.toString(3));
        txt4.setText(Integer.toString(l1.pActual()));
        txt9.setText(Integer.toString(4));
        txt0.setBackground(Color.black);
        txt5.setBackground(Color.white);
        txt1.setBackground(Color.black);
        txt6.setBackground(Color.white);
        txt2.setBackground(Color.black);
        txt7.setBackground(Color.white);
        txt3.setBackground(Color.black);
        txt8.setBackground(Color.white);
        txt4.setBackground(Color.black);
        txt9.setBackground(Color.white);
        p50.setBackground(Color.darkGray);
        p40.setBackground(Color.darkGray);
        p30.setBackground(Color.darkGray);
        p20.setBackground(Color.darkGray);
        p10.setBackground(Color.darkGray);
        p51.setBackground(Color.darkGray);
        p41.setBackground(Color.darkGray);
        p31.setBackground(Color.darkGray);
        p21.setBackground(Color.darkGray);
        p11.setBackground(Color.darkGray);
        p52.setBackground(Color.darkGray);
        p42.setBackground(Color.darkGray);
        p32.setBackground(Color.darkGray);
        p22.setBackground(Color.darkGray);
        p12.setBackground(Color.darkGray);
        p53.setBackground(Color.darkGray);
        p43.setBackground(Color.darkGray);
        p33.setBackground(Color.darkGray);
        p23.setBackground(Color.darkGray);
        p13.setBackground(Color.darkGray);
        p54.setBackground(Color.darkGray);
        p44.setBackground(Color.darkGray);
        p34.setBackground(Color.darkGray);
        p24.setBackground(Color.darkGray);
        p14.setBackground(Color.darkGray);
    }

    void mostrarPA() {
        int piso = l1.pActual();
        switch (piso) {
            case 0: {
                pisos();
                txt0.setBackground(Color.orange);
                txt5.setBackground(Color.darkGray);
                p50.setBackground(Color.green);
                p40.setBackground(Color.green);
                p30.setBackground(Color.green);
                p20.setBackground(Color.green);
                p10.setBackground(Color.green);
                btn0.setBackground(Color.darkGray);

            }
            break;
            case 1: {
                pisos();
                txt1.setBackground(Color.orange);
                txt6.setBackground(Color.darkGray);
                p51.setBackground(Color.green);
                p41.setBackground(Color.green);
                p31.setBackground(Color.green);
                p21.setBackground(Color.green);
                p11.setBackground(Color.green);
                btn1.setBackground(Color.darkGray);
            }
            break;
            case 2: {

                pisos();
                txt2.setBackground(Color.orange);
                txt7.setBackground(Color.darkGray);
                p52.setBackground(Color.green);
                p42.setBackground(Color.green);
                p32.setBackground(Color.green);
                p22.setBackground(Color.green);
                p12.setBackground(Color.green);
                btn2.setBackground(Color.darkGray);
            }
            break;
            case 3: {
                pisos();
                txt3.setBackground(Color.orange);
                txt8.setBackground(Color.darkGray);
                p53.setBackground(Color.green);
                p43.setBackground(Color.green);
                p33.setBackground(Color.green);
                p23.setBackground(Color.green);
                p13.setBackground(Color.green);
                btn3.setBackground(Color.darkGray);
            }
            break;
            case 4: {
                //btn4.setBackground(Color.gray);
                pisos();
                txt4.setBackground(Color.orange);
                txt9.setBackground(Color.darkGray);
                p54.setBackground(Color.green);
                p44.setBackground(Color.green);
                p34.setBackground(Color.green);
                p24.setBackground(Color.green);
                p14.setBackground(Color.green);
                btn4.setBackground(Color.darkGray);
            }
        }
    }

    void personasAscensor() {
        if (l1.cantPersona() > 0) {
            btn0.setEnabled(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
        } else {
            btn0.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
        }
    }

    void cantidaVisita() {
        Nodo p = l1.Primero();
        lbl0.setText(Integer.toString(p.getPersona()));
        p = p.getProx();
        lbl1.setText(Integer.toString(p.getPersona()));
        p = p.getProx();
        lbl2.setText(Integer.toString(p.getPersona()));
        p = p.getProx();
        lbl3.setText(Integer.toString(p.getPersona()));
        p = p.getProx();
        lbl4.setText(Integer.toString(p.getPersona()));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn0 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnGo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txt1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        p21 = new javax.swing.JTextField();
        p22 = new javax.swing.JTextField();
        p23 = new javax.swing.JTextField();
        p24 = new javax.swing.JTextField();
        p20 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txt4 = new javax.swing.JTextField();
        p51 = new javax.swing.JTextField();
        p52 = new javax.swing.JTextField();
        p53 = new javax.swing.JTextField();
        p54 = new javax.swing.JTextField();
        p50 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txt3 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        p41 = new javax.swing.JTextField();
        p42 = new javax.swing.JTextField();
        p43 = new javax.swing.JTextField();
        p44 = new javax.swing.JTextField();
        p40 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txt0 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jTextField15 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jTextField16 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jTextField17 = new javax.swing.JTextField();
        p11 = new javax.swing.JTextField();
        p12 = new javax.swing.JTextField();
        p13 = new javax.swing.JTextField();
        p14 = new javax.swing.JTextField();
        p10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txt2 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jTextField19 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jTextField20 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jTextField21 = new javax.swing.JTextField();
        p31 = new javax.swing.JTextField();
        p32 = new javax.swing.JTextField();
        p33 = new javax.swing.JTextField();
        p34 = new javax.swing.JTextField();
        p30 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl0 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(350, 100));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn0.setBackground(new java.awt.Color(51, 51, 51));
        btn0.setFont(new java.awt.Font("Narkisim", 0, 13));
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("Planta Baja");
        btn0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 80, 30));

        btn3.setBackground(new java.awt.Color(51, 51, 51));
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 40, 30));

        btn4.setBackground(new java.awt.Color(51, 51, 51));
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 40, 30));

        btn1.setBackground(new java.awt.Color(51, 51, 51));
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 40, 30));

        btn2.setBackground(new java.awt.Color(51, 51, 51));
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 40, 30));

        btnGo.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        btnGo.setForeground(new java.awt.Color(204, 0, 0));
        btnGo.setText("GO!");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 80, 60));

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 13));
        jLabel7.setText("PISOS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 40, -1));

        txt6.setEditable(false);
        txt6.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        txt6.setForeground(new java.awt.Color(255, 102, 0));
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6.setText("0");
        getContentPane().add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 20, 20));

        txt7.setEditable(false);
        txt7.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        txt7.setForeground(new java.awt.Color(255, 102, 0));
        txt7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7.setText("0");
        getContentPane().add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 20, 20));

        txt8.setEditable(false);
        txt8.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        txt8.setForeground(new java.awt.Color(255, 102, 0));
        txt8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8.setText("0");
        getContentPane().add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 20, 20));

        txt9.setEditable(false);
        txt9.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        txt9.setForeground(new java.awt.Color(255, 102, 0));
        txt9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9.setText("0");
        getContentPane().add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 20, 20));

        txt5.setEditable(false);
        txt5.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        txt5.setForeground(new java.awt.Color(255, 102, 0));
        txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5.setText("0");
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 20, 20));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setBackground(new java.awt.Color(0, 0, 0));
        txt1.setEditable(false);
        txt1.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        txt1.setForeground(new java.awt.Color(255, 0, 51));
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setText("0");
        jPanel2.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, 20));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel34.setBackground(new java.awt.Color(51, 51, 51));
        jPanel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 51, 255), new java.awt.Color(153, 0, 0)));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTextField9.setBackground(new java.awt.Color(51, 51, 51));
        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        jTextField9.setForeground(new java.awt.Color(255, 0, 51));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("0");
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 20, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 150, 140));

        p21.setBackground(new java.awt.Color(51, 51, 51));
        p21.setEditable(false);
        p21.setFont(new java.awt.Font("Miriam", 0, 10));
        p21.setForeground(new java.awt.Color(255, 0, 0));
        p21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p21.setText("1");
        jPanel2.add(p21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 10, 10));

        p22.setBackground(new java.awt.Color(51, 51, 51));
        p22.setEditable(false);
        p22.setFont(new java.awt.Font("Miriam", 0, 10));
        p22.setForeground(new java.awt.Color(255, 0, 0));
        p22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p22.setText("2");
        jPanel2.add(p22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 10, 10));

        p23.setBackground(new java.awt.Color(51, 51, 51));
        p23.setEditable(false);
        p23.setFont(new java.awt.Font("Miriam", 0, 10));
        p23.setForeground(new java.awt.Color(255, 0, 0));
        p23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p23.setText("3");
        jPanel2.add(p23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 10, 10));

        p24.setBackground(new java.awt.Color(51, 51, 51));
        p24.setEditable(false);
        p24.setFont(new java.awt.Font("Miriam", 0, 10));
        p24.setForeground(new java.awt.Color(255, 0, 0));
        p24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p24.setText("4");
        jPanel2.add(p24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 10, 10));

        p20.setBackground(new java.awt.Color(51, 51, 51));
        p20.setEditable(false);
        p20.setFont(new java.awt.Font("Miriam", 0, 10));
        p20.setForeground(new java.awt.Color(255, 0, 0));
        p20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p20.setText("0");
        jPanel2.add(p20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 10, 10));

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ascensor.jpg"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 170, 120));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt4.setBackground(new java.awt.Color(0, 0, 0));
        txt4.setEditable(false);
        txt4.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        txt4.setForeground(new java.awt.Color(255, 0, 51));
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4.setText("0");
        jPanel4.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 20, 20));

        p51.setBackground(new java.awt.Color(51, 51, 51));
        p51.setEditable(false);
        p51.setFont(new java.awt.Font("Miriam", 0, 10));
        p51.setForeground(new java.awt.Color(204, 0, 0));
        p51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p51.setText("1");
        jPanel4.add(p51, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 10, 10));

        p52.setBackground(new java.awt.Color(51, 51, 51));
        p52.setEditable(false);
        p52.setFont(new java.awt.Font("Miriam", 0, 10));
        p52.setForeground(new java.awt.Color(204, 0, 0));
        p52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p52.setText("2");
        jPanel4.add(p52, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 10, 10));

        p53.setBackground(new java.awt.Color(51, 51, 51));
        p53.setEditable(false);
        p53.setFont(new java.awt.Font("Miriam", 0, 10));
        p53.setForeground(new java.awt.Color(204, 0, 0));
        p53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p53.setText("3");
        jPanel4.add(p53, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 10, 10));

        p54.setBackground(new java.awt.Color(51, 51, 51));
        p54.setEditable(false);
        p54.setFont(new java.awt.Font("Miriam", 0, 10));
        p54.setForeground(new java.awt.Color(204, 0, 0));
        p54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p54.setText("4");
        jPanel4.add(p54, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 10, 10));

        p50.setBackground(new java.awt.Color(51, 51, 51));
        p50.setEditable(false);
        p50.setFont(new java.awt.Font("Miriam", 0, 10));
        p50.setForeground(new java.awt.Color(204, 0, 0));
        p50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p50.setText("0");
        jPanel4.add(p50, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 10, 10));

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ascensor.jpg"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 140));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt3.setBackground(new java.awt.Color(0, 0, 0));
        txt3.setEditable(false);
        txt3.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        txt3.setForeground(new java.awt.Color(255, 0, 51));
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3.setText("0");
        jPanel6.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, 20));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel37.setBackground(new java.awt.Color(51, 51, 51));
        jPanel37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 51, 255), new java.awt.Color(153, 0, 0)));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTextField13.setBackground(new java.awt.Color(51, 51, 51));
        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        jTextField13.setForeground(new java.awt.Color(255, 0, 51));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("0");
        jPanel7.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 20, 20));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 150, 140));

        p41.setBackground(new java.awt.Color(51, 51, 51));
        p41.setEditable(false);
        p41.setFont(new java.awt.Font("Miriam", 0, 10));
        p41.setForeground(new java.awt.Color(255, 0, 0));
        p41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p41.setText("1");
        jPanel6.add(p41, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 10, 10));

        p42.setBackground(new java.awt.Color(51, 51, 51));
        p42.setEditable(false);
        p42.setFont(new java.awt.Font("Miriam", 0, 10));
        p42.setForeground(new java.awt.Color(255, 0, 0));
        p42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p42.setText("2");
        jPanel6.add(p42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 10, 10));

        p43.setBackground(new java.awt.Color(51, 51, 51));
        p43.setEditable(false);
        p43.setFont(new java.awt.Font("Miriam", 0, 10));
        p43.setForeground(new java.awt.Color(255, 0, 0));
        p43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p43.setText("3");
        jPanel6.add(p43, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 10, 10));

        p44.setBackground(new java.awt.Color(51, 51, 51));
        p44.setEditable(false);
        p44.setFont(new java.awt.Font("Miriam", 0, 10));
        p44.setForeground(new java.awt.Color(255, 0, 0));
        p44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p44.setText("4");
        jPanel6.add(p44, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, 10));

        p40.setBackground(new java.awt.Color(51, 51, 51));
        p40.setEditable(false);
        p40.setFont(new java.awt.Font("Miriam", 0, 10));
        p40.setForeground(new java.awt.Color(255, 0, 0));
        p40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p40.setText("0");
        jPanel6.add(p40, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 10, 10));

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ascensor.jpg"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, 120));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt0.setBackground(new java.awt.Color(0, 0, 0));
        txt0.setEditable(false);
        txt0.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        txt0.setForeground(new java.awt.Color(255, 0, 51));
        txt0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt0.setText("0");
        jPanel8.add(txt0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, 20));

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel39.setBackground(new java.awt.Color(51, 51, 51));
        jPanel39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 51, 255), new java.awt.Color(153, 0, 0)));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTextField15.setBackground(new java.awt.Color(51, 51, 51));
        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        jTextField15.setForeground(new java.awt.Color(255, 0, 51));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("0");
        jPanel9.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 20, 20));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 150, 140));

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField16.setBackground(new java.awt.Color(51, 51, 51));
        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        jTextField16.setForeground(new java.awt.Color(255, 0, 51));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("0");
        jPanel10.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 20, 20));

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel40.setBackground(new java.awt.Color(51, 51, 51));
        jPanel40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 51, 255), new java.awt.Color(153, 0, 0)));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTextField17.setBackground(new java.awt.Color(51, 51, 51));
        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        jTextField17.setForeground(new java.awt.Color(255, 0, 51));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("0");
        jPanel11.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 20, 20));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 150, 140));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 150, 140));

        p11.setBackground(new java.awt.Color(51, 51, 51));
        p11.setEditable(false);
        p11.setFont(new java.awt.Font("Miriam", 0, 10));
        p11.setForeground(new java.awt.Color(255, 0, 0));
        p11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p11.setText("1");
        jPanel8.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 10, 10));

        p12.setBackground(new java.awt.Color(51, 51, 51));
        p12.setEditable(false);
        p12.setFont(new java.awt.Font("Miriam", 0, 10));
        p12.setForeground(new java.awt.Color(255, 0, 0));
        p12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p12.setText("2");
        jPanel8.add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 10, 10));

        p13.setBackground(new java.awt.Color(51, 51, 51));
        p13.setEditable(false);
        p13.setFont(new java.awt.Font("Miriam", 0, 10));
        p13.setForeground(new java.awt.Color(255, 0, 0));
        p13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p13.setText("3");
        jPanel8.add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 10, 10));

        p14.setBackground(new java.awt.Color(51, 51, 51));
        p14.setEditable(false);
        p14.setFont(new java.awt.Font("Miriam", 0, 10));
        p14.setForeground(new java.awt.Color(255, 0, 0));
        p14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p14.setText("4");
        jPanel8.add(p14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 10, 10));

        p10.setBackground(new java.awt.Color(51, 51, 51));
        p10.setEditable(false);
        p10.setFont(new java.awt.Font("Miriam", 0, 10));
        p10.setForeground(new java.awt.Color(255, 0, 0));
        p10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p10.setText("0");
        jPanel8.add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 10, 10));

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ascensor.jpg"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 170, 120));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt2.setBackground(new java.awt.Color(0, 0, 0));
        txt2.setEditable(false);
        txt2.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        txt2.setForeground(new java.awt.Color(255, 0, 51));
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.setText("0");
        jPanel12.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, 20));

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel41.setBackground(new java.awt.Color(51, 51, 51));
        jPanel41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 51, 255), new java.awt.Color(153, 0, 0)));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTextField19.setBackground(new java.awt.Color(51, 51, 51));
        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        jTextField19.setForeground(new java.awt.Color(255, 0, 51));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("0");
        jPanel13.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 20, 20));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 150, 140));

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField20.setBackground(new java.awt.Color(51, 51, 51));
        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        jTextField20.setForeground(new java.awt.Color(255, 0, 51));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("0");
        jPanel14.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 20, 20));

        jPanel15.setBackground(new java.awt.Color(102, 102, 102));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel42.setBackground(new java.awt.Color(51, 51, 51));
        jPanel42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 51, 255), new java.awt.Color(153, 0, 0)));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTextField21.setBackground(new java.awt.Color(51, 51, 51));
        jTextField21.setEditable(false);
        jTextField21.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14));
        jTextField21.setForeground(new java.awt.Color(255, 0, 51));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("0");
        jPanel15.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 20, 20));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 150, 140));

        jPanel12.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 150, 140));

        p31.setBackground(new java.awt.Color(51, 51, 51));
        p31.setEditable(false);
        p31.setFont(new java.awt.Font("Miriam", 0, 10));
        p31.setForeground(new java.awt.Color(255, 0, 0));
        p31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p31.setText("1");
        jPanel12.add(p31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 10, 10));

        p32.setBackground(new java.awt.Color(51, 51, 51));
        p32.setEditable(false);
        p32.setFont(new java.awt.Font("Miriam", 0, 10));
        p32.setForeground(new java.awt.Color(255, 0, 0));
        p32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p32.setText("2");
        jPanel12.add(p32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 10, 10));

        p33.setBackground(new java.awt.Color(51, 51, 51));
        p33.setEditable(false);
        p33.setFont(new java.awt.Font("Miriam", 0, 10));
        p33.setForeground(new java.awt.Color(255, 0, 0));
        p33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p33.setText("3");
        jPanel12.add(p33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 10, 10));

        p34.setBackground(new java.awt.Color(51, 51, 51));
        p34.setEditable(false);
        p34.setFont(new java.awt.Font("Miriam", 0, 10));
        p34.setForeground(new java.awt.Color(255, 0, 0));
        p34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p34.setText("4");
        jPanel12.add(p34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 10, 10));

        p30.setBackground(new java.awt.Color(51, 51, 51));
        p30.setEditable(false);
        p30.setFont(new java.awt.Font("Miriam", 0, 10));
        p30.setForeground(new java.awt.Color(255, 0, 0));
        p30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p30.setText("0");
        jPanel12.add(p30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 10, 10));

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ascensor.jpg"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel12.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 170, 120));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 290, 10));

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 10, 600));

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Contador de Visistas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        jLabel2.setText("Piso 1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("Piso 2:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        jLabel4.setForeground(new java.awt.Color(51, 102, 0));
        jLabel4.setText("Piso 3:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jLabel5.setForeground(new java.awt.Color(51, 102, 0));
        jLabel5.setText("Piso 4:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        jLabel6.setForeground(new java.awt.Color(51, 102, 0));
        jLabel6.setText("Piso 0:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        lbl1.setForeground(new java.awt.Color(0, 51, 153));
        lbl1.setText("0");
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 20, -1));

        lbl4.setForeground(new java.awt.Color(0, 51, 153));
        lbl4.setText("0");
        getContentPane().add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 20, -1));

        lbl3.setForeground(new java.awt.Color(0, 51, 153));
        lbl3.setText("0");
        getContentPane().add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 20, -1));

        lbl2.setForeground(new java.awt.Color(0, 51, 153));
        lbl2.setText("0");
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 20, -1));

        lbl0.setForeground(new java.awt.Color(0, 51, 153));
        lbl0.setText("0");
        getContentPane().add(lbl0, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 20, -1));

        jLabel13.setForeground(new java.awt.Color(153, 0, 51));
        jLabel13.setText("dentro el ascensor");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

        jLabel14.setForeground(new java.awt.Color(153, 0, 51));
        jLabel14.setText("Cantidad de Personas ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        jLabel15.setForeground(new java.awt.Color(153, 0, 51));
        jLabel15.setText("Estado Actual desl Ascensor");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 170, -1));

        txtP.setFont(new java.awt.Font("Microsoft JhengHei", 0, 36));
        txtP.setForeground(new java.awt.Color(153, 204, 0));
        txtP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtP.setText("0");
        getContentPane().add(txtP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 40, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:
        l1.iniciar();
        if (vf == false) {
            l1.vfsp();
        }
        txtP.setText(Integer.toString(l1.cantPersona()));
        l1.vfep();
        txtP.setText(Integer.toString(l1.cantPersona()));
        mostrarPA();
        personasAscensor();
        cantidaVisita();
        timer1.start();
        vf = true;
    }//GEN-LAST:event_btnGoActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        l1.setPiso(3);
        btn3.setBackground(Color.red);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        l1.setPiso(0);
        btn0.setBackground(Color.red);

    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        l1.setPiso(1);
        btn1.setBackground(Color.red);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        l1.setPiso(2);
        btn2.setBackground(Color.red);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        l1.setPiso(4);
        btn4.setBackground(Color.red);
    }//GEN-LAST:event_btn4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Form1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btnGo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbl0;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JTextField p10;
    private javax.swing.JTextField p11;
    private javax.swing.JTextField p12;
    private javax.swing.JTextField p13;
    private javax.swing.JTextField p14;
    private javax.swing.JTextField p20;
    private javax.swing.JTextField p21;
    private javax.swing.JTextField p22;
    private javax.swing.JTextField p23;
    private javax.swing.JTextField p24;
    private javax.swing.JTextField p30;
    private javax.swing.JTextField p31;
    private javax.swing.JTextField p32;
    private javax.swing.JTextField p33;
    private javax.swing.JTextField p34;
    private javax.swing.JTextField p40;
    private javax.swing.JTextField p41;
    private javax.swing.JTextField p42;
    private javax.swing.JTextField p43;
    private javax.swing.JTextField p44;
    private javax.swing.JTextField p50;
    private javax.swing.JTextField p51;
    private javax.swing.JTextField p52;
    private javax.swing.JTextField p53;
    private javax.swing.JTextField p54;
    private javax.swing.JTextField txt0;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JLabel txtP;
    // End of variables declaration//GEN-END:variables
}
