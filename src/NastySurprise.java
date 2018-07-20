import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton first = new JButton();
	JButton secound = new JButton();

	NastySurprise() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		first.setText("Trick");
		first.addActionListener(this);
		secound.setText("Treat");
		secound.addActionListener(this);
		panel.add(first);
		panel.add(secound);
		frame.setTitle("@#$%@%&@!!!!!");
		frame.pack();
	}

	public static void main(String[] args) {
		NastySurprise somethang = new NastySurprise();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == first) {
			showPictureFromTheInternet("http://www.pictorem.com/collection/900_2331348HighRes.jpg");
		} else if (e.getSource() == secound) {
			showPictureFromTheInternet("https://ih1.redbubble.net/image.410068489.3517/ap,550x550,12x12,1,transparent,t.png");
		}

	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
