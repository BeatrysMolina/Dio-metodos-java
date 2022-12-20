package AulaRetorno;

public class Main {
    
    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício quadrilátero!");

        double areaQuadrado = Sobrecarga.area(3);
        System.out.println("\nÁrea do quadrado é " + areaQuadrado);

        double areaRetangulo = Sobrecarga.area(5,5);
        System.out.println("Área do retângulo é " + areaRetangulo);

        double areaTrapezio = Sobrecarga.area(7,8,9);
        System.out.println("Área do trapézio é " + areaTrapezio);
    }
}