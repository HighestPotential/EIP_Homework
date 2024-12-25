package none;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

public class ContainerDemo extends JFrame implements Serializable {

    private static final long serialVersionUID = 1L;

    public ContainerDemo() {
        // Set title and default close operation
        setTitle("TopLevelDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650, 1000);

        JButton button6 = new JButton("Button 6");
        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setOpaque(true);
        menuBar.setBackground(Color.DARK_GRAY);
        menuBar.setSize(new Dimension(200, 400));
        menuBar.add(button6);

        // Panel (Unterstrukturierung)
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);
        panel.setPreferredSize(new Dimension(200, 220));

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        button1.setSize(new Dimension(40000, 600));
        // Layout for panel (GridLayout)
        panel.setLayout(new GridLayout(5, 0));  // 5 rows, 1 column
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button5);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.orange);
        panel2.setPreferredSize(new Dimension(100, 120));

        // Add action listeners to buttons
        button1.addActionListener(e -> JOptionPane.showMessageDialog(this, "Button 1 clicked!"));
        button2.addActionListener(e -> System.out.println("Button 2 clicked!"));
        button3.addActionListener(e -> getContentPane().setBackground(Color.blue));
        button4.addActionListener(e -> setTitle("Button 4 pressed"));
        button5.addActionListener(e -> System.exit(0)); // Exits the application
        button6.addActionListener(e -> JOptionPane.showMessageDialog(this, "Menu Bar Button 6 clicked!"));

        // Main window setup
        setJMenuBar(menuBar);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(panel);
        getContentPane().add(button4);
        getContentPane().add(panel2);

        // Make window visible
        setVisible(true);
    }

    // main method to launch the application
    public static void main(String[] args) {
        // Using lambda expression for Runnable
  
            JFrame myApp = new ContainerDemo();  // Instantiate the JFrame (ContainerDemo)
       
    }
}
