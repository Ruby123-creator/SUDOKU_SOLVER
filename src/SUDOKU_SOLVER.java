
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ruby
 */
public class SUDOKU_SOLVER extends javax.swing.JFrame {

    /**
     * Creates new form SUDOKU_SOLVER
     */
    private String turn ="1";
    private boolean flag =true;
    public String solveBoard[][] ={
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"}
    };
    public SUDOKU_SOLVER() {
        initComponents();
    }
    public void resetBoard(){
        JButton buttons[] ={butt4,butt7,butt8,butt9,butt10,butt14,butt15,butt16,butt18,butt19,butt21,
        butt23,butt26,butt32,butt33,butt35,butt38,butt39,butt43,butt44,butt47,butt49,butt50,butt56,
        butt59,butt61,butt63,butt64,butt66,butt67,butt68,butt72,butt73,butt74,butt75,butt78};
        JButton board[][] ={
            {butt1 ,butt2,butt3,butt4,butt5,butt6,butt7,butt8,butt9},
            {butt10 ,butt11,butt12,butt13,butt14,butt15,butt16,butt17,butt18},
            {butt19 ,butt20,butt21,butt22,butt23,butt24,butt25,butt26,butt27},
            {butt28 ,butt29,butt30,butt31,butt32,butt33,butt34,butt35,butt36},
            {butt37 ,butt38,butt39,butt40,butt41,butt42,butt43,butt44,butt45},
            {butt46 ,butt47,butt48,butt49,butt50,butt51,butt52,butt53,butt54},
            {butt55 ,butt56,butt57,butt58,butt59,butt60,butt61,butt62,butt63},
            {butt64 ,butt65,butt66,butt67,butt68,butt69,butt70,butt71,butt72},
            {butt73 ,butt74,butt75,butt76,butt77,butt78,butt79,butt80,butt81},
        };
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                boolean flag =true;
                for(int k=0;k<buttons.length;k++){
                    if(board[i][j]==buttons[k])flag =false;
                }
                if(flag==true){
                    board[i][j].setText("");
                    board[i][j].setBackground(Color.white);
                }
            }
        }
       
    }
    public void see_solution(){
         JButton buttons[] ={butt4,butt7,butt8,butt9,butt10,butt14,butt15,butt16,butt18,butt19,butt21,
        butt23,butt26,butt32,butt33,butt35,butt38,butt39,butt43,butt44,butt47,butt49,butt50,butt56,
        butt59,butt61,butt63,butt64,butt66,butt67,butt68,butt72,butt73,butt74,butt75,butt78};
        JButton board[][] ={
            {butt1 ,butt2,butt3,butt4,butt5,butt6,butt7,butt8,butt9},
            {butt10 ,butt11,butt12,butt13,butt14,butt15,butt16,butt17,butt18},
            {butt19 ,butt20,butt21,butt22,butt23,butt24,butt25,butt26,butt27},
            {butt28 ,butt29,butt30,butt31,butt32,butt33,butt34,butt35,butt36},
            {butt37 ,butt38,butt39,butt40,butt41,butt42,butt43,butt44,butt45},
            {butt46 ,butt47,butt48,butt49,butt50,butt51,butt52,butt53,butt54},
            {butt55 ,butt56,butt57,butt58,butt59,butt60,butt61,butt62,butt63},
            {butt64 ,butt65,butt66,butt67,butt68,butt69,butt70,butt71,butt72},
            {butt73 ,butt74,butt75,butt76,butt77,butt78,butt79,butt80,butt81},
        };
        if(flag==true){
            flag =false;
            jButton94.setText("HIDE SOLUTION");
           for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                boolean flag =true;
                for(int k=0;k<buttons.length;k++){
                    if(board[i][j]==buttons[k])flag =false;
                }
                if(flag==true){
                    board[i][j].setText(solveBoard[i][j]);
                    board[i][j].setForeground(Color.BLUE);
                    board[i][j].setBackground(Color.LIGHT_GRAY);
                }
            }
        }  
        }
        else{
            jButton94.setText("SOLUTION");
            flag =true;
            resetBoard();
        }
    }
    public void checkmoves(){
     JButton buttons[] ={butt4,butt7,butt8,butt9,butt10,butt14,butt15,butt16,butt18,butt19,butt21,
        butt23,butt26,butt32,butt33,butt35,butt38,butt39,butt43,butt44,butt47,butt49,butt50,butt56,
        butt59,butt61,butt63,butt64,butt66,butt67,butt68,butt72,butt73,butt74,butt75,butt78};
        JButton board[][] ={
            {butt1 ,butt2,butt3,butt4,butt5,butt6,butt7,butt8,butt9},
            {butt10 ,butt11,butt12,butt13,butt14,butt15,butt16,butt17,butt18},
            {butt19 ,butt20,butt21,butt22,butt23,butt24,butt25,butt26,butt27},
            {butt28 ,butt29,butt30,butt31,butt32,butt33,butt34,butt35,butt36},
            {butt37 ,butt38,butt39,butt40,butt41,butt42,butt43,butt44,butt45},
            {butt46 ,butt47,butt48,butt49,butt50,butt51,butt52,butt53,butt54},
            {butt55 ,butt56,butt57,butt58,butt59,butt60,butt61,butt62,butt63},
            {butt64 ,butt65,butt66,butt67,butt68,butt69,butt70,butt71,butt72},
            {butt73 ,butt74,butt75,butt76,butt77,butt78,butt79,butt80,butt81},
        };
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j].getText()!=solveBoard[i][j] && board[i][j].getText()!=""){
                    board[i][j].setBackground(Color.orange);
                    //board[i][j].setForeground(Color.WHITE);
                }
            }
        }
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
        butt1 = new javax.swing.JButton();
        butt19 = new javax.swing.JButton();
        butt10 = new javax.swing.JButton();
        butt2 = new javax.swing.JButton();
        butt11 = new javax.swing.JButton();
        butt20 = new javax.swing.JButton();
        butt21 = new javax.swing.JButton();
        butt12 = new javax.swing.JButton();
        butt3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        butt4 = new javax.swing.JButton();
        butt22 = new javax.swing.JButton();
        butt13 = new javax.swing.JButton();
        butt5 = new javax.swing.JButton();
        butt14 = new javax.swing.JButton();
        butt23 = new javax.swing.JButton();
        butt24 = new javax.swing.JButton();
        butt15 = new javax.swing.JButton();
        butt6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        butt28 = new javax.swing.JButton();
        butt46 = new javax.swing.JButton();
        butt37 = new javax.swing.JButton();
        butt29 = new javax.swing.JButton();
        butt38 = new javax.swing.JButton();
        butt47 = new javax.swing.JButton();
        butt48 = new javax.swing.JButton();
        butt39 = new javax.swing.JButton();
        butt30 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        butt31 = new javax.swing.JButton();
        butt49 = new javax.swing.JButton();
        butt40 = new javax.swing.JButton();
        butt32 = new javax.swing.JButton();
        butt41 = new javax.swing.JButton();
        butt50 = new javax.swing.JButton();
        butt51 = new javax.swing.JButton();
        butt42 = new javax.swing.JButton();
        butt33 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        butt55 = new javax.swing.JButton();
        butt73 = new javax.swing.JButton();
        butt64 = new javax.swing.JButton();
        butt56 = new javax.swing.JButton();
        butt65 = new javax.swing.JButton();
        butt74 = new javax.swing.JButton();
        butt75 = new javax.swing.JButton();
        butt66 = new javax.swing.JButton();
        butt57 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        butt58 = new javax.swing.JButton();
        butt76 = new javax.swing.JButton();
        butt67 = new javax.swing.JButton();
        butt59 = new javax.swing.JButton();
        butt68 = new javax.swing.JButton();
        butt77 = new javax.swing.JButton();
        butt78 = new javax.swing.JButton();
        butt69 = new javax.swing.JButton();
        butt60 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        butt61 = new javax.swing.JButton();
        butt79 = new javax.swing.JButton();
        butt70 = new javax.swing.JButton();
        butt62 = new javax.swing.JButton();
        butt71 = new javax.swing.JButton();
        butt80 = new javax.swing.JButton();
        butt81 = new javax.swing.JButton();
        butt72 = new javax.swing.JButton();
        butt63 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        butt34 = new javax.swing.JButton();
        butt52 = new javax.swing.JButton();
        butt43 = new javax.swing.JButton();
        butt35 = new javax.swing.JButton();
        butt44 = new javax.swing.JButton();
        butt53 = new javax.swing.JButton();
        butt54 = new javax.swing.JButton();
        butt45 = new javax.swing.JButton();
        butt36 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        butt7 = new javax.swing.JButton();
        butt25 = new javax.swing.JButton();
        butt16 = new javax.swing.JButton();
        butt8 = new javax.swing.JButton();
        butt17 = new javax.swing.JButton();
        butt26 = new javax.swing.JButton();
        butt27 = new javax.swing.JButton();
        butt18 = new javax.swing.JButton();
        butt9 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUDOKU");
        setBackground(new java.awt.Color(0, 51, 153));
        setLocation(new java.awt.Point(300, 50));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        butt1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt1ActionPerformed(evt);
            }
        });

        butt19.setBackground(new java.awt.Color(153, 102, 255));
        butt19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt19.setText("7");
        butt19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt19ActionPerformed(evt);
            }
        });

        butt10.setBackground(new java.awt.Color(153, 102, 255));
        butt10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt10.setText("4");
        butt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt10ActionPerformed(evt);
            }
        });

        butt2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt2ActionPerformed(evt);
            }
        });

        butt11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt11ActionPerformed(evt);
            }
        });

        butt20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt20ActionPerformed(evt);
            }
        });

        butt21.setBackground(new java.awt.Color(153, 102, 255));
        butt21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt21.setText("6");
        butt21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt21ActionPerformed(evt);
            }
        });

        butt12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt12ActionPerformed(evt);
            }
        });

        butt3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(butt19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butt20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butt21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(butt10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(butt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(butt11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butt10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butt19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(butt12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        butt4.setBackground(new java.awt.Color(153, 102, 255));
        butt4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt4.setText("5");
        butt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt4ActionPerformed(evt);
            }
        });

        butt22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt22ActionPerformed(evt);
            }
        });

        butt13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt13ActionPerformed(evt);
            }
        });

        butt5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt5ActionPerformed(evt);
            }
        });

        butt14.setBackground(new java.awt.Color(153, 102, 255));
        butt14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt14.setText("7");
        butt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt14ActionPerformed(evt);
            }
        });

        butt23.setBackground(new java.awt.Color(153, 102, 255));
        butt23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt23.setText("4");
        butt23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt23ActionPerformed(evt);
            }
        });

        butt24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt24ActionPerformed(evt);
            }
        });

        butt15.setBackground(new java.awt.Color(153, 102, 255));
        butt15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt15.setText("8");
        butt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt15ActionPerformed(evt);
            }
        });

        butt6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(butt22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butt23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butt24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butt4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(butt13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(butt5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(butt14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butt5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butt13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butt22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(butt15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 6, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        butt28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt28ActionPerformed(evt);
            }
        });

        butt46.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt46ActionPerformed(evt);
            }
        });

        butt37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt37ActionPerformed(evt);
            }
        });

        butt29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt29ActionPerformed(evt);
            }
        });

        butt38.setBackground(new java.awt.Color(153, 102, 255));
        butt38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt38.setText("3");
        butt38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt38ActionPerformed(evt);
            }
        });

        butt47.setBackground(new java.awt.Color(153, 102, 255));
        butt47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt47.setText("6");
        butt47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt47ActionPerformed(evt);
            }
        });

        butt48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt48ActionPerformed(evt);
            }
        });

        butt39.setBackground(new java.awt.Color(153, 102, 255));
        butt39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt39.setText("4");
        butt39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt39ActionPerformed(evt);
            }
        });

        butt30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(butt46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butt47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butt48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butt28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(butt37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(butt29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(butt38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butt29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butt37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butt46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(butt39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 166, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        butt31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt31ActionPerformed(evt);
            }
        });

        butt49.setBackground(new java.awt.Color(153, 102, 255));
        butt49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt49.setText("1");
        butt49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt49ActionPerformed(evt);
            }
        });

        butt40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt40ActionPerformed(evt);
            }
        });

        butt32.setBackground(new java.awt.Color(153, 102, 255));
        butt32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt32.setText("3");
        butt32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt32ActionPerformed(evt);
            }
        });

        butt41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt41ActionPerformed(evt);
            }
        });

        butt50.setBackground(new java.awt.Color(153, 102, 255));
        butt50.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt50.setText("8");
        butt50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt50ActionPerformed(evt);
            }
        });

        butt51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt51ActionPerformed(evt);
            }
        });

        butt42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt42ActionPerformed(evt);
            }
        });

        butt33.setBackground(new java.awt.Color(153, 102, 255));
        butt33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt33.setText("5");
        butt33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(butt49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butt50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butt51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butt31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(butt40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(butt32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(butt41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butt32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butt40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butt49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(butt42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 166, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        butt55.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt55ActionPerformed(evt);
            }
        });

        butt73.setBackground(new java.awt.Color(153, 102, 255));
        butt73.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt73.setText("6");
        butt73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt73ActionPerformed(evt);
            }
        });

        butt64.setBackground(new java.awt.Color(153, 102, 255));
        butt64.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt64.setText("3");
        butt64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt64ActionPerformed(evt);
            }
        });

        butt56.setBackground(new java.awt.Color(153, 102, 255));
        butt56.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt56.setText("4");
        butt56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt56ActionPerformed(evt);
            }
        });

        butt65.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt65ActionPerformed(evt);
            }
        });

        butt74.setBackground(new java.awt.Color(153, 102, 255));
        butt74.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt74.setText("8");
        butt74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt74ActionPerformed(evt);
            }
        });

        butt75.setBackground(new java.awt.Color(153, 102, 255));
        butt75.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt75.setText("9");
        butt75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt75ActionPerformed(evt);
            }
        });

        butt66.setBackground(new java.awt.Color(153, 102, 255));
        butt66.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt66.setText("5");
        butt66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt66ActionPerformed(evt);
            }
        });

        butt57.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt57ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(butt73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butt74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butt75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butt55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(butt64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(butt56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(butt65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butt56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butt64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butt73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(butt66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 326, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        butt58.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt58ActionPerformed(evt);
            }
        });

        butt76.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt76ActionPerformed(evt);
            }
        });

        butt67.setBackground(new java.awt.Color(153, 102, 255));
        butt67.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt67.setText("9");
        butt67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt67ActionPerformed(evt);
            }
        });

        butt59.setBackground(new java.awt.Color(153, 102, 255));
        butt59.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt59.setText("5");
        butt59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt59ActionPerformed(evt);
            }
        });

        butt68.setBackground(new java.awt.Color(153, 102, 255));
        butt68.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt68.setText("6");
        butt68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt68ActionPerformed(evt);
            }
        });

        butt77.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt77ActionPerformed(evt);
            }
        });

        butt78.setBackground(new java.awt.Color(153, 102, 255));
        butt78.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt78.setText("1");
        butt78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt78ActionPerformed(evt);
            }
        });

        butt69.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt69ActionPerformed(evt);
            }
        });

        butt60.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt60ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(butt76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butt77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butt78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butt58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(butt67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(butt59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(butt68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butt59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butt67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butt76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(butt69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 326, -1, -1));

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        butt61.setBackground(new java.awt.Color(153, 102, 255));
        butt61.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt61.setText("9");
        butt61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt61ActionPerformed(evt);
            }
        });

        butt79.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt79ActionPerformed(evt);
            }
        });

        butt70.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt70ActionPerformed(evt);
            }
        });

        butt62.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt62ActionPerformed(evt);
            }
        });

        butt71.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt71ActionPerformed(evt);
            }
        });

        butt80.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt80ActionPerformed(evt);
            }
        });

        butt81.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt81ActionPerformed(evt);
            }
        });

        butt72.setBackground(new java.awt.Color(153, 102, 255));
        butt72.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt72.setText("2");
        butt72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt72ActionPerformed(evt);
            }
        });

        butt63.setBackground(new java.awt.Color(153, 102, 255));
        butt63.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt63.setText("6");
        butt63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt63ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butt70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(butt62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(butt71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butt72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(butt79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butt80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butt81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butt62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butt70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butt79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 326, -1, -1));

        jPanel8.setBackground(new java.awt.Color(0, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        butt34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt34ActionPerformed(evt);
            }
        });

        butt52.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt52ActionPerformed(evt);
            }
        });

        butt43.setBackground(new java.awt.Color(153, 102, 255));
        butt43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt43.setText("2");
        butt43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt43ActionPerformed(evt);
            }
        });

        butt35.setBackground(new java.awt.Color(153, 102, 255));
        butt35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt35.setText("9");
        butt35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt35ActionPerformed(evt);
            }
        });

        butt44.setBackground(new java.awt.Color(153, 102, 255));
        butt44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt44.setText("8");
        butt44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt44ActionPerformed(evt);
            }
        });

        butt53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt53ActionPerformed(evt);
            }
        });

        butt54.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt54ActionPerformed(evt);
            }
        });

        butt45.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt45ActionPerformed(evt);
            }
        });

        butt36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(butt52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butt53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butt54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butt34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(butt43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(butt35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(butt44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butt35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butt43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butt52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(butt45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 166, -1, -1));

        jPanel9.setBackground(new java.awt.Color(0, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        butt7.setBackground(new java.awt.Color(153, 102, 255));
        butt7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt7.setText("7");
        butt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt7ActionPerformed(evt);
            }
        });

        butt25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt25ActionPerformed(evt);
            }
        });

        butt16.setBackground(new java.awt.Color(153, 102, 255));
        butt16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt16.setText("5");
        butt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt16ActionPerformed(evt);
            }
        });

        butt8.setBackground(new java.awt.Color(153, 102, 255));
        butt8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt8.setText("3");
        butt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt8ActionPerformed(evt);
            }
        });

        butt17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt17ActionPerformed(evt);
            }
        });

        butt26.setBackground(new java.awt.Color(153, 102, 255));
        butt26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt26.setText("2");
        butt26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt26ActionPerformed(evt);
            }
        });

        butt27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt27ActionPerformed(evt);
            }
        });

        butt18.setBackground(new java.awt.Color(153, 102, 255));
        butt18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt18.setText("9");
        butt18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt18ActionPerformed(evt);
            }
        });

        butt9.setBackground(new java.awt.Color(153, 102, 255));
        butt9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butt9.setText("4");
        butt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(butt25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butt26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butt27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butt7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(butt16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(butt8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(butt17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butt18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butt8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butt16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butt25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(butt18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 6, -1, -1));

        jButton82.setBackground(new java.awt.Color(51, 204, 255));
        jButton82.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton82.setText("1");
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton82, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 40, 40));

        jButton83.setBackground(new java.awt.Color(255, 255, 51));
        jButton83.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton83.setText("2");
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton83, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 40, 40));

        jButton84.setBackground(new java.awt.Color(255, 255, 51));
        jButton84.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton84.setText("3");
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton84, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 40, 40));

        jButton85.setBackground(new java.awt.Color(255, 255, 51));
        jButton85.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton85.setText("4");
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton85, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 40, 40));

        jButton86.setBackground(new java.awt.Color(255, 255, 51));
        jButton86.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton86.setText("5");
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton86, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 40, 40));

        jButton87.setBackground(new java.awt.Color(255, 255, 51));
        jButton87.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton87.setText("6");
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton87, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 40, 40));

        jButton88.setBackground(new java.awt.Color(255, 255, 51));
        jButton88.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton88.setText("7");
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton88, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 40, 40));

        jButton89.setBackground(new java.awt.Color(255, 255, 51));
        jButton89.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton89.setText("8");
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton89, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 40, 40));

        jButton91.setBackground(new java.awt.Color(255, 255, 51));
        jButton91.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton91.setText("9");
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton91, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 40, 40));

        jButton90.setBackground(new java.awt.Color(0, 204, 255));
        jButton90.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton90.setText("RESET");
        jButton90.setBorder(null);
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton90, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 265, 70, 30));

        jButton92.setBackground(new java.awt.Color(0, 255, 153));
        jButton92.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton92.setText("CHECK MOVES");
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton92, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 316, -1, 30));

        jButton93.setBackground(new java.awt.Color(255, 153, 255));
        jButton93.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton93.setText("EXIT");
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton93, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 360, -1, 30));

        jButton94.setBackground(new java.awt.Color(255, 255, 0));
        jButton94.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton94.setText("SOLUTION");
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton94, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 404, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("SUDOKU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 17, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("SOLVER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -190, 700, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butt19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt19ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt19ActionPerformed

    private void butt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt11ActionPerformed
        // TODO add your handling code here:
         butt11.setText(turn);
        butt11.setBackground(Color.white);
    }//GEN-LAST:event_butt11ActionPerformed

    private void butt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt20ActionPerformed
        // TODO add your handling code here:
         butt20.setText(turn);
        butt20.setBackground(Color.white);
    }//GEN-LAST:event_butt20ActionPerformed

    private void butt21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt21ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt21ActionPerformed

    private void butt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt12ActionPerformed
        // TODO add your handling code here:
         butt12.setText(turn);
        butt12.setBackground(Color.white);
    }//GEN-LAST:event_butt12ActionPerformed

    private void butt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt3ActionPerformed
        // TODO add your handling code here:
         butt3.setText(turn);
        butt3.setBackground(Color.white);
    }//GEN-LAST:event_butt3ActionPerformed

    private void butt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt22ActionPerformed
        // TODO add your handling code here:
         butt22.setText(turn);
        butt22.setBackground(Color.white);
    }//GEN-LAST:event_butt22ActionPerformed

    private void butt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt14ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt14ActionPerformed

    private void butt23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt23ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt23ActionPerformed

    private void butt24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt24ActionPerformed
        // TODO add your handling code here:
         butt24.setText(turn);
        butt24.setBackground(Color.white);
    }//GEN-LAST:event_butt24ActionPerformed

    private void butt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt15ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt15ActionPerformed

    private void butt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt6ActionPerformed
        // TODO add your handling code here:
         butt6.setText(turn);
        butt6.setBackground(Color.white);
    }//GEN-LAST:event_butt6ActionPerformed

    private void butt46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt46ActionPerformed
        // TODO add your handling code here:
         butt46.setText(turn);
        butt46.setBackground(Color.white);
    }//GEN-LAST:event_butt46ActionPerformed

    private void butt38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt38ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt38ActionPerformed

    private void butt47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt47ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt47ActionPerformed

    private void butt48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt48ActionPerformed
        // TODO add your handling code here:
         butt48.setText(turn);
        butt48.setBackground(Color.white);
    }//GEN-LAST:event_butt48ActionPerformed

    private void butt39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt39ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt39ActionPerformed

    private void butt30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt30ActionPerformed
        // TODO add your handling code here:
         butt30.setText(turn);
        butt30.setBackground(Color.white);
    }//GEN-LAST:event_butt30ActionPerformed

    private void butt49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt49ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt49ActionPerformed

    private void butt41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt41ActionPerformed
        // TODO add your handling code here:
         butt41.setText(turn);
        butt41.setBackground(Color.white);
    }//GEN-LAST:event_butt41ActionPerformed

    private void butt50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt50ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt50ActionPerformed

    private void butt51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt51ActionPerformed
        // TODO add your handling code here:
         butt51.setText(turn);
        butt51.setBackground(Color.white);
    }//GEN-LAST:event_butt51ActionPerformed

    private void butt42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt42ActionPerformed
        // TODO add your handling code here:
         butt42.setText(turn);
        butt42.setBackground(Color.white);
    }//GEN-LAST:event_butt42ActionPerformed

    private void butt33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt33ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt33ActionPerformed

    private void butt73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt73ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt73ActionPerformed

    private void butt65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt65ActionPerformed
        // TODO add your handling code here:
         butt65.setText(turn);
        butt65.setBackground(Color.white);
    }//GEN-LAST:event_butt65ActionPerformed

    private void butt74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt74ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt74ActionPerformed

    private void butt75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt75ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt75ActionPerformed

    private void butt66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt66ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt66ActionPerformed

    private void butt57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt57ActionPerformed
        // TODO add your handling code here:
         butt57.setText(turn);
        butt57.setBackground(Color.white);
    }//GEN-LAST:event_butt57ActionPerformed

    private void butt76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt76ActionPerformed
        // TODO add your handling code here:
         butt76.setText(turn);
        butt76.setBackground(Color.white);
    }//GEN-LAST:event_butt76ActionPerformed

    private void butt68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt68ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt68ActionPerformed

    private void butt77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt77ActionPerformed
        // TODO add your handling code here:
         butt77.setText(turn);
        butt77.setBackground(Color.white);
    }//GEN-LAST:event_butt77ActionPerformed

    private void butt78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt78ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt78ActionPerformed

    private void butt69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt69ActionPerformed
        // TODO add your handling code here:
         butt69.setText(turn);
        butt69.setBackground(Color.white);
    }//GEN-LAST:event_butt69ActionPerformed

    private void butt60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt60ActionPerformed
        // TODO add your handling code here:
         butt60.setText(turn);
        butt60.setBackground(Color.white);
    }//GEN-LAST:event_butt60ActionPerformed

    private void butt79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt79ActionPerformed
        // TODO add your handling code here:
         butt79.setText(turn);
        butt79.setBackground(Color.white);
    }//GEN-LAST:event_butt79ActionPerformed

    private void butt71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt71ActionPerformed
        // TODO add your handling code here:
         butt71.setText(turn);
        butt71.setBackground(Color.white);
    }//GEN-LAST:event_butt71ActionPerformed

    private void butt80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt80ActionPerformed
        // TODO add your handling code here:
         butt80.setText(turn);
        butt80.setBackground(Color.white);
    }//GEN-LAST:event_butt80ActionPerformed

    private void butt81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt81ActionPerformed
        // TODO add your handling code here:
         butt81.setText(turn);
        butt81.setBackground(Color.white);
    }//GEN-LAST:event_butt81ActionPerformed

    private void butt72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt72ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt72ActionPerformed

    private void butt63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt63ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt63ActionPerformed

    private void butt52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt52ActionPerformed
        // TODO add your handling code here:
         butt52.setText(turn);
        butt52.setBackground(Color.white);
    }//GEN-LAST:event_butt52ActionPerformed

    private void butt44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt44ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt44ActionPerformed

    private void butt53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt53ActionPerformed
        // TODO add your handling code here:
         butt53.setText(turn);
        butt53.setBackground(Color.white);
    }//GEN-LAST:event_butt53ActionPerformed

    private void butt54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt54ActionPerformed
        // TODO add your handling code here:
         butt54.setText(turn);
        butt54.setBackground(Color.white);
    }//GEN-LAST:event_butt54ActionPerformed

    private void butt45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt45ActionPerformed
        // TODO add your handling code here:
         butt45.setText(turn);
        butt45.setBackground(Color.white);
    }//GEN-LAST:event_butt45ActionPerformed

    private void butt36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt36ActionPerformed
        // TODO add your handling code here:
         butt36.setText(turn);
        butt36.setBackground(Color.white);
    }//GEN-LAST:event_butt36ActionPerformed

    private void butt25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt25ActionPerformed
        // TODO add your handling code here:
         butt25.setText(turn);
        butt25.setBackground(Color.white);
    }//GEN-LAST:event_butt25ActionPerformed

    private void butt17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt17ActionPerformed
        // TODO add your handling code here:
         butt17.setText(turn);
        butt17.setBackground(Color.white);
    }//GEN-LAST:event_butt17ActionPerformed

    private void butt26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt26ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt26ActionPerformed

    private void butt27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt27ActionPerformed
        // TODO add your handling code here:
         butt27.setText(turn);
        butt27.setBackground(Color.white);
    }//GEN-LAST:event_butt27ActionPerformed

    private void butt18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt18ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt18ActionPerformed

    private void butt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt9ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        // TODO add your handling code here:
        turn ="1";
        jButton82.setBackground(Color.cyan);
        jButton86.setBackground(Color.yellow);
        jButton83.setBackground(Color.yellow);
        jButton84.setBackground(Color.yellow);
        jButton85.setBackground(Color.yellow);
        jButton87.setBackground(Color.yellow);
        jButton88.setBackground(Color.yellow);
        jButton89.setBackground(Color.yellow);
        jButton91.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        // TODO add your handling code here:
        turn ="2";
        jButton83.setBackground(Color.cyan);
        jButton82.setBackground(Color.yellow);
        jButton86.setBackground(Color.yellow);
        jButton84.setBackground(Color.yellow);
        jButton85.setBackground(Color.yellow);
        jButton87.setBackground(Color.yellow);
        jButton88.setBackground(Color.yellow);
        jButton89.setBackground(Color.yellow);
        jButton91.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        // TODO add your handling code here:
        turn ="3";
        jButton84.setBackground(Color.cyan);
        jButton82.setBackground(Color.yellow);
        jButton83.setBackground(Color.yellow);
        jButton86.setBackground(Color.yellow);
        jButton85.setBackground(Color.yellow);
        jButton87.setBackground(Color.yellow);
        jButton88.setBackground(Color.yellow);
        jButton89.setBackground(Color.yellow);
        jButton91.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        // TODO add your handling code here:
        turn ="4";
        jButton85.setBackground(Color.cyan);
        jButton82.setBackground(Color.yellow);
        jButton83.setBackground(Color.yellow);
        jButton84.setBackground(Color.yellow);
        jButton86.setBackground(Color.yellow);
        jButton87.setBackground(Color.yellow);
        jButton88.setBackground(Color.yellow);
        jButton89.setBackground(Color.yellow);
        jButton91.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        // TODO add your handling code here:
        turn ="5";
        jButton86.setBackground(Color.cyan);
        jButton82.setBackground(Color.yellow);
        jButton83.setBackground(Color.yellow);
        jButton84.setBackground(Color.yellow);
        jButton85.setBackground(Color.yellow);
        jButton87.setBackground(Color.yellow);
        jButton88.setBackground(Color.yellow);
        jButton89.setBackground(Color.yellow);
        jButton91.setBackground(Color.yellow);
        
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        // TODO add your handling code here:
        turn ="6";
        jButton86.setBackground(Color.yellow);
        jButton82.setBackground(Color.yellow);
        jButton83.setBackground(Color.yellow);
        jButton84.setBackground(Color.yellow);
        jButton85.setBackground(Color.yellow);
        jButton87.setBackground(Color.cyan);
        jButton88.setBackground(Color.yellow);
        jButton89.setBackground(Color.yellow);
        jButton91.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        // TODO add your handling code here:
        turn ="7";
        jButton88.setBackground(Color.cyan);
        jButton82.setBackground(Color.yellow);
        jButton83.setBackground(Color.yellow);
        jButton84.setBackground(Color.yellow);
        jButton85.setBackground(Color.yellow);
        jButton87.setBackground(Color.yellow);
        jButton86.setBackground(Color.yellow);
        jButton89.setBackground(Color.yellow);
        jButton91.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        // TODO add your handling code here:
        turn ="8";
        jButton89.setBackground(Color.cyan);
        jButton82.setBackground(Color.yellow);
        jButton83.setBackground(Color.yellow);
        jButton84.setBackground(Color.yellow);
        jButton85.setBackground(Color.yellow);
        jButton87.setBackground(Color.yellow);
        jButton88.setBackground(Color.yellow);
        jButton86.setBackground(Color.yellow);
        jButton91.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        // TODO add your handling code here:
        turn ="9";
        jButton91.setBackground(Color.cyan);
        jButton82.setBackground(Color.yellow);
        jButton83.setBackground(Color.yellow);
        jButton84.setBackground(Color.yellow);
        jButton85.setBackground(Color.yellow);
        jButton87.setBackground(Color.yellow);
        jButton88.setBackground(Color.yellow);
        jButton89.setBackground(Color.yellow);
        jButton86.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        // TODO add your handling code here
         int a = JOptionPane.showConfirmDialog(null ,"Do you really want to exit","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
  
        }

    }//GEN-LAST:event_jButton93ActionPerformed

    private void butt70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt70ActionPerformed
        // TODO add your handling code here:
         butt70.setText(turn);
        butt70.setBackground(Color.white);
    }//GEN-LAST:event_butt70ActionPerformed

    private void butt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt10ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt10ActionPerformed

    private void butt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt4ActionPerformed

    private void butt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt7ActionPerformed

    private void butt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt8ActionPerformed

    private void butt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt16ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt16ActionPerformed

    private void butt32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt32ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt32ActionPerformed

    private void butt35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt35ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt35ActionPerformed

    private void butt43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt43ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt43ActionPerformed

    private void butt56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt56ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt56ActionPerformed

    private void butt64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt64ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt64ActionPerformed

    private void butt59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt59ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt59ActionPerformed

    private void butt67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt67ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt67ActionPerformed

    private void butt61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt61ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this ," oops!!! Box is already filled","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butt61ActionPerformed

    private void butt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt1ActionPerformed
        // TODO add your handling code here:
        butt1.setText(turn);
        butt1.setBackground(Color.white);
    }//GEN-LAST:event_butt1ActionPerformed

    private void butt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt2ActionPerformed
        // TODO add your handling code here:
         butt2.setText(turn);
        butt2.setBackground(Color.white);
    }//GEN-LAST:event_butt2ActionPerformed

    private void butt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt5ActionPerformed
        // TODO add your handling code here:
         butt5.setText(turn);
        butt5.setBackground(Color.white);
    }//GEN-LAST:event_butt5ActionPerformed

    private void butt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt13ActionPerformed
        // TODO add your handling code here:
         butt13.setText(turn);
        butt13.setBackground(Color.white);
    }//GEN-LAST:event_butt13ActionPerformed

    private void butt28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt28ActionPerformed
        // TODO add your handling code here:
         butt28.setText(turn);
        butt28.setBackground(Color.white);
    }//GEN-LAST:event_butt28ActionPerformed

    private void butt29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt29ActionPerformed
        // TODO add your handling code here:
         butt29.setText(turn);
        butt29.setBackground(Color.white);
    }//GEN-LAST:event_butt29ActionPerformed

    private void butt37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt37ActionPerformed
        // TODO add your handling code here:
         butt37.setText(turn);
        butt37.setBackground(Color.white);
    }//GEN-LAST:event_butt37ActionPerformed

    private void butt31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt31ActionPerformed
        // TODO add your handling code here:
         butt31.setText(turn);
        butt31.setBackground(Color.white);
    }//GEN-LAST:event_butt31ActionPerformed

    private void butt40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt40ActionPerformed
        // TODO add your handling code here:
         butt40.setText(turn);
        butt40.setBackground(Color.white);
    }//GEN-LAST:event_butt40ActionPerformed

    private void butt34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt34ActionPerformed
        // TODO add your handling code here:
         butt34.setText(turn);
        butt34.setBackground(Color.white);
    }//GEN-LAST:event_butt34ActionPerformed

    private void butt55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt55ActionPerformed
        // TODO add your handling code here:
         butt55.setText(turn);
        butt55.setBackground(Color.white);
    }//GEN-LAST:event_butt55ActionPerformed

    private void butt58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt58ActionPerformed
        // TODO add your handling code here:
         butt58.setText(turn);
        butt58.setBackground(Color.white);
    }//GEN-LAST:event_butt58ActionPerformed

    private void butt62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt62ActionPerformed
        // TODO add your handling code here:
         butt62.setText(turn);
        butt62.setBackground(Color.white);
    }//GEN-LAST:event_butt62ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        // TODO add your handling code here:
         int a = JOptionPane.showConfirmDialog(null ,"Do you really want to reset","Sudoku solver",JOptionPane.YES_NO_OPTION);
        if(a==0){
        resetBoard();
        }
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        // TODO add your handling code here:
        see_solution();
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        // TODO add your handling code here:
        checkmoves();
    }//GEN-LAST:event_jButton92ActionPerformed

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
            java.util.logging.Logger.getLogger(SUDOKU_SOLVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SUDOKU_SOLVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SUDOKU_SOLVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SUDOKU_SOLVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SUDOKU_SOLVER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butt1;
    private javax.swing.JButton butt10;
    private javax.swing.JButton butt11;
    private javax.swing.JButton butt12;
    private javax.swing.JButton butt13;
    private javax.swing.JButton butt14;
    private javax.swing.JButton butt15;
    private javax.swing.JButton butt16;
    private javax.swing.JButton butt17;
    private javax.swing.JButton butt18;
    private javax.swing.JButton butt19;
    private javax.swing.JButton butt2;
    private javax.swing.JButton butt20;
    private javax.swing.JButton butt21;
    private javax.swing.JButton butt22;
    private javax.swing.JButton butt23;
    private javax.swing.JButton butt24;
    private javax.swing.JButton butt25;
    private javax.swing.JButton butt26;
    private javax.swing.JButton butt27;
    private javax.swing.JButton butt28;
    private javax.swing.JButton butt29;
    private javax.swing.JButton butt3;
    private javax.swing.JButton butt30;
    private javax.swing.JButton butt31;
    private javax.swing.JButton butt32;
    private javax.swing.JButton butt33;
    private javax.swing.JButton butt34;
    private javax.swing.JButton butt35;
    private javax.swing.JButton butt36;
    private javax.swing.JButton butt37;
    private javax.swing.JButton butt38;
    private javax.swing.JButton butt39;
    private javax.swing.JButton butt4;
    private javax.swing.JButton butt40;
    private javax.swing.JButton butt41;
    private javax.swing.JButton butt42;
    private javax.swing.JButton butt43;
    private javax.swing.JButton butt44;
    private javax.swing.JButton butt45;
    private javax.swing.JButton butt46;
    private javax.swing.JButton butt47;
    private javax.swing.JButton butt48;
    private javax.swing.JButton butt49;
    private javax.swing.JButton butt5;
    private javax.swing.JButton butt50;
    private javax.swing.JButton butt51;
    private javax.swing.JButton butt52;
    private javax.swing.JButton butt53;
    private javax.swing.JButton butt54;
    private javax.swing.JButton butt55;
    private javax.swing.JButton butt56;
    private javax.swing.JButton butt57;
    private javax.swing.JButton butt58;
    private javax.swing.JButton butt59;
    private javax.swing.JButton butt6;
    private javax.swing.JButton butt60;
    private javax.swing.JButton butt61;
    private javax.swing.JButton butt62;
    private javax.swing.JButton butt63;
    private javax.swing.JButton butt64;
    private javax.swing.JButton butt65;
    private javax.swing.JButton butt66;
    private javax.swing.JButton butt67;
    private javax.swing.JButton butt68;
    private javax.swing.JButton butt69;
    private javax.swing.JButton butt7;
    private javax.swing.JButton butt70;
    private javax.swing.JButton butt71;
    private javax.swing.JButton butt72;
    private javax.swing.JButton butt73;
    private javax.swing.JButton butt74;
    private javax.swing.JButton butt75;
    private javax.swing.JButton butt76;
    private javax.swing.JButton butt77;
    private javax.swing.JButton butt78;
    private javax.swing.JButton butt79;
    private javax.swing.JButton butt8;
    private javax.swing.JButton butt80;
    private javax.swing.JButton butt81;
    private javax.swing.JButton butt9;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
