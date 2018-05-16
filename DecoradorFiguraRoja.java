public class DecoradorFiguraRoja extends DecoradorForma {

   public DecoradorFiguraRoja(Forma DecoradorForma) {
      super(DecoradorForma);		
   }

   @Override
   public void dibujar() {
	  DecoradorForma.dibujar();	       
      BordeRojo(DecoradorForma);
   }

   private void BordeRojo(Forma DecoradorForma){
      System.out.println("Borde: Rojo");
   }
}