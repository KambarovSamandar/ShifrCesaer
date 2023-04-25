//caeser

import java.util.Scanner;

public class Shifr {
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZhh";

    public static String encrypt(String plainText,int shiftKey)
    {

        plainText = plainText.toUpperCase();

        String cipherText= " ";

        for(int i=0; i<plainText.length(); i++)
        {

            int charPosition = ALPHABET.indexOf(plainText.charAt(i));

            int keyVal = (shiftKey + charPosition)% 26 ;

            char replaceVal = ALPHABET.charAt(keyVal);

            cipherText += replaceVal;
        }

        return cipherText;
    }

    public void Bara() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите что нибудь:");

        String message = new String();

        message = sc.next();

        System.out.println(encrypt(message,3));

        sc.close();

    }

}
