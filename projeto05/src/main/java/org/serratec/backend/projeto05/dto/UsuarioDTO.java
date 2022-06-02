package org.serratec.backend.projeto05.dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String login;
	private String senha;
	private Integer idUsuario;
	
	public UsuarioDTO() {}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	

}
