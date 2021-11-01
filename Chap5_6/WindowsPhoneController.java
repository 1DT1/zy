package Chap5_6;

public class WindowsPhoneController implements GameController {
    // WindowsPhone游戏操作控制
    @Override
    public IOperationController OperationController() {
        return new WindowsPhoneOperationController();
    }
    // WindowsPhone游戏界面控制
    @Override
    public Controller InterfaceController() {
        return new WindowsPhoneInterfaceController();
    }
}
