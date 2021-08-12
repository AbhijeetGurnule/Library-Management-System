import javax.swing.JFrame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

public class ReadMe extends JFrame{

	// Variables declaration - do not modify                     
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel title;
    // End of variables declaration
	
	public ReadMe() {
        initComponents();
    }
	
	private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setFocusCycleRoot(true);
        kGradientPanel1.setGradientFocus(500);
        kGradientPanel1.setStartColor(new java.awt.Color(255, 255, 51));

        title.setFont(new java.awt.Font("Open Sans SemiBold", 0, 30));
        title.setText("README");
        kGradientPanel1.add(title);
        title.setBounds(90, 50, 130, 40);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14));
        jLabel2.setText("Add Book");
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(310, 60, 70, 19);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12)); 
        jLabel3.setText("This section helps user to add collection of books in proper manner.");
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(310, 80, 440, 20);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14));
        jLabel4.setText("Statistics");
        kGradientPanel1.add(jLabel4);
        jLabel4.setBounds(310, 120, 70, 30);

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 12));
        jLabel5.setText("This section keep records of issue books and receive books.");
        kGradientPanel1.add(jLabel5);
        jLabel5.setBounds(310, 150, 380, 15);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14));
        jLabel6.setText("Add Student");
        kGradientPanel1.add(jLabel6);
        jLabel6.setBounds(310, 190, 90, 19);

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 12));
        jLabel7.setText("This section helps in adding new student records in system.");
        kGradientPanel1.add(jLabel7);
        jLabel7.setBounds(310, 210, 380, 20);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14));
        jLabel8.setText("Issue Book");
        kGradientPanel1.add(jLabel8);
        jLabel8.setBounds(310, 250, 80, 19);

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 12));
        jLabel9.setText("This section manage book records for issuing books.");
        kGradientPanel1.add(jLabel9);
        jLabel9.setBounds(310, 280, 330, 15);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14));
        jLabel10.setText("Receive Book");
        kGradientPanel1.add(jLabel10);
        jLabel10.setBounds(310, 320, 110, 19);

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 12)); 
        jLabel11.setText("This section manage book records for receiving books.");
        kGradientPanel1.add(jLabel11);
        jLabel11.setBounds(310, 350, 340, 13);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); 
        jLabel12.setText("About");
        kGradientPanel1.add(jLabel12);
        jLabel12.setBounds(310, 390, 50, 19);

        jLabel13.setFont(new java.awt.Font("Consolas", 0, 12)); 
        jLabel13.setText("This section is for contact and ask any queries related to library system.");
        kGradientPanel1.add(jLabel13);
        jLabel13.setBounds(310, 420, 480, 15);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/readme.png"))); 
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(0, 180, 220, 210);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/left.png"))); 
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				Home home = new Home();
				home.setVisible(true);
			}
		});
        kGradientPanel1.add(back);
        back.setBounds(670, 450, 70, 70);

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
	
	public static void main(String[] args) {
		new ReadMe().setVisible(true);
	}

}
