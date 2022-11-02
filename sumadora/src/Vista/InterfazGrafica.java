package Vista;
import javax.swing.*;
import java.awt.*;
public class InterfazGrafica {
 //define los atributos
 private JFrame marcoPrincipal;
 private Container contenedorMarcoPrincipal;
 private PanelLogo logoPanel;
 private PanelSuma sumaPanel;
 private PanelBotones botonesPanel;
 public InterfazGrafica() {
 // Crear marco principal
 marcoPrincipal = new JFrame("SUMADORA");
 contenedorMarcoPrincipal = marcoPrincipal.getContentPane();
 contenedorMarcoPrincipal.setLayout(new BorderLayout(5,5));
 logoPanel = new PanelLogo();
 sumaPanel = new PanelSuma();
botonesPanel = new PanelBotones();
 contenedorMarcoPrincipal.add(logoPanel, BorderLayout.NORTH);
 contenedorMarcoPrincipal.add(sumaPanel, BorderLayout.CENTER);
 contenedorMarcoPrincipal.add(botonesPanel, BorderLayout.SOUTH);
 // Ajustar el contenedor a los componentes
 marcoPrincipal.pack();// establece el tamaño por defecto
// marcoPrincipal.setResizable(true);
 marcoPrincipal.setVisible(true); //hace el marco visible
 // establece el marco para salir cuando se cierre
 marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public JFrame getMarcoPrincipal() {
 return marcoPrincipal;
 }
 public void setMarcoPrincipal(JFrame marcoPrincipal) {
 this.marcoPrincipal = marcoPrincipal;
 }
 public Container getContenedorMarcoPrincipal() {
 return contenedorMarcoPrincipal;
 }
 public void setContenedorMarcoPrincipal(Container contenedorMarcoPrincipal) {
 this.contenedorMarcoPrincipal = contenedorMarcoPrincipal;
 }
 public PanelLogo getLogoPanel() {
 return logoPanel;
 }
 public void setLogoPanel(PanelLogo logoPanel) {
 this.logoPanel = logoPanel;
 }
 public PanelSuma getSumaPanel() {
 return sumaPanel;
 }
 public void setSumaPanel(PanelSuma sumaPanel) {
 this.sumaPanel = sumaPanel;
 }
 public PanelBotones getBotonesPanel() {
 return botonesPanel;
 }
 public void setBotonesPanel(PanelBotones botonesPanel) {
 this.botonesPanel = botonesPanel;
 }
}