package Chap5_7;

public class Linux extends Os{
    protected  Button creButton(){
        Button button=new LinuxButton();
        return button;
    }
    protected  Text creText(){
        Text text=new LinuxText();
        return text;
    }
}