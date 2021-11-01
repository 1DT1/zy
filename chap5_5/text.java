package chap5_5;

public class text {
   public static void main(String[] args)
        {
            DBFactory factory;
            Connection connection;
            Statement statement;
            factory = new OracleFactory();
            connection = factory.createConnection();
            statement = factory.createStatement();
            connection.connect();
            statement.executeStatement();
        }
    }

