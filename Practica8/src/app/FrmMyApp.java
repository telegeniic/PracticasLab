package app;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.*;

public class FrmMyApp extends JFrame{

    private static final long serialVersionUID = 1L;

    JFrame frame;

    public void init(){

        //Name form
        JLabel LblName = new JLabel();
        JTextField TxtName = new JTextField();
        
        //Last name form
        JLabel LblLastName = new JLabel();
        JTextField TxtLastName = new JTextField();

        //Accept button
        JButton BtnAcept = new JButton("Click");

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GroupLayout Layout = new GroupLayout(getContentPane());
        getContentPane().setLayout();

    }
    
}