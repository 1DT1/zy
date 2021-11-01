package tupiangeshi;

public class GifReaderFactory implements ReaderFactory {
    public Reader createReader() {
        return new GifReader();
    }
}
