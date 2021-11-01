package Chap5_7;

public class Unix extends Os{
    protected  Button creButton(){
        Button button=new UnixButton();
        return button;
    }
    protected  Text creText(){
        Text text=new UnixText();
        return text;
    }
}
