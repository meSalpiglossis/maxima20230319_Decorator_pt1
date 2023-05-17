import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ZipReaderDecorator implements IFileReader {

    private IFileReader reader;

    public ZipReaderDecorator(IFileReader reader) {
        logDependencyAdding(reader, "constructor");
        this.reader = reader;
    }

    public void setReader(IFileReader reader) {
        logDependencyAdding(reader, "setReader");
        this.reader = reader;
    }

    @Override
    public boolean open(String fileName) throws IOException {
        System.out.println("+ZipReaderDecorator.open with parameter: " + fileName);

        ////TODO Possibly: with reader usage
        boolean isOk = true;
        if(reader != null) {
            isOk = reader.open(fileName);
        }
        //boolean isOk = reader.open(fileName);

        //TODO: Open file (ina default way)
        System.out.println("Just trying to open ZIP file: " + fileName);
        return isValidFileType(fileName) && !isPasswordRequired(fileName);
    }

    @Override
    public ByteArrayOutputStream read() throws IOException {
        System.out.println("+ZipReaderDecorator.read without parameters");
        //TODO: Implement additional behavior using reader

        ByteArrayOutputStream readerStream = null;
        if(reader != null) {
            readerStream = reader.read();
        } else {
            readerStream = new ByteArrayOutputStream();
        }

        //TODO: Read file (in a default way)
        System.out.println("Just trying to read ZIP file");
        return readerStream;
    }

    private void logDependencyAdding(IFileReader reader, String methodName) {
        String msg = "+ZipReaderDecorator " + methodName + " with parameter IFileReader: ";

        if(reader != null) {
            msg += reader;
        } else {
            msg += "null";
        }

        System.out.println(msg);
    }

    private boolean isValidFileType(String fileName) {
        System.out.println("-ZipReaderDecorator.isValidFileType with parameter: " + fileName);
        return true;
    }

    private boolean isPasswordRequired(String fileName) {
        System.out.println("-ZipReaderDecorator.isPasswordRequired with parameter: " + fileName);
        return false;
    }

    private ByteArrayOutputStream unZip(ByteArrayOutputStream stream) {
        System.out.println("-ZipReaderDecorator.unZip with parameter: " + stream);
        return stream;
    }
}
