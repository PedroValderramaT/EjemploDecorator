public abstract class DecoradorForma implements Forma {
   protected Forma DecoradorForma;

   public DecoradorForma(Forma DecoradorForma){
      this.DecoradorForma = DecoradorForma;
   }

   public void dibujar(){
	   DecoradorForma.dibujar();
   }	
}