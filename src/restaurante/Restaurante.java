
package restaurante;


public class Restaurante {
    private float polbo;
    private float patacas;
    private float clientes;
    //constructores
    public void Restaurante(float pol, float pat, float cli){
        polbo= pol;
        patacas= pat;
        clientes= cli;
    }
    //metodos
   public void engadirPolbo (int x){
    float maspolbos= polbo + x;
    }
   public void engadirPatacas ( int x){
    float maspatatas= patacas + x;
    }
   public void amosarPolbo( ){
       System.out.println("kgs de polbo no almacén = "+ polbo);
    }
   public void amosarPatacas ( ){
       System.out.println("kgs de patacas no almacén = "+ patacas);
   }
   public float numeroClientes (){
       float personas = (polbo/2 + patacas)/3;
       return personas;
   }
}

    
    
        
    
    

