package chap5_5;

public interface DBFactory {
    public Connection createConnection();
    public Statement createStatement();
}
