package com.api.tarifas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Tarifa {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private Double faixa_0a10;
	
	private Double faixa_11a20;
	
	private Double faixa_21a30;
	
	private Double faixa_31a50;
	
	private Double faixa_51;
	
	private Double taxaReg;
	
	private String tipoConsumidor;
	
	@ManyToOne
	@JoinColumn(name="fk_codigo_categoria")
	private Categoria categoria;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Double getFaixa_0a10() {
		return faixa_0a10;
	}

	public void setFaixa_0a10(Double faixa_0a10) {
		this.faixa_0a10 = faixa_0a10;
	}

	public Double getFaixa_11a20() {
		return faixa_11a20;
	}

	public void setFaixa_11a20(Double faixa_11a20) {
		this.faixa_11a20 = faixa_11a20;
	}

	public Double getFaixa_21a30() {
		return faixa_21a30;
	}

	public void setFaixa_21a30(Double faixa_21a30) {
		this.faixa_21a30 = faixa_21a30;
	}

	public Double getFaixa_31a50() {
		return faixa_31a50;
	}

	public void setFaixa_31a50(Double faixa_31a50) {
		this.faixa_31a50 = faixa_31a50;
	}

	public Double getFaixa_51() {
		return faixa_51;
	}

	public void setFaixa_51(Double faixa_51) {
		this.faixa_51 = faixa_51;
	}

	public Double getTaxaReg() {
		return taxaReg;
	}

	public void setTaxaReg(Double taxaReg) {
		this.taxaReg = taxaReg;
	}

	public String getTipoConsumidor() {
		return tipoConsumidor;
	}

	public void setTipoConsumidor(String tipoConsumidor) {
		this.tipoConsumidor = tipoConsumidor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((faixa_0a10 == null) ? 0 : faixa_0a10.hashCode());
		result = prime * result + ((faixa_11a20 == null) ? 0 : faixa_11a20.hashCode());
		result = prime * result + ((faixa_21a30 == null) ? 0 : faixa_21a30.hashCode());
		result = prime * result + ((faixa_31a50 == null) ? 0 : faixa_31a50.hashCode());
		result = prime * result + ((faixa_51 == null) ? 0 : faixa_51.hashCode());
		result = prime * result + ((taxaReg == null) ? 0 : taxaReg.hashCode());
		result = prime * result + ((tipoConsumidor == null) ? 0 : tipoConsumidor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarifa other = (Tarifa) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (faixa_0a10 == null) {
			if (other.faixa_0a10 != null)
				return false;
		} else if (!faixa_0a10.equals(other.faixa_0a10))
			return false;
		if (faixa_11a20 == null) {
			if (other.faixa_11a20 != null)
				return false;
		} else if (!faixa_11a20.equals(other.faixa_11a20))
			return false;
		if (faixa_21a30 == null) {
			if (other.faixa_21a30 != null)
				return false;
		} else if (!faixa_21a30.equals(other.faixa_21a30))
			return false;
		if (faixa_31a50 == null) {
			if (other.faixa_31a50 != null)
				return false;
		} else if (!faixa_31a50.equals(other.faixa_31a50))
			return false;
		if (faixa_51 == null) {
			if (other.faixa_51 != null)
				return false;
		} else if (!faixa_51.equals(other.faixa_51))
			return false;
		if (taxaReg == null) {
			if (other.taxaReg != null)
				return false;
		} else if (!taxaReg.equals(other.taxaReg))
			return false;
		if (tipoConsumidor == null) {
			if (other.tipoConsumidor != null)
				return false;
		} else if (!tipoConsumidor.equals(other.tipoConsumidor))
			return false;
		return true;
	}
	
	

	
	

}
