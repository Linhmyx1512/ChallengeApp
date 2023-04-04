
package menu;


public class Profile extends javax.swing.JPanel {

    public Profile() {
        initComponents();
        lbTotal.setOpaque(true);        
    }
    
    public void showInfor(Collection c) {
        showTotal.setText(String.valueOf(c.totalChallenge));
        showDone.setText(String.valueOf(c.doneChallange));
        showReset.setText(String.valueOf(c.totalChallenge- c.doneChallange));
    }
    
    public void addDataTable(int stt, String name, String date, String status) {
        table.addRow(new Object[]{stt, name, date, status});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTotal = new javax.swing.JLabel();
        lbDone = new javax.swing.JLabel();
        lbReset = new javax.swing.JLabel();
        showTotal = new javax.swing.JLabel();
        showDone = new javax.swing.JLabel();
        showReset = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        table = new swingMain.Table();

        setBackground(new java.awt.Color(153, 204, 255));
        setPreferredSize(new java.awt.Dimension(745, 598));

        lbTotal.setBackground(new java.awt.Color(153, 204, 255));
        lbTotal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(204, 102, 0));
        lbTotal.setText("TOTAL CHALLENGE");
        lbTotal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbTotal.setOpaque(true);

        lbDone.setBackground(new java.awt.Color(153, 204, 255));
        lbDone.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbDone.setForeground(new java.awt.Color(204, 102, 0));
        lbDone.setText("DONE");
        lbDone.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbDone.setOpaque(true);

        lbReset.setBackground(new java.awt.Color(153, 204, 255));
        lbReset.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbReset.setForeground(new java.awt.Color(204, 102, 0));
        lbReset.setText("RESET");
        lbReset.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbReset.setOpaque(true);

        showTotal.setBackground(new java.awt.Color(204, 255, 255));
        showTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showTotal.setForeground(new java.awt.Color(153, 153, 153));
        showTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 102, 51)));
        showTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        showTotal.setOpaque(true);

        showDone.setBackground(new java.awt.Color(204, 255, 255));
        showDone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showDone.setForeground(new java.awt.Color(153, 153, 153));
        showDone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showDone.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 102, 51)));
        showDone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        showDone.setOpaque(true);

        showReset.setBackground(new java.awt.Color(204, 255, 255));
        showReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showReset.setForeground(new java.awt.Color(153, 153, 153));
        showReset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showReset.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 102, 51)));
        showReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        showReset.setOpaque(true);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showDone, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbReset)
                            .addComponent(showReset, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showDone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lbDone;
    private javax.swing.JLabel lbReset;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel showDone;
    private javax.swing.JLabel showReset;
    private javax.swing.JLabel showTotal;
    private swingMain.Table table;
    // End of variables declaration//GEN-END:variables
}
