import javax.swing.JFrame;
import java.sql.*;

public class SplashScreen extends JFrame{

	// Variables declaration                  
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel loadinglabel;
	private javax.swing.JLabel logo;
	private javax.swing.JLabel percentlabel;
	private javax.swing.JProgressBar progressbar;
	private javax.swing.JLabel title;
	// End of variables declaration

	public SplashScreen() {
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		logo = new javax.swing.JLabel();
		title = new javax.swing.JLabel();
		loadinglabel = new javax.swing.JLabel();
		percentlabel = new javax.swing.JLabel();
		progressbar = new javax.swing.JProgressBar();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(204, 204, 255));
		jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logo.png"))); 
		jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 106, 471, 237));

		title.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 24)); 
		title.setForeground(new java.awt.Color(255, 255, 255));
		title.setText("LIBRARY MANAGEMENT SYSTEM");
		jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, 36));

		loadinglabel.setFont(new java.awt.Font("Open Sans SemiBold", 0, 11)); 
		loadinglabel.setForeground(new java.awt.Color(102, 102, 102));
		loadinglabel.setText("Loading...");
		jPanel1.add(loadinglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

		percentlabel.setFont(new java.awt.Font("Open Sans SemiBold", 0, 11)); 
		percentlabel.setForeground(new java.awt.Color(102, 102, 102));
		percentlabel.setText("0 %");
		jPanel1.add(percentlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 30, -1));

		progressbar.setBackground(new java.awt.Color(255, 255, 255));
		progressbar.setFont(new java.awt.Font("Segoe UI", 0, 10)); 
		progressbar.setForeground(new java.awt.Color(204, 102, 255));
		progressbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
		progressbar.setString("0%\n20%\n50%\n75\n90%\n100%");
		jPanel1.add(progressbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 540, 860, 10));

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
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}


		SplashScreen ss = new SplashScreen();
		ss.setVisible(true);

		try {
			for(int i =0;i<=100;i=i+2){
				Thread.sleep(100);
				ss.percentlabel.setText(i+"%");

				if(i==10){
					ss.loadinglabel.setText("Turning On Module.....");

				}
				if(i==20){
					ss.loadinglabel.setText("Loading Module.....");
				}

				if(i==40){
					ss.loadinglabel.setText("Connecting to the Database.....");
				}

				if(i==60){
					ss.loadinglabel.setText("Connection Successful.....");
				}

				if(i==80){
					ss.loadinglabel.setText("Launching Application.....");
				}
				ss.progressbar.setValue(i);
			}

		}catch(Exception e){
			System.out.println("e");
		}

		ss.setVisible(false);
		new Login().setVisible(true);
		ss.dispose();
	}

}
