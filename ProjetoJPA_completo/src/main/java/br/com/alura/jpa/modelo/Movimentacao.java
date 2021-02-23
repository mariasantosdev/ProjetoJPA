package br.com.alura.jpa.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipoMovimentacao;
    private LocalDateTime data;
    
    @ManyToOne
    private Conta conta;
    
    @ManyToMany
    private List<Categoria> categorias;
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	private String descricao;
	public void setTipoMovimentacao(TipoMovimentacao entrada) {
		// TODO Auto-generated method stub
		
	}
	public void setValor(BigDecimal bigDecimal) {
		// TODO Auto-generated method stub
		
	}
	public void setConta(Conta conta) {
		// TODO Auto-generated method stub
		
	}
	public void setCategorias(List<Categoria> asList) {
		// TODO Auto-generated method stub
		
	}
	public String getTipoMovimentacao() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getValor() {
		// TODO Auto-generated method stub
		return null;
	}


}
