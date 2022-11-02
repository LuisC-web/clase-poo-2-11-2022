package Vista;

import javax.swing.*;
import java.awt.*;
public class PanelBotones extends JPanel {
 /**
* Constante para el extensión 1.
*/
 private final String OPCION_1 = "opcion1";
 /**
* Cosntante para la extensión 2.
*/
 private final String OPCION_2 = "opcion2";
 /**
* Botón para la extensión 1.
*/
 private JButton btnOpcion1;
 /**
* Botón para la extensión 2.
*/
 private JButton btnOpcion2;
 public PanelBotones(){
 setLayout(new FlowLayout());
 setBackground(Color.BLUE);
 btnOpcion1 = new JButton( "Limpiar" );
 btnOpcion1.setActionCommand( OPCION_1 );
 btnOpcion2 = new JButton( "Opción 2" );
 btnOpcion2.setActionCommand( OPCION_2 );
 add( btnOpcion1 );
 add( btnOpcion2 );
 }
 public JButton getBtnOpcion1() {
 return btnOpcion1;
 }
 public void setBtnOpcion1(JButton btnOpcion1) {
 this.btnOpcion1 = btnOpcion1;
 }
 public JButton getBtnOpcion2() {
 return btnOpcion2;
 }
 public void setBtnOpcion2(JButton btnOpcion2) {
 this.btnOpcion2 = btnOpcion2;
 }
}
