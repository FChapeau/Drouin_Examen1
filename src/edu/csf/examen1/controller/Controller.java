package edu.csf.examen1.controller;

import java.awt.EventQueue;

import edu.csf.examen1.view.View;

public class Controller {
	View view;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller controller = new Controller();
	}
	
	public Controller (){
		StartView();
	}
	
	private void StartView(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view = new View(Controller.this);
					view.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
