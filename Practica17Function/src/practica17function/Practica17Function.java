
package practica17function;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Practica17Function {
static Scanner keyboard = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("0.000" );

    
    public static void main(String[] args) {
        //Declaraciones input usuario
        int euroInt;
        String euroString;
        float euroFloat;
        char charInput;
        int numInt;
        String strInput;
        
        //Declaraciones resultado
        float resFloat;
        double resDouble;
        String resString;
        int resInt;
        char resChar;
        
        int option = -1;
        /*Declaramos y damos un valor diferente a 0 a la variable 'option' 
          para poder entrar en el WHILE*/
        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();

            switch (option) {//start of switch
                case 1:
                    System.out.println("How many euros you want?");
                    euroInt= keyboard.nextInt(); 
                    resFloat = function01(euroInt);
                    System.out.println(euroInt + "€ = " + resFloat + "$");
                    break;
                    
                case 2:
                    System.out.println("How many euros you want?");
                    euroInt= keyboard.nextInt();
                    resDouble = function02(euroInt);
                    System.out.println(euroInt + "€ = " + resDouble + "$");
                    break;
                    
                case 3:
                    System.out.println("How many euros you want?");
                    euroInt= keyboard.nextInt();
                    resString = function03(euroInt);
                    System.out.println(euroInt + "€ = " + resString + "$");
                    break;
                    
                case 4:
                    System.out.println("How many euros you want?");
                    euroString= keyboard.next();
                    resInt = function04(euroString);
                    System.out.println(euroString + "€ = " + resInt + "$");
                    break;
                    
                case 5:
                    System.out.println("How many euros you want?");
                    euroFloat= keyboard.nextFloat();
                    resInt = function05(euroFloat);
                    System.out.println(euroFloat + "€ = " + resInt + "$");
                    break;
                    
                case 6:
                    System.out.println("How many euros you want?");
                    euroFloat= keyboard.nextFloat();
                    resString = function06(euroFloat);
                    System.out.println(euroFloat + "€ = " + resString + "$");
                    break;
                    
                case 7:
                    System.out.println("Write a letter:");
                    charInput = (keyboard.next()).charAt(0);
                    process07(charInput);
                    break;
                    
                case 8:
                    System.out.println("Write a noun:");
                    strInput = keyboard.next();
                    resString = function08(strInput);
                    System.out.println(strInput + " = " + resString);
                    break;
                    
                case 9:
                    do{
                        System.out.println("Write a number between 0 and 255:");
                        numInt= keyboard.nextInt();
                        if(numInt>=0&&numInt<=255){
                            resChar = function09(numInt);
                            System.out.println(numInt + " = " + resChar);
                        }
                        else System.out.println("\n-The number is not inside the parameters\n Please try again\n");
                    }while(numInt<0||numInt>255);
                    break;
                    
                case 10:
                    process10();
                    break;
                    
                case 11:
                    double preu=100, tax=21, res;
                    res = functionMarc(preu, tax);//llamar a functionMarc
                    methodAitor(preu, tax, res) ;//llamar a procedimiento
                    System.out.println("");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nNo valid option");
            }//end of switch
        }//end of while
    }
    
    private static void userMenu() {
        /*System.out.println("Option 1: (int-Float)");
        System.out.println("Option 2: (int-double)");
        System.out.println("Option 3: (int-String)");
        System.out.println("Option 4: (String-int)");
        System.out.println("Option 5: (float-int)");
        System.out.println("Option 6: (float-String)");
        System.out.println("Option 7: (char[letra] - int:binari)");
        System.out.println("Option 8: (char[nombre] -binary)-");
        System.out.println("Option 9: (int[0-255] -char)");
        System.out.println("Option 10: (char[Tabla ASCII] - int[numerico:hexadecimal])");
        System.out.println("Option 11: (euro-dollar[$])");
        System.out.println("Option 0: (exit):");*/
        System.out.println("Chose an option between 1-11, 0 is for exit");

        System.out.println("\nPlease choose your option:");
    }
    
    //apartado1-function recibe en euro int, devuelve $ en float
    private static float function01(int euro){
        //declarar variable de return
        float result;
        result= euro/0.91f;
        return result;
    }
    
    private static double function02(int €uro){
        double res;
        res= €uro/0.91f;
        return res;
    }
    
    private static String function03(int euro) {
        String res;
        double resDouble;
        resDouble= euro/0.91f;
        res = String.valueOf (resDouble);
        return res;
    }

    private static int function04(String euro) {
        int res;
        float euroStringtoInt = Float.parseFloat(euro);
        res = (int) (euroStringtoInt/0.91f);
        return res;
    }

    private static int function05(float euro) {
        int res;
        res =  (int) (euro/0.91f);
        return res;
    }

    private static String function06(float euro) {
        String res;
        float resFloat= euro/0.91f;
        res = String.valueOf (resFloat);
        return res;
    }

    private static void process07(char letter) {
        int intLetter;
        String binLetter;
        intLetter= (int) letter;
        binLetter = Integer.toBinaryString(letter);
        System.out.println(letter + " = (int): " + intLetter + " (binary): " + binLetter);
    }

    private static String function08(String strInput) {
        String res = "";
        String x;
        for(int i=0; i<strInput.length(); i++){
            char letra= strInput.charAt(i);
            x = Integer.toBinaryString(letra);
            res+=x+" ";
        }
        return res;
    }
    
    private static String StringtoBinary(String str){
        String result = "";
        
        String letterBinary;
        char ch;
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            result += Integer.toBinaryString(ch) + " ";
        }
        return result;
    }

    private static char function09(int num) {
        char res;
        res=(char)num;
        return res;
    }

    private static void process10() {
        final int Ncol=4;
        int indexCol = 256/Ncol;
        for(int index=0; index<indexCol+1; index++){
            char columnChar1= (char)index;
            char columnChar2= (char)(index+indexCol+1);
            char columnChar3= (char)(index+indexCol*2+1);
            char columnChar4= (char)(index+indexCol*3+1);
            
            int columnInt1= (int) columnChar1;
            int columnInt2= (int) columnChar2;
            int columnInt3= (int) columnChar3;
            int columnInt4= (int) columnChar4;
            
            String columnHex1 = Integer.toHexString(columnChar1);
            String columnHex2 = Integer.toHexString(columnChar2);
            String columnHex3 = Integer.toHexString(columnChar3);
            String columnHex4 = Integer.toHexString(columnChar4);
            
            //este if es para que no me salgan numeros mas allá del 255 en la 4ª columna 
            if(index<63){
                System.out.print("\n(int)"+columnInt1+": (hex)"+columnHex1+": -> "+columnChar1);
                System.out.print("\t\t(int)"+columnInt2+": (hex)"+columnHex2+": -> "+columnChar2);
                System.out.print("\t\t(int)"+columnInt3+": (hex)"+columnHex3+": -> "+columnChar3);
                System.out.print("\t\t(int)"+columnInt4+": (hex)"+columnHex4+": -> "+columnChar4);
            }
            else{
                System.out.print("\n(int)"+columnInt1+": (hex)"+columnHex1+": -> "+columnChar1);
                System.out.print("\t\t(int)"+columnInt2+": (hex)"+columnHex2+": -> "+columnChar2);
                System.out.print("\t\t(int)"+columnInt3+": (hex)"+columnHex3+": -> "+columnChar3);
            }
        }
        System.out.println("\n");
    }
    
    //function CalculoPVP
    private static double functionMarc(double price, double iva){
        double PVP; // declarar la variable de return
        PVP= price + price*(iva/100);
        return PVP;
    }
    
    public static void methodAitor(double price, double iva, double res){
        String blue="\033[34m";
        String Purple="\033[35m";
        String yellow="\033[33m";
        System.out.println(blue + "Price: " + price);
        System.out.println(Purple + "Iva: " + iva);
        System.out.println(yellow +"Res: " + res);
    }
}
