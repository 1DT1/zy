package chap5_5;

public class MysqlFactory implements DBFactory
{
    public Connection createConnection()
    {
        return new MysqlConnection();
    }
    public Statement createStatement()
    {
        return new MysqlStatement();
    }
}