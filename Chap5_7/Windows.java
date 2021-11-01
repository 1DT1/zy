package Chap5_7;

public class Windows extends Os{
    protected  Button creButton(){
        Button button=new WindowsButton();
        return button;
    }
    protected  Text creText(){
        Text text=new WindowsText();
        return text;
    }
}
