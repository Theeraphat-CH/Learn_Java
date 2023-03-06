public class twoD_array_V2 {
    public static void main(String[] args) {
        String[][] syntax = {
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h", "i"}
        };

        for (int i = 0; i < syntax.length; i++) {
            for (int j = 0; j < syntax[i].length; j++) {
                System.out.print(syntax[i][j] + " ");
            }
            System.out.println();
        }
    }
}
