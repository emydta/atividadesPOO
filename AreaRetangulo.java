import java.util.Scanner;

public class AreaRetangulo{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Digite o valor da altura: ");
        retangulo.altura = scanner.nextInt(); 
        System.out.println("Digite o valor da largura: ");
        retangulo.largura = scanner.nextInt();

        double areaRetangulo = retangulo.area();
        double perimeterRetangulo = retangulo.perimeter();
        double diagonalRetangulo = retangulo.diagonal();

        System.out.println("area do retangulo é: "+areaRetangulo); 
        System.out.println("perimetro do retangulo é: "+perimeterRetangulo); 
        System.out.println("diagonal do retangulo é: "+diagonalRetangulo); 


        
    }
}