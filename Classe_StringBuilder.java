package classe_stringbuilder;

public class Classe_StringBuilder {

    public static void main(String[] args) {

        StringBuilder string1 = new StringBuilder("Bóson Treinamento.");
        System.out.printf("string1 = %s%n", string1.toString());
        System.out.printf("string2 = %d%n", string1.capacity());
        System.out.printf("string3 = %d%n", string1.length());
        string1.setLength(15);
        System.out.printf("Novo comprimento: %d%n", string1.length());
        System.out.printf("string1 = %s%n", string1.toString());
        
        
        
        System.out.println();
    }
}