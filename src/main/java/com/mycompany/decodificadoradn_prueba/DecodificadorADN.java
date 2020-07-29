package com.mycompany.decodificadoradn_prueba;

/**
 *
 * @author joshua
 */
public class DecodificadorADN {
    
    public DecodificadorADN(){
        
    }
    
    public String decodificador(String adn1, String adn2){
        String secuencia = "";
        //Con el ciclo for examinamos de derecha a izquierda la secuencia de ADN ADN_1
        for (int i = adn1.length(); i >= 0 ; i--) {
            //Con este siguiente ciclo for se examina de izquierda a derecha la secuencia de ADN ADN_2
            for (int j = 0; j < i; j++) {
                /*Con esta sentencia examinamos con el tamaño del nombre de ADN_1, cada vez  
                que esto se haga, se compara el caracter que se examina en cada for con lo
                que se ingresa en ADN_2. Entonces se tomaran los caracteres que se repiten
                en secuencia entre las dos palabras*/
                if(adn2.contains(adn1.substring(j, i)) && secuencia.length() < adn1.substring(j, i).length()){
                    //La secuencia que se extrae entre lo que se ingreso en ADN_1 Y ADN_2 se guarda en "secuencia"
                    secuencia = adn1.substring(j, i);
                }
            }
        }
        return secuencia;
    }
}
