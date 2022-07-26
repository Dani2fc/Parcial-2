package Modelo;

import javax.sound.sampled.SourceDataLine;

class Figura {
    protected String nombreFigura = "";

    public void imprimirDatos(){
        System.out.println("La figura del/la: "+ " su respectivo volumen es: ");

    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

}

class Cubo extends Figura {
    private String nombreCubo;
    
    private double diametro;

    public Cubo(String nombreC, double diameter){
        this.nombreCubo = nombreC;
        this.diametro = diameter;
    }

    public void calcularVolumen(double volumenCubo){
        volumenCubo = Math.pow(diametro,3);
    }

    public String getNombreCubo() {
        return nombreCubo;
    }
    public void setNombreCubo(String nombreCubo) {
        this.nombreCubo = nombreCubo;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public static void main(String[] args) {
        Cubo nuevoCubo = new Cubo("Cubo", 10);
        System.out.println("Datos de la primera figura: "+ nuevoCubo);
    }
    
}

class Cilindro extends Figura{

    private String nombreCilindro;

    private double alturaCilindro;
    
    private double radioCilindro;

    public Cilindro(String nombreC2, double alturaC2, double radioC2){
        this.nombreCilindro = nombreC2;
        this.alturaCilindro = alturaC2;
        this.radioCilindro = radioC2;
    }

    public void calcularVolumen2(double volumenCilindro){
        volumenCilindro = ((Math.PI * alturaCilindro)* Math.pow(radioCilindro,2));
    }

    public String getNombreCilindro() {
        return nombreCilindro;
    }

    public double getAltura() {
        return alturaCilindro;
    }

    public void setAltura(double altura) {
        this.alturaCilindro = altura;
    }

    public void setNombreCilindro(String nombreCilindro) {
        this.nombreCilindro = nombreCilindro;
    }

    public double getRadio() {
        return radioCilindro;
    }

    public void setRadio(double radio) {
        this.radioCilindro = radio;
    }

    public static void main(String[] args) {
        Cilindro nuevoCilindro = new Cilindro("Cilindro",20,5);
    }
}

class Cono extends Figura{

    private String nombreCono = "Cono";
    private double alturaCono;
    private double radioCono;

    public void calcularVolumen3(double volumenCono){
        volumenCono = ((((Math.PI * alturaCono)* (Math.pow(radioCono, 2)))/3));
    }


    public String getNombreCono() {
        return nombreCono;
    }

    public void setNombreCono(String nombreCono) {
        this.nombreCono = nombreCono;
    }

    public double getAlturaCono() {
        return alturaCono;
    }

    public void setAlturaCono(double alturaCono) {
        this.alturaCono = alturaCono;
    }
    
    public double getRadioCono() {
        return radioCono;
    }

    public void setRadioCono(double radioCono) {
        this.radioCono = radioCono;
    }

    public static void main(String[] args) {
        Cono nuevoCono = new Cono();
    }
}

class Esfera extends Figura{

    private String nombreEsfera = "Esfera";
    private double radioEsfera;

    public void calcularVolumen4(double volumenEsfera){
        volumenEsfera = ((4*(Math.PI *(Math.pow(radioEsfera,3))))/3);
    }
    

    public double getRadioEsfera() {
        return radioEsfera;
    }
    public void setRadioEsfera(double radioEsfera) {
        this.radioEsfera = radioEsfera;
    }
    public String getNombreEsfera() {
        return nombreEsfera;
    }
    public void setNombreEsfera(String nombreEsfera) {
        this.nombreEsfera = nombreEsfera;
    }

    public static void main(String[] args) {
        Esfera nuevaEsfera = new Esfera();
    }
}
