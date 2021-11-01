package tupiangeshi;

public class JpgReaderFactory implements ReaderFactory {
    @Override
    public Reader createReader() {
        //初始化读取器的细节
        return new JpgReader();
    }
}
