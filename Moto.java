public class Moto {

   private int cc, aņoDeMatriculacion, matricula;
   private String marca, color;
   
   private void setCc (int cc) {
    this.cc = cc;
 }

   private void setAņoDeMatriculacion(int aņoDeMatriculacionS) {
    this.aņoDeMatriculacion = aņoDeMatriculacionS;
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

   public Moto (int centimetrosCubicos, int aņoMatricula, int matricula, String marca, String color) {

    setCc(centimetrosCubicos);
    setAņoDeMatriculacion(aņoMatricula);
    setMatricula(matricula);
    setMarca(marca);
    setcolor(color);
 }
}