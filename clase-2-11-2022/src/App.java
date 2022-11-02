import javax.swing.JFrame;
public class App
{
 public static void main(String[] args)
{ 
 // crea un panel que contiene nuestro dibujo
 CampoTextoPanel panel = new CampoTextoPanel(); 
 // crea un nuevo marco para contener el panel
 JFrame aplicacion = new JFrame("Prueba de JTextField");
 aplicacion.add(panel); // agrega el panel al marc
 aplicacion.setSize(350, 250); // establece el tamaño del marco
 aplicacion.setVisible(true);//hace el marco visible
 // establece el marco para salir cuando se cierre
aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
} 
} // fin de la clase App
