import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JTextField numOne = new JTextField(4);
	JTextField numTwo = new JTextField(4);

	Calculator() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(numOne);
		panel.add(numTwo);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(label);
		add.setText("+");
		sub.setText("-");
		mul.setText("•");
		div.setText("÷");
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setText("0");
		frame.setTitle("calculator.exe");
		frame.pack();
	}

	public static void main(String[] args) {
		Calculator math = new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int answer;
		String first = numOne.getText();
		String second = numTwo.getText();
		int wholeOne = Integer.parseInt(first);
		int wholeTwo = Integer.parseInt(second);
		if (e.getSource() == add) {
			answer = wholeOne + wholeTwo;
			label.setText("" + answer);
			frame.pack();
		} else if (e.getSource() == sub) {
			answer = wholeOne - wholeTwo;
			label.setText("" + answer);
			frame.pack();
		} else if (e.getSource() == mul) {
			answer = wholeOne * wholeTwo;
			label.setText("" + answer);
			frame.pack();
		} else if (e.getSource() == div) {
			answer = wholeOne / wholeTwo;
			label.setText("" + answer);
			frame.pack();
		}
	}
}
