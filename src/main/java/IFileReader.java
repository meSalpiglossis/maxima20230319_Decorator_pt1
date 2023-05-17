import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public interface IFileReader {
    ByteArrayOutputStream read(ByteArrayInputStream inputStream) throws IOException;

    boolean open(String fileName);
}
