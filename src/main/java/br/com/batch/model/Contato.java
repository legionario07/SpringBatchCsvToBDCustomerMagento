package br.com.batch.model;

public class Contato {
	
	private String telefonePrincipal;
	private String telefoneSecundario;
	private String telefoneTerciario;
	private String email;
	private String responsavel;
	
	public Contato() {
		
	}
	
	public Contato(String telefonePrincipal, String telefoneSecundario, String telefoneTerciario, String email,
			String responsavel) {
		super();
		this.telefonePrincipal = telefonePrincipal;
		this.telefoneSecundario = telefoneSecundario;
		this.telefoneTerciario = telefoneTerciario;
		this.email = email;
		this.responsavel = responsavel;
	}

	public String getTelefonePrincipal() {
		return telefonePrincipal;
	}
	public void setTelefonePrincipal(String telefonePrincipal) {
		this.telefonePrincipal = telefonePrincipal;
	}
	public String getTelefoneSecundario() {
		return telefoneSecundario;
	}
	public void setTelefoneSecundario(String telefoneSecundario) {
		this.telefoneSecundario = telefoneSecundario;
	}
	public String getTelefoneTerciario() {
		return telefoneTerciario;
	}
	public void setTelefoneTerciario(String telefoneTerciario) {
		this.telefoneTerciario = telefoneTerciario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public String toString() {
		return "Contato [telefonePrincipal=" + telefonePrincipal + ", telefoneSecundario=" + telefoneSecundario
				+ ", telefoneTerciario=" + telefoneTerciario + ", email=" + email + ", responsavel=" + responsavel
				+ "]";
	}

}
