public class task5 {
    public static void main(String[] args) {
        String nome = "Henrique da Costa Barboza";

        char[] charArray = nome.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        String reversa = new String(charArray);
        System.out.println("String original: " + nome);
        System.out.println("String invertida: " + reversa);
    }
}
