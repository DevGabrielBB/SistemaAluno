package br.edu.unicid.model;

public class Aluno {
	private int RGM;
	private String NOME_ALUNO;
	private String DTA_NASCIMENTO;
	private String EMAIL;
	private String ENDERECO;
	private String MUNICIPIO;
	private String UF;
	private String TELEFONE;

	// construtor vazio
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	// construtor com campos
	public Aluno(int RGM, String NOME_ALUNO, String DTA_NASCIMENTO, String EMAIL, String ENDERECO, String MUNICIPIO, String UF, String TELEFONE) {
		this.RGM = RGM;
		this.NOME_ALUNO = NOME_ALUNO;
		this.DTA_NASCIMENTO = DTA_NASCIMENTO;
		this.EMAIL = EMAIL;
		this.ENDERECO = ENDERECO;
		this.MUNICIPIO = MUNICIPIO;
		this.UF = UF;
		this.TELEFONE = TELEFONE;
	}
	public int getRGM() {
		return RGM;
	}
	public void setRGM(int rGM) {
		RGM = rGM;
	}
	public String getNOME_ALUNO() {
		return NOME_ALUNO;
	}
	public void setNOME_ALUNO(String nOME_ALUNO) {
		NOME_ALUNO = nOME_ALUNO;
	}
	public String getDTA_NASCIMENTO() {
		return DTA_NASCIMENTO;
	}
	public void setDTA_NASCIMENTO(String dTA_NASCIMENTO) {
		DTA_NASCIMENTO = dTA_NASCIMENTO;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getENDERECO() {
		return ENDERECO;
	}
	public void setENDERECO(String eNDERECO) {
		ENDERECO = eNDERECO;
	}
	public String getMUNICIPIO() {
		return MUNICIPIO;
	}
	public void setMUNICIPIO(String mUNICIPIO) {
		MUNICIPIO = mUNICIPIO;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	public String getTELEFONE() {
		return TELEFONE;
	}
	public void setTELEFONE(String tELEFONE) {
		TELEFONE = tELEFONE;
	}
	
}
