package cloud;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class restro_bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					restro_bill window = new restro_bill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public restro_bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 556, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Resturant bill ");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 23));
		lblNewLabel.setBounds(185, 11, 230, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(66, 75, 91, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(66, 154, 72, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "Ichiraku Ramen-Rs.90", "Noodles-Rs.70", "Onigiri-RS.150", "Sushi-Rs.200"}));
		c1.setBounds(233, 79, 132, 22);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(233, 160, 132, 25);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("Ichiraku Ramen-Rs.90"))
				{
					bill=q*90;
					JOptionPane.showMessageDialog(btnNewButton, "Hello \n Selected item:"+item+"\n Quantity: "+q+" \n your bill:"+bill);
				}
				else if(item.equals("Noodles-Rs.70"))
				{
					bill=q*70;
					JOptionPane.showMessageDialog(btnNewButton, "Hello \n Selected item:"+item+"\n Quantity: "+q+" \n your bill:"+bill);
				}
				else if(item.equals("Onigiri-Rs.150"))
				{
					bill=q*150;
					JOptionPane.showMessageDialog(btnNewButton, "Hello \n Selected item:"+item+"\n Quantity: "+q+" \n your bill:"+bill);
				}
				else if(item.equals("Sushi-Rs.200"))
				{
					bill=q*200;
					JOptionPane.showMessageDialog(btnNewButton, "Hello \n Selected item:"+item+"\n Quantity: "+q+" \n your bill:"+bill);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(185, 244, 89, 33);
		frame.getContentPane().add(btnNewButton);
	}
}
