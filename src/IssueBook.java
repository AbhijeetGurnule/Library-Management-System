import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;

public class IssueBook extends JFrame{

	// Variables declaration                    
	private javax.swing.JButton back;
	private javax.swing.JLabel book_id;
	private javax.swing.JLabel branch;
	private javax.swing.JLabel course;
	private javax.swing.JLabel edition;
	private javax.swing.JLabel fname;
	private javax.swing.JLabel isbn;
	private javax.swing.JButton issue;
	private com.toedter.calendar.JDateChooser jDateChooser1;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField11;
	private javax.swing.JTextField jTextField12;
	private javax.swing.JTextField jTextField13;
	private javax.swing.JTextField jTextField14;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	private javax.swing.JLabel name;
	private javax.swing.JLabel pages;
	private javax.swing.JLabel price;
	private javax.swing.JLabel publisher;
	private javax.swing.JButton search1;
	private javax.swing.JButton search2;
	private javax.swing.JLabel semester;
	private javax.swing.JLabel sname;
	private javax.swing.JLabel student_id;
	private javax.swing.JLabel title1;
	private javax.swing.JLabel title2;
	private javax.swing.JLabel year;
	// End of variables declaration

	public IssueBook() {
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		title1 = new javax.swing.JLabel();
		book_id = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		name = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		isbn = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		publisher = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		edition = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		price = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		pages = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		search1 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		title2 = new javax.swing.JLabel();
		student_id = new javax.swing.JLabel();
		jTextField8 = new javax.swing.JTextField();
		sname = new javax.swing.JLabel();
		jTextField9 = new javax.swing.JTextField();
		fname = new javax.swing.JLabel();
		jTextField10 = new javax.swing.JTextField();
		course = new javax.swing.JLabel();
		jTextField11 = new javax.swing.JTextField();
		branch = new javax.swing.JLabel();
		jTextField12 = new javax.swing.JTextField();
		year = new javax.swing.JLabel();
		jTextField13 = new javax.swing.JTextField();
		semester = new javax.swing.JLabel();
		jTextField14 = new javax.swing.JTextField();
		search2 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jLabel16 = new javax.swing.JLabel();
		jDateChooser1 = new com.toedter.calendar.JDateChooser();
		issue = new javax.swing.JButton();
		back = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jPanel1.setBackground(new java.awt.Color(204, 255, 255));

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));
		jPanel2.setPreferredSize(new java.awt.Dimension(360, 410));

		title1.setFont(new java.awt.Font("Roboto", 1, 15));
		title1.setText("Issue Book");

		book_id.setFont(new java.awt.Font("Roboto", 1, 10));
		book_id.setText("Book_id");

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

		isbn.setFont(new java.awt.Font("Roboto", 1, 10));
		isbn.setText("ISBN");

		jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		publisher.setFont(new java.awt.Font("Roboto", 1, 10));
		publisher.setText("Publisher");

		jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		edition.setFont(new java.awt.Font("Roboto", 1, 10));
		edition.setText("Edition");

		jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		price.setFont(new java.awt.Font("Roboto", 1, 10)); 
		price.setText("Price");

		jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		pages.setFont(new java.awt.Font("Roboto", 1, 10)); 
		pages.setText("Pages");

		jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		search1.setBackground(new java.awt.Color(255, 255, 255));
		search1.setFont(new java.awt.Font("Roboto", 1, 10)); 
		search1.setForeground(new java.awt.Color(204, 51, 255));
		search1.setText("Search");
		search1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
		search1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(57, 57, 57)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jTextField3)
								.addComponent(jTextField4)
								.addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jTextField5)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
														.addGap(88, 88, 88)
														.addComponent(title1))
												.addComponent(edition, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(publisher, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(isbn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(pages, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(book_id, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(search1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
								.addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
						.addGap(56, 56, 56))
				);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(25, 25, 25)
						.addComponent(title1)
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(book_id)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(name)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(isbn)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(publisher)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(edition)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(price)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(pages)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		jPanel3.setBackground(new java.awt.Color(255, 255, 255));
		jPanel3.setPreferredSize(new java.awt.Dimension(360, 410));

		title2.setFont(new java.awt.Font("Roboto", 1, 15));
		title2.setText("Student Details");

		student_id.setFont(new java.awt.Font("Roboto", 1, 10));
		student_id.setText("Student_id");

		jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		sname.setFont(new java.awt.Font("Roboto", 1, 10));
		sname.setText("Name");

		jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		fname.setFont(new java.awt.Font("Roboto", 1, 10));
		fname.setText("Father's Name");

		jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		course.setFont(new java.awt.Font("Roboto", 1, 10));
		course.setText("Course");

		jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		branch.setFont(new java.awt.Font("Roboto", 1, 10)); 
		branch.setText("Branch");

		jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		year.setFont(new java.awt.Font("Roboto", 1, 10)); 
		year.setText("Year");

		jTextField13.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		semester.setFont(new java.awt.Font("Roboto", 1, 10)); 
		semester.setText("Semester");

		jTextField14.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		search2.setBackground(new java.awt.Color(255, 255, 255));
		search2.setFont(new java.awt.Font("Roboto", 1, 10)); 
		search2.setForeground(new java.awt.Color(204, 51, 255));
		search2.setText("Search");
		search2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
		search2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGap(131, 131, 131)
										.addComponent(title2))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGap(59, 59, 59)
										.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(year)
												.addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(fname)
												.addComponent(course)
												.addComponent(branch)
												.addComponent(semester)
												.addComponent(jTextField9)
												.addComponent(jTextField10)
												.addComponent(jTextField11)
												.addComponent(jTextField12)
												.addComponent(jTextField13)
												.addComponent(jTextField14)
												.addGroup(jPanel3Layout.createSequentialGroup()
														.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(student_id)
																.addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(search2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))))
						.addContainerGap(46, Short.MAX_VALUE))
				);
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGap(25, 25, 25)
						.addComponent(title2)
						.addGap(18, 18, 18)
						.addComponent(student_id)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(sname)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(fname)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(course)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(branch)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(year)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(semester)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(42, Short.MAX_VALUE))
				);

		jPanel4.setBackground(new java.awt.Color(204, 204, 204));

		jLabel16.setFont(new java.awt.Font("Roboto", 1, 11));
		jLabel16.setText("Date of Issue");

		jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
		jDateChooser1.setFont(new java.awt.Font("Roboto", 0, 10)); 

		issue.setBackground(new java.awt.Color(255, 255, 255));
		issue.setFont(new java.awt.Font("Roboto", 1, 10)); 
		issue.setForeground(new java.awt.Color(0, 0, 0));
		issue.setText("Issue");
		issue.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 0)));
		issue.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		back.setBackground(new java.awt.Color(255, 255, 255));
		back.setFont(new java.awt.Font("Roboto", 1, 10)); 
		back.setForeground(new java.awt.Color(0, 0, 0));
		back.setText("Back");
		back.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 0)));
		back.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addGap(93, 93, 93)
						.addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27)
						.addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(89, 89, 89)
						.addComponent(issue, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(45, 45, 45)
						.addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		jPanel4Layout.setVerticalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addGap(13, 13, 13)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(issue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
										.addGap(5, 5, 5)
										.addComponent(jLabel16)))
						.addContainerGap(13, Short.MAX_VALUE))
				);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(42, 42, 42)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
										.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(42, 42, 42))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(30, 30, 30)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
								.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(24, 24, 24))
				);

		getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

		pack();
		setLocationRelativeTo(null);
	}

	private void ActionPerformed(java.awt.event.ActionEvent evt) {                                        
		// TODO add your handling code here:
		try{
			conn con = new conn();
			if(evt.getSource() == search1){
				String sql = "select * from books where book_id = ?";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, jTextField1.getText());
				ResultSet rs = st.executeQuery();

				while (rs.next()) {
					jTextField2.setText(rs.getString("name"));
					jTextField3.setText(rs.getString("isbn"));
					jTextField4.setText(rs.getString("publisher"));
					jTextField5.setText(rs.getString("edition"));
					jTextField6.setText(rs.getString("price"));
					jTextField7.setText(rs.getString("pages"));
				}
				st.close();
				rs.close();

			}
			if(evt.getSource() == search2){
				String sql = "select * from students where student_id = ?";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, jTextField8.getText());
				ResultSet rs = st.executeQuery();

				while (rs.next()) {
					jTextField9.setText(rs.getString("name"));
					jTextField10.setText(rs.getString("fname"));
					jTextField11.setText(rs.getString("course"));
					jTextField12.setText(rs.getString("branch"));
					jTextField13.setText(rs.getString("year"));
					jTextField14.setText(rs.getString("semester"));
				}
				st.close();
				rs.close();

			}
			if(evt.getSource() == issue){
				try{
					String sql = "insert into issue_book(book_id, student_id, bname, sname, course, branch, date_of_issue) values(?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement st = con.c.prepareStatement(sql);
					st.setString(1, jTextField1.getText());
					st.setString(2, jTextField8.getText());
					st.setString(3, jTextField2.getText());
					st.setString(4, jTextField9.getText());
					st.setString(5, jTextField11.getText());
					st.setString(6, jTextField12.getText());
					st.setString(7, ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
					int i = st.executeUpdate();
					if (i > 0)
						JOptionPane.showMessageDialog(null, "Successfully Book Issued..!");
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
			con.c.close();
		}catch(Exception e){

		}
	}

	public static void main(String[] args) {
		new IssueBook().setVisible(true);
	}
}
