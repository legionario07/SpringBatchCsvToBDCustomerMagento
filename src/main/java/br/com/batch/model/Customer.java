package br.com.batch.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Customer {

	private Integer entityId;
	private String cnpj;
	private String nomeFantasia;
	private String razaoSocial;
	private String categoria;
	private List<Endereco> enderecos;
	private Contato contato;
	
	private Map<String, String> data;
	
	public Customer(List<Endereco> enderecos, Contato contato) {
		super();
		this.enderecos = enderecos;
		this.contato = contato;
	}

	public Customer(String cnpj, String nomeFantasia, String razaoSocial, String categoria, List<Endereco> enderecos,
			Contato contato) {
		super();
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.categoria = categoria;
		this.enderecos = enderecos;
		this.contato = contato;
	}

	public Customer() {
		data = new HashMap<>();
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Customer [cnpj=" + cnpj + ", nomeFantasia=" + nomeFantasia + ", razaoSocial=" + razaoSocial
				+ ", categoria=" + categoria + ", enderecos=" + enderecos + ", contato=" + contato + "]";
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public Integer getEntityId() {
		return entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}
	
	
}
