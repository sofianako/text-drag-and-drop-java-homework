package org.example;

public class Main {
    public static void main(String[] args)
    {
        SwingDragDropTextFields frame =
                new SwingDragDropTextFields("Text Fields Drag and Drop");
        frame.setVisible(true);

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}