package findWord;
public class Main {
    public static void main(String[] args) {
        System.out.println(findWordPosition("Hello", "lo"));
    }

    private static int findWordPosition(String source, String target) {

        return source.indexOf(target);
    }
}