public class calcular {
    private String Nombre;
    private double[] Valores = new double[5];

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setValores(double[] valores) {
        Valores = valores;
    }

    public String getNombre() {
        return Nombre;
    }

    public double[] getValores() {
        return Valores;
    }

    public static double CalcularPromedio(double[] Valores){
        double num = 0;
        for(int i = 0; i < Valores.length; i++ ){
           num = num + Valores[i];
        }

        return num / Valores.length;
    }


    public static String Calificacion(double promedio){
        if(promedio <= 50){
            return "F";
        }else if (promedio >= 51 && promedio <= 60){
            return "E";
        } else if (promedio >= 61 && promedio <= 70) {
            return "D";
        } else if (promedio >= 71 && promedio <= 80) {
            return "C";
        } else if (promedio >= 81 && promedio <= 90) {
            return "B";
        }else if (promedio >= 91 && promedio <= 100){
            return "A";
        }else{
            return "ERROR";
        }
    }

    public void Imprimir (String Nombre, double Promedio, String Calificacion){
        int numM = 1;
        System.out.println("Nombre alumno: " + Nombre );

        for(int i = 0; i < Valores.length; i++){
            System.out.println("Calificacion " + numM++ + ": " + Valores[i] );
        }

        System.out.println("Promedio: " + Promedio);
        System.out.println("Calificacion: " + Calificacion + "\n");
    }
}
