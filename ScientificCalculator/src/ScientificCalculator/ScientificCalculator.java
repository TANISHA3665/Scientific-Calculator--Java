/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ScientificCalculator;

import java.awt.Dimension;

/**
 *
 * @author Tanishaa
 */
public class ScientificCalculator extends javax.swing.JFrame {
    
    double firstNum;
    double secondNum;
    double result;
    String operations;
    private Object math;
    
    public ScientificCalculator() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jbtnSquareRoot = new javax.swing.JButton();
        jbtnBackSpace = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtnAdd = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtnMultiply = new javax.swing.JButton();
        jbtnSubtract = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtnPlusMinus = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnEquals = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnPi = new javax.swing.JButton();
        jbtnSin = new javax.swing.JButton();
        jbtnLog = new javax.swing.JButton();
        jbtnSinh = new javax.swing.JButton();
        jbtnXY = new javax.swing.JButton();
        jbtnTan = new javax.swing.JButton();
        jbtnTanh = new javax.swing.JButton();
        jbtnXY2 = new javax.swing.JButton();
        jbtnCbr = new javax.swing.JButton();
        jbtnRound = new javax.swing.JButton();
        jbtnOctal = new javax.swing.JButton();
        jbtnHex = new javax.swing.JButton();
        jbtnXY3 = new javax.swing.JButton();
        jbtnCosh = new javax.swing.JButton();
        jbtnCos = new javax.swing.JButton();
        jtxtDisplay = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jbtnSquareRoot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnSquareRoot.setText("√");
        jbtnSquareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSquareRootActionPerformed(evt);
            }
        });

        jbtnBackSpace.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jbtnBackSpace.setText("←");
        jbtnBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackSpaceActionPerformed(evt);
            }
        });

        jbtn8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnAdd.setText("+");

        jbtnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnClear.setText("C");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });

        jbtn7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtnDivide.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDivide.setText("/");

        jbtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtnMultiply.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnMultiply.setText("*");

        jbtnSubtract.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnSubtract.setText("-");

        jbtn9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtn3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtnPlusMinus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnPlusMinus.setText("±");
        jbtnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusMinusActionPerformed(evt);
            }
        });

        jbtn0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtnEquals.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnEquals.setText("=");

        jbtnDot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });

        jbtnPi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnPi.setText("π");
        jbtnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPiActionPerformed(evt);
            }
        });

        jbtnSin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnSin.setText("Sin");
        jbtnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinActionPerformed(evt);
            }
        });

        jbtnLog.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnLog.setText("Log");
        jbtnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogActionPerformed(evt);
            }
        });

        jbtnSinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnSinh.setText("Sinh");
        jbtnSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinhActionPerformed(evt);
            }
        });

        jbtnXY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnXY.setText("x^y");
        jbtnXY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXYActionPerformed(evt);
            }
        });

        jbtnTan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnTan.setText("Tan");
        jbtnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTanActionPerformed(evt);
            }
        });

        jbtnTanh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnTanh.setText("Tanh");
        jbtnTanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTanhActionPerformed(evt);
            }
        });

        jbtnXY2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnXY2.setText("x^2");
        jbtnXY2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXY2ActionPerformed(evt);
            }
        });

        jbtnCbr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnCbr.setText("Cbr");
        jbtnCbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCbrActionPerformed(evt);
            }
        });

        jbtnRound.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnRound.setText("Rnd");
        jbtnRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRoundActionPerformed(evt);
            }
        });

        jbtnOctal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnOctal.setText("Oct");

        jbtnHex.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnHex.setText("Hex");

        jbtnXY3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnXY3.setText("x^3");
        jbtnXY3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXY3ActionPerformed(evt);
            }
        });

        jbtnCosh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnCosh.setText("Cosh");
        jbtnCosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCoshActionPerformed(evt);
            }
        });

        jbtnCos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnCos.setText("Cos");
        jbtnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCosActionPerformed(evt);
            }
        });

        jtxtDisplay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jMenu3.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnCosh, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnXY, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnTanh, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnXY3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnHex, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnOctal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnXY2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnCbr, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnRound, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnSquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxtDisplay)
                        .addGap(219, 219, 219)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnBackSpace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnSquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnCosh, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnXY, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTanh, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnXY2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCbr, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRound, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnXY3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnHex, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnOctal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setResizable(true);
        this.setSize(470, 410);
        jtxtDisplay.setLayout(null);
        this.jtxtDisplay.setSize(300, 38);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(true);
        this.setSize(250, 410); 
        
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setResizable(true);
        this.setSize(250, 410); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
            
        String iNum = jtxtDisplay.getText() + jbtn5.getText();
        jtxtDisplay.setText(iNum);
        
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
            
        String iNum = jtxtDisplay.getText() + jbtn4.getText();
        jtxtDisplay.setText(iNum);
        
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
            
        String iNum = jtxtDisplay.getText() + jbtn3.getText();
        jtxtDisplay.setText(iNum);
        
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        
        String iNum = jtxtDisplay.getText() + jbtn7.getText();
        jtxtDisplay.setText(iNum);
        
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        
        String iNum = jtxtDisplay.getText() + jbtn8.getText();
        jtxtDisplay.setText(iNum);
        
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
            
        String iNum = jtxtDisplay.getText() + jbtn9.getText();
        jtxtDisplay.setText(iNum);
        
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
            
        String iNum = jtxtDisplay.getText() + jbtn6.getText();
        jtxtDisplay.setText(iNum);
        
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
    
        String iNum = jtxtDisplay.getText() + jbtn2.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        
        String iNum = jtxtDisplay.getText() + jbtn1.getText();
        jtxtDisplay.setText(iNum);
        
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
            
        String iNum = jtxtDisplay.getText() + jbtn0.getText();
        jtxtDisplay.setText(iNum);
        
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
            
        jtxtDisplay.setText("");
        
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jbtnBackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackSpaceActionPerformed
        String bsp = null;
        
        if(jtxtDisplay.getText().length() > 0){
            StringBuilder strB = new StringBuilder(jtxtDisplay.getText());
            strB.deleteCharAt(jtxtDisplay.getText().length() - 1);
            bsp = strB.toString();
            jtxtDisplay.setText(bsp);
        }
    }//GEN-LAST:event_jbtnBackSpaceActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
       
        if(!jtxtDisplay.getText().contains(".")){
            jtxtDisplay.setText(jtxtDisplay.getText() + jbtnDot.getText());
        } 
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusMinusActionPerformed
        
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = ops * (-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnPlusMinusActionPerformed

    private void jbtnSquareRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSquareRootActionPerformed
        
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.sqrt(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnSquareRootActionPerformed

    private void jbtnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogActionPerformed
        
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.log(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnLogActionPerformed

    private void jbtnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSinActionPerformed
        
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.sin(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnSinActionPerformed

    private void jbtnSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSinhActionPerformed

        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.sinh(ops);
        jtxtDisplay.setText(String.valueOf(ops));    }//GEN-LAST:event_jbtnSinhActionPerformed

    private void jbtnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCosActionPerformed

        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.cos(ops);
        jtxtDisplay.setText(String.valueOf(ops));    }//GEN-LAST:event_jbtnCosActionPerformed

    private void jbtnCoshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCoshActionPerformed

        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.cosh(ops);
        jtxtDisplay.setText(String.valueOf(ops));    }//GEN-LAST:event_jbtnCoshActionPerformed

    private void jbtnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTanActionPerformed

        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.tan(ops);
        jtxtDisplay.setText(String.valueOf(ops));    }//GEN-LAST:event_jbtnTanActionPerformed

    private void jbtnTanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTanhActionPerformed
        
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.tanh(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnTanhActionPerformed

    private void jbtnCbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCbrActionPerformed
        
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.cbrt(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnCbrActionPerformed

    private void jbtnRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRoundActionPerformed
        
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.round(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnRoundActionPerformed

    private void jbtnPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPiActionPerformed

        double ops;
        ops = (3.1415926535897932385);
        jtxtDisplay.setText(String.valueOf(ops));    }//GEN-LAST:event_jbtnPiActionPerformed

    private void jbtnXYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXYActionPerformed
        
        if(jtxtDisplay.getText().length() > 0){
            double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
            ops = Math.pow(ops, ops);
            jtxtDisplay.setText(String.valueOf(ops));
        }  
    }//GEN-LAST:event_jbtnXYActionPerformed

    private void jbtnXY2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXY2ActionPerformed
        
        if(jtxtDisplay.getText().length() > 0){
            double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
            ops = (ops * ops);
            jtxtDisplay.setText(String.valueOf(ops));
        }
    }//GEN-LAST:event_jbtnXY2ActionPerformed

    private void jbtnXY3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXY3ActionPerformed
       
        if(jtxtDisplay.getText().length() > 0){
            double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
            ops = (ops * ops * ops);
            jtxtDisplay.setText(String.valueOf(ops));
        }
    }//GEN-LAST:event_jbtnXY3ActionPerformed

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
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScientificCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnBackSpace;
    private javax.swing.JButton jbtnCbr;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnCos;
    private javax.swing.JButton jbtnCosh;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEquals;
    private javax.swing.JButton jbtnHex;
    private javax.swing.JButton jbtnLog;
    private javax.swing.JButton jbtnMultiply;
    private javax.swing.JButton jbtnOctal;
    private javax.swing.JButton jbtnPi;
    private javax.swing.JButton jbtnPlusMinus;
    private javax.swing.JButton jbtnRound;
    private javax.swing.JButton jbtnSin;
    private javax.swing.JButton jbtnSinh;
    private javax.swing.JButton jbtnSquareRoot;
    private javax.swing.JButton jbtnSubtract;
    private javax.swing.JButton jbtnTan;
    private javax.swing.JButton jbtnTanh;
    private javax.swing.JButton jbtnXY;
    private javax.swing.JButton jbtnXY2;
    private javax.swing.JButton jbtnXY3;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables
}
