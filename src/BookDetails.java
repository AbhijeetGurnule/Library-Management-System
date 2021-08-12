import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

public class BookDetails extends JFrame{

	// Variables declaration                   
	private javax.swing.JButton Back;
	private javax.swing.JButton delete;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JButton search;
	// End of variables declaration

	public void Book() {

		try {
			conn con = new conn();
			String sql = "select * from books";
			PreparedStatement st = con.c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			jTable1.setModel(DbUtils.resultSetToTableModel(rs));
			rs.close();
			st.close();
			con.c.close();
		} catch (Exception e) {

		}
	}

	public BookDetails() {
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		Back = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		search = new javax.swing.JButton();
		delete = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(204, 255, 255));

		jLabel3.setFont(new java.awt.Font("Open Sans SemiBold", 0, 24));
		jLabel3.setText("BOOK DETAILS");

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));
		jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

		Back.setBackground(new java.awt.Color(255, 255, 255));
		Back.setFont(new java.awt.Font("Roboto", 1, 10)); 
		Back.setForeground(new java.awt.Color(204, 51, 255));
		Back.setText("Back");
		Back.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
		Back.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		search.setBackground(new java.awt.Color(255, 255, 255));
		search.setFont(new java.awt.Font("Roboto", 1, 10)); 
		search.setForeground(new java.awt.Color(204, 51, 255));
		search.setText("Search");
		search.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
		search.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		delete.setBackground(new java.awt.Color(255, 255, 255));
		delete.setFont(new java.awt.Font("Roboto", 1, 10)); 
		delete.setForeground(new java.awt.Color(204, 51, 255));
		delete.setText("Delete");
		delete.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
		delete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		jTable1.setFont(new java.awt.Font("Segoe UI", 0, 10)); 
		jTable1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int row = jTable1.getSelectedRow();
				jTextField1.setText(jTable1.getModel().getValueAt(row, 1).toString());
			}
		});

		jTable1.setSelectionBackground(new java.awt.Color(225, 225, 255));
		jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
						.addGap(29, 29, 29)
						.addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(30, 30, 30)
						.addComponent(jTextField1)
						.addGap(26, 26, 26)
						.addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(29, 29, 29)
						.addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27))
				);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(68, 68, 68))
				);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(97, 97, 97)
										.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(338, 338, 338)
										.addComponent(jLabel3)))
						.addContainerGap(98, Short.MAX_VALUE))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(37, 37, 37)
						.addComponent(jLabel3)
						.addGap(18, 18, 18)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(62, Short.MAX_VALUE))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);

		pack();
		Book();
		setLocationRelativeTo(null);
	}


	private void ActionPerformed(java.awt.event.ActionEvent evt) {                                       
		try{

			conn con = new conn();

			if(evt.getSource() == Back) {
				this.setVisible(false);
				new Home().setVisible(true);
			}

			if(evt.getSource() == search){

				String sql = "select * from books where concat(name, book_id) like ?";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, "%" + jTextField1.getText() + "%");
				ResultSet rs = st.executeQuery();

				jTable1.setModel(DbUtils.resultSetToTableModel(rs));
				rs.close();
				st.close();

			}
			if(evt.getSource() == delete){
				String sql = "delete from books where name = '" + jTextField1.getText() + "'";
				PreparedStatement st = con.c.prepareStatement(sql);

				JDialog.setDefaultLookAndFeelDecorated(true);
				int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (response == JOptionPane.NO_OPTION) {

				} else if (response == JOptionPane.YES_OPTION) {
					int rs = st.executeUpdate();
					JOptionPane.showMessageDialog(null, "Deleted !!");
				} else if (response == JOptionPane.CLOSED_OPTION) {

				}
				st.close();
			}
			con.c.close();
		}catch(Exception e){

		}
	}

	public static void main(String[] args) {
		new BookDetails().setVisible(true);
	}
}
