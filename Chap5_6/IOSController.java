package Chap5_6;

public class IOSController implements GameController {
    @Override
    public IOperationController OperationController() {
        return new IOSOperationController();
    }
    @Override
    public Controller InterfaceController() {
        return new IOSInterfaceController();
    }
}

