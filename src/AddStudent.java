import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;

public class AddStudent extends JFrame{

	// Variables declaration                
	private javax.swing.JButton add;
	private javax.swing.JButton back;
	private javax.swing.JLabel branch;
	private javax.swing.JLabel course;
	private javax.swing.JLabel fname;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JComboBox<String> jComboBox2;
	private javax.swing.JComboBox<String> jComboBox3;
	private javax.swing.JComboBox<String> jComboBox4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JLabel name;
	private javax.swing.JLabel semester;
	private javax.swing.JLabel student_id;
	private javax.swing.JLabel title;
	private javax.swing.JLabel year;
	// End of variables declaration

	public AddStudent() {
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		title = new javax.swing.JLabel();
		student_id = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		name = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		fname = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		course = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox<>();
		branch = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox<>();
		year = new javax.swing.JLabel();
		jComboBox3 = new javax.swing.JComboBox<>();
		semester = new javax.swing.JLabel();
		jComboBox4 = new javax.swing.JComboBox<>();
		add = new javax.swing.JButton();
		back = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jPanel1.setBackground(new java.awt.Color(204, 255, 255));

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));
		jPanel2.setPreferredSize(new java.awt.Dimension(320, 356));

		title.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18));
		title.setText("ADD STUDENT");

		student_id.setFont(new java.awt.Font("Roboto", 1, 10));
		student_id.setText("Student_id");

		jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		name.setFont(new java.awt.Font("Roboto", 1, 10));
		name.setText("Name");

		jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		fname.setFont(new java.awt.Font("Roboto", 1, 10));
		fname.setText("Father's Name");

		jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		course.setFont(new java.awt.Font("Roboto", 1, 10));
		course.setText("Course");

		jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.E./B.Tech", "M.E./M.Tech", "B.sc.", "M.sc", "BCA", "MBA", "BBA", "Other", " ", " " }));
		jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));

		branch.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
		branch.setText("Branch");

		jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "IT", "Mechanical", "Civil", "EXTC", "Chemical", "Other" }));
		jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		year.setFont(new java.awt.Font("Roboto", 1, 10)); 
		year.setText("Year");

		jComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", " " }));
		jComboBox3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jComboBox3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		semester.setFont(new java.awt.Font("Roboto", 1, 10)); 
		semester.setText("Semester");

		jComboBox4.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
		jComboBox4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jComboBox4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		add.setBackground(new java.awt.Color(255, 255, 255));
		add.setFont(new java.awt.Font("Roboto", 1, 10)); 
		add.setForeground(new java.awt.Color(204, 51, 255));
		add.setText("Add");
		add.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
		add.addActionListener(new java.awt.event.ActionListener() {
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
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGap(112, 112, 112)
										.addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(30, 30, 30)
										.addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
												.addGap(146, 146, 146)
												.addComponent(title)
												.addGap(56, 56, 56))
										.addGroup(jPanel2Layout.createSequentialGroup()
												.addGap(82, 82, 82)
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(year)
																.addComponent(semester))
														.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																.addComponent(jTextField3)
																.addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jTextField2)
																.addComponent(jTextField1)
																.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(fname)
																.addComponent(student_id)
																.addComponent(course)
																.addComponent(branch))))))
						.addContainerGap(81, Short.MAX_VALUE))
				);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(19, 19, 19)
						.addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(student_id)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(name)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(fname)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(course)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(branch)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(year)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(semester)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(33, 33, 33))
				);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(220, 220, 220)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(220, Short.MAX_VALUE))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(20, 20, 20)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(20, Short.MAX_VALUE))
				);

		getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

		pack();
		setLocationRelativeTo(null);
	}

	private void ActionPerformed(java.awt.event.ActionEvent evt) {                                           
		// TODO add your handling code here:
		try{
			if(evt.getSource() == add){
				try{
					conn con = new conn();
					String sql = "insert into students (student_id, name, fname, course, branch, year, semester) values(?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement st = con.c.prepareStatement(sql);
					st.setString(1, jTextField1.getText());
					st.setString(2, jTextField2.getText());
					st.setString(3, jTextField3.getText());
					st.setString(4, (String) jComboBox1.getSelectedItem());
					st.setString(5, (String) jComboBox2.getSelectedItem());
					st.setString(6, (String) jComboBox3.getSelectedItem());
					st.setString(7, (String) jComboBox4.getSelectedItem());

					int i = st.executeUpdate();
					if (i > 0){
						JOptionPane.showMessageDialog(null, "Successfully Added");
						this.setVisible(false);
						new Home().setVisible(true);
					}
					else
						JOptionPane.showMessageDialog(null, "error");
				}catch(Exception e){
					e.printStackTrace();
				}
			}

			if(evt.getSource() == back){
				this.setVisible(false);
				new Home().setVisible(true);		
			}
		}catch(Exception e){

		}
	}

	public static void main(String[] args) {
		new AddStudent().setVisible(true);
	}
}
