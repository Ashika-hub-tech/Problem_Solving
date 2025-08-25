package STRING;

    public class String_to_Array {
        public static void main(String[] args) {
            String s = "Ashika";

            // Convert string to char array
            char[] strtoarr = s.toCharArray();

            // Print each character
            for (char c : strtoarr) {
                System.out.println(c);
            }
        }
    }
