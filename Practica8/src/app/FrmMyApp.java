package app;

//import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FrmMyApp extends JFrame{

    private static final long serialVersionUID = 1L;

    JFrame frame;

    FrmMyApp() {

        //Name form
        JLabel LblName = new JLabel("Nombre:");
        LblName.setBounds(25,25,100,20);
        JTextField TxtName = new JTextField();
        TxtName.setBounds(100,25,100,20);
        add(LblName);
        add(TxtName);
        
        //Last name form
        JLabel LblLastName = new JLabel("Apellido:");
        LblLastName.setBounds(25,60,100,20);
        JTextField TxtLastName = new JTextField();
        TxtLastName.setBounds(100,60,100,20);
        add(LblLastName);
        add(TxtLastName);

        //Accept button
        JButton BtnAcept = new JButton("Click");
        BtnAcept.setBounds(25,100,100,100);
        add(BtnAcept);

        //Frame Properties
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
}