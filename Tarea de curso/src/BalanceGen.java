import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BalanceGen {
    Scanner leer =new Scanner (System.in);

    private ArrayList<Activo>activo=new ArrayList<>();
    private ArrayList<Pasivo>pasivo=new ArrayList<>();
    private ArrayList<Capital>capital=new ArrayList<>();

   public BalanceGen(){



        activo.add(new Activo("Caja y Bancos", 0));
        activo.add(new Activo("Cuentas por cobrar", 0));
        activo.add(new Activo("Anticipo a proveedores", 0));
        activo.add(new Activo("Inventario", 0));
        activo.add(new Activo("Propiedades planta y equipo", 0));

        pasivo.add(new Pasivo("Cuentas por pagar", 0));
        pasivo.add(new Pasivo("Prestamos Bancarios a corto plazo", 0));
        pasivo.add(new Pasivo("Proveedores", 0));
        pasivo.add(new Pasivo("Acreedores Diversos", 0));
        pasivo.add(new Pasivo("Impuestos por pagar", 0));
        pasivo.add(new Pasivo("Prstamos bancarios a largo plazo", 0));

        capital.add(new Capital("Capital", 0));
        
        
        

    



    }

   public void agregarutilidaddelejercicio(int utilidaddelejercicio){

    capital.add(new Capital("Utilidad del ejercicio", utilidaddelejercicio));


   }

   public void agregarvalordeactivo(){

    for (Activo activo2 : activo) {

        System.out.println("Ingrese el valor de la cuenta "+activo2.getNombre());
        int valor = leer.nextInt();
        activo2.setValor(valor);
        
        
    }

   }

   public void agregarvalordepasivo(){
    for (Pasivo pasivo2 : pasivo) {
        System.out.println("Ingrese el valor de la cuenta "+pasivo2.getNombre());
        int valor = leer.nextInt();
        pasivo2.setValor(valor);
        
    }
   }

   public void agregarvalordecapital(){
    for (Capital capital2 : capital) {

    if (capital2.getNombre().equalsIgnoreCase("Utilidad del ejercicio")) {
        System.out.println("La utilidad del ejercicio fue de ... "+capital2.getValor());
        continue;
    }
        System.out.println("Ingrese el valor de la cuenta "+capital2.getNombre());
        int valor = leer.nextInt();
        capital2.setValor(valor);
    }

   }

   public void mostaractivos(){
    System.out.println("SUS ACTIVOS SON ");
    for (Activo activo2 : activo) {
        System.out.println(activo2.getNombre()+"...."+activo2.getValor());
        
    }


   }

   public void mostrarpasivos(){
    System.out.println("SUS PASIVOS SON ");
    for (Pasivo pasivo2 : pasivo) {
        System.out.println(pasivo2.getNombre()+"...."+pasivo2.getValor());
        
    }


   }

   public void mostrarcapital(){
    System.out.println("SU CAPITAL ES DE ");
    for (Capital capital2 : capital) {
        System.out.println(capital2.getNombre()+"...."+capital2.getValor());
        
    }
   }
   
   public int calcularactivos(){
    int total=0;
    for (Activo activo2 : activo) {
        total=+activo2.getValor();
    }
    return total;

   }

   public int calcularpasivos(){
    int total=0;
    for (Pasivo pasivo2 : pasivo) {
        total=+pasivo2.getValor();   
    }
    return total;

   }

   public int calcularcapital(){
        int total=0;
        for (Capital capital2 : capital) {
            total=+capital2.getValor(); 
        } 
        return total;
   }

   public void balancefinal(int activo, int pasivo, int capital){
    System.out.println("El pasivo mas el capital es igual a "+(pasivo+capital));
    System.out.println("Y sus Activos son igual a "+(activo));


   }
   
   //getters
    public ArrayList<Activo> getActivo() {
       return activo;
   }
   public ArrayList<Capital> getCapital() {
       return capital;
   }
   public ArrayList<Pasivo> getPasivo() {
       return pasivo;
   } 
     //setters 

     public void setActivo(ArrayList<Activo> activo) {
         this.activo = activo;
     }

     public void setCapital(ArrayList<Capital> capital) {
         this.capital = capital;
     }

     public void setPasivo(ArrayList<Pasivo> pasivo) {
         this.pasivo = pasivo;
     }

    }

     
   

    

