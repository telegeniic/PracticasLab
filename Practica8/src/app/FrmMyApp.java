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
        LblName.setBounds(25,30,100,20);
        add(LblName);
        JTextField TxtName = new JTextField();
        TxtName.setBounds(100,30,100,20);
        add(TxtName);
        
        //Last name form
        JLabel LblLastName = new JLabel("Apellido:");
        LblLastName.setBounds(25,60,100,20);
        add(LblLastName);
        JTextField TxtLastName = new JTextField();
        TxtLastName.setBounds(100,60,100,20);
        add(TxtLastName);

        //E-Mail form
        JLabel LblMail = new JLabel("E-Mail:");
        LblMail.setBounds(25,90,100,20);
        add(LblMail);
        JTextField TxtMail = new JTextField();
        TxtMail.setBounds(100,90,100,20);
        add(TxtMail);

        //Telephone form
        JLabel LblPhone = new JLabel("Telefono:");
        LblPhone.setBounds(25,120,100,20);
        add(LblPhone);
        JTextField TxtPhone = new JTextField();
        TxtPhone.setBounds(100,120,100,20);
        add(TxtPhone);

        //Accept button
        JButton BtnAcept = new JButton("Click");
        BtnAcept.setBounds(200,30,75,75);
        add(BtnAcept);

        //Frame Properties
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
}