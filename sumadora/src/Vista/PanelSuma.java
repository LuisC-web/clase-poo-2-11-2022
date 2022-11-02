package Vista;
import javax.swing.*;
import java.awt.*;
public class PanelSuma extends JPanel{
 // declaration Campos- 
 public JButton btnSumar;
 private JLabel jLabel1;
 public JTextField txtNumeroDos;
 public JTextField txtNumeroUno;
 public JTextField txtSuma;
 // final declaration de campos
 public PanelSuma (){
 setLayout(new FlowLayout());
 setBackground(Color.GREEN);
 btnSumar = new JButton(" Sumar ");
 jLabel1 = new JLabel(" + ");
 txtNumeroDos = new JTextField(5);
 txtNumeroUno = new JTextField(5);
 txtSuma = new JTextField(5);
add(txtNumeroUno );
add(jLabel1 );
add( txtNumeroDos );
add( btnSumar );
add(txtSuma );
 }
 public JButton getBtnSumar() {
 return btnSumar;
 }
 public void setBtnSumar(JButton btnSumar) {
 this.btnSumar = btnSumar;
 }
 public JTextField getTxtNumeroDos() {
 return txtNumeroDos;
 }
 public void setTxtNumeroDos(JTextField txtNumeroDos) {
 this.txtNumeroDos = txtNumeroDos;
 }
 public JTextField getTxtNumeroUno() {
 return txtNumeroUno;
 }
 public void setTxtNumeroUno(JTextField txtNumeroUno) {
 this.txtNumeroUno = txtNumeroUno;
 }
 public JTextField getTxtSuma() {
 return txtSuma;
 }
 public void setTxtSuma(JTextField txtSuma) {
 this.txtSuma = txtSuma;
 }
}