/*Rodrigo de Jesús Aguilar Acosta 2902637,
* Hay muchas maneras de llegar a los resultados de la actividad,
* en este caso como la actividad indica que en el tercer método (Imprimir)
* debe de haber 3 parámetros, los cuales son Nombre, Promedio y Calificación
* lo he realizado de tal manera que sea así. */

public class Main {
    public static void main(String[] args) {
        calcular Alumno1 = new calcular();
        calcular Alumno2 = new calcular();
        calcular Alumno3 = new calcular();

        Alumno1.setNombre("Rodrigo Aguilar");
        Alumno2.setNombre("Alexandro Oropeza");
        Alumno3.setNombre("Luis Marquez");

        Alumno1.setValores(new double[] {87,89,95,83,92});
        Alumno2.setValores(new double[] {91,92,93,94,95});
        Alumno3.setValores(new double[] {70.85,85.95,75.55,73.33,80.25});

        Alumno1.Imprimir(
                Alumno1.getNombre(),
                calcular.CalcularPromedio(Alumno1.getValores()),
                calcular.Calificacion(calcular.CalcularPromedio(Alumno1.getValores()))
        );

        Alumno2.Imprimir(
                Alumno2.getNombre(),
                calcular.CalcularPromedio(Alumno2.getValores()),
                calcular.Calificacion(calcular.CalcularPromedio(Alumno2.getValores()))
        );


        Alumno3.Imprimir(
                Alumno3.getNombre(),
                calcular.CalcularPromedio(Alumno3.getValores()),
                calcular.Calificacion(calcular.CalcularPromedio(Alumno3.getValores()))

        );











    }
}