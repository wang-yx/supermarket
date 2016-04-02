package com.wgl.supermarket.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPasswordField;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class v_loginView {

	private JFrame frame;
	private JPasswordField jfd_password;
	private JTextField jfd_username;
	private JButton jbn_reset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v_loginView window = new v_loginView();
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
	public v_loginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 545, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置Frame居中显示
		frame.setLocationRelativeTo(null);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 5;
		gbc_lblNewLabel.gridy = 4;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		jfd_username = new JTextField();
		GridBagConstraints gbc_jfd_username = new GridBagConstraints();
		gbc_jfd_username.insets = new Insets(0, 0, 5, 5);
		gbc_jfd_username.fill = GridBagConstraints.HORIZONTAL;
		gbc_jfd_username.gridx = 7;
		gbc_jfd_username.gridy = 4;
		frame.getContentPane().add(jfd_username, gbc_jfd_username);
		jfd_username.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6  \u7801\uFF1A");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 5;
		gbc_lblNewLabel_1.gridy = 6;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jfd_password = new JPasswordField();
		GridBagConstraints gbc_jfd_password = new GridBagConstraints();
		gbc_jfd_password.insets = new Insets(0, 0, 5, 5);
		gbc_jfd_password.fill = GridBagConstraints.HORIZONTAL;
		gbc_jfd_password.gridx = 7;
		gbc_jfd_password.gridy = 6;
		frame.getContentPane().add(jfd_password, gbc_jfd_password);
		
		JButton jbn_login = new JButton("\u767B\u5F55");
		jbn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = jfd_username.getText();
				String password = String.valueOf(jfd_password.getPassword());
				
				System.out.println("用户名："+username);
				System.out.println("密   码："+password);
			}
		});
		GridBagConstraints gbc_jbn_login = new GridBagConstraints();
		gbc_jbn_login.insets = new Insets(0, 0, 0, 5);
		gbc_jbn_login.gridx = 5;
		gbc_jbn_login.gridy = 9;
		frame.getContentPane().add(jbn_login, gbc_jbn_login);
		
		jbn_reset = new JButton("\u91CD\u7F6E");
		jbn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jfd_username.setText("");
				jfd_password.setText("");
			}
		});
		GridBagConstraints gbc_jbn_reset = new GridBagConstraints();
		gbc_jbn_reset.insets = new Insets(0, 0, 0, 5);
		gbc_jbn_reset.gridx = 7;
		gbc_jbn_reset.gridy = 9;
		frame.getContentPane().add(jbn_reset, gbc_jbn_reset);
		
		
		
	}
}
