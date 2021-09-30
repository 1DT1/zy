package nvwazaoren;

public class nvwa {
    public static people getpeople(String x){
        people People=null;
        if(x.equalsIgnoreCase("M")){
            People=new man();
        }else if(x.equalsIgnoreCase("W")) {
            People = new woman();
        }
        else if(x.equalsIgnoreCase("R")) {
            People = new robot();
        }
        return People;
    }
}
