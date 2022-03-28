package br.com.guilhermylisboa.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_CATEGORIA_CARDAPIO")

public class CategoriaCardapio {
	@Column(name = "ID_CATEGORIA_CARDAPIO")
	private long idCategoriaCardapio;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "ID_CARDAPIO")
	private Cardapio idCardapio;
	
	@Column(name = "TX_STATUS")
	private String status;
	
}
