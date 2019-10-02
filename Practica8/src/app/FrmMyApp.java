package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FrmMyApp extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;

    JFrame frame;

    //Labels declarations
    JLabel LblName;
    JLabel LblLastName;
    JLabel LblMail;
    JLabel LblPhone;

    //Texts declarations
    JTextField TxtName;
    JTextField TxtLastName;
    JTextField TxtMail;
    JTextField TxtPhone;

    //Buttons declarations
    JButton BtnClear;
    JButton BtnAccept;
    JButton BtnNext;
    JButton BtnPrevious;

    public void init() {

        //Places properties
        int[] rows = {30,65,100,135};
        int[] columns = {25,100,210};

        //Label & Text properties
        int infoWidthP = 100; //Width of Labels & Texts
        int infoHeightP = 20;  //Height of Labels & Texts

        //Name form
        LblName = new JLabel("Nombre:");
        LblName.setBounds(columns[0],rows[0],infoWidthP,infoHeightP);
        add(LblName);
        TxtName = new JTextField();
        TxtName.setBounds(columns[1],rows[0],infoWidthP,infoHeightP);
        add(TxtName);
        
        //Last name form
        LblLastName = new JLabel("Apellido:");
        LblLastName.setBounds(columns[0],rows[1],infoWidthP,infoHeightP);
        add(LblLastName);
        TxtLastName = new JTextField();
        TxtLastName.setBounds(columns[1],rows[1],infoWidthP,infoHeightP);
        add(TxtLastName);

        //E-Mail form
        LblMail = new JLabel("E-Mail:");
        LblMail.setBounds(columns[0],rows[2],infoWidthP,infoHeightP);
        add(LblMail);
        TxtMail = new JTextField();
        TxtMail.setBounds(columns[1],rows[2],infoWidthP,infoHeightP);
        add(TxtMail);

        //Telephone form
        LblPhone = new JLabel("Telefono:");
        LblPhone.setBounds(columns[0],rows[3],infoWidthP,infoHeightP);
        add(LblPhone);
        TxtPhone = new JTextField();
        TxtPhone.setBounds(columns[1],rows[3],infoWidthP,infoHeightP);
        add(TxtPhone);

        //Buttons Properties
        int btnHeightP = 30; //Height of buttons
        int btnWidthP = 125; //Width of buttons
        
        //Clear button
        BtnClear = new JButton("Borrar");
        BtnClear.setBounds(columns[2],rows[0],btnWidthP,btnHeightP);
        BtnClear.addActionListener(this);
        add(BtnClear);

        //Accept button
        BtnAccept = new JButton("Aceptar");
        BtnAccept.setBounds(columns[2],rows[1],btnWidthP,btnHeightP);
        add(BtnAccept);

        //Next button
        BtnNext = new JButton("Siguiente");
        BtnNext.setBounds(columns[2],rows[2],btnWidthP,btnHeightP);
        add(BtnNext);

        //Previous button
        BtnPrevious = new JButton("Anterior");
        BtnPrevious.setBounds(columns[2],rows[3],btnWidthP,btnHeightP);
        add(BtnPrevious);

        //Frame Properties
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == BtnClear)
        {
            TxtName.setText("");
            TxtLastName.setText("");
            TxtMail.setText("");
            TxtPhone.setText("");
        }

    }
    
}