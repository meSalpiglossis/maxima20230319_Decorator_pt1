import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class FileReaderDecorator implements IFileReader {

    private IFileReader reader;

    public FileReaderDecorator(IFileReader reader) {
        this.reader = reader;
    }

    public void setReader(IFileReader reader) {
        this.reader = reader;
    }

    @Override
    public ByteArrayOutputStream read(ByteArrayInputStream inputStream) throws IOException {
        ByteArrayOutputStream outputStream =  reader.read(inputStream);
        throw new IOException("Not supported yet.");
    }

    @Override
    public boolean open(String fileName) {
        return false;
    }
}
