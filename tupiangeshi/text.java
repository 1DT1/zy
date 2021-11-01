package tupiangeshi;

public class text {
    public static void main(String[] args) {
        ReaderFactory readerFactory;
        Reader reader;
        readerFactory = new GifReaderFactory();
        reader = readerFactory.createReader();
        reader.readPic();
        readerFactory = new JpgReaderFactory();
        reader = readerFactory.createReader();
        reader.readPic();
    }
}
