import java.util.Scanner;


public class Menu {

     public void menu (){
        Scanner leer=new Scanner(System.in);
        BalanceGen balance = new BalanceGen();
        EstadoResultado est = new EstadoResultado();

      //aqui comienza el estado de resultado
      System.out.println(" BIENVENIDO AL SISTEMA CONTABLE DE LA EMPRESA X");
      System.out.println("---------Ingrese los datos solicitados---------");
      System.out.println("-------------Estado de Resultados--------------");
    
      est.agregarvalordeingresos();
      est.agregarvalordegastos();

      int ingresos = est.calcularingresos();
      int gastos = est.calculargastos();

      System.out.println("Sus ingresos son de "+est.calcularingresos());
      System.out.println("Sus gastos son de "+est.calculargastos());

      int utilidaddelejercicio=est.resultadofinal(ingresos, gastos);

      System.out.println("La utilidad del ejercicio es "+utilidaddelejercicio);
      balance.agregarutilidaddelejercicio(utilidaddelejercicio);

        //aqui termina el estado de resultados



       

        //balance

        boolean salir = false;
 
        do{
        System.out.println("BIENVENIDO AL SISTEMA CONTABLE DE LA EMPRESA X");
        System.out.println("---------------Balance General----------------");
        System.out.println("--------------Elija una opcion----------------");
        
        System.out.println("1. Agregar Activos ");
        System.out.println("2. Agregar Pasivos ");
        System.out.println("3. Agregar Capital ");
        System.out.println("4. Mostrar Activos");
        System.out.println("5. Mostrar Pasivos");
        System.out.println("6. Mostrar Capital");
        System.out.println("7. Balance General");
        System.out.println("8. Salir");
        int opcion = leer.nextInt();

        switch (opcion) {
                 case 1:
                 balance.agregarvalordeactivo();
                 break;

                 case 2:
                 balance.agregarvalordepasivo();
                 break;

                 case 3: 
                 balance.agregarvalordecapital();
                 break;
                 case 4 :
                 balance.mostaractivos();
                 break;

                 case 5:
                 balance.mostrarpasivos();
                 break;

                 case 6:
                 balance.mostrarcapital();
                 break;

                 case 7:
                 balance.balancefinal(balance.calcularactivos(),balance.calcularpasivos(),balance.calcularcapital());
                 break;

                 case 8:
                 System.out.println("Gracias por utilizar nuestro sistema contable");
                 salir=true;
                 break;
        
            default:
            System.out.println("Ingresaste un dato invalido!");
            leer.nextLine();
                break;
        }

    }while (!salir);

    
        
        




    }
    




   
   

}
