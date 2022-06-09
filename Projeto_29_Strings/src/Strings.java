public class Strings {
    public static void main(String[] args) {
        String txt = "Ola Pessoal do IOS";
        String myStr1 = "Hello";
        String myStr2 = "Hello";

        char result = txt.charAt(0); // Caractere na posição zero
        System.out.println("Char na posição zero: " + result);
        result = txt.charAt(10); // Caractere na posição dez
        System.out.println("char na posição dez: " + result);

        // Compara strings
        System.out.println("Compara myStr1 com myStr2: " + myStr1.compareTo(myStr2)); // Returna 0
        System.out.println("Compara txt com myStr2: " + txt.compareTo(myStr2)); // Returna > 0
        System.out.println("Compara myStr1 com txt : " + myStr1.compareTo(txt)); // Returna < 0

        // Verifica o ínicio e o final de um string
        System.out.println("Verifica ínicio da string txt: " + txt.startsWith("Ola")); // Retorna true
        System.out.println("Verifica ínicio da string txt: " + txt.startsWith("O")); // Retorna true
        System.out.println("Verifica ínicio da string txt: " + txt.startsWith("o")); // Retorna false

        System.out.println("Verifica final da string txt: " + txt.endsWith("IOS" )); // Retorna true
        System.out.println("Verifica final da string txt: " + txt.endsWith("S" )); // Retorna true
        System.out.println("Verifica final da string txt: " + txt.endsWith("s" )); // Retorna false
    }
}
