
/**
 * Values Class. Si un numero es negativo, cero o positivo.
 *
 * @author Chávez Sánchez Kevin Edilberto
 * @version 2019 11 29 
 */
public class Values
{
    // instance variables
    
    /**
     * Constructor for objects of class Values
     */
    public Values()
    {
        // initialise instance variables
        
    }

    /**
     * Te dice si un numero es negativo, positivo o cero
     *
     * @param  y  entero
     * @return    negativo, positivo o cero
     */
    public String value(int y)
    {
        // put your code here
        if(y > 0){
            System.out.println("Positivo");
            return "";
        }else if(y == 0){
            System.out.println("Es cero");
            return "";
        }else{  
            System.out.println("Negativo");
            return "";
        }
        
    }
}
