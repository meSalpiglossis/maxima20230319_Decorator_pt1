public class Main {
    public static void main(String[] args) {

        IFileReader newDefaultReader = new TxtReader();
        newDefaultReader.open("OpenMe.txt");

    }
}
