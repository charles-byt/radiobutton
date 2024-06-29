package radiobutton;
import javafx.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public  class MyFrame extends JFrame implements ActionListener {

    JRadioButton radioButton1;
    JRadioButton radioButton2;
    JRadioButton radioButton3;
    JRadioButton radioButton4;
    JRadioButton radioButton5;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Demo");
        this.setLocationRelativeTo(null);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);



        radioButton1 = new JRadioButton("bird");
        radioButton2 = new JRadioButton("cat");
        radioButton3 = new JRadioButton("dog");
        radioButton4 = new JRadioButton("rabbit");
        radioButton5 = new JRadioButton("pig");

        radioButton1.addActionListener(this);
        radioButton2.addActionListener(this);
        radioButton3.addActionListener(this);
        radioButton4.addActionListener(this);
        radioButton5.addActionListener(this);

        ButtonGroup radioButton_group = new ButtonGroup();
        radioButton_group.add(radioButton1);
        radioButton_group.add(radioButton2);
        radioButton_group.add(radioButton3);
        radioButton_group.add(radioButton4);
        radioButton_group.add(radioButton5);

        this.add(radioButton1);
        this.add(radioButton2);
        this.add(radioButton3);
        this.add(radioButton4);
        this.add(radioButton5);


        this.pack();
        this.setVisible(true);
    }

    // implementing ActionListener interface method
    public void actionPerformed(ActionEvent e) {

    }



    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == radioButton1) {
            ImageIcon icon = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\radiobuttonss\\src\\radiobuttons\\AdobeStock_367863869_Preview.jpeg");
            JLabel imagelabel = new JLabel();
            imagelabel.setText("BIRDIMAGE");
            imagelabel.setIcon(icon);
            imagelabel.setBorder(new EmptyBorder(100,0,0,0));
            this.add(imagelabel, BorderLayout.NORTH);
            System.out.println("bird selected");
            //select first then resize the frame to see the image
            //close and rerun to select and see the next image

        } else if (e.getSource() == radioButton2) {
            ImageIcon icon = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\radiobuttonss\\src\\radiobuttons\\AdobeStock_256253532_Preview.jpeg");
            JLabel imagelabel = new JLabel();
            imagelabel.setText("CATIMAGE");
            imagelabel.setIcon(icon);
            imagelabel.setBorder(new EmptyBorder(100,0,0,0));
            this.add(imagelabel, BorderLayout.NORTH);
            System.out.println("cat selected");
            //select first then resize the frame to see the image
            //close and rerun to select and see the next image

        } else if (e.getSource() == radioButton3) {
            ImageIcon icon = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\radiobuttonss\\src\\radiobuttons\\AdobeStock_279686158_Preview.jpeg");
            JLabel imagelabel = new JLabel();
            imagelabel.setText("DOGIMAGE");
            imagelabel.setIcon(icon);
            imagelabel.setBorder(new EmptyBorder(100,0,0,0));
            this.add(imagelabel, BorderLayout.NORTH);
            System.out.println("dog selected");
            //select first then resize the frame to see the image
            //close and rerun to select and see the next image

        } else if (e.getSource() == radioButton4) {
            ImageIcon icon = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\radiobuttonss\\src\\radiobuttons\\AdobeStock_95037410_Preview.jpeg");
            JLabel imagelabel = new JLabel();
            imagelabel.setText("RABBITIMAGE");
            imagelabel.setIcon(icon);
            imagelabel.setBorder(new EmptyBorder(100,0,0,0));
            this.add(imagelabel, BorderLayout.NORTH);
            System.out.println("rabbit selected");
            //select first then resize the frame to see the image
            //close and rerun to select and see the next image


        } else if (e.getSource() == radioButton5) {
            ImageIcon icon = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\radiobuttonss\\src\\radiobuttons\\AdobeStock_265895626_Preview.jpeg");
            JLabel imagelabel = new JLabel();
            imagelabel.setText("PIGIMAGE");
            imagelabel.setIcon(icon);
            imagelabel.setBorder(new EmptyBorder(100,0,0,0));
            this.add(imagelabel, BorderLayout.NORTH);
            System.out.println("pig selected");
            //select first then resize the frame to see the image
            //close and rerun to select and see the next image

        }
    }
}






