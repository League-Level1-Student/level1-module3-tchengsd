import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	char currentLetter;

	public static void main(String[] args) {
		TypingTutor tutor = new TypingTutor();

	}

	TypingTutor() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();

		frame.add(label);
		frame.addKeyListener(this);
		frame.setTitle("Type or Die");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText("" + currentLetter);
		frame.pack();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'A');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println((char) e.getKeyCode());
		if ((char) e.getKeyCode() == currentLetter) {
			System.out.println("Correct");
			frame.getContentPane().setBackground(new Color(0, 255, 0));
		} else {
			System.out.println("Incorrect");
			frame.getContentPane().setBackground(new Color(255, 0, 0));
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
	}

}
