package com.mycompany.decodificadoradn_prueba;

import java.util.Scanner;

/**
 *
 * @author joshua
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String ADN_1 = "";
        String ADN_2 = "";
        
        System.out.println("Escribe la Primer Secuencia de ADN: ");
        ADN_1 = entrada.nextLine();
        System.out.println("Escribe la Segunda Secuencia de ADN: ");
        ADN_2 = entrada.nextLine();
        
        DecodificadorADN decodificadorADN = new DecodificadorADN();
        ResultadoADN resultadoADN = new ResultadoADN();
        resultadoADN.resultadoSecuencia(decodificadorADN.decodificador(ADN_1, ADN_2));
    }
    
}
