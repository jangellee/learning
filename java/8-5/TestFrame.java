import javax.swing.*;

public class TestFrame{
	public static void main(String[] args){
		JButton jbtOK = new JButton("OK");

		JPanel panel = new JPanel();
		panel.add(jbtOK);

		JFrame frame1 = new JFrame();
		frame1.add(panel);
		frame1.setTitle("Window 1");
		frame1.setSize(200, 150);
		frame1.setLocation(200, 100);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
		frame1.isResizable();
		//JFrame frame2 = new JFrame();
		//frame2.setTitle("Window2 ")
	}
}
