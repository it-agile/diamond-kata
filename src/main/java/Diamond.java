public class Diamond {

    public static void main(String[] args) {
        new Diamond().print('F');
    }

    private void print(char letter) {
        print(letter, System.out::println);
    }

    public void print(char letter, Writer writer) {
        writer.print("A");
    }

    public interface Writer {
        void print(String str);
    }
}
