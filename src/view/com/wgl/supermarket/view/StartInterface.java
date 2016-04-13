package com.wgl.supermarket.view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import com.wgl.supermarket.view.panel.User;

public class StartInterface extends JFrame {
	private static final long serialVersionUID = 1L;
	private static StartInterface instance = null;
	private JTabbedPane tablePane;

	public static synchronized StartInterface getInstance() {
		if (instance == null) {
			instance = new StartInterface();
		}
		return instance;
	}

	private StartInterface() {
		initComponents();
		initAction();
		initLayout();
	}

	private void initComponents() {
		tablePane = new JTabbedPane();

		tablePane.setBounds(20, 20, 860, 530);
	}

	private void initAction() {

	}

	private void initLayout() {
		setSize(900, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        setTitle("进销存管理系统");
        
        tablePane.add(new User(), "用户管理");
        tablePane.add(new User(), "库存管理");
        tablePane.add(new User(), "销售管理");
        tablePane.add(new User(), "仓库管理");
        tablePane.add(new User(), "商品管理");
        tablePane.add(new User(), "快捷查询");
        getContentPane().add(tablePane);
	}
	
	public static void main(String[] args) {
		StartInterface.getInstance().setVisible(true);
	}
}
