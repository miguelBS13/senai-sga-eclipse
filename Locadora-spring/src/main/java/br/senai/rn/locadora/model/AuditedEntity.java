package br.senai.rn.locadora.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.senai.rn.locadora.repositories.PersistableEntity;

@MappedSuperclass
public abstract class AuditedEntity implements PersistableEntity<Long>, Comparable<AuditedEntity> {

	@CreatedDate
	@Column(name = "data_criacao", nullable = false, updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonIgnore
	private Date dataCriacao = new Date();
	
	@LastModifiedDate
	@Column(name = "data_modificacao", nullable = true)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonIgnore
	private Date dataModificacao;
	
	@Column(name = "ativo")
	@JsonIgnore
	private boolean ativo = true;

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	@PreUpdate
	private void preUpdate() {
		this.dataModificacao = new Date();

	}
	
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	@Override
	public int compareTo(AuditedEntity entity) {
		return this.getId().compareTo(entity.getId());
	}
		
}
