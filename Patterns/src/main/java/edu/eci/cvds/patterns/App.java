package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        if(args.length == 0){
            System.out.println("Hello world!");
        }
        else{
            System.out.println("Hello " + args.toString().replace("[", "").replace("]", "").replace(",", " ") + "!");
        }
    }
}
