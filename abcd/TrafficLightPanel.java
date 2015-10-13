import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightPanel extends JPanel
{

private int state;
private JButton status;
private JLabel label;


//--------------------------------------------
//Constructor:Creates three circle objects
//------------------------------------------

public TrafficLightPanel()
{
	int red=1;
	int yellow=2;
	int green=3;


//----------------------------------------------
//Constructor: Sets up the GUI
//----------------------------------------------


status = new JButton ("State");
status.addActionListener (new ButtonListener());

label = new JLabel ();

add(status);
add (label);

setPreferredSize (new Dimension (300,200));
setBackground (Color.black);
}

//-------------------------------------------------------
//Represents a listener for button status (action) events
//--------------------------------------------------------
private class ButtonListener implements ActionListener
{

//---------------------------------------------------------------
//Updates the state of the traffic light when the button is pushed
//----------------------------------------------------------------
public void actionPerformed (ActionEvent event)
{
state++;

status = new JButton("State"+1);
repaint();

}
}

//-------------------------------------------------------------
//Draws this panel by requesting that each circle draw itself
//-------------------------------------------------------------

public void paintComponent (Graphics page)
{
	  super.paintComponent(page);


	  page.setColor(Color.red);
      page.fillOval(112, 60, 60,60);

      page.setColor(Color.yellow);
      page.fillOval(112, 60, 60,60);

      page.setColor(Color.green);
  	  page.fillOval(112, 60, 60,60);

	page.setColor(Color.white);
	page.drawString("Ready...Set...GO!!!",100,180);

}
}