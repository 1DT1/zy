package Chap5_7;

public class Test {
    public static void main(String[] args) {
        Os os=(Os) XmlUtil.getBean();
        Button button=os.creButton();
        Text text=os.creText();
        text.getInfo();
        button.getInfo();

    }
}
