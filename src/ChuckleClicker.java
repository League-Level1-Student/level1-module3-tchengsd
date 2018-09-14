import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	JFrame frame;
	JPanel panel;
	JButton buttonOne;
	JButton buttonTwo;

	public static void main(String[] args) {
		new ChuckleClicker().makeButtons();
	}

	void makeButtons() {
		frame = new JFrame();
		panel = new JPanel();
		buttonOne = new JButton();
		buttonTwo = new JButton();
		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Chuckle Clicker");
		panel.add(buttonOne);
		panel.add(buttonTwo);
		buttonOne.addActionListener(this);
		buttonOne.setText("joke");
		buttonTwo.addActionListener(this);
		buttonTwo.setText("punchline");
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == buttonOne) {
			JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
		} else if (e.getSource() == buttonTwo) {
			JOptionPane.showMessageDialog(null, "To become famous with the joke");
		}
	}
}
