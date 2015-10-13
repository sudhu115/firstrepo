import java.awt.*;
import javax.swing.*;
 
public class Images{
 
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Nested Panels  -   HOSHI");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
 
 		ImageIcon devil = new ImageIcon ("devil.gif");
		ImageIcon akali = new ImageIcon ("akali.gif");
		ImageIcon sketch = new ImageIcon ("sketch.gif");
		ImageIcon victor = new ImageIcon ("viktor.gif");
		ImageIcon deva = new ImageIcon ("deva.gif");
 
		JLabel label1, label2, label3, label4;
 
       
      JPanel subPanel1 = new JPanel();
      subPanel1.setPreferredSize (new Dimension(150, 100));
      subPanel1.setBackground (Color.green);
      label1 = new JLabel ("Panel Label1", devil, SwingConstants.CENTER);
      subPanel1.add (label1);
 
 
      JPanel subPanel2 = new JPanel();
      subPanel2.setPreferredSize (new Dimension(150, 100));
      subPanel2.setBackground (Color.red);
      label2 = new JLabel ("Panel1 Label2", akali, SwingConstants.CENTER);
		label2.setHorizontalTextPosition (SwingConstants.LEFT);
		label2.setVerticalTextPosition (SwingConstants.CENTER);
      subPanel2.add (label2);
 
 
		JPanel subPanel3 = new JPanel();
      subPanel3.setPreferredSize (new Dimension(400, 150));
      subPanel3.setBackground (Color.red);
      label3 = new JLabel ("Panel2 Label1", deva, SwingConstants.CENTER);
		label3.setHorizontalTextPosition (SwingConstants.CENTER);
		label3.setVerticalTextPosition (SwingConstants.BOTTOM);
      subPanel3.add (label3);
 
 
		JPanel subPanel4 = new JPanel();
      subPanel4.setPreferredSize (new Dimension(400, 150));
      subPanel4.setBackground (Color.red);
      label4 = new JLabel ("Panel2 Lable2", victor, SwingConstants.CENTER);
		label4.setHorizontalTextPosition (SwingConstants.RIGHT);
		label4.setVerticalTextPosition (SwingConstants.CENTER);
      subPanel4.add (label4);
 
      JPanel primary = new JPanel();
      primary.setBackground (Color.blue);
      primary.add (subPanel1);
      primary.add (subPanel2);
      
		primary.add (subPanel3);
		primary.add (subPanel4);
 
      frame.getContentPane().add(primary);
      frame.pack();
      frame.setVisible(true);
 
		}
	}