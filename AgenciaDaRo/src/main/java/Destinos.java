import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Destinos {
	public Destinos() throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("====================== Destinos da RO ;D =====================");
		System.out.println("==============================================================");
		System.out.println("{1} Atualizar destino {1}");
		System.out.println("{2} Listar destinos {2}");
		System.out.println("{3} Cadastrar destino {3}");
		System.out.println("{4} Localizar um destino {4}");
		System.out.println("{5} Excluir um destino {5}");
		System.out.println("============================================================");
		int valor = 0;
		valor = entrada.nextInt();
		switch (valor) {
		
		case 5:
			System.out.println("ID do destino");
			valor = entrada.nextInt();
			deleteDestino(valor);
			valor = 0;
			break;
		
		case 4: 
			System.out.println("ID do destino");
			valor = entrada.nextInt();
			getDestino(valor);
			valor = 0;
			break;
		case 3:
			System.out.print("Nome do destino :");
			entrada.nextLine();
			String nome = entrada.nextLine();
			System.out.print("Descrição do destino: ");
			String descricao = entrada.nextLine();
			System.out.print("Digite o valor : R$");
			float preco = entrada.nextInt();
			setdestinos(nome, descricao, preco);
			nome = "";
			descricao = "";
			break;
		case 2:
			getdestinos();
			break;
		case 1:
			System.out.println("Qual ID do destino?");
			int id = entrada.nextInt();
			update(id);
			break;
		
		}
		
	}

	public static void setdestinos(String nome,String descricao, Float valor) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/agenciaro";
		Connection conn = DriverManager.getConnection(url, "root", "{Digite a senha do banco}");
		try {
			PreparedStatement ps = conn.prepareStatement("insert into destinos values(default, ?, ?, ?);");
			ps.setString(1, nome);
			ps.setString(2, descricao);
			ps.setFloat(3, valor);
			ps.execute();
		} catch (SQLException e) {
			System.out.println("Falha ao conectar com banco de dados. " + e);
		} finally {
			System.out.println("Destino cadastrado com sucesso!");
			conn.close();
		}
	}

	private static void getdestinos() throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/agenciaro";
		Connection conn = DriverManager.getConnection(url, "root", "{Digite a senha do banco}");

		try {
			Statement ps = conn.createStatement();
			ResultSet ex = ps.executeQuery("SELECT * FROM agenciaro.destinos");
			while (ex.next()) {
				System.out.println("Id: " + ex.getInt("idDestino") + " Nome: " + ex.getString("nome"));
			}
		} catch (SQLException e) {
			System.out.println("Falha ao conectar com banco de dados. " + e);
		} finally {
			System.out.println("Busca finalizada!");
			conn.close();
		}
	}
	private static void getDestino(int id) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/agenciaro";
		Connection conn = DriverManager.getConnection(url, "root", "{Digite a senha do banco}");

		try {
			Statement ps = conn.createStatement();
			ResultSet ex = ps.executeQuery("SELECT * FROM agenciaro.destinos where idDestino =" + id);
			while (ex.next()) {
				System.out.println("Id: " + ex.getInt("idDestino") + " Nome: " + ex.getString("nome"));
			}
		} catch (SQLException e) {
			System.out.println("Falha ao conectar com banco de dados. " + e);
		} finally {
			System.out.println("Busca finalizada!");
			conn.close();
		}
	}
	private static void update(int id) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/agenciaro";
		Connection conn = DriverManager.getConnection(url, "root", "{Digite a senha do banco}");
		getDestino(id);
		System.out.println("Para continuar aperte enter...");
		Scanner entrada = new Scanner(System.in);
		entrada.nextLine();
		
		System.out.print("Novo destino :");
		String nome = entrada.nextLine();
		System.out.print("Descrição do novo destino : :");
		String descricao = entrada.nextLine();
		System.out.print("Quanto vai custar? R$");
		String valor = entrada.nextLine();
		
		try {
			PreparedStatement ps = conn.prepareStatement("update destinos set nome = ?, descricao = ?, valor = ? where idDestino = ?;");
			ps.setString(1, nome);
			ps.setString(2, descricao);
			ps.setString(3, valor);
			ps.setInt(4, id);
			ps.execute();
		} catch (SQLException e) {
			System.out.println("Falha ao conectar com banco de dados. " + e);
		} finally {
			System.out.println("Alterações realizadas com sucesso");
			conn.close();
		}
	}

	private static void deleteDestino(int id) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/agenciaro";
		Connection conn = DriverManager.getConnection(url, "root", "{Digite a senha do banco}");

		try {
			Statement ps = conn.createStatement();
			PreparedStatement preparedStatement = conn.prepareStatement("delete from destinos where idDestino = ?");
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Falha ao conectar com banco de dados. " + e);
		} finally {
			System.out.println("Registro deletado com sucesso!");
			conn.close();
		}
	}
}
