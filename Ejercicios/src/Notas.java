import java.util.Scanner;
public class Notas {
    public double fnotas(){
        Scanner lich=new Scanner(System.in);
        System.out.println("Ingrese la primera nota");
        double n1=lich.nextDouble();
        System.out.println("Ingrese la segunda nota");
        double n2=lich.nextDouble();
        System.out.println("Ingrese la tercera nota");
        double n3=lich.nextDouble();
        double promedio=(n1+n2+n3)/3;
        if(promedio>=18&&promedio<=20){
            System.out.println("Felicidades Ud tiene A "+promedio);
        }
        else if(promedio<=17&&promedio>=15){
            System.out.println("¡Bien! Ud tiene B "+promedio);
        }
        else if (promedio==14||promedio==13){
            System.out.println("¡Hay que mejorar! Ud tiene C "+promedio);
        }
        else if (promedio<=12 && promedio>=0){
            System.out.println("¡OH NO! Ud tiene D "+promedio);
        }
        else {
            System.out.println("Número no válido");
        }
        return promedio;

    }
    public String fcurso(){
        Scanner fenix=new Scanner(System.in);
        System.out.println("Ingrese su ciclo");
        String ciclo= fenix.nextLine();
        System.out.println("Ingrese su grupo");
        String grupo= fenix.nextLine();
        System.out.println("Selecciona tu curso: Escribe F para fundamentos, C para capacidades o M para matemática");
        String opcion="";
        opcion=fenix.nextLine();
        switch(opcion){
            case "F":
                System.out.println("Su curso es FUNDAMENTOS DE PROGRAMACION");
            break;
            case "C":
                System.out.println("Su curso es CAPACIDADES COMUNICATIVAS");
            break;
            case "M":
                System.out.println("Su curso es MATEMÁTICA");
            break;
            default:
                System.out.println("Ese curso no existe");
        }
        return opcion;
    }

    public static void main (String []args){
        Notas ursa=new Notas();
        //+++ursa.fnotas();
        ursa.fcurso();

    }


}
