package br.com.eventdash.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="ITMN_EVENTO")
public class Evento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="num_seq")
	private int numSeq;

	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date data;
	
	@JsonIgnoreProperties("eventos")	
	@ManyToOne
	private Equipamento equipamento;
	
	//@JsonIgnoreProperties("eventos")
	//@ManyToOne
	//private Equipamento alarme;
	
	@JsonIgnoreProperties("eventos")
	@ManyToOne
	private Alarme alarme;
	
	//public Equipamento getAlarme() {
	//	return alarme;
	//}
	//public void setAlarme(Equipamento alarme) {
	//	this.alarme = alarme;
	//}
	
	
	
	public Date getData() {
		return data;
	}
	public Alarme getAlarme() {
		return alarme;
	}
	public void setAlarme(Alarme alarme) {
		this.alarme = alarme;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getNumSeq() {
		return numSeq;
	}
	public void setNumSeq(int numSeq) {
		this.numSeq = numSeq;
	}
	public Equipamento getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	@Override
	public String toString() {
		return "Evento [numSeq=" + numSeq + ", data=" + data + ", equipamento=" + equipamento + ", alarme=" + alarme
				+ "]";
	}

	public Evento(int numSeq, Date data, Equipamento equipamento, Alarme alarme) {
		super();
		this.numSeq = numSeq;
		this.data = data;
		this.equipamento = equipamento;
		this.alarme = alarme;
	}
	public Evento() {
		super();
	}
	
	
	
}
