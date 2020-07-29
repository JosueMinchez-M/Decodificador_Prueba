package com.mycompany.decodificadoradn_prueba;

/**
 *
 * @author joshua
 */
public class ResultadoADN {

    public ResultadoADN() {
        
    }
    
    public void resultadoSecuencia(String secuencia){
        //Se muestra en pantalla la palabra encontrada o en su defecto un aviso de que no se ha encontrado
        if(secuencia != ""){
            System.out.println("\n");
            System.out.println("El conjunto ordenado de bases adyacentes de mayor tamaño es: " + secuencia);
        }else{
            System.out.println("\n");
            System.out.println("+++|NO SE ENCONTRARON COINCIDENCIAS|+++");
        }
    }
    
}
