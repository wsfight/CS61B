public class hw0a {
    public static void main(String[] args) {
        String line = "";
        for(int i = 0;i < 5;i++){

            for(int j = 0;j < i + 1;j++){
                line += "*";

            }
            line += "\n";
        }
        System.out.println(line);
    }
}
