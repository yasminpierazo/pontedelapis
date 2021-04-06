package net.codejava.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Email
	@Column(nullable = false, unique = true, length = 45)
	private String email;

	@Column(nullable = false, length = 64)
	private String senha;

	@Column(name = "nome", nullable = false)
	private String nome;

	@CPF
	@Column(name = "cpf", nullable = false, unique = true)
	private String cpf;

	public String formatar(String cpfCon) {
		/*
		 * Irá converter CPF não formatado para um com pontos e traço. Ex.: 35524519887
		 * torna-se 355.245.198-87.
		 */
		if (cpf != null) {
			cpfCon = cpfCon.replaceAll("\\.", "").replaceAll("\\-", "");

			/*
			 * Irá converter CPF formatado para um sem pontos e traço. Ex.: 355.245.198-87
			 * torna-se 35524519887.
			 */
			cpfCon = cpfCon.substring(0, 3) + "." + cpfCon.substring(3, 6) + "." + cpfCon.substring(6, 9) + "-"
					+ cpfCon.substring(9, 11);

		}
		return cpfCon;
	}

	public String getCpf() {
		cpf = formatar(cpf);
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf = formatar(cpf);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
