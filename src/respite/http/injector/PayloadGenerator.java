/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respite.http.injector;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class PayloadGenerator extends javax.swing.JFrame {
    
    public PayloadGenerator Me;
    public MainForm Parent;

    /**
     * Creates new form PayloadGenerator
     */
    public PayloadGenerator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                StopClose(evt);
            }
        });

        jTextField1.setName("host"); // NOI18N

        jLabel1.setText("Hosts:");

        jLabel2.setText("Request Method:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONNECT", "GET", "POST", "PATCH", "OPTIONS", "MOVE", "PUT", "LINK", "DELETE", "UNLINK", "AOL", "MKCOL", "PROPATCH" }));
        jComboBox1.setName("reqmeth"); // NOI18N

        jLabel3.setText("Injection Method:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Front Inject", "Back Inject", "Normal" }));
        jComboBox2.setSelectedIndex(2);
        jComboBox2.setName("injmeth"); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Front Query");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Back Query");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("None / Middle Query");

        jLabel4.setText("Headers:");

        jCheckBox1.setText("X-Online-Host");

        jCheckBox2.setText("X-Forwarded-Host");
        jCheckBox2.setName(""); // NOI18N

        jCheckBox8.setText("Keep-Alive");
        jCheckBox8.setToolTipText("");

        jCheckBox9.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jCheckBox9.setText("Dual Connect");
        jCheckBox9.setToolTipText("");

        jButton1.setText("Generate Payload");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeneratePayload(evt);
            }
        });

        jLabel6.setText("Split:");

        jCheckBox10.setText("Split");

        jLabel7.setText("Delay (by milliseconds):");

        jTextField2.setText("100");

        jCheckBox6.setText("User-Agent");

        jCheckBox7.setText("X-Forwarded-For");

        jCheckBox12.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jCheckBox12.setText("Real Data");
        jCheckBox12.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3))
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox8)
                                .addGap(93, 93, 93)
                                .addComponent(jCheckBox9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(75, 75, 75)
                                .addComponent(jCheckBox2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jCheckBox10))
                            .addComponent(jCheckBox12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox7)
                                .addGap(58, 58, 58)
                                .addComponent(jCheckBox6)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox12)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox10)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCheckBox1.getAccessibleContext().setAccessibleDescription("xonlinehost");
        jCheckBox2.getAccessibleContext().setAccessibleDescription("xforwardedhost");
        jCheckBox8.getAccessibleContext().setAccessibleDescription("eagegweg");
        jCheckBox9.getAccessibleContext().setAccessibleDescription("gfwegewgew");
        jCheckBox10.getAccessibleContext().setAccessibleDescription("segesgrgv");
        jCheckBox6.getAccessibleContext().setAccessibleDescription("edgewgwe");
        jCheckBox7.getAccessibleContext().setAccessibleDescription("gvqweg");
        jCheckBox12.getAccessibleContext().setAccessibleDescription("ewgewgewg");

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String GetMethod() {
        return this.jComboBox1.getSelectedItem().toString();
    }
    
    public String Generate() {
        String Payload = "";
        String host = this.jTextField1.getText();
        String p_InjectionType = "Normal";
        Boolean p_FrontQuery = false;
        Boolean p_BackQuery = false;
        Boolean p_OnlineHost = this.jCheckBox1.isSelected();
        Boolean p_ForwardHost = this.jCheckBox2.isSelected();
        Boolean p_ForHost = this.jCheckBox7.isSelected();
        Boolean p_KeepAlive = this.jCheckBox8.isSelected();
        Boolean p_UserAgent = this.jCheckBox6.isSelected();
        Boolean p_DualConnect = this.jCheckBox9.isSelected();
        Boolean p_Split = this.jCheckBox10.isSelected();
        Boolean p_RealData = this.jCheckBox12.isSelected();
        
        String p_RequestType = "";
        if (this.jComboBox2.getSelectedItem().toString() == "Normal") {
            p_InjectionType = "Normal";
        } else if (this.jComboBox2.getSelectedItem().toString() == "Back Inject") {
            p_InjectionType = "Back";
        } else if (this.jComboBox2.getSelectedItem().toString() == "Front Inject") {
            p_InjectionType = "Front";
        } else {
            p_InjectionType = "Normal";
        }
        
        p_RequestType = this.jComboBox1.getSelectedItem().toString();
        
        p_FrontQuery = this.jRadioButton1.isSelected();
        p_BackQuery = this.jRadioButton2.isSelected();
        
        if (p_InjectionType == "Normal") {
            
            if (this.jRadioButton3.isSelected()) {
                Payload += p_RequestType + " [host_port] [protocol][crlf] Host: " + host;
            } else if (p_FrontQuery == true) {
                Payload += p_RequestType + " " + host + "@[host_port] [protocol][crlf] Host: " + host;
            } else if (p_BackQuery == true) {
                Payload += p_RequestType + " [host_port]@" + host + " [protocol][crlf] Host: " + host;
                
            }
            if ((!p_OnlineHost) && (!p_ForwardHost) && (!p_ForHost) && (!p_KeepAlive) && (!p_UserAgent)) {
                Payload += "[crlf][crlf]";
            }
            if (p_OnlineHost == true) {
                Payload += "[crlf]X-Online-Host: " + host;
            }
            if (p_ForwardHost == true) {
                Payload += "[crlf]X-Forward-Host: " + host;
            }
            if (p_ForHost == true) {
                Payload += "[crlf]X-Forwarded-For: " + host;
            }
            if (p_KeepAlive == true) {
                Payload += "[crlf]Connection: Keep-Alive";
            }
            if (p_UserAgent == true) {
                Payload += "[crlf]User-Agent: [ua]";
            }
            if ((p_OnlineHost == true) || (p_ForwardHost == true) || (p_ForHost == true) || (p_KeepAlive == true) || (p_UserAgent == true)) {
                Payload += "[crlf][crlf]";
            }
            if (p_RealData) {
                Payload = Payload.replace("CONNECT [host_port] [protocol]", "[realData]");
            }
            
        } else if (p_InjectionType == "Front") {
            
            Payload += p_RequestType + " http://" + host + "/ HTTP/1.1[clrf]Host:" + host;
            if ((p_OnlineHost == false) && (p_ForwardHost == false) && (p_ForHost == false) && (p_KeepAlive == false) && (p_UserAgent == false) && (p_DualConnect == false) && (p_FrontQuery == false) && (p_BackQuery == false) && (p_Split == false)) {
                Payload += "[crlf][crlf]CONNECT [host_port] [protocol][crlf][crlf]";
            }
            if ((p_OnlineHost == false) && (p_ForwardHost == false) && (p_ForHost == false) && (p_KeepAlive == false) && (p_UserAgent == false) && (p_DualConnect == false) && (p_FrontQuery == false) && (p_BackQuery == false) && (p_Split == true)) {
                Payload += "[crlf][crlf][split]CONNECT [host_port] [protocol][crlf][crlf]";
            }
            if ((p_OnlineHost == false) && (p_ForwardHost == false) && (p_ForHost == false) && (p_KeepAlive == false) && (p_UserAgent == false) && (p_DualConnect == false) && (p_FrontQuery == true) && (p_BackQuery == false) && (p_Split == false)) {
                Payload += "[crlf][crlf]CONNECT " + host + "@[host_port] [protocol][crlf][crlf]";
            }
            if ((p_OnlineHost == false) && (p_ForwardHost == false) && (p_ForHost == false) && (p_KeepAlive == false) && (p_UserAgent == false) && (p_DualConnect == false) && (p_FrontQuery == true) && (p_BackQuery == false) && (p_Split == true)) {
                Payload += "[crlf][crlf][split]CONNECT " + host + "@[host_port] [protocol][crlf][crlf]";
            }
            if ((p_OnlineHost == false) && (p_ForwardHost == false) && (p_ForHost == false) && (p_KeepAlive == false) && (p_UserAgent == false) && (p_DualConnect == false) && (p_FrontQuery == false) && (p_BackQuery == true) && (p_Split == false)) {
                Payload += "[crlf][crlf]CONNECT [host_port]@" + host + " [protocol][crlf][crlf]";
            }
            if ((p_OnlineHost == false) && (p_ForwardHost == false) && (p_ForHost == false) && (p_KeepAlive == false) && (p_UserAgent == false) && (p_DualConnect == false) && (p_FrontQuery == false) && (p_BackQuery == true) && (p_Split == true)) {
                Payload += "[crlf][crlf][split]CONNECT [host_port]@" + host + " [protocol][crlf][crlf]";
            }
            if ((p_OnlineHost == false) && (p_ForwardHost == false) && (p_ForHost == false) && (p_KeepAlive == false) && (p_UserAgent == false) && (p_DualConnect == true) && (p_FrontQuery == false) && (p_BackQuery == false) && (p_Split == false)) {
                Payload += "[crlf]CONNECT [host_port] [protocol][crlf][crlf]CONNECT [host_port] [protocol][crlf][crlf]";
            }
            if ((p_OnlineHost == false) && (p_ForwardHost == false) && (p_ForHost == false) && (p_KeepAlive == false) && (p_UserAgent == false) && (p_DualConnect == true) && (p_FrontQuery == true) && (p_BackQuery == false) && (p_Split == false)) {
                Payload += "[crlf]CONNECT [host_port] [protocol][crlf][crlf]CONNECT " + host + "@[host_port] [protocol][crlf][crlf]";
            }
            if ((p_OnlineHost == false) && (p_ForwardHost == false) && (p_ForHost == false) && (p_KeepAlive == false) && (p_UserAgent == false) && (p_DualConnect == true) && (p_FrontQuery == true) && (p_BackQuery == false) && (p_Split == true)) {
                Payload += "[crlf]CONNECT [host_port] [protocol][crlf][crlf][split]CONNECT " + host + "@[host_port] [protocol][crlf][crlf]";
            }
            if ((p_OnlineHost == false) && (p_ForwardHost == false) && (p_ForHost == false) && (p_KeepAlive == false) && (p_UserAgent == false) && (p_DualConnect == true) && (p_FrontQuery == false) && (p_BackQuery == true) && (p_Split == false)) {
                Payload += "[crlf]CONNECT [host_port] [protocol][crlf][crlf]CONNECT [host_port]@" + host + " [protocol][crlf][crlf]";
            }
            if ((p_OnlineHost == false) && (p_ForwardHost == false) && (p_ForHost == false) && (p_KeepAlive == false) && (p_UserAgent == false) && (p_DualConnect == true) && (p_FrontQuery == false) && (p_BackQuery == true) && (p_Split == true)) {
                Payload += "[crlf]CONNECT [host_port] [protocol][crlf][crlf][split]CONNECT [host_port]@" + host + " [protocol][crlf][crlf]";
            }
            if (p_OnlineHost == true) {
                Payload += "[crlf]X-Online-Host: " + host;
            }
            if (p_ForwardHost == true) {
                Payload += "[crlf]X-Forward-Host: " + host;
            }
            if (p_ForHost == true) {
                Payload += "[crlf]X-Forwarded-For: " + host;
            }
            if (p_KeepAlive == true) {
                Payload += "[crlf]Connection: Keep-Alive";
            }
            if (p_UserAgent == true) {
                Payload += "[crlf]User-Agent: [ua]";
            }
            if ((p_DualConnect == false) & (p_FrontQuery == false) & (p_BackQuery == false) & (p_Split == false) && (p_OnlineHost == true) | (p_ForwardHost == true) | (p_ForHost == true) | (p_KeepAlive == true) | (p_UserAgent == true)) {
                Payload += "[crlf][crlf]CONNECT [host_port] [protocol][crlf][crlf]";
            }
            if ((p_DualConnect == false) & (p_FrontQuery == true) & (p_BackQuery == false) & (p_Split == false) && (p_OnlineHost == true) | (p_ForwardHost == true) | (p_ForHost == true) | (p_KeepAlive == true) | (p_UserAgent == true)) {
                Payload += "[crlf][crlf]CONNECT " + host + "@[host_port] [protocol][crlf][crlf]";
            }
            if ((p_DualConnect == false) & (p_FrontQuery == true) & (p_BackQuery == false) & (p_Split == true) && (p_OnlineHost == true) | (p_ForwardHost == true) | (p_ForHost == true) | (p_KeepAlive == true) | (p_UserAgent == true)) {
                Payload += "[crlf][crlf][split]CONNECT " + host + "@[host_port] [protocol][crlf][crlf]";
            }
            if ((p_DualConnect == false) & (p_FrontQuery == false) & (p_BackQuery == true) & (p_Split == false) && (p_OnlineHost == true) | (p_ForwardHost == true) | (p_ForHost == true) | (p_KeepAlive == true) | (p_UserAgent == true)) {
                Payload += "[crlf][crlf]CONNECT [host_port]@" + host + " [protocol][crlf][crlf]";
            }
            if ((p_DualConnect == true) & (p_FrontQuery == false) & (p_BackQuery == true) & (p_Split == true) && (p_OnlineHost == true) | (p_ForwardHost == true) | (p_ForHost == true) | (p_KeepAlive == true) | (p_UserAgent == true)) {
                Payload += "[crlf]CONNECT [host_port] [protocol][crlf][crlf]CONNECT [host_port] [protocol][crlf][crlf]";
            }
            if ((p_DualConnect == true) & (p_FrontQuery == false) & (p_BackQuery == false) & (p_Split == true) && (p_OnlineHost == true) | (p_ForwardHost == true) | (p_ForHost == true) | (p_KeepAlive == true) | (p_UserAgent == true)) {
                Payload += "[crlf]CONNECT [host_port] [protocol][crlf][crlf][split]CONNECT [host_port] [protocol][crlf][crlf]";
            }
            if ((p_DualConnect == true) & (p_FrontQuery == true) & (p_BackQuery == false) & (p_Split == false) && (p_OnlineHost == true) | (p_ForwardHost == true) | (p_ForHost == true) | (p_KeepAlive == true) | (p_UserAgent == true)) {
                Payload += "[crlf]CONNECT [host_port] [protocol][crlf][crlf]CONNECT " + host + "@[host_port] [protocol][crlf][crlf]";
            }
            if ((p_DualConnect == true) & (p_FrontQuery == true) & (p_BackQuery == false) & (p_Split == true) && (p_OnlineHost == true) | (p_ForwardHost == true) | (p_ForHost == true) | (p_KeepAlive == true) | (p_UserAgent == true)) {
                Payload += "[crlf]CONNECT [host_port] [protocol][crlf][crlf][split]CONNECT " + host + "@[host_port] [protocol][crlf][crlf]";
            }
            if ((p_DualConnect == true) & (p_FrontQuery == false) & (p_BackQuery == true) & (p_Split == false) && (p_OnlineHost == true) | (p_ForwardHost == true) | (p_ForHost == true) | (p_KeepAlive == true) | (p_UserAgent == true)) {
                Payload += "[crlf]CONNECT [host_port] [protocol][crlf][crlf]CONNECT [host_port]@" + host + " [protocol][crlf][crlf]";
            }
            if ((p_DualConnect == true) & (p_FrontQuery == false) & (p_BackQuery == true) & (p_Split == true) && (p_OnlineHost == true) | (p_ForwardHost == true) | (p_ForHost == true) | (p_KeepAlive == true) | (p_UserAgent == true)) {
                Payload += "[crlf]CONNECT [host_port] [protocol][crlf][crlf][split]CONNECT [host_port]@" + host + " [protocol][crlf][crlf]";
            }
            if (p_RealData) {
                Payload = Payload.replace("CONNECT [host_port] [protocol]", "[realData]");
            }
            
        } else if (p_InjectionType == "Back") {
            if ((p_FrontQuery == false) && (p_BackQuery == false)) {
                Payload += "CONNECT [host_port] HTTP/1.1[crlf][crlf]" + p_RequestType + " http://" + host + "/ [protocol][crlf]Host: " + host;
            }
            if ((p_FrontQuery == true) && (p_BackQuery == false)) {
                Payload += "CONNECT " + host + "@[host_port] HTTP/1.1[crlf][crlf]" + p_RequestType + " http://" + host + "/ [protocol][crlf]Host: " + host;
            }
            if ((p_FrontQuery == false) && (p_BackQuery == true)) {
                Payload += "CONNECT [host_port]@" + host + " HTTP/1.1[crlf][crlf]" + p_RequestType + " http://" + host + "/ [protocol][crlf]Host: " + host;
            }
            if ((!p_OnlineHost) && (!p_ForwardHost) && (!p_ForHost) && (!p_KeepAlive) && (!p_UserAgent)) {
                Payload += "[crlf][crlf]";
            }
            if (p_OnlineHost == true) {
                Payload += "[crlf]X-Online-Host: " + host;
            }
            if (p_ForwardHost == true) {
                Payload += "[crlf]X-Forward-Host: " + host;
            }
            if (p_ForHost == true) {
                Payload += "[crlf]X-Forwarded-For: " + host;
            }
            if (p_KeepAlive == true) {
                Payload += "[crlf]Connection: Keep-Alive";
            }
            if (p_UserAgent == true) {
                Payload += "[crlf]User-Agent: [ua]";
            }
            if (p_DualConnect == true) {
                Payload += "[crlf]CONNECT [host_port] [protocol]";
            }
            if ((p_OnlineHost == true) || (p_ForwardHost == true) || (p_ForHost == true) || (p_KeepAlive == true) || (p_UserAgent == true)) {
                Payload += "[crlf][crlf]";
            }
            if (p_RealData) {
                Payload = Payload.replace("CONNECT [host_port] [protocol]", "[realData]");
            }
        }
        if (p_RequestType == "GET" || p_RequestType == "HEAD" || p_RequestType == "POST") {
            Payload = Payload.replace("[protocol]", "HTTP/1.0");
        }
        return Payload;
    }
    private void StopClose(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_StopClose
        this.setVisible(false);
    }//GEN-LAST:event_StopClose

    private void GeneratePayload(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeneratePayload
        Parent.SetPayload(Generate());
        Parent.setVisible(true);
    }//GEN-LAST:event_GeneratePayload

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PayloadGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayloadGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayloadGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayloadGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
public JPanel GetParent()
{
return this.jPanel1;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
