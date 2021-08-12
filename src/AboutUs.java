import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class AboutUs extends JFrame{

	// Variables declaration                    
	private javax.swing.JLabel back;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private keeptoo.KGradientPanel kGradientPanel1;
	// End of variables declaration

	public AboutUs() {
		initComponents();
	}

	private void initComponents() {

		kGradientPanel1 = new keeptoo.KGradientPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		back = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		kGradientPanel1.setEndColor(new java.awt.Color(255, 255, 255));
		kGradientPanel1.setGradientFocus(400);
		kGradientPanel1.setStartColor(new java.awt.Color(255, 255, 0));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/A4.png")));
		kGradientPanel1.add(jLabel1);
		jLabel1.setBounds(0, 10, 420, 500);

		jLabel2.setFont(new java.awt.Font("Open Sans Light", 0, 24));
		jLabel2.setText("Hello !");
		kGradientPanel1.add(jLabel2);
		jLabel2.setBounds(470, 70, 70, 40);

		jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 36)); 
		jLabel3.setText("I'M");
		kGradientPanel1.add(jLabel3);
		jLabel3.setBounds(470, 110, 50, 40);

		jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 36)); 
		jLabel4.setText("ABHIJEET GURNULE");
		kGradientPanel1.add(jLabel4);
		jLabel4.setBounds(470, 110, 350, 100);

		jLabel5.setFont(new java.awt.Font("Open Sans", 0, 18)); 
		jLabel5.setText("PROJECT");
		kGradientPanel1.add(jLabel5);
		jLabel5.setBounds(470, 210, 100, 40);

		jLabel6.setFont(new java.awt.Font("Open Sans", 0, 24));
		jLabel6.setText("Library Management System");
		kGradientPanel1.add(jLabel6);
		jLabel6.setBounds(470, 220, 330, 70);

		jLabel7.setFont(new java.awt.Font("Open Sans", 0, 14));
		jLabel7.setText("If u like this project please share your thoughts");
		kGradientPanel1.add(jLabel7);
		jLabel7.setBounds(470, 320, 320, 40);

		jLabel8.setFont(new java.awt.Font("Open Sans", 0, 18));
		jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/mail.png")));
		jLabel8.setText(" abhijeetgurnule07@gmail.com");
		kGradientPanel1.add(jLabel8);
		jLabel8.setBounds(480, 350, 300, 30);

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
		back.setBounds(710, 430, 70, 70);

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
		new AboutUs().setVisible(true);
	}

}
