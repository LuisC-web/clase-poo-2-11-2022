import javax.swing.JFrame;
public class App
{
 public static void main(String[] args)
{ 
 // crea un panel que contiene nuestro dibujo
 MarcoBorderLayout marcoBorderLayout = new MarcoBorderLayout();
 marcoBorderLayout.setSize( 400, 400 ); // establece el tamaño del marco 
 marcoBorderLayout.setVisible( true ); // muestra el marco 
 marcoBorderLayout.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
} // fin de la clase App
}