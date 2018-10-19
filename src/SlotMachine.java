import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SlotMachine implements ActionListener {
	JFrame frame;
	JPanel panel;
	JLabel slotOne;
	JLabel slotTwo;
	JLabel slotThree;
	JButton spinner;
	int rNum;
	int otherR;
	int newR;

	public static void main(String[] args) {
		new SlotMachine().makeSlots();
	}

	void makeSlots() {
		frame = new JFrame();
		panel = new JPanel();
		slotOne = new JLabel();
		slotTwo = new JLabel();
		slotThree = new JLabel();
		spinner = new JButton();

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(slotOne);
		panel.add(slotTwo);
		panel.add(slotThree);
		panel.add(spinner);
		spinner.addActionListener(this);
		spinner.setText("Spin the Meme Machine");
		if (rNum == 0) {
			try {
				slotOne.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("deadlylaser.jpg"))));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (rNum == 1) {
			try {
				slotOne.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("image.png"))));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (rNum == 2) {
			try {
				slotOne.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("bmoji.png"))));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (otherR == 0) {
			try {
				slotTwo.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("deadlylaser.jpg"))));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (otherR == 1) {
			try {
				slotTwo.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("image.png"))));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (otherR == 2) {
			try {
				slotTwo.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("bmoji.png"))));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (newR == 0) {
			try {
				slotThree.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("deadlylaser.jpg"))));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (newR == 1) {
			try {
				slotThree.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("image.png"))));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (newR == 2) {
			try {
				slotThree.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("bmoji.png"))));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == spinner) {
			rNum = new Random().nextInt(3);
			otherR = new Random().nextInt(3);
			newR = new Random().nextInt(3);
			if (rNum == 0) {
				try {
					slotOne.setIcon(
							new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("deadlylaser.jpg"))));
				} catch (IOException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			} else if (rNum == 1) {
				try {
					slotOne.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("image.png"))));
				} catch (IOException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			} else if (rNum == 2) {
				try {
					slotOne.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("bmoji.png"))));
				} catch (IOException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
			if (otherR == 0) {
				try {
					slotTwo.setIcon(
							new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("deadlylaser.jpg"))));
				} catch (IOException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			} else if (otherR == 1) {
				try {
					slotTwo.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("image.png"))));
				} catch (IOException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			} else if (otherR == 2) {
				try {
					slotTwo.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("bmoji.png"))));
				} catch (IOException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
			if (newR == 0) {
				try {
					slotThree.setIcon(
							new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("deadlylaser.jpg"))));
				} catch (IOException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			} else if (newR == 1) {
				try {
					slotThree.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("image.png"))));
				} catch (IOException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			} else if (newR == 2) {
				try {
					slotThree.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("bmoji.png"))));
				} catch (IOException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
			frame.pack();
			if ((rNum == 0 && otherR == 0 && newR == 0) 
					|| (rNum == 1 && otherR == 1 && newR == 1)
					|| (rNum == 2 && otherR == 2 && newR == 2)) {
				JOptionPane.showMessageDialog(null, "YOU WIN!");
			}
		}
	}
}
