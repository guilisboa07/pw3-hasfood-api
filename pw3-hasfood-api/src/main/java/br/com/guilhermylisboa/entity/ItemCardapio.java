package br.com.guilhermylisboa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.guilhermylisboa.enums.StatusEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_ITEM_CARDAPIO")
public class ItemCardapio {

@Id
@Column(name = "ID_ITEM_CARDAPIO")
private long idItemCardapio;

@Column(name = "TX_NOME")
private String nome;

@Column(name = "TX_DESCRICAO")
private String descricao;

@Column(name = "VLR_ITEM")
private float valorItem;

@Column(name = "TX_STATUS")
private StatusEnum Status;


}
