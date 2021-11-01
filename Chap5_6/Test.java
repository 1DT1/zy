package Chap5_6;

public class Test {
    public static void main(String[] args) {
       GameController  gj19GameController;
        Controller gj19IInterfaceController;
        IOperationController gj19IOperationController;
        gj19GameController = new AndroidController();
        gj19IInterfaceController = gj19GameController.InterfaceController();
        gj19IOperationController = gj19GameController.OperationController();
        gj19IInterfaceController.Interface();
        gj19IOperationController.Operator();
    }
}
