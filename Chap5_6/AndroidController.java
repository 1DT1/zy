package Chap5_6;

public class AndroidController implements GameController {

    public IOperationController OperationController() {
        return new AndroidOperationController();
    }

    public Controller InterfaceController() {
        return new AndroidInterfaceController();
    }
}
