package org.example;

import java.awt.Container;
import java.awt.GridLayout;

// import javax.swing.DropMode;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

    public class SwingDragDropTextFields extends JFrame
{
    //Sample 02: TextFields as Members
    JTextField tf1;
    JTextField tf2;

    @SuppressWarnings("unchecked")
    public SwingDragDropTextFields(String title)
    {
        //Sample 01: Set Size and Position
        super(title);
        setBounds(100, 100, 350, 150);
        Container ControlHost = getContentPane();
        ControlHost.setLayout(new GridLayout(2,2));

        //Sample 03: Create TextFields, Labels
        tf1 = new JTextField(20);
        tf1.setName("tf1");
        tf2 = new JTextField(20);
        tf2.setName("tf2");

        //Sample 04: Add components to Frame
        add(new JLabel("Drag and drop text ->"));
        add(tf1);
        add(new JLabel("Also drop text here ->"));
        add(tf2);

        //Run: Select and Drag: Move
        //Run: Select and Press Control then Drag: Copy
        //Sample 05: Add Drag Support to Text Field 1
        tf1.setDragEnabled(true);

    }
}