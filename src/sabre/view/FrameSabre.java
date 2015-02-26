package sabre.view;

import javax.swing.*;

import sabre.controller.SabresController;

public class FrameSabre extends JFrame
{
	private SabrePanel appPanel;
	
	public FrameSabre(SabresController baseController)
	{
		appPanel = new SabrePanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(600, 800);
		this.setContentPane(appPanel);
		this.setVisible(true);
	}
}
