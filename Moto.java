public class Moto {

   private int cc, añoDeMatriculacion, matricula;
   private String marca, color;
   
   private void setCc (int cc) {
    this.cc = cc;
 }

   private void setAñoDeMatriculacion(int añoDeMatriculacionS) {
    this.añoDeMatriculacion = añoDeMatriculacionS;
 }

   private void setMatricula(int MatriculaS) {
    this.matricula = matriculaS;
 }

  private void setMarca(String marcaS) {
    this.setMarca = marcaS;
 }

   private void setColor (String colorS) {
    this.setColor = colorS;
 }

   public Moto(int matriculaC, String marcaC) {

    setMatricula(matriculaC);
    setMarca(marcaC);
 }

   public Moto (int centimetrosCubicos, int añoMatricula, int matricula, String marca, String color) {

    setCc(centimetrosCubicos);
    setAñoDeMatriculacion(añoMatricula);
    setMatricula(matricula);
    setMarca(marca);
    setcolor(color);
 }
}