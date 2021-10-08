package huitugongju;

public class factory {
    public static final String CIRCLE="circle";
    public static final String RECTSNGLE="rectsngle";
    public static final String TRIANGLE="triangle";
    public static shape getshape(String type) throws UnsupportedShapeException{
        shape Shape;
        switch(type){
            case CIRCLE:
                Shape=new circle();
                break;
                case RECTSNGLE:
                    Shape=new rectsngle();
                    break;
                case TRIANGLE:
                    Shape=new triangle();
                    break;
                default :
                    throw new UnsupportedShapeException("不支持该类型");
            }
            return Shape;
    }
}


