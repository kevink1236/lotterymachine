import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Arrays;


public class Lotto implements ActionListener{
	private static JFrame frame;
	private static JButton button;
	private static JPanel panel;
	private static JLabel label1;
	private static JLabel Label2;
	private static JLabel Label3;
	private static JLabel Label4;
	private static JLabel Label5;
	private static JLabel Label6;

	public static void main(String[] args) {
		frame = new JFrame();
		frame.setSize(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		label1 = new JLabel();
		Label2 = new JLabel();
		Label3 = new JLabel();
		Label4 = new JLabel();
		Label5 = new JLabel();
		Label6 = new JLabel();

		button = new JButton("Click to draw a lottery");
		button.addActionListener(new Lotto());
		button.setBounds(10,10,10,3);

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(100,100,50,50));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label1);
		panel.add(Label2);
		panel.add(Label3);
		panel.add(Label4);
		panel.add(Label5);
		panel.add(Label6);

		frame.add(panel, BorderLayout.CENTER);
		frame.setTitle("Lotto");
		frame.pack();

	}//end main
	@Override
	public void actionPerformed(ActionEvent e) {
		int first = 0;
		int second = 0;
		int thrid = 0;
		int fourth = 0;
		int fifth = 0;
		int sixth = 0;
		int[] random = new int[6];
		int count = 0; 
		boolean yes = false;
		while(yes == false)
		{
			randomNum(random);
			yes = true;
			for(int i = 0; i<random.length-1; i++) {
				for(int j = i+1; j<random.length; j++) {
					if(random[i] == random[j]) {
						yes = false;
					}
				}//end loop
			}//end loop
		}//end loop
		Arrays.sort(random);
		label1.setText("The first number is: " + random[0]);
		Label2.setText("The second number is: " + random[1]);
		Label3.setText("The third number is: " + random[2]);
		Label4.setText("The fourth number is: " + random[3]);
		Label5.setText("The fifth number is: " + random[4]);
		Label6.setText("The sixth number is: " + random[5]);
	}//end actionPerformed()
	public int[] randomNum(int[] random)
	{
		for(int i =0; i<6; i++)
		{
			random[i] = (int)((Math.random()*59)+1);
		}
		return random;
	}//end loop
}//end class
