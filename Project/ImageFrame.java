import javax.swing.*;
public class ImageFrame extends JFrame {
	public ImageFrame() {
		//put in picture
		Icon pic = new ImageIcon(getClass().getResource("Colistro.png"));
		//create label with message
		JLabel label1 = new JLabel("Hi!");
		//attach picture to label
		label1.setIcon(pic);
		//add label to the ImageFrame
		add(label1);
	}
}