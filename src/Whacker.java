import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whacker {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	Whacker() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
	}

	public static void main(String[] args) {
		new Whacker().makeButtons();
	}

	void makeButtons() {
		Whacker moles = new Whacker();
		Random rand = new Random();
		int aNumber = rand.nextInt(23);

		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			if (i == aNumber) {
				button.setText("mole");
			}
			panel.add(button);
		}
		frame.setSize(400, 200);
	}
}
