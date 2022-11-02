import Controlador.Controlador;
import Vista.InterfazGrafica;
import Modelo.Modelo;
public class App {
 public static void main(String[] args) {
 InterfazGrafica vista;
 Modelo modelo;
 Controlador controlador;
 vista = new InterfazGrafica();
 modelo = new Modelo();
 controlador = new Controlador(vista, modelo);
 }
}