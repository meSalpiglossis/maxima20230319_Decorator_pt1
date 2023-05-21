import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        final String DIVIDER = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

        try {
            IFileReader additionalReaderFeature = null;
            IFileReader simpleTXTReader = new FileReaderDecorator(additionalReaderFeature);
            simpleTXTReader.open("Simple.txt");
            ByteArrayOutputStream readerSrtream = simpleTXTReader.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(DIVIDER);

        try {
            IFileReader additionalReaderFeature = new ZipReaderDecorator(null);
            IFileReader unZipTxtReader = new FileReaderDecorator(additionalReaderFeature);
            unZipTxtReader.open("Zipped.txt");
            ByteArrayOutputStream readerSrtream = unZipTxtReader.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
