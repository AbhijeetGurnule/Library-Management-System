import javax.swing.JFrame;
import net.proteanit.sql.DbUtils;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;

public class Statistics extends JFrame{

	// Variables declaration                    
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	// End of variables declaration

	public Statistics() {
		initComponents();
		issueBook();
		returnBook();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jButton3 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jPanel1.setBackground(new java.awt.Color(204, 255, 255));

		jLabel3.setFont(new java.awt.Font("Roboto", 1, 15));
		jLabel3.setText("Issue Book Details");

		jTable1.setSelectionBackground(new java.awt.Color(225, 225, 255));
		jTable1.setForeground(new Color(0, 0, 0));
		jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11));
		jScrollPane1.setViewportView(jTable1);

		jLabel1.setFont(new java.awt.Font("Roboto", 1, 15));
		jLabel1.setText("Retrun Book Details");

		jTable2.setSelectionBackground(new java.awt.Color(225, 225, 255));
		jTable2.setForeground(new Color(0, 0, 0));
		jTable2.setFont(new java.awt.Font("Segoe UI", 0, 11));
		jScrollPane2.setViewportView(jTable2);

		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setFont(new java.awt.Font("Roboto", 0, 10));
		jButton3.setForeground(new java.awt.Color(0, 204, 255));
		jButton3.setText("Back");
		jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 255)));
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(369, 369, 369)
										.addComponent(jLabel3))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(368, 368, 368)
										.addComponent(jLabel1))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(96, 96, 96)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
														.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
														.addComponent(jScrollPane2)))))
						.addContainerGap(96, Short.MAX_VALUE))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(49, 49, 49)
						.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(36, 36, 36)
						.addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(52, 52, 52)
						.addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(112, Short.MAX_VALUE))
				);

		getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

		pack();
		setLocationRelativeTo(null);
	}

	public void issueBook() {
		try {
			conn con =  new conn();
			String sql = "select * from issue_book";
			PreparedStatement st = con.c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			jTable1.setModel(DbUtils.resultSetToTableModel(rs));

		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void returnBook() {
		try {
			conn con = new conn();
			String sql = "select * from return_book";
			PreparedStatement st = con.c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			jTable2.setModel(DbUtils.resultSetToTableModel(rs));
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
		if(evt.getSource() == jButton3){
			this.setVisible(false);
			new Home().setVisible(true);
		}
	}

	public static void main(String[] args) {
		new Statistics().setVisible(true);
	}

}
