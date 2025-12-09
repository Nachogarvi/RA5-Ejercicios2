 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DAMDAW
 */
public class Concatena {

    public static void main(String[] args) {
        String a = "Buenos dias";
        String b = " adios";
        String valor = "Buenos días";

        valor = valor + " y hasta luego";
        valor += " y adiós";
        valor = valor.concat(" y hasta luego");
        System.out.println(valor);

        valor = new StringBuilder().append(valor).append(" y Adiós").toString();
        System.out.println(valor);
        
        a = a.concat(b);
        a = a + b;
        a += b;
        System.out.println(a);
    }
}
