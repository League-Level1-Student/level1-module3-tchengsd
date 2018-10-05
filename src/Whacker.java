import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whacker implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	int whackCount = 0;
	int missCount = 0;
	Date start = new Date();

	public static void main(String[] args) {
		new Whacker().makeButtons();
	}

	void makeButtons() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		Random rand = new Random();
		int aNumber = rand.nextInt(23);

		for (int i = 0; i < 24; i++) {
			button = new JButton();
			if (i == aNumber) {
				button.setText("mole");
			}
			panel.add(button);
			button.addActionListener(this);
		}
		frame.setSize(400, 200);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton thing = (JButton) e.getSource();
		if (thing.getText().equals("mole")) {
			whackCount++;
			playSound("349193__natty23__whack.wav");
		} else {
			missCount++;
			speak("You did miss" + missCount + "times");
		}
		frame.dispose();
		makeButtons();
		if (whackCount == 10) {
			endGame(start, 10);
			frame.dispose();
		}
		if (missCount == 5) {
			JOptionPane.showMessageDialog(null, "You lose");
			endGame(start, whackCount);
			frame.dispose();
		}
	}

}
