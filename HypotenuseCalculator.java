import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//Adding the event since we will now be using an action listener

public class HypotenuseCalculator extends JFrame implements ActionListener{ 
  JButton okButton = new JButton("Calculate");          
  JTextField nameField1 = new JTextField(15);
  JTextField nameField2 = new JTextField(15);
  JLabel label3 = new JLabel("Result: ", JLabel.RIGHT);

  public HypotenuseCalculator() { 
    setTitle("Hypotenuse Calculator");
    setSize(700, 400);    

    // Creating layouts
    GridLayout layout1 = new GridLayout(5, 1);
    FlowLayout layout2 = new FlowLayout();
    
    // Creating panels
    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();
    JPanel pan3 = new JPanel();
    JPanel pan4 = new JPanel();
    JPanel pan5 = new JPanel();

    // Setting layouts 
    setLayout(layout1);
    pan1.setLayout(layout2);
    pan2.setLayout(layout2);
    pan3.setLayout(layout2);
    pan4.setLayout(layout2);
    pan5.setLayout(layout2);

    // Creating welcome layout
    JLabel welcomeSign = new JLabel("Welcome to the Hypotenuse Calculator!"); 
    welcomeSign.setFont(new Font("Serif", Font.PLAIN, 34)); 
    pan1.add(welcomeSign); 

    // Creating first input
    JLabel label1 = new JLabel("A value for triangle: ", JLabel.RIGHT);
    label1.setFont(new Font("Serif", Font.PLAIN, 22)); 
    pan2.add(label1);
    pan2.add(nameField1);
    
    // Creating second input
    JLabel label2 = new JLabel("B value for triangle: ", JLabel.RIGHT);
    label2.setFont(new Font("Serif", Font.PLAIN, 22)); 
    pan3.add(label2);
    pan3.add(nameField2);

    // Creating calculate button
    pan4.add(okButton);

    // Creating space for answer
    label3.setFont(new Font("Serif", Font.PLAIN, 22)); 
    pan5.add(label3);

    okButton.addActionListener(this);  

    add(pan1);
    add(pan2);
    add(pan3);
    add(pan4);
    add(pan5);
    setVisible(true); 
  }

  public void actionPerformed(ActionEvent event) {
    
    String command = event.getActionCommand();
    if (command.equals("Calculate")) {
      double answer =  Math.pow(Math.pow(Float.parseFloat(nameField1.getText()), 2) + Math.pow(Float.parseFloat(nameField2.getText()), 2), 0.5);       
      label3.setText("Result: " + answer + " units");  
    } 
  }
  
  public static void main(String[] args) {
    HypotenuseCalculator frame1 = new HypotenuseCalculator();
  }
}