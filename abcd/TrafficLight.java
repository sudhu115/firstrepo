import javax.swing.JFrame;

public class TrafficLight
{
	//-------------------------------------
	//Creates the main program frame
	//-------------------------------------
	public static void main (String[] args)
	{

	JFrame frame=new JFrame("Traffic Light");
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	TrafficLightPanel panel = new TrafficLightPanel();

	frame.getContentPane().add(new TrafficLightPanel());

	frame.pack();
	frame.setVisible(true);
}
}