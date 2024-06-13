package br.edu.unicid.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import br.edu.unicid.model.Aluno;
import br.edu.unicid.util.ConnectionFactory;

public class AlunoDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs; 
	private Aluno aluno;

	public AlunoDAO() throws Exception {
		// chama a classe ConnectionFactory e estabele uma conexão
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("erro: \n" + e.getMessage());
		}
	}

	// método de salvar

	public void salvar(Aluno aluno) throws Exception {
		if (aluno == null)
			throw new Exception("O valor passado nao pode ser nulo");
		try {
			String SQL = "INSERT INTO "
					+ "aluno (rgm, "
					+ "nome, email, "
					+ "dtaNascimento, "
					+ "idade,endereco) "
					+ "values (?, ?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, aluno.getRGM());
			ps.setString(2, aluno.getNOME_ALUNO());
			ps.setString(3, aluno.getDTA_NASCIMENTO());
			ps.setString(4, aluno.getEMAIL());
			ps.setString(5, aluno.getENDERECO());
			ps.setString(6, aluno.getMUNICIPIO());
			ps.setString(7, aluno.getUF());
			ps.setString(8, aluno.getTELEFONE());
			ps.executeUpdate();
		} catch (SQLException sqle) {
			throw new Exception("Erro ao inserir dados " + sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}

	// método de atualizar

	public void atualizar(Aluno aluno) throws Exception {
		if (aluno == null)
			throw new Exception("O valor passado nao pode ser nulo");
		try {
			String SQL = "UPDATE aluno set NOME_ALUNO=?, "
					+ "DTA_NASCIMENTO=?, EMAIL=?, "
					+ "ENDERECO=?, MUNICIPIO=?, UF=?, TELEFONE=? "
					+ "WHERE RGM = ?";
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, aluno.getRGM());
			ps.setString(2, aluno.getNOME_ALUNO());
			ps.setString(3, aluno.getDTA_NASCIMENTO());
			ps.setString(4, aluno.getEMAIL());
			ps.setString(5, aluno.getENDERECO());
			ps.setString(6, aluno.getMUNICIPIO());
			ps.setString(7, aluno.getUF());
			ps.setString(8, aluno.getTELEFONE());
			ps.executeUpdate();
		} catch (SQLException sqle) {
			throw new Exception("Erro ao alterar dados " + sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}

	// método de excluir

	public void excluir(Aluno aluno) throws Exception {
		if (aluno == null)
			throw new Exception("O valor passado nao pode ser nulo");
		try {
			String SQL = "DELETE FROM aluno"
					+ " WHERE RGM = ?";
			conn = this.conn;
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, aluno.getRGM());
			ps.executeUpdate();
		} catch (SQLException sqle) {
			throw new Exception("Erro ao excluir dados " + sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}

	// Procurar Aluno

	public Aluno procurarAluno(int RGM) throws Exception {

		try {
			String SQL = "SELECT  * FROM aluno WHERE RGM=?";
			conn = this.conn;
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, RGM);			
			rs = ps.executeQuery();
			if (rs.next()) {
				int rgm = rs.getInt(1);
				String nome = rs.getString(2);
				String dtanascimento = rs.getString(3);
				String email = rs.getString(4);
				String endereco = rs.getString(5);
				String municipio = rs.getString(6);
				String uf = rs.getString(7);
				String telefone = rs.getString(8);
				aluno = new Aluno(rgm, nome, dtanascimento, email, endereco, municipio, uf, telefone);
			}
			return aluno;
		} catch (SQLException sqle) {
			throw new Exception(sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps, rs);
		}
	}
// Listar todos os alunos

	public List todosAlunos() throws Exception {
		try {
			conn = this.conn;
			ps = conn.prepareStatement("SELECT * FROM Aluno");
			rs = ps.executeQuery();
			List<Aluno> list = new ArrayList<Aluno>();
			while (rs.next()) {
				int rgm = rs.getInt(1);
				String nome = rs.getString(2);
				String dtanascimento = rs.getString(3);
				String email = rs.getString(4);
				String endereco = rs.getString(5);
				String municipio = rs.getString(6);
				String uf = rs.getString(7);
				String telefone = rs.getString(8);
				list.add(new Aluno(rgm, nome, dtanascimento, email, endereco, municipio, uf, telefone));
			}
			return list;
		} catch (SQLException sqle) {
			throw new Exception(sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps, rs);
		}
	}
}


