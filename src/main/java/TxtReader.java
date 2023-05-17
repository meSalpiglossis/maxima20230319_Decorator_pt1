import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TxtReader implements IFileReader {

    @Override
    public ByteArrayOutputStream read(ByteArrayInputStream inputStream) throws IOException {
        throw new IOException("Not supported yet.");
    }

    @Override
    public boolean open(String fileName) {
        return false;
    }
}
