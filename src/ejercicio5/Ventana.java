package ejercicio5;

import java.util.ArrayList;

public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
        this.setSize(400, 350);
        lista = new ArrayList<>();
        lstValores.setListData(lista.toArray());
        optCfa.setSelected(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        optArea = new javax.swing.JRadioButton();
        optCfa = new javax.swing.JRadioButton();
        btnCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstValores = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Valores ingresados");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 130, 140, 20);

        txtRadio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtRadio);
        txtRadio.setBounds(90, 20, 60, 20);

        grupo.add(optArea);
        optArea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        optArea.setText("Area");
        getContentPane().add(optArea);
        optArea.setBounds(190, 30, 60, 23);

        grupo.add(optCfa);
        optCfa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        optCfa.setText("Circunferencia");
        getContentPane().add(optCfa);
        optCfa.setBounds(190, 10, 117, 20);

        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(40, 60, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Resultado:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 80, 80, 20);

        txtResultado.setEditable(false);
        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtResultado);
        txtResultado.setBounds(250, 80, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Radio:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 20, 60, 20);

        lstValores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lstValores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstValores);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 150, 260, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int radio = Integer.parseInt(txtRadio.getText());
        double resultado;
        if (optCfa.isSelected()){
            resultado = 2*Math.PI*radio;
            lista.add("Radio: "+radio+" Circunferencia: "+String.format("%.2f", resultado));
        }
        else {
            resultado = Math.PI*Math.pow(radio,2);
            lista.add("Radio: "+radio+" Area: "+String.format("%.2f", resultado));
        }
        txtResultado.setText(String.format("%.2f", resultado));   
        lstValores.setListData(lista.toArray());
    }//GEN-LAST:event_btnCalcularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstValores;
    private javax.swing.JRadioButton optArea;
    private javax.swing.JRadioButton optCfa;
    private javax.swing.JTextField txtRadio;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
    ArrayList<String> lista;
}
