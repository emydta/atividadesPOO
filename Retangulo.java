public class Retangulo{

    double altura;
    double largura;

    public double area(){

        double area = (altura * largura);
        return area;
    }

    public double perimeter(){
        double perimeter = 2 * (altura + largura);
        return perimeter;
    }

    public double diagonal(){
        double diagonal = Math.sqrt(altura * altura + largura * largura);
        return diagonal;
    }


}