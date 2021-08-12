import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*; 

public class Login extends JFrame{

	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField3;
	private keeptoo.KGradientPanel kGradientPanel1;

	public Login() {
		initComponents();
	}

	private void initComponents() {

		kGradientPanel1 = new keeptoo.KGradientPanel();
		jPanel1 = new javax.swing.JPanel();
		jTextField3 = new javax.swing.JTextField();
		jPasswordField1 = new javax.swing.JPasswordField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		kGradientPanel1.setForeground(new java.awt.Color(255, 255, 255));
		kGradientPanel1.setEndColor(new java.awt.Color(51, 255, 255));
		kGradientPanel1.setGradientFocus(600);
		kGradientPanel1.setStartColor(new java.awt.Color(255, 51, 255));

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 102, 255)));

		jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 102, 255)));

		jLabel2.setFont(new java.awt.Font("Roboto", 1, 10));
		jLabel2.setText("Username");

		jLabel3.setFont(new java.awt.Font("Roboto", 1, 10));
		jLabel3.setText("Password");

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setFont(new java.awt.Font("Roboto", 1, 10));
		jButton1.setForeground(new java.awt.Color(204, 51, 255));
		jButton1.setText("Login");
		jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setFont(new java.awt.Font("Roboto", 1, 10));
		jButton2.setForeground(new java.awt.Color(204, 51, 255));
		jButton2.setText("Signup");
		jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setFont(new java.awt.Font("Roboto", 1, 10)); 
		jButton3.setForeground(new java.awt.Color(204, 51, 255));
		jButton3.setText("Forgot");
		jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Roboto", 0, 9));
		jLabel4.setText("Forgot Password ?");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(52, 52, 52)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel2)
								.addComponent(jLabel3)
								.addComponent(jTextField3)
								.addComponent(jPasswordField1)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
										.addGap(24, 24, 24)
										.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
										.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(24, 24, 24))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
										.addGap(0, 0, Short.MAX_VALUE)
										.addComponent(jLabel4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(38, 38, 38)))
						.addContainerGap(52, Short.MAX_VALUE))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(81, 81, 81)
						.addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(30, 30, 30)
						.addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(31, 31, 31)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(56, 56, 56)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4))
						.addContainerGap(53, Short.MAX_VALUE))
				);

		kGradientPanel1.add(jPanel1);
		jPanel1.setBounds(400, 90, 350, 370);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/library.png")));
		kGradientPanel1.add(jLabel1);
		jLabel1.setBounds(60, 180, 280, 160);

		jLabel5.setFont(new java.awt.Font("Montserrat Light", 0, 18));
		jLabel5.setText("L I B R A R Y");
		kGradientPanel1.add(jLabel5);
		jLabel5.setBounds(150, 340, 110, 23);

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

	public void ActionPerformed(java.awt.event.ActionEvent evt){
		if(evt.getSource() == jButton1){
			Boolean status = false;
			try {
				conn con = new conn();
				String sql = "select * from account where username=? and password=?";
				PreparedStatement st = con.c.prepareStatement(sql);

				st.setString(1, jTextField3.getText());
				st.setString(2, jPasswordField1.getText());

				ResultSet rs = st.executeQuery();
				if (rs.next()) {
					this.setVisible(false);
					new Home().setVisible(true);
				} else
					JOptionPane.showMessageDialog(null, "Invalid Login...!.");

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		if(evt.getSource() == jButton2){
			this.setVisible(false);
			new Signup().setVisible(true);
		}
		if(evt.getSource() == jButton3){
			setVisible(false);
			Forgot forgot = new Forgot();
			forgot.setVisible(true);
		}
	}

	public static void main(String[] args) {
		new Login().setVisible(true);
	}

}
