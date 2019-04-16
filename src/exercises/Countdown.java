package exercises;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


/*
 * I wanted to do this exercise in the style of pop-up.
 * That's why I was searching Google on how it can be done.
 * Some solutions I found were good inspiration (for example, ideas for digital clock, etc).
 * I know that it was supposed to use a for-loop...
 */
public class Countdown {
	
	public void loader()
	{
		JFrame frame = new JFrame("NASACountdown");
		JLabel label = new JLabel();
		Icon icon = new ImageIcon("gif/imageedit_3_8656027860.gif", "Rocket");

		Timer timer = new Timer(1000, new ActionListener() {
			int count = 11;

			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				if (count > 0) {
					label.setText(Integer.toString(count));
				} else if (count == 0) {
					label.setText("blastoff");
				} else {
					((Timer) (e.getSource())).stop();
					label.setText("");
					label.setIcon(icon);
					
				}
			}

		});

		timer.setInitialDelay(0);
		timer.start();

		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(label);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Sans Serif", Font.PLAIN, 150));
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		new Countdown().loader();

	}

}
