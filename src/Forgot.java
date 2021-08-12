import javax.swing.JFrame;
import java.sql.*; 

public class Forgot extends JFrame{

	// Variables declaration                     
	private javax.swing.JLabel answer;
	private javax.swing.JButton back;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private keeptoo.KGradientPanel kGradientPanel1;
	private javax.swing.JLabel name;
	private javax.swing.JLabel password;
	private javax.swing.JButton retrive;
	private javax.swing.JLabel s_que;
	private javax.swing.JButton search;
	private javax.swing.JLabel title;
	private javax.swing.JLabel username;
	// End of variables declaration

	public Forgot() {
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		kGradientPanel1 = new keeptoo.KGradientPanel();
		jPanel2 = new javax.swing.JPanel();
		title = new javax.swing.JLabel();
		username = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		name = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		s_que = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		answer = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		password = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		search = new javax.swing.JButton();
		retrive = new javax.swing.JButton();
		back = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		kGradientPanel1.setEndColor(new java.awt.Color(51, 255, 255));
		kGradientPanel1.setGradientFocus(600);
		kGradientPanel1.setStartColor(new java.awt.Color(255, 51, 255));

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));

		title.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18));
		title.setText("FORGOT?");

		username.setFont(new java.awt.Font("Roboto", 0, 10));
		username.setText("Username");

		jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 102, 255)));

		name.setFont(new java.awt.Font("Roboto", 0, 10));
		name.setText("Name");

		jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 102, 255)));

		s_que.setFont(new java.awt.Font("Roboto", 0, 10)); 
		s_que.setText("Security Question");

		jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 102, 255)));
		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		answer.setFont(new java.awt.Font("Roboto", 0, 10)); 
		answer.setText("Answer");

		jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 102, 255)));
		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		password.setFont(new java.awt.Font("Roboto", 0, 10));
		password.setText("Password");

		jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 102, 255)));

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

		retrive.setBackground(new java.awt.Color(255, 255, 255));
		retrive.setFont(new java.awt.Font("Roboto", 1, 10)); 
		retrive.setForeground(new java.awt.Color(204, 51, 255));
		retrive.setText("Retrive");
		retrive.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
		retrive.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		back.setBackground(new java.awt.Color(255, 255, 255));
		back.setFont(new java.awt.Font("Roboto", 1, 10)); 
		back.setForeground(new java.awt.Color(204, 51, 255));
		back.setText("Back");
		back.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
		back.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(title)
						.addGap(171, 171, 171))
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(57, 57, 57)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
												.addComponent(answer)
												.addComponent(s_que)
												.addComponent(jTextField2)
												.addComponent(jTextField1)
												.addComponent(name)
												.addComponent(username)
												.addComponent(password)
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
														.addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(56, 56, 56))
												.addComponent(jTextField3))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
										.addComponent(jTextField4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(retrive, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(33, Short.MAX_VALUE))
				);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
						.addContainerGap(59, Short.MAX_VALUE)
						.addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(username)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(name)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(s_que)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(answer)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(retrive, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(password)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(31, 31, 31)
						.addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(46, 46, 46))
				);

		kGradientPanel1.add(jPanel2);
		jPanel2.setBounds(220, 40, 430, 470);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
				);

		getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

		pack();
		setLocationRelativeTo(null);
	}                                 

	private void ActionPerformed(java.awt.event.ActionEvent evt) {                                            
		// TODO add your handling code here:
		try{
			conn con = new conn();
			if(evt.getSource() == search){
				String sql = "select * from account where username=?";
				PreparedStatement st = con.c.prepareStatement(sql);

				st.setString(1, jTextField1.getText());
				ResultSet rs = st.executeQuery();

				while (rs.next()) {
					jTextField2.setText(rs.getString("name"));
					jTextField3.setText(rs.getString("que"));
				}

			}
			if(evt.getSource() == retrive){
				String sql = "select * from account where ans=?";
				PreparedStatement st = con.c.prepareStatement(sql);

				st.setString(1, jTextField4.getText());
				ResultSet rs = st.executeQuery();

				while (rs.next()) {
					jTextField5.setText(rs.getString("password"));
				}

			}
			if(evt.getSource() == back){
				this.setVisible(false);
				new Login().setVisible(true);

			}
		}catch(Exception e){

		}
	}

	public static void main(String[] args) {
		new Forgot().setVisible(true);
	}
}
