public class Moto {

   private int cc, a�oDeMatriculacion, matricula;
   private String marca, color;
   
   private void setCc (int cc) {
    this.cc = cc;
 }

   private void setA�oDeMatriculacion(int a�oDeMatriculacionS) {
    this.a�oDeMatriculacion = a�oDeMatriculacionS;
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

   public Moto (int centimetrosCubicos, int a�oMatricula, int matricula, String marca, String color) {

    setCc(centimetrosCubicos);
    setA�oDeMatriculacion(a�oMatricula);
    setMatricula(matricula);
    setMarca(marca);
    setcolor(color);
 }
}