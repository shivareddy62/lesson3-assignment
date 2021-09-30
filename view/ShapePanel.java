package view;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ShapeEventListener;

import java.awt.BorderLayout;
import java.awt.Container;

public class ShapePanel {
    private JFrame window;
    private ShapeCanvas canvas;
    private JButton randomShapeButton;
    private JButton exitButton;

    public ShapePanel (JFrame window){
        this.window = window;
    }
    public <ShapeEventListner> void init(){
        Container cp = window.getContentPane();
        JPanel southPanel = new JPanel();

        cp.add(BorderLayout.SOUTH, southPanel);

         randomShapeButton = new JButton("Random Shapes");
         exitButton = new JButton("Exit");
        southPanel.add(randomShapeButton);
        southPanel.add(exitButton);
// canvas
        canvas = new ShapeCanvas(this);
        cp.add(BorderLayout.CENTER,canvas);

        //event listner
        ShapeEventListener listener = new ShapeEventListener(this);
        randomShapeButton.addActionListener(listener);
        exitButton.addActionListener(listener);

    }
    public JButton getExitButton(){
        return exitButton;
    }
    public JButton getRandomShapeButton(){
      return randomShapeButton;
    }
    public ShapeCanvas getCanvas(){
        return canvas;
    }
    public JFrame getWindow(){
        return window;
    }
}
