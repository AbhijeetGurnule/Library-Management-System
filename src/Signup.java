import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*; 

public class Signup extends JFrame{

	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private keeptoo.KGradientPanel kGradientPanel1;

	public Signup() {
		initComponents();
	}

	private void initComponents() {

		kGradientPanel1 = new keeptoo.KGradientPanel();
		jPanel1 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();
		jLabel4 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox<>();
		jLabel5 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		kGradientPanel1.setEndColor(new java.awt.Color(0, 255, 255));
		kGradientPanel1.setGradientFocus(500);
		kGradientPanel1.setStartColor(new java.awt.Color(255, 0, 255));

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel6.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18));
		jLabel6.setText("SIGN UP");

		jLabel1.setFont(new java.awt.Font("Roboto", 1, 10));
		jLabel1.setText("Username");

		jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 102, 255)));

		jLabel2.setFont(new java.awt.Font("Roboto", 1, 10));
		jLabel2.setText("Name");

		jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 102, 255)));

		jLabel3.setFont(new java.awt.Font("Roboto", 1, 10));
		jLabel3.setText("Password");

		jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 102, 255)));
		jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordField1ActionPerformed(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Roboto", 1, 10));
		jLabel4.setText("Security Question");

		jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Your Nickname?", "Your Lucky Number?", "Your Childhood Name?", "Your Favourite Color?" }));
		jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 102, 255)));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Roboto", 1, 10)); 
		jLabel5.setText("Answer");

		jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 102, 255)));

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setFont(new java.awt.Font("Roboto", 1, 10)); 
		jButton2.setForeground(new java.awt.Color(204, 51, 255));
		jButton2.setText("Create");
		jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setFont(new java.awt.Font("Roboto", 1, 10)); 
		jButton3.setForeground(new java.awt.Color(204, 51, 255));
		jButton3.setText("Back");
		jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
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
										.addGap(146, 146, 146)
										.addComponent(jLabel6))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(57, 57, 57)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(jTextField3)
												.addComponent(jLabel4)
												.addComponent(jLabel3)
												.addComponent(jTextField2)
												.addComponent(jTextField1)
												.addComponent(jLabel2)
												.addComponent(jLabel1)
												.addComponent(jPasswordField1)
												.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(59, Short.MAX_VALUE))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(45, Short.MAX_VALUE)
						.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(50, 50, 50))
				);

		kGradientPanel1.add(jPanel1);
		jPanel1.setBounds(250, 40, 370, 470);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
				);

		pack();
		setLocationRelativeTo(null);
	}

	private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
		// TODO add your handling code here:
	}                                               

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
		// TODO add your handling code here:
	}                                          

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
		try{
			conn con = new conn();

			if(evt.getSource() == jButton2){
				String sql = "insert into account(username, name, password, que, ans) values(?, ?, ?, ?, ?)";
				PreparedStatement st = con.c.prepareStatement(sql);

				st.setString(1, jTextField1.getText());
				st.setString(2, jTextField2.getText());
				st.setString(3, jPasswordField1.getText());
				st.setString(4, (String) jComboBox1.getSelectedItem());
				st.setString(5, jTextField3.getText());

				int i = st.executeUpdate();
				if (i > 0){
					JOptionPane.showMessageDialog(null, "successfully Created");
				}

				jTextField1.setText("");
				jTextField2.setText("");
				jPasswordField1.setText("");
				jTextField3.setText("");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}                                        

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
		// TODO add your handling code here:
		if(evt.getSource() == jButton3){
			this.setVisible(false);
			new Login().setVisible(true);

		}
	}

	public static void main(String[] args) {
		new Signup().setVisible(true);
	}

}
