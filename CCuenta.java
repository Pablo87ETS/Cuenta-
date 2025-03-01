package cuentas;
/**
 *
 * @author Pablo Díaz Hernández
 */
public class CCuenta {
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
   private String nombre;  
   private String cuenta;
   private double saldo;  
   private double tipoInterés;
   public CCuenta()   
   {
   }
   public CCuenta(String nom, String cue, double sal, double tipo) 
   {       
   nombre =nom;
   cuenta=cue;   
   saldo=sal; 
   }        
   public double estado()   
   {  
   return getSaldo();
   }  
   public void retirar(double cantidad) 
   {try {  
   System.out.println("Quitamos en cuenta: " + cantidad);
   if (cantidad <= 0) 
   throw new Exception ("No se puede retirar una cantidad negativa");       
   if (estado()< cantidad)   
   throw new Exception ("No hay suficiente dinero");     
            setSaldo(getSaldo() - cantidad);     
   } catch (Exception e) {       
   System.out.println(e);
   }      
   }   
   public void ingresar(double cantidad)  
   {try {      
   System.out.println("Aumento en cuenta: " + cantidad);
   if (cantidad<0)  
   throw new Exception("No se puede ingresar una cantidad negativa");     
            setSaldo(getSaldo() + cantidad); 
   } catch (Exception e) {      
   System.out.println(e);
   }
   }  
   public static void main(String[] args) {  
   CCuenta cuenta1;
   double saldoActual;   
   cuenta1 = new CCuenta("Luis Hernández","1000-2365-85-1230456745",4000,0); 
   saldoActual = cuenta1.estado();
   System.out.println("El saldo actual es "+ saldoActual );

   operaciones(cuenta1); 

   saldoActual = cuenta1.estado();    
   System.out.println("El saldo actual es "+ saldoActual ); 
   }

    private static void operaciones(CCuenta cuenta1) {
        // Operaciones de ingreso y retiro
        cuenta1.retirar(2300);
        cuenta1.ingresar(685);
    }
    }   