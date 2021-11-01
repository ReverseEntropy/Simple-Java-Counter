package pkg;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class Count {
	JButton plusButton;
	JButton resetButton;
	JLabel numberLabel;
	int x;
	Boolean hasReset;
	JLabel newLabel;
	
	//create GUI
	public Count() {
		//Customise frame
		JFrame frame = new JFrame("Counter");
		frame.setSize(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		plusButton = new JButton("+");
		resetButton = new JButton("Reset");
		numberLabel = new JLabel("0");
		numberLabel.setFont(new Font("Comic Sans", Font.BOLD, 226));
		
		//set count var to 0
		x = 0;
		
		//Add objects to frame
		frame.add(numberLabel);
		frame.add(plusButton);
		frame.add(resetButton);
	
		
		plusButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Increment count var every time + is clicked
				x++;
				String holder = Integer.toString(x);
				numberLabel.setText(holder);
				
			}
		});
		
		resetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				x = 0;
				String zeroHolder = Integer.toString(x);
				numberLabel.setText(zeroHolder);
				JFrame newFrame = new JFrame("Reset");
				newFrame.setSize(200,100);
				newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				newFrame.setVisible(true);
				newLabel = new JLabel("Counter reset");
				newLabel.setFont(new Font("Comic Sans", Font.BOLD, 18));
				newFrame.add(newLabel);
				
			}
		});
		
	}
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Count();
				
			}
		});
		
		
	}
	
	
}
