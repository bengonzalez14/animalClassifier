/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubvertibrates;
import java.util.Scanner;
/**
 *
 * @author ben-g
 */
public class GithubVertibrates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Keyboard = new Scanner(System.in);
        boolean Warm, Feathers, Gills, Water;
        char Answer;
        
        System.out.println("Animal Classes - is it warm blooded?  Y/N");
        Answer = Keyboard.findWithinHorizon(".", 0).charAt(0);
        //Warm = Answer == 'Y';
        //Warm = Keyboard == 'Y';
                
        
        
        if (Answer=='Y'){
            System.out.println("Does it have feathers?  Y/N");
             Answer = Keyboard.findWithinHorizon(".", 0).charAt(0);
             
             if (Answer=='Y'){
                 System.out.println("It's a bird");
             }
                 else {
                         System.out.println("it's a mammal");
                         }
             }
            
            
        
        
        else{
            System.out.println("Does it live in water?  Y/N");
             Answer = Keyboard.findWithinHorizon(".", 0).charAt(0);
             
             if (Answer=='N'){
                 System.out.println("It's a reptile");
             }
             
             else {
                 System.out.println("Does it have gills?   Y/N");
                 Answer = Keyboard.findWithinHorizon(".", 0).charAt(0);
                 
                 if (Answer=='Y'){
                     System.out.println("It's a fish");
                 }
                 else {System.out.println("it's an amphibian");
                 }
             }
             
             }
        }
         
        
        
    }
    

