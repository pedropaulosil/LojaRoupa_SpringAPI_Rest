package entidades;

import entidades.Roupa;
import entidades.GerenciarRoupas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GerenciarRoupas {
    private final String url = "jdbc:mysql://localhost:3306/Loja";
    private final  String usuario = "root";
    private final String senha = "admin";

    //metodo para conectar o banco de dados
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);

    }
    public void CadastrarRoupa(Roupa roupa) {
        String sql = "INSERT INTO roupas (marca, quantidade, tipo, valor, tamanho)" + "VALUES(?,?,?,?,?,)";
        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, roupa.getMarca());
            stmt.setDouble(2, roupa.getQuantidade());
            stmt.setDouble(3, roupa.getValor());
            stmt.setString(4, roupa.getTamanho());
            stmt.setString(5, roupa.getTipo());

            stmt.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
    public void excluirPedido(int id) {
        String sql = "DELETE FROM roupas WHERE id = ?";
        PreparedStatement stmt = null;
        try {
            Connection conexao = conectar();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public void AlterarPedido(int id, String marca, int quantidade, double valor, int tamanho, String tipo) {
        String sql = "UPDATE roupas SET marca = ?, quantidade = ?, valor = ?, tipo = ?, tamanho = ? WHERE id = ?";

        try{
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, marca);
            stmt.setDouble(2, quantidade);
            stmt.setDouble(3, valor);
            stmt.setInt(4, tamanho);
            stmt.setString(5, tipo);
            stmt.setInt(6, id);

            stmt.executeUpdate();
            stmt.close();
            System.out.println("Alterado com sucesso!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}


