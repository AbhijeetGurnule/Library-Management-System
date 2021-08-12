import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class ReturnBook extends JFrame{

	// Variables declaration - do not modify                     
	private javax.swing.JButton Back;
	private javax.swing.JLabel Book;
	private javax.swing.JLabel Book_id;
	private javax.swing.JLabel Branch;
	private javax.swing.JLabel Course;
	private javax.swing.JLabel Date_of_Issue;
	private javax.swing.JLabel Date_of_Return;
	private javax.swing.JLabel Name;
	private javax.swing.JButton Return;
	private javax.swing.JButton Search;
	private javax.swing.JLabel Student_id;
	private com.toedter.calendar.JDateChooser jDateChooser1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JPanel panel1;
	private javax.swing.JPanel panel2;
	private javax.swing.JLabel title;
	// End of variables declaration 

	public static void main(String[] args) {
		new ReturnBook().setVisible(true);
	}

	public void delete() {
		try {
			conn con = new conn();
			String sql = "delete from issue_book where book_id=?";
			PreparedStatement st = con.c.prepareStatement(sql);
			st.setString(1, jTextField1.getText());
			int i = st.executeUpdate();
			if (i > 0)
				JOptionPane.showConfirmDialog(null, "Book Returned");
			else
				JOptionPane.showMessageDialog(null, "error in Deleting");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
			e.printStackTrace();
		}
	}

	public ReturnBook() {
		initComponents();
	}

	private void initComponents() {

		panel1 = new javax.swing.JPanel();
		panel2 = new javax.swing.JPanel();
		title = new javax.swing.JLabel();
		Book_id = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		Student_id = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		Book = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		Name = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		Course = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		Branch = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		Date_of_Issue = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		Date_of_Return = new javax.swing.JLabel();
		jDateChooser1 = new com.toedter.calendar.JDateChooser();
		Search = new javax.swing.JButton();
		Return = new javax.swing.JButton();
		Back = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		panel1.setBackground(new java.awt.Color(204, 255, 255));
		panel1.setPreferredSize(new java.awt.Dimension(850, 550));

		panel2.setBackground(new java.awt.Color(255, 255, 255));
		panel2.setPreferredSize(new java.awt.Dimension(720, 351));

		title.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18));
		title.setText("RETURN BOOK");

		Book_id.setFont(new java.awt.Font("Roboto", 1, 10));
		Book_id.setText("Book_id");

		jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 12));
		jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		Student_id.setFont(new java.awt.Font("Roboto", 1, 10)); 
		Student_id.setText("Student_id");

		jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		Book.setFont(new java.awt.Font("Roboto", 1, 10)); 
		Book.setText("Book");

		jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		Name.setFont(new java.awt.Font("Roboto", 1, 10)); 
		Name.setText("Name");

		jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		Course.setFont(new java.awt.Font("Roboto", 1, 10)); 
		Course.setText("Course");

		jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		Branch.setFont(new java.awt.Font("Roboto", 1, 10));
		Branch.setText("Branch");

		jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		Date_of_Issue.setFont(new java.awt.Font("Roboto", 1, 10));
		Date_of_Issue.setText("Date of Issue");

		jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
		jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 255)));
		jTextField7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ActionPerformed(evt);
			}
		});

		Date_of_Return.setFont(new java.awt.Font("Roboto", 1, 10)); 
		Date_of_Return.setText("Date of Return");

		Search.setBackground(new java.awt.Color(255, 255, 255));
		Search.setFont(new java.awt.Font("Roboto", 1, 10)); 
		Search.setForeground(new java.awt.Color(204, 51, 255));
		Search.setText("Search");
		Search.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
//		204, 51, 255
		
//		0, 204, 255
		Search.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SearchActionPerformed(evt);
			}
		});

		Return.setBackground(new java.awt.Color(255, 255, 255));
		Return.setFont(new java.awt.Font("Roboto", 1, 10)); 
		Return.setForeground(new java.awt.Color(204, 51, 255));
		Return.setText("Return");
		Return.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
		Return.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ReturnActionPerformed(evt);
			}
		});

		Back.setBackground(new java.awt.Color(255, 255, 255));
		Back.setFont(new java.awt.Font("Roboto", 1, 10));
		Back.setForeground(new java.awt.Color(204, 51, 255));
		Back.setText("Back");
		Back.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 51, 255)));
		Back.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BackActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
		panel2.setLayout(panel2Layout);
		panel2Layout.setHorizontalGroup(
				panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panel2Layout.createSequentialGroup()
						.addGap(295, 295, 295)
						.addComponent(title)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(panel2Layout.createSequentialGroup()
						.addGap(99, 99, 99)
						.addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(Book_id)
										.addComponent(Book)
										.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(Date_of_Issue)
										.addComponent(Course)
										.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
						.addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(Student_id)
								.addGroup(panel2Layout.createSequentialGroup()
										.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(41, 41, 41)
										.addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(Name)
										.addComponent(jTextField4)
										.addComponent(Branch)
										.addComponent(jTextField6)
										.addComponent(Date_of_Return)
										.addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(99, Short.MAX_VALUE))
				);
		panel2Layout.setVerticalGroup(
				panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panel2Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(panel2Layout.createSequentialGroup()
										.addComponent(Book_id)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(panel2Layout.createSequentialGroup()
										.addComponent(Student_id)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGap(18, 18, 18)
						.addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(panel2Layout.createSequentialGroup()
										.addComponent(Book)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(panel2Layout.createSequentialGroup()
										.addComponent(Name)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(18, 18, 18)
						.addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(panel2Layout.createSequentialGroup()
										.addComponent(Course)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(panel2Layout.createSequentialGroup()
										.addComponent(Branch)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(18, 18, 18)
						.addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(panel2Layout.createSequentialGroup()
										.addComponent(Date_of_Issue)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(panel2Layout.createSequentialGroup()
										.addComponent(Date_of_Return)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(18, 18, 18)
						.addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(35, Short.MAX_VALUE))
				);

		javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
		panel1.setLayout(panel1Layout);
		panel1Layout.setHorizontalGroup(
				panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panel1Layout.createSequentialGroup()
						.addGap(65, 65, 65)
						.addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(65, Short.MAX_VALUE))
				);
		panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(99, 99, 99))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				);

		pack();
		setLocationRelativeTo(null);
	}

		private void SearchActionPerformed(java.awt.event.ActionEvent evt) {                                       
			try {
				conn con = new conn();
				if(evt.getSource() == Search){
					String sql = "select * from issue_book where student_id = ? and book_id =?";
					PreparedStatement st = con.c.prepareStatement(sql);
					st.setString(1, jTextField2.getText());
					st.setString(2, jTextField1.getText());
					ResultSet rs = st.executeQuery();

					while (rs.next()) {
						jTextField3.setText(rs.getString("bname"));
						jTextField4.setText(rs.getString("sname"));
						jTextField5.setText(rs.getString("course"));
						jTextField6.setText(rs.getString("branch"));
						jTextField7.setText(rs.getString("date_of_issue"));
					}
					st.close();
					rs.close();

				}
			}catch(Exception e) {
				
			}
		}                                      
	
		private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {                                       
			try {
				conn con = new conn();
				if(evt.getSource() == Return){
					String sql = "insert into return_book(book_id, student_id, bname, sname,course, branch, date_of_issue, date_of_return) values(?, ?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement st = con.c.prepareStatement(sql);
					st.setString(1, jTextField1.getText());
					st.setString(2, jTextField2.getText());
					st.setString(3, jTextField3.getText());
					st.setString(4, jTextField4.getText());
					st.setString(5, jTextField5.getText());
					st.setString(6, jTextField6.getText());
					st.setString(7, jTextField7.getText());

					st.setString(8, ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
					int i = st.executeUpdate();
					if (i > 0) {
						JOptionPane.showMessageDialog(null, "Processing...");
						delete();
					} else
						JOptionPane.showMessageDialog(null, "error");

				}
			}catch(Exception e) {
				
			}
		}                                      
	
		private void BackActionPerformed(java.awt.event.ActionEvent evt) {                                     
			try {
				conn con = new conn();
				if(evt.getSource() == Back){
					this.setVisible(false);
					new Home().setVisible(true);

				}
			}catch(Exception e) {
				
			}
		}

	public void ActionPerformed(java.awt.event.ActionEvent evt){

	}
}
