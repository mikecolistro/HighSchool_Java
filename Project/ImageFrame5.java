import javax.swing.*;
public class ImageFrame5 extends JFrame {
	public ImageFrame5() {
		//put in picture
		Icon pic = new ImageIcon(getClass().getResource("Hjorth.png"));
		//create label with message
		JLabel label1 = new JLabel("Hi!");
		//attach picture to label
		label1.setIcon(pic);
		//add label to the ImageFrame
		add(label1);
	}
}