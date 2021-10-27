package OAxitong;

public class NewCipherAdapter extends DataOperation {
    private NewCipher cipher;
    public NewCipherAdapter() {
        cipher=new NewCipher();
    }
    public String doEncrypt(String ps) {
        return cipher.doEncrypt(ps);
    }
}
