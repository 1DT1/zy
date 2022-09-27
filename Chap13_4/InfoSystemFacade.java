package Chap13_4;


public class InfoSystemFacade extends AbstractFacade{
    private FileReader fileReader;
    private DataConversion dataConversion;
    private DataAnalysis dataAnalysis;
    private DataDisplay dataDisplay;
    public InfoSystemFacade(){
        fileReader=new FileReader();
        dataConversion=new DataConversion();
        dataAnalysis=new DataAnalysis();
        dataDisplay=new DataDisplay();
    }

    public void statisticalAnalysis(){
        fileReader.readFile();
        dataConversion.convertData();
        dataAnalysis.analysisData();
        dataDisplay.displayData();
    }
}
