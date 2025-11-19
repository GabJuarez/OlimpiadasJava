public class Main {
    public static void main(String[] args) {
        String miCadena = "hola que nota"; // debe retornar 6
        System.out.println(countVowels(miCadena));
    }
    /*

     */
    public static int countVowels(String text) {
        // arreglo de vocales (ubicar memoria al inicio)
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U','á','é','í','ó','ú','Á','É','Í','Ó','Ú'};
        // compile error retornaba cannot find symbol

        // variable contador
        int count = 0;
        
        /*
            bucle externo itera a través de la cadena
            por cada elemento de la cadena, chequeamos nuestro
            arreglo de carácteres de vocales
        */
        for(int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                
                /*  si la letra actual de la cadena es una vocal,
                    incrementar el count.
                */
                if(text.charAt(i) == vowels[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
