import java.util.ArrayList;
import java.util.Arrays;
import  java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;


public class ExpresionesRegulares {
    public static void main(String [] args){
                Scanner sc = new Scanner(System.in);


                String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
                Pattern emailPattern = Pattern.compile(emailRegex);


                String telefonoRegex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
                Pattern telefonoPattern = Pattern.compile(telefonoRegex);


                String fechaRegex = "^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/\\d{4}$";
                Pattern fechaPattern = Pattern.compile(fechaRegex);







                String texto = "correo@example.com";
                Matcher emailMatcher = emailPattern.matcher(texto);

                //Ejemplo validar email
                if (emailMatcher.find()) {
                    System.out.println("La dirección de correo electrónico es válida.");
                } else {
                    System.out.println("La dirección de correo electrónico no es válida.");
                }

                //Ejemplo validar teléfono
                texto = "(123) 456-7890";
                Matcher telefonoMatcher = telefonoPattern.matcher(texto);
                if (telefonoMatcher.find()) {
                    System.out.println("El número de teléfono es válido.");
                } else {
                    System.out.println("El número de teléfono no es válido.");
                }


                //Ejemplo validar fecha
                texto = "12/31/2023";
                Matcher fechaMatcher = fechaPattern.matcher(texto);
                if (fechaMatcher.find()) {
                    System.out.println("La fecha es válida.");
                } else {
                    System.out.println("La fecha no es válida.");
                }


                //Ejemplo validar Array
        /*
        String contieneAbc = "[a-zA-Z0-9._-]*abc[a-zA-Z0-9._-]*";
                ArrayList<String> listAbc = new ArrayList<String>();
                int cant = 0;
                String entry;
                while (cant < 4){
                    System.out.println("Ingrese una palabra con abc");
                    entry = sc.nextLine();
                    if (entry.matches(contieneAbc)){
                        listAbc.add(entry);
                        cant +=1;
                    }else{
                        System.out.println("Inválido");
                    }
                }
                System.out.println(listAbc);

         */



                //   Ejercicios   //
                //String sin terminar en dígito
                String noFinalDigit = "\\D$";
                Pattern noFDigitPattern = Pattern.compile(noFinalDigit);

                String word = "termino bien";
                String word2 = "termino 3";
                Matcher finalDigitMatcher = noFDigitPattern.matcher(word);


                if (finalDigitMatcher.find()){
                    System.out.println("El String no termina en Dígito");
                }else{
                    System.out.println("El String termina en dígito");
                }

                //Ejercicio no empieza con un dígito
                String noInicialDigit = "^\\D";
                String palabra = "2maraca";

                if (palabra.matches(noInicialDigit)){
                    System.out.println("La palabra no empieza con un dígito");
                }else{
                    System.out.println("La palabra empieza con un dígito");
                }

                //Ejercicio String  formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10

                String word5Min = "^[a-zA-Z]{5,10}$";
                String palabra2 = "Manzana";

                if(palabra2.matches(word5Min)){
                    System.out.println("si");
                }

                //Ejercicio validar DNI
                String validDni =  "^\\d{2}-\\d{3}-\\d{3}$";
                String dni = "94-219-667";

        System.out.println(dni.matches(validDni));

        //Ejercicio validar mail
        ArrayList<String> emails = new ArrayList<String>();
        ArrayList<String> mail = new ArrayList<>(Arrays.asList("lol@gmail.com", "@.com", "mail@gmail")); ;

        for (int i = 0; i < mail.size(); i++){
            if (verifyMail(mail.get(i))) {
                emails.add(mail.get(i));
            }
        }
        System.out.println(emails);




    }
    public static boolean verifyMail(String mail) {
        String validEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return mail.matches(validEmail);
    }
}
