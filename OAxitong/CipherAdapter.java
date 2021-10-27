package OAxitong;

public class CipherAdapter extends DataOperation {
    private Caesar cipher;
    public CipherAdapter() {
        cipher=new Caesar();
    }
    public String doEncrypt(String ps) {
        return cipher.doEncrypt(ps);
    }
}