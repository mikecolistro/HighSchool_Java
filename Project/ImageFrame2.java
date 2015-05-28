import javax.swing.*;
public class ImageFrame2 extends JFrame {
	public ImageFrame2() {
		//put in picture
		Icon pic = new ImageIcon(getClass().getResource("Fata.png"));
		//create label with message
		JLabel label1 = new JLabel("Hi!");
		//attach picture to label
		label1.setIcon(pic);
		//add label to the ImageFrame
		add(label1);
	}
}