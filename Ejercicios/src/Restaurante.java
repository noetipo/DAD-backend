import java.util.Scanner;
public class Restaurante{

    public double fdescuentos(){
        Scanner invoker = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de menus a comprar");
        int cant_menus=invoker.nextInt();
        int costo_menu=12;
        double subtotal=cant_menus*costo_menu;
        double igv_calculado=subtotal*0.18;
        if(subtotal>100){
            double descuento=subtotal*0.1;
            System.out.println("Subtotal: "+subtotal);
            System.out.println("IGV: "+igv_calculado);
            System.out.println("Descuento: "+descuento);
            double total_pagar=subtotal+igv_calculado-descuento;
            System.out.println("Total a pagar: "+total_pagar);
        }
        else{

        }
        return subtotal;




    }

    public String fcomida(){
        Scanner storm= new Scanner(System.in);
        System.out.println("Seleccione su entrada: Ceviche, papa rellena o sopa de pollo");
        String opcion="";
        opcion=storm.nextLine();
        switch(opcion){
            case "Ceviche":
                System.out.println("Ud ha seleccionado Ceviche");
            break;
            case "Papa rellena":
                System.out.println("Ud ha seleccionado Papa rellena");
            break;
            case "Sopa de pollo":
                System.out.println("Ud ha seleccionado Sopa de pollo");
                break;
        }

        return opcion;
    }


    public static void main(String[]args){
    Restaurante lina =new Restaurante();
    lina.fdescuentos();



    }
}
