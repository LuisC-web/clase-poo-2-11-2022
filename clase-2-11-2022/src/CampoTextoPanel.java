import javax.swing.*;
import java.awt.event.*;
public class CampoTextoPanel extends JPanel implements ActionListener {
 private JLabel label1;
 private JLabel label2;
 private JTextField textfield1;
 private JTextField textfield2;
 private JButton boton1;
 public CampoTextoPanel() {
 setLayout(null);
 label1=new JLabel("Nombre:");
 label1.setBounds(10,10,100,30);
 label2=new JLabel("Clave:");
 label2.setBounds(10,50,100,30);
 textfield1=new JTextField();
 textfield1.setBounds(130,10,100,30);
 textfield2=new JTextField();
 textfield2.setBounds(130,50,100,30);
 boton1=new JButton("Confirmar");
 boton1.setBounds(10,100,100,30);
 
 add(label1);
 add(label2);
 add(textfield1);
 add(textfield2);
 add(boton1);
 boton1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e) {
 JFrame aplicacion= new JFrame();
 if (e.getSource()==boton1) {
 String cad1=textfield1.getText();
 String cad2=textfield2.getText();
 if (cad1.equals("Julio")==true && cad2.equals("jct123")==true){
aplicacion.setTitle("Correcto");
 aplicacion.setSize(350,250); 
 aplicacion.setVisible(true);
 }else{
 aplicacion.setTitle("Incorrecto");
 aplicacion.setSize(350,250); 
 aplicacion.setVisible(true);
 }
 }
 }
}
