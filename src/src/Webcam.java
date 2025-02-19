package src;

public class Webcam {
    private String resolucion;
    private int fps;
    private boolean encendida;

    // Constructor
    public Webcam(String resolucion, int fps) {
        this.resolucion = resolucion;
        this.fps = fps;
        this.encendida = false; // Cámara apagada por defecto
    }

    // Getters y Setters
    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    public boolean isEncendida() {
        return encendida;
    }

    // Métodos para encender y apagar la cámara
    public void encender() {
        if(encendida) {
            System.out.println("La cámara ya está encendida.");
            return;
        }
            encendida = true;
            System.out.println("Cámara encendida.");
 
    }

    public void apagar() {
        if(!encendida) {
            System.out.println("La cámara ya está apagada.");
            return;
        }
            encendida = false;
            System.out.println("Cámara apagada.");

    }

    // Método para tomar una foto
    public String tomarFoto() {
        if (!encendida) {
            return "Error: La cámara está apagada. Enciéndela para tomar una foto.";
        }

        String[] dimensiones = resolucion.split("x");
        int ancho = Integer.parseInt(dimensiones[0]);
        int alto = Integer.parseInt(dimensiones[1]);

        double tamano = (ancho * alto * fps) / 1000000.0;
        return "Foto tomada con resolución " + resolucion + ", tamaño estimado: " + tamano + " MB.";
    }
}