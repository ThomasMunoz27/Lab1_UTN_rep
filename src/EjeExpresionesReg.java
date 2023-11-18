import java.util.regex.Matcher;
import java.util.Scanner;
public class EjeExpresionesReg {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1
        String patronNum = "\\d[0-9]{7,10}";
        String numTel = "2616978762";
        if (numTel.matches(patronNum)){
            System.out.println("El número es válido");
        }else {
            System.out.println("EL número es inválido");
        }


        //Ejercicio 2
        String patronCuil = "[0-9]{11}";
        String cuil = "23942196679";
        if (cuil.matches(patronCuil)){
            System.out.println("Número de cuil válido");
        }else {
            System.out.println("Número de cuil inválido");
        }

        //ejercicio 3
        System.out.println("Ingrese un mail: ");
        String mail = sc.nextLine();
        String patronMail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if(mail.matches(patronMail)){
            System.out.println("Mail valido");
        }else{
            System.out.println("Mail invalido");
        }


        //Ejercicio 4
        String patronNomencl = "^[0-9]{21}$";
        String numNot21 = "12345";
        if (numNot21.matches(patronNomencl)){
            System.out.println("La nomeclatura es válida");
        }else {
            System.out.println("La nomenclatura es inválida");
        }


        //Ejercicio 5


        //Ejercicio 6
        String userNum, userCuil, userMail;
        boolean correcto = false;
        while (!correcto){
            System.out.println("Ingrese su número de telefono: ");
            userNum = sc.nextLine();
            if (userNum.matches(patronNum)){
                correcto = true;
            }else {
                System.out.println("Número de teléfono inválido.\nIngreselo nuevamente.");
            }
        }
        correcto = false;
        while (!correcto){
            System.out.println("Ingrese su cuil: ");
            userCuil = sc.nextLine();
            if (userCuil.matches(patronCuil)){
                correcto = true;
            }else {
                System.out.println("Número de CUIL inválido.\nIngreselo nuevamente.");
            }
        }
        correcto = false;

        while (!correcto){
            System.out.println("Ingrese su mail: ");
            userMail = sc.nextLine();
            if (userMail.matches(patronMail)){
                correcto = true;
            }else {
                System.out.println("Mail inválido.\nIngreselo nuevamente.");
            }
        }

        System.out.println("Ingreso de datos exitoso");
    //Ejercicio 7
        System.out.println("Ingrese varios mail y separalos con coma: ");
        String mails = sc.nextLine();
        String[] mailsList = mails.split(",");


        for(String email : mailsList){
            if(email.matches(patronMail)){
                System.out.println(email + " Mail valido");
            }else{
                System.out.println(email + " Mail invalido");
            }
        }

        //Ejercicio
    }
}
