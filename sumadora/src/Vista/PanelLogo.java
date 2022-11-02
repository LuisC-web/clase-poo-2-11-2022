package Vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class PanelLogo extends JPanel
{
 private static final String RUTA_IMAGEN = "./imagenes/logoSuma.png";
 //Constante Ruta de la imagen del banner.
 private JLabel etiqueta;//Etiqueta en la que se implementa la imagen.
 // -----------------------------------------------------------------
 // Constructores
 // -----------------------------------------------------------------
 public PanelLogo( )
 {
 setBackground(Color.MAGENTA);
 ImageIcon ruta = new ImageIcon(RUTA_IMAGEN);
 etiqueta = new JLabel( );
 etiqueta.setIcon(ruta);
 //etiqueta.setIcon( new ImageIcon( RUTA_IMAGEN ) );
 add( etiqueta );
 }
}