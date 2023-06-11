
package TugasNo1;

public class Tugas1 {

    public static void main(String[] args) {
        String input = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";

        // Memanggil method untuk memproses input dan menghasilkan output
        String output1 = getFirstSentence(input);
        String output2 = getLowerCaseSentence(input);
        String output3 = getUpperCaseSentence(input);
        String output4 = getMiddleWord(input);
        String output5 = getEndWords(input);
        
        // Menampilkan output
        System.out.println("String awal");
        System.out.println(input);
        System.out.println( );
        System.out.println("Tampilkan Ke layar");
        System.out.println( );
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);
    }

    public static String getFirstSentence(String input) {
        String[] words = input.split(" ");
        return words[0] + " " + words[1] + " " + words[2] + " " + words[3];
    }
    
    public static String getLowerCaseSentence(String input) {
        String[] words = input.split(" ");
        String word = words[0] + " " + words[1] + " " + words[2] + " " + words[3];
        return word.toLowerCase();
    }
    public static String getUpperCaseSentence(String input) {
        String[] words = input.split(" ");
        String word = words[0] + " " + words[1] + " " + words[2] + " " + words[3];
        return word.toUpperCase();
    }
    
    public static String getMiddleWord(String input) {
        String[] words = input.split(" ");
        return words[3];
    }
    
    public static String getEndWords(String input) {
        String[] words = input.split(" ");
        StringBuilder lastWords = new StringBuilder();
        
        for (int i = 4; i < words.length; i++) {
            lastWords.append(words[i]);
            if (i < words.length - 1) {
                lastWords.append(" ");
            }
        }
        
        return lastWords.toString();
    }
}

