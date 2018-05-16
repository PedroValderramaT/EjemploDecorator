public class PatronDecorador {
   public static void main(String[] args) {

      Forma Circulo = new Circulo();

      Forma CirculoRojo = new DecoradorFiguraRoja(new Circulo());

      Forma RectanguloRojo = new DecoradorFiguraRoja(new Rectangulo());
      System.out.println("Circulo con borde normal");
      Circulo.dibujar();

      System.out.println("\nCirculo con borde rojo");
      CirculoRojo.dibujar();

      System.out.println("\nRectangulo de borde rojo");
      RectanguloRojo.dibujar();
   }
}