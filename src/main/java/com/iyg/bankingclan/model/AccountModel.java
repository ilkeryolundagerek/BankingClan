package com.iyg.bankingclan.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountModel implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id//Pk
	@NotNull
	Long id;

	@NotNull
	Long balance;

	@NotNull
	@Size(min=2, max=30)
	String name;

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", name=" + name + "]";
	}
	public AccountModel(Long id) {
		super();
		this.id = id;
	}

	public void deposit(long balance){
		balance += balance;
	}

}
