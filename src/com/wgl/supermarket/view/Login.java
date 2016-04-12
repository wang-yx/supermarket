package com.wgl.supermarket.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	private static final long serialVersionUID = 1L;

	private static Login instance = null;
	private JTextField userName;
	private JPasswordField password;
	private JCheckBox remPSW;
	private JLabel forgetPSW;
	private JButton login;
	private JButton reset;

	public static synchronized Login getInstance() {
		if (instance == null) {
			instance = new Login();
		}
		return instance;
	}

	private Login() {
		initComponents();
		initAction();
		initLayout();
	}

	/*
	 * 初始化页面组件
	 */
	private void initComponents() {
		userName = new JTextField();
		password = new JPasswordField();
		remPSW = new JCheckBox("记住密码");
		forgetPSW = new JLabel("忘记密码");
		login = new JButton("登录");
		reset = new JButton("重置");
		
		userName.setBounds(70, 50, 200, 25);
		password.setBounds(70, 80, 200, 25);
		remPSW.setBounds(70, 110, 100, 25);
		forgetPSW.setBounds(185, 110, 100, 25);
		login.setBounds(70, 140, 100, 25);
		reset.setBounds(170, 140, 100, 25);
	}

	/*
	 * 初始化监听
	 */
	private void initAction() {
		for (WindowListener listener : getWindowListeners()) {
            removeWindowListener(listener);
        }
        addWindowListener(new WindowAdapter() {
            
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                doClose();
            }
        });
        
        
        forgetPSW.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent evt) {
				JOptionPane.showMessageDialog(userName, "请联系管理员", "提示", JOptionPane.PLAIN_MESSAGE, null);
			}
        	
        });
	}

	/*
	 * 初始化页面布局
	 */
	private void initLayout() {
		setSize(350, 250);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("进销存管理系统");
        getContentPane().setLayout(null);
        
        getContentPane().add(userName);
        getContentPane().add(password);
        getContentPane().add(remPSW);
        getContentPane().add(forgetPSW);
        getContentPane().add(login);
        getContentPane().add(reset);
	}
	
	/*
     * 关闭窗体
     */
    private void doClose() {
        dispose();
    }
	
	public static void main(String[] args) {
		Login.getInstance().setVisible(true);
	}
}
