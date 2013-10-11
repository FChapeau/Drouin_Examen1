package edu.csf.examen1.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.csf.examen1.controller.Controller;

public class View extends JFrame implements IWatcher{

	private JPanel contentPane;
	private Controller controller;

	/**
	 * Create the frame.
	 */
	public View(Controller controller) {
		this.controller = controller;
		Initialize();
	}
	
	private void Initialize(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
