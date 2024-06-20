import java.sql.*;

public class Main {
    private static final String URL = "jdbc:sqlite:C:\\Users\\Pichau\\Documents\\Proz\\Java\\Aula4\\banco.db";
    private Connection connection;

    public static void main(String[] args) {
        Clientes gerenciador = new Clientes();
        gerenciador.connect();
        gerenciador.createTable();
        gerenciador.deleteClient(1);
        gerenciador.insertClient("Maria");
        gerenciador.insertClient("Ana");

    }
}

