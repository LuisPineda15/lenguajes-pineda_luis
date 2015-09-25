/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.pineda_luis;

/**
 *
 * @author T-107
 */
public class Imc {
    float peso;
    float altura;
      
    public Imc (float p, float a ){
        peso =p;
        altura =a;
    }
    public Imc(){
        peso=77f;
        altura=1.77f;
    }
    
    public Imc(float f){
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        //reasignamos
        b=(byte)i;
        l=i;
        s=(short)l;
        s=b;
        l=s;
        s=(short)l;
        s=(short)i;
        l=b;
    }
            
    

public float calcular(){
float resultadoImc=peso/(altura*altura);
if (resultadoImc<20){
    System.out.println(" Eres anorexico te moriras: ");
} 
if (resultadoImc>=20&&resultadoImc<=25){
    System.out.println(" Estas bien sano : ");
} 
if (resultadoImc>=25&&resultadoImc<=30){
    System.out.println(" Te pasate de tamales: ");
} 
if (resultadoImc>30){
    System.out.println(" eres un tinaco con patas: ");
} 
return resultadoImc;
}
}