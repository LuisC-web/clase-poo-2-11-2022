package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Modelo;
import Vista.InterfazGrafica;
public class Controlador implements ActionListener{
 private InterfazGrafica vista= new InterfazGrafica();
 private Modelo modelo = new Modelo();
 public Controlador(InterfazGrafica view, Modelo modelo) {
 this.vista = view;
 this.modelo= modelo;
 this.vista.getSumaPanel().getBtnSumar().addActionListener(this);
 this.vista.getBotonesPanel().getBtnOpcion1().addActionListener(this);
 this.vista.getBotonesPanel().getBtnOpcion2().addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae){
 if (ae.getSource() == vista.getSumaPanel().getBtnSumar()){
 modelo.setNumeroUno(Integer.parseInt(vista.getSumaPanel().txtNumeroUno.getText()));
 modelo.setNumeroDos(Integer.parseInt(vista.getSumaPanel().txtNumeroDos.getText()));
 vista.getSumaPanel().getTxtSuma().setText(String.valueOf(modelo.sumar()));
 }else if (ae.getSource() == this.vista.getBotonesPanel().getBtnOpcion1()){
//String comando = this.vista.getBotonesPanel().getBtnOpcion1().getActionCommand( );
vista.getSumaPanel().txtNumeroUno.setText(null);
vista.getSumaPanel().txtNumeroDos.setText(null);
vista.getSumaPanel().txtSuma.setText(null); 
 }
 else if (ae.getSource() == this.vista.getBotonesPanel().getBtnOpcion2()) {
 {
 JOptionPane.showMessageDialog( null,"Otra posibilidad de hacer algo ");
 }
 }
 }
}