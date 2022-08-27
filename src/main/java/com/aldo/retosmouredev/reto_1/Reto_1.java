/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldo.retosmouredev.reto_1;

/**
 *
 * @author aldai
 */
public class Reto_1 {
    
    public String Metodo_reto_1(){
        String var = "";
        
        for(int i = 1;i<=100;i++){
            if((i%3==0) && (i%5==0)){
                var = var + "fizz buzz,";
            }else if(i%5==0){
                var = var + "buzz, ";
            }else if(i%3==0){
                var = var + "fizz, ";
            }else{
                String numero = i+", ";
                var = var + numero;
            }
        }
        return var;
    }
    
    
}
