/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author aluno
 */
public class ImbecilException extends Exception 
{

    private int codigoErro;
    
    public ImbecilException(int cod)
    {
        this.codigoErro = cod;
    }
    
    @Override
    public String getMessage() 
    {
        switch(this.codigoErro)
        {
            case 0 : return "não é posível dividir por zero, idiota";
            
            default : return "eu não tenho ideia do que aconteceu";
        }
    }
   
}
