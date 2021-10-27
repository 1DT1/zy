package OAxitong;

public class text {
    public static void main(String[] args) {
        String s1 = "123456";
        String s2 = "";
        DataOperation data = null;
        data = new CipherAdapter();
        s2 = data.doEncrypt(s1);
        System.out.println(s2);
        data = new NewCipherAdapter();
        s2 = data.doEncrypt(s1);
        System.out.println(s2);
    }
}
